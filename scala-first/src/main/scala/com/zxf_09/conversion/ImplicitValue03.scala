package com.chapter09.conversion

/**
  * @author zxfcode
  * @create 2018-11-17 15:36
  */
object ImplicitValue03 {
  implicit var str1:String = "jack"   //隐式值
  //name是隐式参数
  def hello(implicit name:String): Unit ={  //hello$1
    println(name + "  hello")
    def hello(): Unit ={  //hello$2
      println("xxx")
    }
  }

  def main(args: Array[String]): Unit = {
    hello  //底层hello$1(str1)   在使用隐式值时，不要写()
  }
}
