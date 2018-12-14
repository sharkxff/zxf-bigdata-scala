package com.chapter17.factory.order


import com.chapter17.factory.pizza.Pizza

import scala.io.StdIn
import scala.util.control.Breaks._

/**
  * @author zxfcode
  * @create 2018-11-25 14:32
  */
abstract class OrderPizza {

  breakable{
    var pizzaType: String = null
    var pizza:Pizza = null
    do{
      println("客观，请问想来点什么口味的pizza(工厂方法)")
      pizzaType = StdIn.readLine()
      pizza = createPizza(pizzaType)
      if(pizza == null){
        break()
      }
      pizza.prepare()
      pizza.cutting()
      pizza.bake()
      pizza.box()
    }while(true)

  }
//createPizza(orderType)让各个子类实现order的过程
  def createPizza(t:String):Pizza
}
