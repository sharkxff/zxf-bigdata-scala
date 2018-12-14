package com.chapter13.exercise

/**
  * @author zxfcode
  * @create 2018-11-22 11:30
  */
object UnlessExer {
  def main(args: Array[String]): Unit = {
    /*
    实现一个unless控制抽象，工作机制类似if,但条件是反过来的
     */
    var a = 11
    myunless(a <= 10) {
      a += 1
      println(a)
    }
  }
  def myunless(contion : => Boolean)(block:Unit)={
    if(!contion){
      block
    }
  }
}
