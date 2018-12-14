package actors02

import akka.actor.Actor
import akka.actor.ActorRef

/**
  * @author zxfcode
  * @create 2018-11-23 21:10
  */
//持有接收消息的actor的ref
class XiaoHuangActor(actorRef: ActorRef) extends Actor{
  private val qiaoRef: ActorRef = actorRef
  override def receive: Receive = {
    case "start" => {
      println("出招了")
      self ! "hhgame"
    }
    case "hhgame" =>{
      println("无影脚")
      Thread.sleep(1000)
      qiaoRef ! "kaigan" //给qiao发消息
    }
  }
}
