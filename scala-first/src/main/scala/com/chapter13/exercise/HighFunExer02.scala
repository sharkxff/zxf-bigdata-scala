package com.chapter13.exercise

import scala.collection.mutable

/**
  * @author zxfcode
  * @create 2018-11-22 10:23
  */
object HighFunExer02 {
  def main(args: Array[String]): Unit = {
      /*
      编写函数values(fun:(Int)=>Int,low:Int,high:Int),
      该函数输出一个集合，对应给定区间内给定函数的输入和输出。
      比如，values(x=>x*x,-5,5)应该产出一个对偶的集合(-5,25),(-4,16),(-3,9),…,(5,25)
       */
    val pf = values(fun,-5,5)
    println(pf)
  }
  def values(fun:(Int)=>Int,low:Int,high:Int):mutable.Map[Int,Int] = {
    val map = mutable.HashMap[Int,Int]()
    for(item <- low to high){
      map += (item -> fun(item))
    }
    map
  }
  def fun(num : Int):Int={
    num * num
  }
}
