package com.chapter.ifelse

/**
  * @author zxfcode
  */
object Exercise01 {
  def main(args: Array[String]): Unit = {
    val a = 3
    val b = 100
    val c = 6

    val r = b * b - 4 * a * c //b * b - 4 * a * c会多次使用，因此可以先计算并保存到变量中
    var x1 = 0.0
    var x2 = 0.0
    //    var sum = 0
    //    sum = a * x * x + b * x + c
    if (r > 0) {
      x1 = (-b + math.sqrt(r)) / (2 * a)
      x2 = (-b - math.sqrt(r)) / (2 * a)
      println(s"x1 = ${x1.formatted("%.2f")} \t x2 = ${x2.formatted("%.2f")}")
    } else if ((r) == 0) {
      x1 = -b / (2 * a)
      println(s"x = $x1")
    } else {
      println("无解")
    }
  }
}
