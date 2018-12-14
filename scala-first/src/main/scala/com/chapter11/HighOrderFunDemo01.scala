package com.chapter11

/**
  * @author zxfcode
  * @create 2018-11-20 9:07
  */
object HighOrderFunDemo01 {
  def main(args: Array[String]): Unit = {

    val res = test(sum2,3.4)
    println(res)  //6.8

    var fun = myFun //直接执行
    var fun1 = myFun _

    test2(sayOk)
//    test2(sayOk())  //报错，加上括号--》执行sayok  9.20
//    test(sub)  //报错，参数不匹配
  }

  //高阶函数，不能省略形参里的括号
  def test2(f:()=>Unit)={
    f()
  }
  def sayOk()={
    println("sayokk")
  }
  def sub(n:Int): Unit ={

  }

  def myFun(): Unit ={
    println("myfun")
  }

  //f:Double =>Double,接收一个Double，返回一个Double
  //f(n1):test中执行传入的函数
  def test(f: Double => Double, n1: Double) = {
    f(n1)
  }

  //普通函数
  def sum2(d: Double): Double = {
    println("sum2")
    d + d
  }
}
