package com.chapter07.homework

/**
  * @author zxfcode
  * @create 2018-11-14 20:39
  */
object TimeTest {
  def main(args: Array[String]): Unit = {
    val time1 = new Time(10,33)
    val time2 = new Time(10,32)
    println(time1.before(time2))
  }
}

class Time (val hours:Int,val minutes:Int){
  var ahour = hours
  var aminute = minutes
  def before(other:Time): Boolean ={
    if (this.ahour > other.ahour){
      false
    }else if((this.ahour == other.ahour) && this.aminute >other.aminute){
      false
    }else{
      true
    }
  }
}