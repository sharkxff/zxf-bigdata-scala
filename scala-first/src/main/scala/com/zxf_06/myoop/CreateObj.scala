package com.chapter06.myoop

/**
  * @author zxfcode
  * @create 2018-11-13 16:54
  */
object CreateObj {
  def main(args: Array[String]): Unit = {
    val emp = new Emp
    //多态时要写上类型
    val emp2: Person = new Emp

  }
}

class Person {

}

class Emp extends Person {

}