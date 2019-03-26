package com.chapter06.nightExer

/**
  * @author zxfcode
  * @create 2018-11-14 18:26
  */
object BoxExer {
  def main(args: Array[String]): Unit = {
    val box = new Box()
    //println(box.getVol())

//    var box.leng=2.0
//    var box.widt=3.0

    println(box.getBvol(3.0, 4.0, 5.0))
  }

}

//len:Double,wid:Double,hei:Double
class Box() {
  var leng: Double = _
  var widt: Double = _
  var heig: Double = _
  def getVol() ={
    //len*wid*hei
  }
  def getBvol(leng:Double,widt:Double,heig:Double)={
    leng*widt*heig
  }
  def Box(){}
}
