package com.chapter10.homework


import scala.collection.mutable
import scala.collection.mutable.{ArrayBuffer, ListBuffer}

/**
  * @author zxfcode
  * @create 2018-11-19 19:27
  */
object Exercise01 {
  def main(args: Array[String]): Unit = {
    /*
    编写一段代码，将a设置为一个n个随机整数的数组，要求随机数介于0和n之间
     */
    var a =new ArrayBuffer[Int]()
    for(i <- 0 to 5){
      a += scala.util.Random.nextInt()
    }
    println(a)

    /*
    编写一个循环，将整数数组中相邻的元素置换。比如Array(1, 2, 3, 4, 5)置换后为Array(2, 1, 4, 3, 5)
     */
    var b = ArrayBuffer[Int](1,2,3,4,5)
    for(i <- 0 until (b.length-1,2)){
      var tem = b(i+1)
      b(i+1) = b(i)
      b(i) = tem
    }
    println(b)

    /*
    给定一个整数数组，产出一个新的数组，包含原数组中的所有正值，以原有顺序排列，
    之后的元素是所有零或负值，以原有顺序排列。
     */
    var c = ArrayBuffer(1,2,3,0,4,5,-2,0,-3)
    var c2 = for(i <- c if (i > 0)) yield i
    for(item <- c if( item <= 0)) {
      c2 += item
    }
    println(c2)

    /*
    设置一个映射，其中包含你想要的一些装备，以及它们的价格。
    然后根据这个映射构建另一个新映射，采用同一组键，但是价格上打9折。
     */
    var d = mutable.Map("aa"->22,"bb"->10,"cc"->20)
    println(d)
    for((k,v) <- d) println(k + ":" + v*0.9)

    /*
    编写一个函数 minmax(values:Array[Int]), 返回数组中最小值和最大值的对偶
     */
    var e = Array[Int](1,2,3,10,4,5,-2,0,-13)
    println(minmax(e))

    /*
    编写一个函数，从一个整型链表中去除所有的零值。
     */
    var list = List(1,2,3,0,5,4,0,6)
    println(removeZero(list))

    /*
    编写一个函数，接受一个字符串的集合，以及一个从字符串到整数值的映射。
    返回整形的集合，其值为能和集合中某个字符串相对应的映射的值。
    举例来说，给定Array(“Tom”,”Fred”,”Harry”)和Map(“Tom”->3,”Dick”->4,”Harry”->5)，返回Array(3,5)。
    提示：用flatMap将get返回的Option值组合在一起。
     */
    var arr02 = Array("Tom","Fred","Harry")
    var map02 = Map("Tom"->3,"Dick"->4,"Harry"->5)
    val ints = getValues(arr02,map02)
//    for (i<- arr99) println(i)

    /*
    实现一个函数，作用与mkStirng相同，提示：使用reduceLeft实现试试
     */
    var list88 = new scala.collection.mutable.HashSet[String] with MktString
    list88 += "1"
    list88 += "6"
    list88 += "8"
    println(list88.mkString("|"))

    val list44 = mutable.ListBuffer(2,3,4,66)
    list44.mkString("|")

    /*
    给定整型列表lst，(lst :\ List[Int]())(_ :: _)得到什么?
    (List[Int]() /: lst)(_ :+ _)又得到什么？
    如何修改他们中的一个，以对原列表进行反向排列?
     */

    val lst = List[Int](1,2,4,6,9)
    val ints22 = (lst :\ List[Int](3,6))(_ :: _)
    val ints33 = (List[Int](7,8) /: lst)(_ :+ _)
    val ints44 = (List[Int]() :\ lst)(_ :: _)
    println(ints22)
    println(ints33)
    println(ints44)

    /*
    编写一个函数，将Double数组转换成二维数组。传入列数作为参数。
    距离来说，传入Array(1,2,3,4,5,6)和3列，返回Array(Array(1,2,3), Array(4,5,6))。
     */
    val arr999 = Array(1,2,3,4,5,6)
    var err = getArr(arr999,3)
    for(item <- err){
      print(item)
    }

//    def getMkString(f22:String,split2:String):ListBuffer[Any]={
//
//    }
//    def f22(n1:String):String={
//    n1.toString
//    }
  }
  def getArr(arr:Array[Int],n:Int): Array[Int] ={
    var arrin = ArrayBuffer[Int](n)
    var arrzong = ArrayBuffer[Int](arr.length/n )
    for (item <- 0 until (arr.length,n)){
      arrin += item
    }
    arrzong.appendAll(arrin)
    arrzong.toArray
  }


  trait MktString {
    this: mutable.Iterable[String] =>
    def mktString(split: String = "") = if (this != Nil) this.reduceLeft(_ + split + _)
  }


  def getValues(values:Array[String],map:Map[String,Int]) : Array[Int] = {
    var list5 = ArrayBuffer[Int]()
    for (i <- values) {
      if(map.contains(i)){
        list5.append(map(i) )
      }
    }
    list5.toArray
  }
  def minmax(values : Array[Int]) ={
    (values.max,values.min)
  }

  def removeZero(values : List[Int]):List[Int]={
    values.filter(_ != 0)
  }

}
