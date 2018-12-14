package com.chapter08.night
import java.awt.Rectangle
import java.awt.Point
/**
  * @author zxfcode
  * @create 2018-11-16 23:42
  */
object TestSquare {
  def main(args: Array[String]): Unit = {
    //提供一个Square类，扩展自java.awt.Rectangle并且是三个构造器：
    // 一个以给定的端点和宽度构造正方形，
    // 一个以(0,0)为端点和给定的宽度构造正方形，
    // 一个以(0,0)为端点,0为宽度构造正方形
    val rect1=new Square()
    val rect2=new Square(2)
    val rect3=new Square(new Point(2,3),5)
    println(rect1)
    println(rect2)
    println(rect3)
  }
}

class Square extends Rectangle{
  height=0
  width=0
  x=0
  y=0
  def this(p:Point,w:Int){
    this()
    this.height=w
    this.width=w
    this.x=p.x
    this.y=p.y
  }
  def this(width:Int){
    this(new Point(0,0),width)
  }
}
