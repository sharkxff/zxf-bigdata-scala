package com.chapter17.abstracegactory.order

import com.chapter17.abstracegactory.pizza.Pizza

import scala.io.StdIn
import scala.util.control.Breaks._

/**
  * @author zxfcode
  * @create 2018-11-25 14:32
  */
 class OrderPizza {
  //OrderPizza ,当我们使用抽象工厂模式后，我们订购一个Pizza思路
  //1.接收一个子工厂实例，根据该工厂的创建要求去实例
  var abxfactory :Absfactory = _
  def this(absfactory: Absfactory){
    //多态
    this
    breakable{
      var pizzaType: String = null
      var pizza:Pizza = null
      do{
        println("客观，请问想来点什么口味的pizza(抽象工厂)")
        pizzaType = StdIn.readLine()
        pizza = absfactory.createPizza(pizzaType)
        if(pizza == null){
          break()
        }
        pizza.prepare()
        pizza.cutting()
        pizza.bake()
        pizza.box()
      }while(true)

    }
  }

}
