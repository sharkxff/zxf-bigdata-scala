package com.chapter10

/**
  * @author zxfcode
  * @create 2018-11-19 10:49
  */
object MultiplyArray {
  def main(args: Array[String]): Unit = {
    val arr = Array.ofDim[Int](3,4)
    for(item <- arr){
      for (item2 <- item){
        print(item2 + "\t")
      }
      println()
    }

    println("======================")
    println(arr(1)(1))
    arr(1)(1) = 200
    for(item <- arr){
      for (item2 <- item){
        print(item2 + "\t")
      }
      println()
    }

    println("======================")
    for(item <- 0 to arr.length-1){
      for (item2 <- 0 to arr(item).length-1){
        print(item2 + "\t")
      }
      println()
    }
  }
}
