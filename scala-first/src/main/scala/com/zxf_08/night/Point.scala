package com.chapter08.night

/**
  * @author zxfcode
  * @create 2018-11-16 20:54
  */
object Point01 {

  def apply(x: Int, y: Int): Point01 = new Point01(x, y)
}

class Point01(x: Int, y: Int) {
  var m: Int = x
  var n: Int = y

}
object test{
  def main(args: Array[String]): Unit = {
    val p1 = Point01(3,4)
    println(p1.m,p1.n)
  }
}
