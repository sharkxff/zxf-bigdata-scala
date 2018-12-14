package com.chapter13

/**
  * @author zxfcode
  * @create 2018-11-21 15:11
  */
object ParameterInfer {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4)

    println(list.map((x:Int) => x+1))  //List(2, 3, 4, 5)
    //简写
    println(list.map((x) => x+1))
    println(list.map(x => x+1))
    println(list.map(_ + 1))

    val res = list.reduce(_ + _)  //自己做一下推断过程

  }

  def f1(n1:Int , n2:Int):Int={
    n1 + n2
  }
}
