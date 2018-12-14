package com.chapter17.factory.pizza

/**
  * @author zxfcode
  * @create 2018-11-25 14:30
  */
class GreekPizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "希腊pizza"
    println(this.name + "preparing...")
  }
}
