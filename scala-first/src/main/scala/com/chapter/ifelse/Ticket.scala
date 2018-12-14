package com.chapter.ifelse

import scala.io.StdIn

/**
  * @author zxfcode
  */
object Ticket {
  def main(args: Array[String]): Unit = {
    println("请输入月份：")
    val month = StdIn.readInt()
    if(month >= 4 && month <= 10){
      val cn = 60
      println("请输入年龄")
      val age = StdIn.readInt()
      if(age >= 18 && age <= 60){
        println("票价："+cn)
      }else if(age < 18){
        println("票价："+ (cn /2))
      }else{
        println("票价：" + (cn/3))
      }
    }else{
      val cn = 40
      println("请输入年龄")
      val age = StdIn.readInt()
      if(age >= 18 && age <= 60){
        println("票价："+cn)
      }else{
        println("票价："+ (cn /2))
      }
    }
  }
}
