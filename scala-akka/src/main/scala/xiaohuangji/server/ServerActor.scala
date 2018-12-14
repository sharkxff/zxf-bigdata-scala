package xiaohuangji.server

import akka.actor.{Actor, ActorRef, ActorSystem, Props}
import com.typesafe.config.ConfigFactory
import xiaohuangji.common.{ClientMessage, ServerMessage}

/**
  * @author zxfcode
  * @create 2018-11-24 10:43
  */
class ServerActor extends Actor{
  override def receive: Receive = {
    case "start" => println("小黄鸡开始工作")
      //如果收到的是ClientMessage(msg)
    case ClientMessage(msg)=>{
      msg match {
        case "学费" => sender() ! ServerMessage("20000rmb")
        case _ =>sender() ! ServerMessage("听不懂")
      }
    }
  }
}

object ServerActor extends App {
  var host = "127.0.0.1"
  var port = 9999
  val config = ConfigFactory.parseString(s"""
                                                    |akka.actor.provider="akka.remote.RemoteActorRefProvider"
                                                    |akka.remote.netty.tcp.hostname=$host
                                                    |akka.remote.netty.tcp.port=$port
        """.stripMargin
  )
  val serverSystem = ActorSystem("server",config)
  val serverActorRef: ActorRef = serverSystem.actorOf(Props[ServerActor],"serverActor")
  serverActorRef ! "start"
}