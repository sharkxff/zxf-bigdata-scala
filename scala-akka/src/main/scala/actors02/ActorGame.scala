package actors02

import akka.actor.{ActorRef, ActorSystem, Props}

/**
  * @author zxfcode
  * @create 2018-11-23 21:11
  */
object ActorGame extends App {
  //创建ActorSystem
  val actorSystemSystem = ActorSystem("actorSystem")
  //创建bActorRef引用/代理，因为他要被使用（a向他发送邮件）
   val bActorRef: ActorRef = actorSystemSystem.actorOf(Props[XiaoQiaoActor],"bActor")
  //创建aActorRef
  private val hActor: ActorRef = actorSystemSystem.actorOf(Props(new XiaoHuangActor(bActorRef)),"hActor")
  hActor ! "start"
}
