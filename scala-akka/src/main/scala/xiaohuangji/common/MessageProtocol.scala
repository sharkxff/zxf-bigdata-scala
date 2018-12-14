package xiaohuangji.common

/**
  * @author zxfcode
  * @create 2018-11-24 10:56
  */

////客户端发给服务器协议（序列化的对象）
//case class ClientMessage(meg:String)
//
////服务器返回给客户端协议（样例类对象）
//case class ServerMessage(msg:String)


//使用样例类来构建协议
//客户端发给服务器协议(序列化的对象)
case class ClientMessage(mes: String)

//服务端发给客户端的协议(样例类对象)
case class ServerMessage(mes: String)