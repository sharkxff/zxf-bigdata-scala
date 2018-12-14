package com.chapter18.generic

/**
  * @author zxfcode
  * @create 2018-11-26 15:29
  */
object demo01 {
  def main(args: Array[String]): Unit = {
    val list = List("hello","Dog","world")
    val list2 = List(10,20,30)
    println(midList(list))
    println(midList(list2))
  }
  //取中间值
  def midList[E] (l: List[E] ): E ={
    l (l.length / 2)
  }

}

