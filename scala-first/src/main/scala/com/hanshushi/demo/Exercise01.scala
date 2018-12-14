package com.hanshushi.demo

/**
  * @author zxfcode
  * @create 2018-11-13 15:39
  */
object Exercise01 {
  def main(args: Array[String]): Unit = {
    jinzi(4)
  }
  def jinzi(n:Int): Unit ={
    for( i <- 0 to n){
      for (m <- 1 to n-i){
        print(" ")
      }
      for( j <- 1 to i*2+1){
        print("*")
      }
      println()
    }
  }
}
