package com.chapter13

/**
  * @author zxfcode
  * @create 2018-11-21 20:47
  */
object AbstractMyWhile {
  def main(args: Array[String]): Unit = {
    var i = 10
    mywhile( i >0){
      i -= 1
      println(i)
    }
  }
  def mywhile(condition: => Boolean)(block: =>Unit):Unit ={
    if(condition){
      block
      mywhile(condition)(block)
    }
  }
}
