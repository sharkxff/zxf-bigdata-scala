package com.chapter06.myoop

/**
  * @author zxfcode
  * @create 2018-11-13 16:13
  */
object CatDemo {
  def main(args: Array[String]): Unit = {

    //创建一只猫
    val cat = new Cat
    //给猫的属性赋值

    //说明
    //cat.name其实不是直接访问属性,而是cat.name_$eq("小白") =>setter方法
    //cat.name等价于cat.name()
    cat.name = "小白"
    cat.age = 10
    cat.color = "白色"
    //printf("小猫信息如下:%s %d %s", cat.name, cat.age, cat.color)

    var fish = new Fish
    fish.name //Null
    fish.color //String


    var a = new A

    println("var5="+a.var5)

    var worker1 = new Worker
    worker1.name = "jack"
    var worker2 = new Worker
    worker2.name = "mary" //二者互不影响
  }
}

//定义一个类
//一个class Cat对应的字节码文件只有一个Cat.class ,默认是public
class Cat {
  //定义/生命3个属性
  //说明
  //当我们声明了var name : Stirng 时,在底层对应private name
  //同时会生成两个public方法 name() <=类似=> getter   public name_$eq()=>setter
  var name: String = "" //给初始值
  var age: Int = _ //_表示给age一个默认的值,如果是Int,默认就是0
  var color: String = _ ////_表示给color一个默认的值,如果是String,默认就是""


}

class Dog {
  var name = "jack" //属性可以是一个值类型
  var lover = new Fish //属性也可以是一个引用类型
}

class Fish {
  var name = null // 调用时就是Null来行
  var color: String = null //ok,指定了类型
}

class A {
  var var1: String = _ //null
  var var2: Byte = _ //0
  var var3: Double = _ //0.0
  var var4: Boolean = _ //false
  var var5: Char = _

}

class Worker {
  var name: String = _
}