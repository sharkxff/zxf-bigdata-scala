package com.chapter12

/**
  * @author zxfcode
  * @create 2018-11-20 15:49
  */
object MatchVal01 {
  def main(args: Array[String]): Unit = {
    val ch = 'v'
    ch match{
      case '+' => println("ok~")
      case mychar => println("ok!"+mychar)
      case _ => println("ok~~~")
    }

    val ch1 = '+'
    val res = ch1 match {
      case '+' => ch1 + "hello"
      //case mychar => println("ok!" + mychar)
      case _ => println("ok~~~")
    }
    println(res)
  }
}
