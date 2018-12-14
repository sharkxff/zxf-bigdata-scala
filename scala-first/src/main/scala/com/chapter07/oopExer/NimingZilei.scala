package com.chapter07.oopExer

/**
  * @author zxfcode
  */
object NimingZilei {
  def main(args: Array[String]): Unit = {
    //匿名子类？？还需要学习
    val ani = new Animal04 {
      override var name: String = _

      override def cry(): Unit = {
        println("~~~~~:)")
      }
    }
  }
}

abstract class Animal04{
  var name:String
  def cry()
}
