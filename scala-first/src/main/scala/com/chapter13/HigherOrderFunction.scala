package com.chapter13

/**
  * @author zxfcode
  * @create 2018-11-21 14:41
  */
object HigherOrderFunction {
  def main(args: Array[String]): Unit = {


    def test22(f: Double => Double,f2 :Double => Int, n1: Double) = {
      f(f2(n1))
    }

    def sum22(d: Double): Double = {
      d + d
    }
    def mod22(d:Double) : Int = {
      d.toInt % 2
    }

    val res = test22(sum22,mod22,6.0)  //0.0   (6%2)+(6%2)
    println(res)
  }
}
