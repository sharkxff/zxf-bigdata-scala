package com.chapter.myfor

/**
  * @author zxfcode
  */
object ForDemo01 {
  def main(args: Array[String]): Unit = {
    val start = 1
    val end = 10
    //看start从哪个数开始循环
    //to是关键字   end 是循环结束的值   start to end 表示前后闭合[start,end]
    for ( i <- start to end){
     // println("hello yue \t" + i)
    }
    //for推导式也可以直接对集合进行遍历

    val list = List("hello",10,20,"yue")
    for(item <- list){
      println("hello shark \t" + item)
    }


  }
}
