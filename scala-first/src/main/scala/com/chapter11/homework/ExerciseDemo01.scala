package com.chapter11.homework

import scala.collection.mutable.ArrayBuffer

/**
  * @author zxfcode
  * @create 2018-11-20 20:52
  */
object ExerciseDemo01 {
  def main(args: Array[String]): Unit = {
    /*
    给定整型列表lst，(lst :\ List[Int]())(_ :: _)得到什么?
    (List[Int]() /: lst)(_ :+ _)又得到什么？
    如何修改他们中的一个，以对原列表进行反向排列?
     */
    val lst = List(3,5,7,1)
    println((lst :\ List[Int]())(_ :: _))
    println((List[Int]() /: lst)(_ :+ _).reverse)//List(1, 7, 5, 3)
    println((List[Int]() /: lst)((a,b)=>b :: a))
    /*
    编写一个函数，将Double数组转换成二维数组。传入列数作为参数。
    距离来说，传入Array(1,2,3,4,5,6)和3列，返回Array(Array(1,2,3), Array(4,5,6))。
     */
    val arr002 = Array(3,5,2,7,1,8,4,9)
    getFun(arr002,4).foreach(a=>println(a.mkString(",")))
  }

  def getFun(arr : Array[Int],n : Int) ={
    arr.grouped(n).toArray
  }
}
