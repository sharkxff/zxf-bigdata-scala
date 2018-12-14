package com.chapter08.mymixin

/**
  * @author zxfcode
  * @create 2018-11-17 11:14
  */
object MixInPro {
  def main(args: Array[String]): Unit = {
    //查看反编译后的代码
    val mysql5 = new MySQL6 with DB6 {
      //特质中未被初始化的字段必须实现
      override var sal: Int = 666
    }

  }
}

trait DB6{
  var opertype : String = "insert"
  var sal:Int  //抽象字段
  def insert(): Unit = {
    println("DB6.....")
  }
}
class MySQL6 {}
