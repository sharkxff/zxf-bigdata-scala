package com.chapter10.setdemo

import scala.collection.mutable

/**
  * @author zxfcode
  * @create 2018-11-19 19:22
  */
object SetMutable {
  def main(args: Array[String]): Unit = {
    val set2 = mutable.Set(1,2,"hello")
    set2.add(4)
    println(set2)

    set2 += 6
    println(set2)

    set2.+=(5)
    println(set2)

    set2 -= 2
    println(set2)

    set2.remove("hello")
    println(set2)

    for(x <- set2)println(x)
  }
}
