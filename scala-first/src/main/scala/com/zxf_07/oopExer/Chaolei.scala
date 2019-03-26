package com.chapter07.oopExer

/**
  * @author zxfcode
  * @create 2018-11-16 10:39
  */
object Chaolei {
  def main(args: Array[String]): Unit = {

    //分析
    //1.因为Scala遵守先构建父类的部分，extends A
    //2.A...
    //3.B...(B的主构造器)
    val b = new B()
    println("===============")
    //4.B辅助构造器
    val b2 = new B("jack")

    //A(pName:String)
    println("=====================")
    val c = new C("zhangsan",20)
    //A...
    //C.....
    //c的名字:zhangsan
    c.showInfo()
  }
}


class A(pName:String){
  var name = "zhangsan"
  println("A...")

  def this(){
    this("A默认")
    println("A默认")
  }
}

class B extends A{
  println("B...")

  def this(name:String){
    this  //必须调用主构造器
    this.name = name
    println("B辅助构造器")
  }
}

class C(cname:String,age:Int) extends A(cname:String){
  println("C.....")

  def this(name:String){
    this(name,10)  //主构造器没有无参的
    println("C辅助构造器")
  }

  def showInfo(): Unit ={
    println("c的名字："+name,"年龄："+age)
  }
}