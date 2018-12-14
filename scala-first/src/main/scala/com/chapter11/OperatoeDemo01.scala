package com.chapter11

/**
  * @author zxfcode
  * @create 2018-11-20 14:48
  */
object OperatoeDemo01 {
  def main(args: Array[String]): Unit = {
    var mon = new Monster
    mon.+(10)
    mon.++
    !mon
  }
}

class Monster{
  var money:Int = 0
  def +(n:Int): Unit ={
    this.money += n
  }

  def ++(): Unit ={
    this.money += 1
  }
  //操作符重载，（前置），一元
  def unary_!(): Unit ={
    this.money = -this.money
  }
}