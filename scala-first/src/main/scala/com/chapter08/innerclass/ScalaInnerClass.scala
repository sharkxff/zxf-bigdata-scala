package com.chapter08.innerclass

/**
  * @author zxfcode
  * @create 2018-11-17 14:23
  */
object ScalaInnerClass {
  def main(args: Array[String]): Unit = {
    val outer1 : ScalaOuterClass = new ScalaOuterClass();
    val outer2 : ScalaOuterClass = new ScalaOuterClass();

    // Scala创建内部类的方式和Java不一样，将new关键字放置在前，使用  对象.内部类  的方式创建
    val inner1 = new outer1.ScalaInnerClass()
    val inner2 = new outer2.ScalaInnerClass()

    //做了类型投影
    inner1.test(inner2)  //不做类型投影这里会报错，因为内部类是外部类的对象
    //创建静态内部类对象
    val staticInner = new ScalaOuterClass.ScalaStaticInnerClass()
    println(staticInner)
  }
}

//方式1、使用外部类.this.属性
class ScalaOuterClass {
  var name : String = "scott"
  private var sal : Double = 1.2

  class ScalaInnerClass { //成员内部类
    def info() = {
      // 访问方式：外部类名.this.属性名
      // 怎么理解 ScalaOuterClass.this 就相当于是 ScalaOuterClass 这个外部类的一个实例,
      // 然后通过 ScalaOuterClass.this 实例对象去访问 name 属性
      // 只是这种写法比较特别，学习java的同学可能更容易理解 ScalaOuterClass.class 的写法.
      println("name = " + ScalaOuterClass.this.name + " sal =" + ScalaOuterClass.this.sal)
    }
    //ScalaOuterClass02#ScalaInnerClass02屏蔽外部对象对内部对像的影响
    def test( ic : ScalaOuterClass#ScalaInnerClass ) : Unit = {
      System.out.println(ic);
    }
  }
}
object ScalaOuterClass {  //伴生对象
class ScalaStaticInnerClass { //静态内部类
}
}

//方法2、使用别名 别名.属性
class ScalaOuterClass02 {
  myOuter =>  //这样写，你可以理解成这样写，myOuter就是代表外部类的一个对象.
  class ScalaInnerClass02 { //成员内部类
    def info() = {
      println("name = " + ScalaOuterClass02.this.name + " age =" + ScalaOuterClass02.this.sal)
      println("-----------------------------------")
      println("name = " + myOuter.name + " age =" + myOuter.sal)
    }


  }

  // 当给外部指定别名时，需要将外部类的属性放到别名后.
  var name : String = "scott"
  private var sal : Double = 1.2
}
object ScalaOuterClass02 {  //伴生对象
class ScalaStaticInnerClass02 { //静态内部类
}
}