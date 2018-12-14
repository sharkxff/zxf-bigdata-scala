package sparkmasterworker.master

import akka.actor.{Actor, ActorRef, ActorSystem, Props}
import com.typesafe.config.{Config, ConfigFactory}
import sparkmasterworker.common._

import scala.collection.mutable
import scala.concurrent.duration._

/**
  * @author zxfcode
  * @create 2018-11-24 21:56
  */
class MasterActor extends Actor {
  //定义一个hashMap来存储注册信息
  val works= mutable.HashMap[String, WorkerInfo]()

  override def receive: Receive = {
    case "start" => {
      println("master启动了")
      self ! StartTimeoutWorker
    }
    case WorkerRegisterInfo(id, cpu, ram) => {
      if (!works.contains(id)) {
        //创建一个workInfo
        val workInfo = new WorkerInfo(id, cpu, ram)
        works += ((id, workInfo))
        println("works：" + works)
        sender() ! WorkerRegisterSucess
      }
    }
    case HeartBeat(id) => {
      val workerInfo = works(id)
      workerInfo.lastHeart = System.currentTimeMillis()
      println("master更新了" + id + "的时间")
    }
    case StartTimeoutWorker => {
      println("开始检测心跳")
      import context.dispatcher
      //9秒监控一次
      context.system.scheduler.schedule(0 millis, 9000 millis, self, RemoveTimeoutWorker)
    }
    case RemoveTimeoutWorker =>{
      val workerInfos = works.values
      val currentTime = System.currentTimeMillis()
      //用当前时间减去values里的时间，大于6秒说明从上次检测后再没有发送过心跳
      //注意时间单位为毫秒
     workerInfos.filter(workerInfo => (currentTime - workerInfo.lastHeart > 9000)).
        foreach(workerInfo=>works.remove(workerInfo.id))
      println("还有"+works.size+"个work存活")
    }
  }
}

object MasterActor extends App {
  //这里我们分析出有3个host,port,sparkMasterActor
  if (args.length != 3) {
    println("请输入参数 host port sparkMasterActor名字")
    sys.exit()
  }

  val host = args(0)
  val port = args(1)
  val name = args(2)
   val config = ConfigFactory.parseString(
    s"""
akka.actor.provider="akka.remote.RemoteActorRefProvider"
akka.remote.netty.tcp.hostname=${host}
akka.remote.netty.tcp.port=${port}
            """.stripMargin)
  val masterSystem = ActorSystem("master", config)
  val masterActorRef: ActorRef = masterSystem.actorOf(Props[MasterActor], s"${name}")
  masterActorRef ! "start"
}