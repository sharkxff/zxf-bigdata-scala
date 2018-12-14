package com.chapter07.oopExer

/**
  * @author zxfcode
  * @create 2018-11-16 9:19
  */
object fengzhuang {
  def main(args: Array[String]): Unit = {
    val emp = new Emp100
    emp.printName()
  }
}

class Person100 {
  //属性都是私有的，设置了私有属性对应的getset方法会变成对应的范围
  private var name: String = "tom"
  protected var age: Int = _

  def printName(){
    println("Person printName()" + name)
  }

  def sayHi(){
    println("Person sayHi()" + name)
  }
}

class Emp100 extends Person100 {
  override def printName(){
    super.printName()
    println("Emp100 printAge" + age)
    sayHi()
  }
}