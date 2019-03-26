package com.chapter08.night

/**
  * @author zxfcode
  * @create 2018-11-16 23:19
  */
object PointTest {
  def main(args: Array[String]): Unit = {
    //设计一个Point类，其x和y坐标可以通过构造器提供。
    // 提供一个子类LabeledPoint，其构造器接受一个标签值和x,y坐标,
    // 比如:new LabeledPoint(“Black Thursday”,1929,230.07)
  }
}

class Point02(val x: Double, val y: Double) {
  override def toString: String = "x=" + x + "\ty=" + y
}

//class LabeledPoint(val label: String, override val x: Double, override val y: Double)
//  extends Point(x, y){
//
//}

abstract class Shape{
  //def centerPoint() : Point02
}

class Rectangle02(p1:Point02,p2:Point02,p3:Point02) extends Shape{
//  override def centerPoint(): Point02 = {
//
//  }
}

class Circle(p1:Point02,p2:Point02,p3:Point02) extends Shape{
//  override def centerPoint(): Point02 = {
//
//  }
}