package com.chapter11

/**
  * @author zxfcode
  * @create 2018-11-20 10:14
  */
object FilterDemo01 {
  def main(args: Array[String]): Unit = {
    val names = List("Alice","Bob","Nick")
    val name2 = names.filter(startA)
    println(names)
    println(name2)
  }

  def startA(str:String):Boolean={
    str.startsWith("A")
  }
}
