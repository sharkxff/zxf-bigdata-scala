package com.chapter10.transfer

import scala.collection.mutable.ArrayBuffer

/**
  * @author zxfcode
  * @create 2018-11-19 11:12
  */
object ScaToJava {
  def main(args: Array[String]): Unit = {
    val arr = ArrayBuffer[Int](3,2,5)
    import scala.collection.JavaConversions.bufferAsJavaList
    //val javaArr = new ProcessBuilder(arr)

  }
}
