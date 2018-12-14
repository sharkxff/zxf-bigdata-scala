package com.hanshushi.homework

/**
  * @author zxfcode
  * @create 2018-11-14 8:46
  */
object Listense {
  def main(args: Array[String]): Unit = {
    var n = 5
    (0 to n).reverse.foreach(println)

    var res: Long = 1
    for (i <- "Hello") {
      res *= i.toLong
    }
    println("res=" + res)

    //用foreach来做
    "Hello".foreach(res *= _.toLong)
    println("res=" + res)

    "Hello".foreach(myCont)
    println("res=" + res)
    def myCont(ch: Char): Unit = {
      res *= ch.toLong
    }

    //(0 to n).reverse.foreach(_+1)
  }

}
