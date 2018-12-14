package com.chapter11.homework

import scala.collection.mutable
import scala.collection.mutable.{ArrayBuffer, ListBuffer}

/**
  * @author zxfcode
  * @create 2018-11-20 21:09
  */
object HomeworkExer {
  def main(args: Array[String]): Unit = {
    /*
    编写一个compose函数，将两个类型为Double=>Option[Double]的函数组合在一起，产生另一个同样类型的函数。
    如果其中一个函数返回None，则组合函数也应返回None。例如：
    def f(x : Double) = if ( x >= 0) Some(sqrt(x)) else None
    def g(x : Double) = if ( x != 1) Some( 1 / ( x - 1)) else None
    val h = compose(f,g)
    h(2)将得到Some(1)，而h(1)和h(0)将得到None
     */
    val h = compose(f(0),g(0))
    //println(h)

    /*
    编写函数values(fun:(Int)=>Int,low:Int,high:Int),
    该函数输出一个集合，对应给定区间内给定函数的输入和输出。
    比如，values(x=>x*x,-5,5)应该产出一个对偶的集合(-5,25),(-4,16),(-3,9),…,(5,25)
    思路：有一个函数，
     */

    //for ((k, v) <- values(-5, 5)) println(k + " , " + v)

    //for(v <- values(-5, 5)) print(v)

    //给你一个数组集合，如果该数组时  Array(10,20) , 请使用默认匹配，返回Array(20,10)


    val arrs2 = Array(Array(0), Array(1, 0), Array(0, 1, 0),
      Array(1, 1, 0), Array(1, 1, 0, 1))

    for (arr <- arrs2 ) {
      val result = arr match {
        //case Array(0) => "0"
        case Array(x, y) => (y,x) //? ArrayB(y,x)
        //case Array(0, _*) => "以0开头和数组"
        case _ => "不处理~~"
      }
      //println(result)
    }

    /*
    val lines = List("atguigu han hello ", "atguigu han aaa aaa aaa ccc ddd uuu")
使用映射集合，list中，各个单词出现的次数，并按出现次数排序
提示：xxx, 课后练习
     */
    val lines = List("atguigu han hello ", "atguigu han aaa aaa aaa ccc ddd uuu")
    val maparr = getLine(lines)

    println(maparr)

    /*
    如何用reduceLeft得到数组Array(1,333,4,6,4,4,9,32,6,9,0,2)中的最大元素?
     */
    val list99 = Array(1,333,4,6,4,4,9,32,6,9,0,2)
    val max = list99.reduceLeft(getMax)
    println(max)
    /*
    4、用to和reduceLeft实现阶乘函数,不得使用循环或递归
     */
    val list999 = List(1,9)
    //val sumnum = list999.reduceLeft(getSum)
   // println(sumnum)
}

//  def getSum(n1:Int,n2:Int):Int={
////    (n1 to n2).foreach()
//  }
  def getMax(n1:Int,n2:Int):Int = {
    if(n1<n2) n2 else n1
  }
  def getLine(list:List[String]):mutable.Map[String,Int]={
    //var list66 = ListBuffer[String]()
    val maparr = mutable.Map[String,Int]()
    for (item <- list){
      val liness = item.split(" ")
      for (item22 <- liness){
        maparr += (item22 -> (maparr.getOrElse(item22,0) + 1))
      }
    }
//    for(map <- maparr){
//      var result = map match {
//        case (x,y) => (y,x)
//        case _ => "none"
//      }
//    }

    maparr
  }
  def getWord(aaa:String):ListBuffer[String]={
    var listBuffer = ListBuffer[String]()
    listBuffer += aaa
    listBuffer
  }
  def values(low :Int,high:Int):mutable.Map[Int,Int]={
    var map22 = mutable.Map[Int,Int]()
    for(item <- low to high){
      map22 += (item -> item * item)
    }
    map22
  }
  def fun(n : Int):Int={
    n*n
  }

  def f(x : Double) = if ( x >= 0) Some(scala.math.sqrt(x)) else None
  def g(x : Double) = if ( x != 1) Some( 1 / ( x - 1)) else None
  def compose(f11:Option[Double],f22:Option[Double]):Option[Double]={
    if(f11!= None && f22!=None) f22 else None
  }
}
