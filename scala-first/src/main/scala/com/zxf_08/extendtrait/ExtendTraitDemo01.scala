package com.chapter08.extendtrait

/**
  * @author zxfcode
  * @create 2018-11-17 11:40
  */
object ExtendTraitDemo01 {

}
trait LoggedException extends Exception{
  def log(): Unit ={
    println(getMessage()) // 方法来自于Exception类
  }
}
//UnhappyException 就是Exception的子类.
class UnhappyException extends LoggedException{
  // 已经是Exception的子类了，所以可以重写方法
  override def getMessage = "错误消息！"
}

class UnhappyException2 extends IndexOutOfBoundsException with LoggedException{
  // 已经是Exception的子类了，所以可以重写方法
  override def getMessage = "错误消息！"
}
class CCC{}
class DDD extends Exception{}
//如果混入特质(LoggedException)的类(UnhappyException3)已经继承了一个类(DDD),
// DDD须是特质(LoggedException)超类(Exception)的子类，否则多继承现象
//DDD和LoggedException有共同的超类

//CCC-->错误,subclass CCC is not a subclass of superclass Exception
class UnhappyException3 extends DDD with LoggedException{
  // 已经是Exception的子类了，所以可以重写方法
  override def getMessage = "错误消息！"
}