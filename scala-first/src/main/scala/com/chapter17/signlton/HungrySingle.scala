package com.chapter17.signlton

/**
  * @author zxfcode
  * @create 2018-11-25 15:24
  */
object HungrySingle {
  def main(args: Array[String]): Unit = {
    val sin1:HunSin = HunSin.getInstance
    val sin2:HunSin = HunSin.getInstance
    if(sin1 == sin2){
      println("333")
    }
  }
}

class HunSin private(){}
object HunSin{
  private val s:HunSin = new HunSin
  def getInstance={
    s
  }
}