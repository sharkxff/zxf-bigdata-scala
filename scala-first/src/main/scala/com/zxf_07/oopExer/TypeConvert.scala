package com.chapter07.oopExer

/**
  * @author zxfcode
  * @create 2018-11-16 10:21
  */
object TypeConvert {
  def main(args: Array[String]): Unit = {
    println(classOf[String])

    var a = "zhangsan"
    println(a.getClass.getName) //使用反射机制

    //isInstanceOf  asInstanceOf
    var p1 = new Person200
    var emp1 = new Emp200
    //将子类引用给父类（向上转型，自动）
    p1 = emp1
    //将父类的引用重新转成子类引用（多态），即向下转型
    var emp2 = p1  //emp2是person200类型的
    var emp3 = p1.asInstanceOf[Emp200]  //emp2是emp200类型的

    emp3.sayHello()
  }
}
class Person200 {
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

class Emp200 extends Person200 {
  override def printName(){
    super.printName()
    println("Emp100 printAge" + age)
    sayHi()
  }

  def sayHello(): Unit ={
    println("Emp200 sayHello")
  }
}