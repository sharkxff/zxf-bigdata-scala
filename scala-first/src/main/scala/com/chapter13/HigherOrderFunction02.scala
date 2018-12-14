package com.chapter13

/**
  * @author zxfcode
  * @create 2018-11-21 14:48
  */
object HigherOrderFunction02 {
  def main(args: Array[String]): Unit = {
    //minusxy是一个高阶函数--因为返回一个匿名函数--(y: Int) => x - y
    // --这个匿名函数可以用变量接收x涉及到闭包，
    def minusxy(x: Int) = {
      (y: Int) => x - y //注意非法字符的查找，保存到editplus里保存看看
    }

    //f1就是(y:Int) => 3-y
    val f1 = minusxy(3)
    println("f1的类性 = " + f1)   //f1的类性 = <function1>
    println(f1(1))  //2
    println(f1(9))  //-6
    //    println(result33)

    println(minusxy(4)(9))  //4-9 = -5
    println(minusxy _)  //<function1>
  }
}
