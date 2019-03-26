package com.chapter08.night

/**
  * @author zxfcode
  * @create 2018-11-16 23:36
  */
object TestShape {
  def main(args: Array[String]): Unit = {
    //定义一个抽象类Shape，一个抽象方法centerPoint，以及该抽象类的子类Rectangle和Circle。
    // 为子类提供合适的构造器，并重写centerPoint方法
  }
}

abstract class Shape04{
  def centerPoint()
}

class Rectangle01 extends Shape04{
  var x:Double = 0.0
  var y:Double = 0.0
  def this(x:Double ,y:Double){
    this
    this.x = x
    this.y = y
  }
  override def centerPoint(): Unit = {
    x/2
  }
}