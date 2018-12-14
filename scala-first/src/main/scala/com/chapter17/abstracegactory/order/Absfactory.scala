package com.chapter17.abstracegactory.order

import com.chapter17.abstracegactory.pizza.Pizza

/**
  * @author zxfcode
  * @create 2018-11-25 15:17
  */
trait Absfactory {
  def createPizza(t:String):Pizza
}
