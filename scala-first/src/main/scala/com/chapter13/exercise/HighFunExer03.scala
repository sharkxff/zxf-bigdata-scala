package com.chapter13.exercise

/**
  * @author zxfcode
  * @create 2018-11-22 11:40
  */
object HighFunExer03 {
  def main(args: Array[String]): Unit = {
    /*
    5、编写函数largest(fun:(Int)=>Int,inputs:Seq[Int]),输出在给定输入序列中给定函数的最大值。
    举例来说，largest(x=>10x-xx,1 to 10)应该返回25.不得使用循环或递归
     */
    def largest(fun: (Int) => Int, inputs: Seq[Int]) {
      println(inputs.map { fun }.max)
    }
    largest(x => 10*x - x * x, (1 to 5))
  }

}
