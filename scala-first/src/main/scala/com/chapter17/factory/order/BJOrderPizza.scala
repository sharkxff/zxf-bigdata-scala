package com.chapter17.factory.order
import com.chapter17.factory.pizza.{BJPepperPizza, BJcheesePizza, Pizza}

/**
  * @author zxfcode
  * @create 2018-11-25 14:56
  */
class BJOrderPizza extends OrderPizza {

  override def createPizza(t: String): Pizza = {
      var pizza: Pizza = null
      if (t.equals("cheese")) {
        pizza = new BJcheesePizza
      } else if(t.equals("pepper")) {
        pizza = new BJPepperPizza
      }
       pizza

  }
}
