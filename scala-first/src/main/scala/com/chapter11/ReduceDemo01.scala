package com.chapter11

/**
  * @author zxfcode
  * @create 2018-11-20 10:21
  */
object ReduceDemo01 {
  def main(args: Array[String]): Unit = {
    val list1 = List(3, 5, 7,33,12)
    //化简的方式来求和
    val res = list1.reduceLeft(sum)
    //(3)5(8)7(15)33(48)12
    println("\n"+res)

    println(list1.reduceLeft(minus))  //((((3-5)-7)-33)-12)
    println(list1.reduceRight(minus)) //(3-(5-(7-(33-12))))
    println(list1.reduce(minus))   //等价于reduceLeft

    println(list1.reduceLeft(min))
  }

  //最小值
  def min(n1:Int,n2:Int): Int ={
    if(n1 < n2) n1 else n2
  }

  def sum(n1:Int,n2:Int):Int={
    //print("("+n1+")"+n2)
    n1 + n2
  }

  def minus(n1:Int,n2:Int):Int={
    //print("("+n1+")"+n2)
    n1 - n2
  }
}
