package com.chapter13.dataConsructExer

import scala.collection.mutable
import scala.collection.mutable.{ArrayBuffer, ListBuffer}

/**
  * @author zxfcode
  * @create 2018-11-22 13:57
  */
object OneExer {
  def main(args: Array[String]): Unit = {
    /*
    编写一段代码，将a设置为一个n个随机整数的数组，要求随机数介于0和n之间。
     */
    var a = ListBuffer[Long]()
    for (i <- 0 to 5) {
      a += scala.util.Random.nextInt(5)
    }
    //println(a)

    /*
    编写一个循环，将整数数组中相邻的元素置换。比如Array(1, 2, 3, 4, 5)置换后为Array(2, 1, 4, 3, 5)
     */
    var arr = mutable.ArrayBuffer(2, 3, 4, 5, 1, 7)
    for (item <- 0 to(arr.length - 1, 2)) {
      arr(item) = arr(item) + arr(item + 1)
      arr(item + 1) = arr(item) - arr(item + 1)
      arr(item) = arr(item) - arr(item + 1)
    }
    //println(arr)

    /*
    给定一个整数数组，产出一个新的数组，包含原数组中的所有正值，以原有顺序排列，
    之后的元素是所有零或负值，以原有顺序排列。
     */
    val list = ListBuffer(3, -1, 2, -3, 9, 4, -8)
    val list22 = for (item <- list if (item > 0)) yield item
    for (item <- list if (item <= 0)) {
      list22 += item
    }
    //println(list22)

    /*
    设置一个映射，其中包含你想要的一些装备，以及它们的价格。
    然后根据这个映射构建另一个新映射，采用同一组键，但是价格上打9折。
     */
    var map11 = mutable.Map(("hh", 22), ("ll", 33), ("ee", 44))
    var map22 = mutable.Map[String, Double]()
    map22 = for ((k, v) <- map11) yield (k, v * 0.9)
    //println(map22)

    /*
    编写一个函数 minmax(values:Array[Int]), 返回数组中最小值和最大值的对偶
     */
    def minmax(values: Array[Int]) = {
      (values.min, values.max)
    }
    //println(minmax(Array(33,55,22,11,66)))

    /*
    编写一个函数，从一个整型链表中去除所有的零值。
     */
    val seq = Seq(3, 2, 0, 5, 4, 0, 9).collect {
      case i if (i > 0) => i
    }
    //println(seq)

    /*
    编写一个函数，接受一个字符串的集合，以及一个从字符串到整数值的映射。
    返回整形的集合，其值为能和集合中某个字符串相对应的映射的值。
    举例来说，给定Array(“Tom”,”Fred”,”Harry”)和Map(“Tom”->3,”Dick”->4,”Harry”->5)，返回Array(3,5)。
    提示：用flatMap将get返回的Option值组合在一起。
     */
    //    def getFlatMap(arr:Array[String],maps:mutable.Map[String,Int]):Array[Int]={
    //      val arr33 = ArrayBuffer[Int]()
    //      val keylist = maps.map(_._1)
    //      for(item <- arr){
    //        if(item.equals(keylist.foreach((x:String)=>x))){
    //          arr33 += maps(item)
    //        }
    //      }
    //      arr33.toArray
    //    }
    def getOption(arr: Array[String], maps: Map[String, Int]): Array[Int] = {
      //for (item <- arr) println(item)
      //扁平化arr,去除arr里的每一个元素
      arr.flatMap(maps.get(_))
    }

    //println("********************************")
    val arrs = Array("Tom", "Fred", "Harry")
    val maps = Map("Tom" -> 3, "Harry" -> 4)
    for (elem <- getOption(arrs, maps)) {
      //println(elem)
    }

    /*
    实现一个函数，作用与mkStirng相同，提示：使用reduceLeft实现试试
     */
    def getMk(arr: Array[Any], split: String) = {
      arr.reduceLeft(_ + split + _)
    }

    // println(getMk(Array(2, 3, 4, 1), "|"))

    /*
    给定整型列表lst，(lst :\ List[Int]())(_ :: _)得到什么?
    (List[Int]() /: lst)(_ :+ _)又得到什么？如何修改他们中的一个，以对原列表进行反向排列?
     */
    val lstss = List(3, 2, 5, 6)
    println((lstss :\ List[Int]()) (_ :: _))
    println((List[Int]() /: lstss) (_ :+ _))
    println((lstss :\ List[Int]()) ((a, b) => b :+ a))

    /*
    编写一个函数，将Double数组转换成二维数组。传入列数作为参数。
    距离来说，传入Array(1,2,3,4,5,6)和3列，返回Array(Array(1,2,3), Array(4,5,6))。
     */
    def getGroup(arrs:Array[Int],i:Int)={
      arrs.grouped(i).toArray
    }

    println(getGroup(Array(3, 4, 2, 6, 4, 7, 5, 7, 8, 9), 5).foreach(a=>println(a.mkString(","))))
  }
}
