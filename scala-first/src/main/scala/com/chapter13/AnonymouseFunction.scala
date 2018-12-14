package com.chapter13

/**
  * @author zxfcode
  * @create 2018-11-21 14:32
  */
object AnonymouseFunction {
  def main(args: Array[String]): Unit = {

    //不用写def 函数名，返回类型--使用类型推导，=变成了=>，多行使用{}
    val triple = (x: Double) => 3 * x
    val triple22 = (x: Double, y: Double) => {
      //println("x = " + x)   //这里如果有错误提示，用回车换行
      x*y
    }
    println("triple " + triple) //triple <function1>
    println("triple22 " + triple22) //没有参数表示返回类型  triple22 <function2>
    println(triple22(3.4,2.0)) //表示执行 6.8
  }
}
