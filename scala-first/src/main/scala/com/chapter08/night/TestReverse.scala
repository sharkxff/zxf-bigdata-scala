package com.chapter08.night

/**
  * @author zxfcode
  * @create 2018-11-16 20:58
  */
object TestReverse {
  def main(args: Array[String]): Unit = {
    //toRever("hello world")
  }
}

object toRever extends App{
  for ( i <- args.reverse){
    println(i + " ")
  }
}