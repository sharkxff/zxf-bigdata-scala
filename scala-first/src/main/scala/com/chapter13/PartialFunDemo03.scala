package com.chapter13

/**
  * @author zxfcode
  * @create 2018-11-21 14:11
  */
object PartialFunDemo03 {
  def main(args: Array[String]): Unit = {
    //偏函数简写
    val list = List(1, 2, 3, 4, "abc",1.2,5.4,2.2f,2.7f)

//    implicit
    //定义一个偏函数（匿名子类）  接收参数类型Any返回的类型是Int
    def parFun:PartialFunction[Any, Int] ={
      case i: Int => i + 1  //case语句自动转换为偏函数
      case j: Double => (j * 2).toInt   //这里写一个隐式函数来转一下
    }

    val list2 = list.collect(parFun) //做了隐式转换
    println(list2)   //List(2, 3, 4, 5, 2, 10)

    //第二种简写形式
    val list3 = list.collect{case i:Int => i+1}
    println("list3 = " + list3)   //List(2, 3, 4, 5)

    //多种情况
    val list4 = list.collect{
      case i:Int => i+1
      case j:Double => (j*2).toInt
      case k:Float => (k*3).toInt
    }
    println("list4 = "+ list4)  //List(2, 3, 4, 5, 2, 10, 6, 8)
  }
}
