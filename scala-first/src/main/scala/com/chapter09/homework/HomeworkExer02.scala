package com.chapter09.homework

import scala.collection.mutable.ArrayBuffer

/**
  * @author zxfcode
  * @create 2018-11-18 16:44
  */
object HomeworkExer02 {
  def main(args: Array[String]): Unit = {
    /*
    2.编写一个循环，将整数数组中相邻的元素置换。比如Array(1, 2, 3, 4, 5)置换后为Array(2, 1, 4, 3, 5)
     */
    var arr = Array(1, 2, 3, 4, 5)
    for (i <- 1 until(arr.length, 2)) {
      var temp = arr(i - 1)
      arr(i - 1) = arr(i)
      arr(i) = temp
    }
    //for (ele <- arr) println(ele)


    /*
    3.给定一个整数数组，产出一个新的数组，包含原数组中的所有正值，
    以原有顺序排列，之后的元素是所有零或负值，以原有顺序排列。
     */
    var intarr = ArrayBuffer(1, 2, -3, 5, -4, 6)
    var intarr02 = for (elem <- intarr if (elem > 0)) yield elem
    for (elem <- intarr if (elem <= 0)) intarr02 += elem
    //for (elem <- intarr02) println(elem)

    /*
    4.设置一个映射，其中包含你想要的一些装备，以及它们的价格。
    然后根据这个映射构建另一个新映射，采用同一组键，但是价格上打9折。
     */
    var map04 = Map("aa" -> 4, "bb" -> 5, "cc" -> 6)
    var map042 = for ((k, v) <- map04) yield (k -> v * 0.9)
    for ((k, v) <- map042) {
      //println(k + ":" + v)
    }

    /*
    5.编写一个函数 minmax(values:Array[Int]), 返回数组中最小值和最大值的对偶
     */
    var arr05 = Array(1, 5, 7, 9, 33, 23, 11)

    def minmax(arr: Array[Int]) = {
      (arr.min,arr.max)
    }
//    println(minmax(arr05))

    /*
    编写一个函数，从一个整型链表中去除所有的零值。
     */
    def removeZero(list : List[Int]):List[Int] ={
      list.filter( _ != 0)
    }
    var arr06 = List(2,3,4,0,5,6,0,1)
    println(removeZero(arr06))

  }

}
