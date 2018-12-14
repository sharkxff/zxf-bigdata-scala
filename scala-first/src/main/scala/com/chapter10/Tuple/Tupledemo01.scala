package com.chapter10.Tuple

/**
  * @author zxfcode
  * @create 2018-11-19 11:34
  */
object Tupledemo01 {
  def main(args: Array[String]): Unit = {

    //tuple1是一个Tuple类型是Tuple4
    //编译器根据元素的个数不同，对应不同的远足类型：Tuple1~Tuple22

    val tuple1 = (1,2,3,"hello",4)
    println(tuple1)
    println("===========访问==============")
    //访问第一个
    println(tuple1._1)
    println(tuple1.productElement(0))  //从0开始

    println("===========遍历==============")
    for(item <- tuple1.productIterator){
      println("item == " + item)
    }
  }
}
