package com.chapter.home
import  util.control.Breaks._
/**
  * @author zxfcode
  */
object Exercise1 {
  def main(args: Array[String]): Unit = {
    //100以内的数求和，求出当和 第一次大于20的当前数【for】
    var sum = 0
    var j = 0
    for(i <- 0 to 100 if sum <= 20){
      sum += i
      j=i
    }
    //println(j)

    //用break实现
    breakable{
      for(i <- 1 to 100){
        sum += i
        if(sum > 20){
          println("第一次大于20 的当前数" +i )
          break()
        }
      }
    }
    //用循环守卫实现
    var lop = true
    var sum2 = 0
    for(i <- 1 to 100 if lop == true){
      sum2 +=i
      if (sum2 > 20){
        println("第一次大于20 的当前数" +i)
        lop = false
      }
    }
  }
}
