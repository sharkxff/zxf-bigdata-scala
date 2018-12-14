package com.chapter09.conversion

/**
  * @author zxfcode
  * @create 2018-11-17 15:09
  */
object ImplicitDemo01 {
  def main(args: Array[String]): Unit = {
    //编写一个隐式函数转成Double->Int转换

    implicit def f1(d: Double): Int = {  //底层转换成了f1$1
      d.toInt
      //val num:Int = 3.4 //会报错，隐式引用不能嵌套使用，这里相当于f1$1(3.4)，递归了
    }
    var num: Int = 3.5   //底层：f1$1(num)
    println("num= " + num)

  }
}
