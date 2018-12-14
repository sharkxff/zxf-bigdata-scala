package com.chapter.ifelse

/**
  * @author zxfcode
  */
object exercise1 {
  def main(args: Array[String]): Unit = {
    if (5 > 4) println("5>4")


    val age = 70
    //if else有返回值，为满足结果的左后一行内容,这里res是any，因为不确定返回的类型
    val res = if (age > 20) {
      println("hello age > 20")
      9 + 7
      "hello "
    }else{
      7
    }
    println(res)

    val num = 3
    //没有返回值时返回的是 () --> unit
    val res2 = if( num>9){
      "hello"
    }
    println(res2)
  }
}
