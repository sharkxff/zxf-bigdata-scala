package actors02

import akka.actor.Actor

/**
  * @author zxfcode
  * @create 2018-11-23 21:10
  */
class XiaoQiaoActor extends Actor{
  override def receive: Receive = {
    case "kaigan" => {
      println("小龙十八掌")
      Thread.sleep(1000)
      //通过sender()可以获取到发消息的actor的ref
      sender() ! "hhgame"
    }
  }
}
