package com.chapter17.simplefactory.order

import com.chapter17.simplefactory.pizza.{CheesePizza, GreekPizza, PepperPizza, Pizza}

/**
  * @author zxfcode
  * @create 2018-11-25 14:32
  */
object PizzaFactory {
  def createPizza(t: String): Pizza = {
    var pizza: Pizza = null
    if (t.equals("cheese")) {
      pizza = new CheesePizza
    } else if (t.equals("greek")) {
      pizza = new GreekPizza
    } else if(t.equals("pepper")) {
      pizza = new PepperPizza
    }
    return pizza
  }
}
