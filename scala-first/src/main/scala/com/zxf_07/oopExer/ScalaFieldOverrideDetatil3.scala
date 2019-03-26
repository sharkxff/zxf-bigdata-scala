package com.chapter07.oopExer

/**
  * @author zxfcode
  */
object ScalaFieldOverrideDetatil3 {
  def main(args: Array[String]): Unit = {
    println("xxx")
  }
}

//没有初始化的变量就是抽象数向
//会自动生成抽象方法
//抽像属性在抽象类中，包含了抽象属性的类，这个类也是抽象的
abstract class A03 {
  var name: String  //抽象
  var age:Int =10

}

class Sub_A03 extends A03 {
  //在子类中重写父类的抽象属性，本质是实现了抽象方法
  //这里override可写可不写，父类的抽象属性，生成的是抽像方法，不涉及方法重写的概念
  var name: String = ""
  //会报错，override不能作用在一个可变的变量
  //override var age:Int = 20
}