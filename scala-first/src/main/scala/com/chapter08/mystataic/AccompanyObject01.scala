package com.chapter08.mystataic

/**
  * @author zxfcode
  * @create 2018-11-16 15:14
  */
object AccompanyObject01 {
  def main(args: Array[String]): Unit = {
    //println(ScalaPerson.sex)  //ScalaPerson$.MODULE$.sex()

    //ScalaPerson.sayHi()   //ScalaPerson$.MODULE$.sayHi()


    var t:Byte = 23
    var y:Byte = 34
    var vv = t+y
    val num = 6
    for (i <- 0 to num) {
      printf("%d + %d = %d\n", i, (num - i), num)
    }

  }
}

//在同一个文件中，有class ScalaPerson和object ScalaPerson

//伴生类，非静态的内容，编译后，底层生成ScalaPerson.class
class ScalaPerson {
  var name: String = _
}

//伴生对象，静态内容在里面编译后，底层生成ScalaPerson$.class
//可直接通过ScalaPerson.属性  或者方法
object ScalaPerson {
  var sex: Boolean = true
  def sayHi(): Unit ={

  }
}