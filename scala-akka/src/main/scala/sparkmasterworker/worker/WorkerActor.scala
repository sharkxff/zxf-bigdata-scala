package sparkmasterworker.worker

import java.util.UUID

import akka.actor.{Actor, ActorRef, ActorSelection, ActorSystem, Props}
import com.typesafe.config.ConfigFactory
import sparkmasterworker.common.{HeartBeat, SendHeartBeat, WorkerRegisterInfo, WorkerRegisterSucess}
import scala.concurrent.duration._
/**
  * @author zxfcode
  * @create 2018-11-24 21:56
  */
class WorkerActor(masterHost: String, masterPort: Int,masterName:String) extends Actor {
  //masterRef
  var masterProxy: ActorSelection = _

  //给一个随机数id
   val id = java.util.UUID.randomUUID().toString

  override def preStart(): Unit = {
    masterProxy = context.actorSelection(s"akka.tcp://master@${masterHost}:${masterPort}/user/$masterName")
  }

  override def receive: Receive = {
    case "start" => {
      println("worker启动了")
      masterProxy ! WorkerRegisterInfo(id,16,16*1024)
    }
    case WorkerRegisterSucess =>{
      println(id+"注册成功")
      import context.dispatcher
      //说明
      //1. 0 millis 不延时，立即执行定时器
      //2. 3000 millis 表示每隔3秒执行一次
      //3. self:表示发给自己
      //4. SendHeartBeat 发送的内容
      //millis需要导包：import scala.concurrent.duration._
      context.system.scheduler.schedule(0 millis, 3000 millis, self, SendHeartBeat)
    }
    case SendHeartBeat =>{
      println("work "+id+"发送心跳")
      masterProxy ! HeartBeat(id)
    }
  }
}

object WorkerActor extends App {
  val wHost = args(0)
  val wPort = args(1)
  val wName = args(2)
  val mHost = args(3)
  val mPort = args(4)
  val mName = args(5)
  if (args.length != 6) {
    println("请输入参数 workerHost workerPort workerName masterHost masterPort masterName")
    sys.exit()
  }

  val config = ConfigFactory.parseString(
    s"""
       |akka.actor.provider="akka.remote.RemoteActorRefProvider"
       |akka.remote.netty.tcp.hostname=$wHost
       |akka.remote.netty.tcp.port=$wPort
            """.stripMargin)
  val workerActor = ActorSystem("workerActor", config)
  val workerActorRef: ActorRef = workerActor.actorOf(Props(new WorkerActor(mHost, mPort.toInt,mName)),"workerActor")
  workerActorRef ! "start"
}