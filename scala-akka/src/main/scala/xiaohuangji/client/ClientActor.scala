package xiaohuangji.client

import akka.actor.{Actor, ActorRef, ActorSelection, ActorSystem, Props}
import com.typesafe.config.ConfigFactory
import xiaohuangji.common.{ClientMessage, ServerMessage}

import scala.io.StdIn

/**
  * @author zxfcode
  * @create 2018-11-24 10:43
  */
class ClientActor(serverHost:String,serverPort:Int) extends Actor{
  //要给服务器发送消息，要先持有服务器的ref
  var serverActorRef:ActorSelection  = _

  override def preStart(): Unit = {
    //println("preStart开始执行")
    serverActorRef = context.actorSelection(s"akka.tcp://server@${serverHost}:${serverPort}/user/serverActor")
    //println("serverActorRef:"+serverActorRef)
  }
  override def receive: Receive = {
    case "start" => println("客户start")
      //给server发送消息
    case msg:String =>{
      serverActorRef ! ClientMessage(msg)
    }
      //收到server的回复
    case ServerMessage(msg) =>
     println(s"收到小黄鸡的回复：$msg")
  }
}
object ClientActor extends App {
  val (clientHost,clientPort,serverHost,serverPort) = ("127.0.0.1",9998,"127.0.0.1",9999)
  val config = ConfigFactory.parseString(
    s"""
akka.actor.provider="akka.remote.RemoteActorRefProvider"
akka.remote.netty.tcp.hostname=$clientHost
akka.remote.netty.tcp.port=$clientPort
        """.stripMargin
  )

  val clientSystem = ActorSystem("client",config)

  val clientActorRef: ActorRef = clientSystem.actorOf(Props(new ClientActor(serverHost,serverPort)),"clientActor")

  clientActorRef ! "start"
  Thread.sleep(1000)
  while(true){
    println("请输入想咨询的问题：")
    val msg = StdIn.readLine()
    clientActorRef ! msg
    Thread.sleep(1000)
  }
//  //客户端可以发送消息给服务器
//  while (true) {
//    println("请输入要咨询的问题")
//    val mes = StdIn.readLine()
//    clientActorRef ! mes
//  }
}