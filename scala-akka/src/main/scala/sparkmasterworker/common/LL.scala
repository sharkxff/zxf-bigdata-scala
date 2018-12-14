package sparkmasterworker.common

/**
  * @author zxfcode
  * @create 2018-11-24 21:56
  */
//注册worker
case class WorkerRegisterInfo(id: String, cpu: Int, ram: Int)

//封装一下注册的信息，便于后续的更改,将来这个WorkerInfo会扩展（比如增加worker上一次的心跳时间）
class WorkerInfo(val id: String, val cpu: Int, val ram: Int){
  var lastHeart : Long = System.currentTimeMillis()
}

//注册成功返回
case object WorkerRegisterSucess

//worker每隔一定时间由定时器发给自己的一个消息
case object SendHeartBeat
//worker每隔一定时间由定时器触发，而向master发现的协议消息
case class HeartBeat(id:String)

//master给自己发送一个触发检查超时worker的信息
case object StartTimeoutWorker

// master给自己发消息，检测worker,对于心跳超时的
case object RemoveTimeoutWorker