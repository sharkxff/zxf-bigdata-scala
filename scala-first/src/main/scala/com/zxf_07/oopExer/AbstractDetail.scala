package com.chapter07.oopExer

/**
  * @author zxfcode
  */
object AbstractDetail {
  def main(args: Array[String]): Unit = {
    //默认，一个抽象类是不能实例化的，但是实例化时，动态的实现了抽象类的所有抽线方法，也可以
    //val animal03 = new Animal03 //会报错
//    val animal03 = new Animal03 {
//      override def dayHello(): Unit = {
//        println("say hello")
//      }
//    }


  }
}

abstract class Animal01 {
  var name: String //抽象字段
  var age: Int //抽象字段
  var color: String = "black" //普通属性
  def cry() //抽象方法，不需要标记abstract，标记后编译会报错
}

//notic
//有什么用：价值更多是在于设计，子类继承并实现抽象类（即实现抽象类的抽象方法）


abstract class Animal02 {

  //抽象类中可以有实现的方法
  def dayHi(): Unit = {
    println("xxxx") //
  }
}

abstract class Animal03 {

  //抽象类中可以有实现的方法
  //不能用private、final来修饰，与拿来被重写/实现相违背
  def dayHello()
  var food: String
}

//继承抽象类，必须重写抽象类的抽象方法
class Cat extends Animal03{
  override def dayHello(): Unit = {
    println("miaomiao~~~")
  }

  override var food: String = _
}