package com.chapter17.simplefactory.pizza

/**
  * @author zxfcode
  * @create 2018-11-25 14:24
  */
abstract class Pizza {
  var name: String = _

  //每种披萨的原材料不同，因此创建成抽象的
  def prepare()

  def cutting(): Unit = {
    println(this.name + "cutting...")
  }

  def bake(): Unit = {
    println(this.name + "bakeing...")
  }

  def box(): Unit = {
    println(this.name + "boxing...")
  }
}
