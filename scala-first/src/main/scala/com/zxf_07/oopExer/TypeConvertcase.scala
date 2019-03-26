package com.chapter07.oopExer

/**
  * @author zxfcode
  * @create 2018-11-16 10:29
  */
object TypeConvertcase {
  def main(args: Array[String]): Unit = {
    val stu = new Student400
    val emp = new Emp400
    test(stu)
    test(emp)
  }

  def test(p:Person400): Unit ={
    if(p.isInstanceOf[Emp400]){
      //对p的类型没有任何变化，而是返回的是Emp400
      p.asInstanceOf[Emp400].showInfo()
      p.printName()
    }else if(p.isInstanceOf[Student400]){
      p.asInstanceOf[Student400].show()
    }else{
      println("转换失败")
    }
  }
}
class Person400 {

  def printName(){
    println("Person400 printName()")
  }

  def sayHi(){
    println("Person400 sayHi()")
  }
}

class Student400 extends Person400{
  val stuId = 100

  override def printName(): Unit = {
    println("student400 printname")
  }

  def show(): Unit ={
    println("student400学生id是：" +this.stuId)
  }


}

class Emp400 extends Person400{
  var stuId = 400

  override def printName(): Unit = {
    println("Emp400 printname")
  }

  def showInfo(): Unit ={
    println("Emp400学生id是：" +this.stuId)
  }


}