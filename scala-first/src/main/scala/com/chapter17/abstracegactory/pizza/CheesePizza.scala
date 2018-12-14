package com.chapter17.abstracegactory.pizza

/**
  * @author zxfcode
  * @create 2018-11-25 14:29
  */
class CheesePizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "奶酪pizza"
    println(this.name + "preparing...")
  }
}
