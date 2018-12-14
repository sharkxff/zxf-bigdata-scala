package com.hanshushi.demo

/**
  * @author zxfcode
  */
object Feibo {
  def main(args: Array[String]): Unit = {
//    val n = 6
//    for (i <- 1 to n){
//      println(feibo(i))
//    }
    println(tao(1))
  }

  def feibo(n: Int): Int = {
    if(n == 1 || n==2){
      1
    }else{
      (feibo(n-1) + feibo(n-2))
    }
  }

  //猴子吃桃
  def tao(num: Int): Int ={
    if( num == 10){
      1
    }else{
      (tao(num + 1) + 1) *2
    }
  }

  //
}
