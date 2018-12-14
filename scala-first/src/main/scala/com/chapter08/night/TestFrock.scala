package com.chapter08.night

/**
  * @author zxfcode
  * @create 2018-11-16 20:16
  */
object TestFrock {
  def main(args: Array[String]): Unit = {
//    val f1 = Frock.getCurrent()
//    Frock.showInfo()
//    val f2 = Frock.getCurrent()
    val f1 = new Frock
    Frock.showInfo()
    val f2 = new Frock
    Frock.showInfo()
    val f3 = new Frock
    Frock.showInfo()
  }
}
class Frock{
  var serialNum:Unit = 100000
  serialNum = Frock.getCurrent()
}

object Frock{
  private var currentNum = 1000000
  def getCurrent(): Unit ={
    this.currentNum += 100
  }
  def showInfo(): Unit ={
    printf("当前序列号为：%d \n",this.currentNum)
  }
}
