package com.chapter17.simplefactory.order
import com.chapter17.simplefactory.pizza.Pizza

import scala.io.StdIn
import util.control.Breaks._
/**
  * @author zxfcode
  * @create 2018-11-25 14:32
  */
class OrderPizza {
  var pizzaType: String = _
  var pizza:Pizza = _
  breakable{
    do{
      println("客观，请问想来点什么口味的pizza(简单工厂)")
      pizzaType = StdIn.readLine()
      pizza = PizzaFactory.createPizza(pizzaType)
      if(pizza == null){
        break()
      }
      this.pizza.prepare()
      this.pizza.cutting()
      this.pizza.bake()
      this.pizza.box()
    }while(true)

  }
}
