package com.chapter17.abstracegactory.pizza

/**
  * @author zxfcode
  * @create 2018-11-25 14:55
  */
class BJPepperPizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "北京胡椒pizza"
    println(this.name + "preparing...")
  }
}
