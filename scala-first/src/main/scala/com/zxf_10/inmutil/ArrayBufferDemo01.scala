package com.chapter10.inmutil

import scala.collection.mutable.ArrayBuffer

/**
  * @author zxfcode
  * @create 2018-11-19 10:19
  */
object ArrayBufferDemo01 {
  def main(args: Array[String]): Unit = {

    //
    val arr11 = ArrayBuffer[Any](3,2,5)

    println("arr1(1) = " + arr11(1))

    for (i <- arr11){
      println(i)
    }

    println("arr11.hadh = " + arr11.hashCode())

    //支持可变参数  在底层重新创建了一个对象再返回过来
    //类似java数组的扩容
    arr11.append(22,44,12.3)
    println("arr11.hadh = " + arr11.hashCode())
    println("=====================")

    arr11(1) = 90
    for (i <- arr11){
      println(i)
    }
    println("=====================")
    arr11.remove(2)
    for (i <- arr11){
      println(i)
    }
  }
}
