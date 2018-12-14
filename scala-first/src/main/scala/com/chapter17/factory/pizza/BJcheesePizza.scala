package com.chapter17.factory.pizza

/**
  * @author zxfcode
  * @create 2018-11-25 14:55
  */
class BJcheesePizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "北京奶酪pizza"
    println(this.name + "preparing...")
  }
}