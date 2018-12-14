package com.hanshushi.demo

/**
  * @author zxfcode
  * @create 2018-11-13 14:17
  */
object VarParameters {
  def main(args: Array[String]): Unit = {

    println(sum(10, 30, 10, 3, 45, 7))

    val res = sum(10,20) //直接被执行
    //只能修饰val的
    lazy val res2 = sum(10,20) //res被用了才会执行sum函数

    println("------------------")
    println("res2 = " + res2)  //此时res2执行了

    def f1 = "vasanna"
    //等价于
    def f2()={
      "vasanna"
    }
  }

  def sum(n1: Int, args: Int*): Int = {
    println("args.length" + args.length)
    var sum = n1
    for (item <- args) {
      sum += item
    }
    sum
  }
}
