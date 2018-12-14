package com.chapter08.night

/**
  * @author zxfcode
  * @create 2018-11-16 20:09
  */
object TestCylinder {
  def main(args: Array[String]): Unit = {
    val cylinder = new Cylinder
    cylinder.length = 3.0
    println(cylinder.findVolume())
  }
}

class Circle{
  private var radius = 1
  def findArea(): Double ={
    3.14*this.radius*this.radius
  }
}
class Cylinder extends Circle{
  var length:Double = _
  def findVolume(): Double ={
    (this.findArea())*(this.length)
  }
}