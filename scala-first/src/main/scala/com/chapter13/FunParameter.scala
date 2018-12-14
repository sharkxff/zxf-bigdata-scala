package com.chapter13

/**
  * @author zxfcode
  * @create 2018-11-21 14:24
  */
object FunParameter {
  def main(args: Array[String]): Unit = {
    def plus(x:Int) = 3+x
    val result11 = Array(1,2,3,4).map(plus)  //4,5,6,7
    println(result11.mkString(","))

    //scala中函数也有类型，plus就是<function1>   .map(plus(_))，里面_是map遍历出来的数据
    println("plus函数类型为：" + plus _)
    //plus函数类型为：<function1>  类型跟函数的参数个数有关，这里是一个参数--function1
  }
}
