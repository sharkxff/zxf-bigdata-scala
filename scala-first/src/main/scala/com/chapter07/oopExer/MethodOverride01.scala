package com.chapter07.oopExer

/**
  * @author zxfcode
  * @create 2018-11-18 20:32
  */
object MethodOverride01 {
  def main(args: Array[String]): Unit = {

    val emp = new Emp100
    emp.printName()
  }
}

//Person类
class Person100 {
  var name: String = "tom"

  def printName() { //输出名字
    println("Person printName() " + name)
  }

  def sayHi(): Unit = {
    println("sayHi...")
  }
}

//这里我们继承Person
class Emp100 extends Person100 {
  //这里需要显式的使用override
  override def printName() {
    println("Emp printName() ")
    //在子类中需要去调用父类的方法,使用super
    super.printName()
    sayHi()
  }
}

