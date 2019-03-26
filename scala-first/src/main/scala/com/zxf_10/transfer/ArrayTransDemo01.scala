package com.chapter10.transfer

import scala.collection.mutable.ArrayBuffer

/**
  * @author zxfcode
  * @create 2018-11-19 10:38
  */
object ArrayTransDemo01 {
  def main(args: Array[String]): Unit = {
    val arr1to1 = ArrayBuffer[Int](3,2,5)
    println(arr1to1)

    val arr2to2 = arr1to1.toArray
    println(arr2to2)

    val arr3to3 = arr2to2.toBuffer
    arr3to3.append(1234)
    println(arr3to3)
  }
}
