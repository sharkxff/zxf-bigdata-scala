package com.chapter09.dataConstract

/**
  * @author zxfcode
  * @create 2018-11-17 23:16
  */
object Exercise01 {
  /*
  编写一段代码，将a设置为一个n个随机整数的数组，要求随机数介于0和n之间。
   */
  def main(args: Array[String]): Unit = {
    getAttr(10).foreach(println)
  }
  def getAttr(n:Int): Array[Int] ={
    val list = new Array[Int](n)
    val rand = new scala.util.Random()
    for ( i <- list) yield rand.nextInt()
  }
}


