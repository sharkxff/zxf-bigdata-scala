package com.chapter11

/**
  * @author zxfcode
  * @create 2018-11-20 10:06
  */
object FlatMapDemo01 {
  def main(args: Array[String]): Unit = {
    val names = List("Alice","Bob","Nick")
    //扁平化，把多有元素打散
    val name2 = names.flatMap(upper)
    //name2 = List(A, L, I, C, E, B, O, B, N, I, C, K)
    println("name2 = " + name2)
  }

  def upper(s:String):String={
    s.toUpperCase
  }
}
