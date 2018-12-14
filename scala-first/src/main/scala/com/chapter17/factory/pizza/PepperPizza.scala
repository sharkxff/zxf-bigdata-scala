package com.chapter17.factory.pizza

/**
  * @author zxfcode
  * @create 2018-11-25 14:29
  */
class PepperPizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "胡椒pizza"
    println(this.name + "preparing...")
  }
}
