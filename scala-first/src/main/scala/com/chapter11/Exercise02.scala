package com.chapter11

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
  * @author zxfcode
  * @create 2018-11-20 11:24
  */
object Exercise02 {
  def main(args: Array[String]): Unit = {
    val sentence = "AAAAAAABBBBBBBCCCCCCCDDDDD"
    val arrBuffer = new ArrayBuffer[Char]()

    sentence.foldLeft(arrBuffer)(putArray)
    println(arrBuffer)

    val map22 = sentence.foldLeft(Map[Char,Int]())(charCount)
    println(map22)

    //可变map作为左折叠的第一个参数
    val map33 = mutable.Map[Char,Int]()
    sentence.foldLeft(map33)(charImCount)
    println(map33)

    //wordcount,并且根据个数排序
    val lines = List("atguigu han heello","atguigu aaa aaa aaa ccc ddd uuu")
  }


  def putArray(arr: ArrayBuffer[Char], c: Char): ArrayBuffer[Char] = {
    arr.append(c)
    arr
  }

  //效率低
  def charCount(map: Map[Char, Int], char: Char): Map[Char, Int] = {
    map + (char -> (map.getOrElse(char,0)+1))
  }
//可变map,效率高
  def charImCount(map: mutable.Map[Char, Int], char: Char): mutable.Map[Char, Int] = {
    map += (char -> (map.getOrElse(char,0)+1))
  }

}
