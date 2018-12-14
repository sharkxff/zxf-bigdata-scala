package com.chapter13.exercise

/**
  * @author zxfcode
  * @create 2018-11-22 9:57
  */
object HighFunExer01 {
  /*
  编写一个compose函数，将两个类型为Double=>Option[Double]的函数组合在一起，产生另一个同样类型的函数。
  如果其中一个函数返回None，则组合函数也应返回None。例如：
def f(x : Double) = if ( x >= 0) Some(sqrt(x)) else None
def g(x : Double) = if ( x != 1) Some( 1 / ( x - 1)) else None
val h = compose(f,g)
h(2)将得到Some(1)，而h(1)和h(0)将得到None

   */
  def main(args: Array[String]): Unit = {
    val h = compose(f(1),g(1))(1)
    println(h)
  }

  def compose(f1: Option[Double], f2: Option[Double])(hy: Double): Option[Double] = {
    if (f1 != None && f2 != None) {
      if (hy >= 1) f2 else f1
    } else {
      None
    }
  }

  def f(x: Double) = if (x >= 0) Some(math.sqrt(x)) else None

  def g(x: Double) = if (x != 1) Some(1 / (x - 1)) else None

}
