package com.chapter13.exercise

/**
  * @author zxfcode
  * @create 2018-11-22 10:51
  */
object ReduceExer01 {
  def main(args: Array[String]): Unit = {
    /*
    如何用reduceLeft得到数组Array(1,333,4,6,4,4,9,32,6,9,0,2)中的最大元素?
     */
    println(Array(1, 333, 4, 6, 4, 4, 9, 32, 6, 9, 0, 2).reduceLeft(getMax))

    /*
    4、用to和reduceLeft实现阶乘函数,不得使用循环或递归
     */
    println((1 to 5).reduceLeft(getPlus))
  }

  def getMax(num: Int, num2: Int): Int = {
    if (num > num2) num else num2
  }

  def getPlus(num: Int, num2: Int): Int = {
    num * num2
  }
}
