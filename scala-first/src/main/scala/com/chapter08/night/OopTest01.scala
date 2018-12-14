package com.chapter08.night

/**
  * @author zxfcode
  * @create 2018-11-16 20:44
  */
object OopTest01 {
  private val i2c = 30.8
  private val g2l = 3.78541184
  private val m2k = 1.60934

  def inchesToCentimeters(inches: Double): Double = {
    inches * i2c
  }

  def gallonsToLiters(gallon: Double): Double = {
    gallon * g2l
  }

  def milesToKilometers(miles: Double): Double = {
    miles * m2k
  }

  def main(args: Array[String]): Unit = {
    var inch = 20
    var gall = 20
    var mile = 20
    println(inch+"英尺="+inchesToCentimeters(inch))
    println(gall+"加仑="+gallonsToLiters(gall))
    println(mile+"公里="+milesToKilometers(mile))
  }
}
