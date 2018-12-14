package com.chapter08.selftype

/**
  * @author zxfcode
  * @create 2018-11-17 11:56
  */
object SelfTypeDemo {
  def main(args: Array[String]): Unit = {

  }
}
//Logger就是自身类型特质  等价于trait Logger extends Exception-->混入该特质的类也是Exception的子类
trait Logger {
  // 明确告诉编译器，我就是Exception,如果没有这句话，下面的getMessage不能调用
  this: Exception =>
  def log(): Unit ={
    // 既然我就是Exception, 那么就可以调用其中的方法
    println(getMessage)
  }
}

//class Console extends  Logger {} //错误
class Console extends Exception with Logger//对吗?
