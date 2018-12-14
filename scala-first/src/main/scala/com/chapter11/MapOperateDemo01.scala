package com.chapter11

/**
  * @author zxfcode
  * @create 2018-11-20 8:55
  */
object MapOperateDemo01 {
  def main(args: Array[String]): Unit = {
    val list1 = List(3, 5, 7)
    var list2 = List[Int]()
    for (item <- list1) {
      list2 = list2 :+ item * 2
    }
    println(list2)   //6,10,14

    //传统方式  1）优点：方式直接，好理解
    // 2） 缺点：不够简洁/高效，没体现函数式编程特点：集合=》新集合=》函数，不利于处理复杂业务
  }
}
