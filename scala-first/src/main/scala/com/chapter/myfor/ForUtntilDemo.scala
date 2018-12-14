package com.chapter.myfor

/**
  * @author zxfcode
  */
object ForUtntilDemo {
  def main(args: Array[String]): Unit = {
    val start = 1
    val end = 11
    //until  前闭后开.范围是  start---end-1   [1,11)
    for(i <- start until end){
      println("hello shark \t" + i)
    }
  }
}
