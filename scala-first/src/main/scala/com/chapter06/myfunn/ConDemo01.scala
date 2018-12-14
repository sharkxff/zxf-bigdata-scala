package com.chapter06.myfunn

/**
  * @author zxfcode
  * @create 2018-11-14 9:55
  */
object ConDemo01 {
  def main(args: Array[String]): Unit = {

    //val p1 = new Person("jack", 20)
    //println(p1)

    val aa = new AA("jack")
  }
}

class Person(inName: String, inAge: Int) {
  var name: String = inName
  var age: Int = inAge

  override def toString: String = {
    "name = " + this.name + "\tage=" + this.age
  }

  def this(name:String){
    //辅助构造器在第一行必须调用主构造器
    this("jack",10)
    this.name = name
  }
}

class BB{
  println("bb~~~~")
}
class AA extends BB{
  println("AA()")
  def this(name:String){
    this
    println("A this(name:string)")
  }
}