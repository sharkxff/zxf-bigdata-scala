package com.chapter12.casepak

/**
  * @author zxfcode
  * @create 2018-11-21 9:46
  */
object CaseClassDemo01 {
  def main(args: Array[String]): Unit = {
    println("hello")

  }
}

abstract class Amount
//case关键字    目的是模式匹配优化  可以自己补充业务代码(可扩展)  参数都是val的->只读
//   apply和unapply在伴生对象(Dollar$.class)中
case class Dollar(value: Double) extends Amount
case class Currency(value: Double, unit: String) extends Amount
case object NoAmount extends Amount
