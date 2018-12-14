package actor01

import akka.actor.{Actor, ActorRef, ActorSystem, Props}

/**
  * @author zxfcode
  * @create 2018-11-23 20:44
  */
//继承Actor后就是一个Actor,核心方法receive方法重写
class SayHelloActor extends Actor {
  //receive会被该Actor的MailBox(实现了Runnable接口)调用
  //当Actor的MailBox接收到消息后会调用receive，type Receive = PartialFunction[Any,Unit]
  override def receive: Receive = {
    case "hello" => println("收到，hello :)")
    case "ok" => println("好的，OK :)")
    case "exit" => {
      println("退出系统")
      context.stop(self) //停止actorref
      context.system.terminate() //退出actorsystem
    }
    case _ => println("匹配不到")
  }
}

object SayHelloDemo{
  //先创建一个actorFactory，返回Actor的ActorRef
  private val actorFactory = ActorSystem("actorFactory")
  //创建Actor的同时，返回Actor的ActorRef
  //说明：Props[SayHelloActor]创建了一个SayHelloActor实例（使用反射），给actor取名为"sayHelloActor"
  //    sayHelloActorRef: ActorRef就是Props[SayHelloActor]的ActorRef
  //    创建的SayHelloActor实例被ActorSystem接管
  private val sayHelloActorRef: ActorRef = actorFactory.actorOf(Props[SayHelloActor],"sayHelloActor")

  def main(args: Array[String]): Unit = {
    sayHelloActorRef ! "hello"
    sayHelloActorRef ! "ok"
  }
}
