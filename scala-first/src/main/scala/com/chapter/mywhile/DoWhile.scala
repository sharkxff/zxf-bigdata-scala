package com.chapter.mywhile

/**
  * @author zxfcode
  */
object DoWhile {
  def main(args: Array[String]): Unit = {
    var i = 0
    do {
      println("hello shark \t" + i)
      i += 1
    } while (i < 10)
  }
}
