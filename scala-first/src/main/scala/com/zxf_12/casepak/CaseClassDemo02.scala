package com.chapter12.casepak

/**
  * @author zxfcode
  * @create 2018-11-21 10:21
  */
object CaseClassDemo02 {
  def main(args: Array[String]): Unit = {
    //用了样例类匹配起来更简洁
    for (amt <- Array(Dollar2(1000.0), Currency2(1000.0, "RMB"), NoAmount2)) {
      val result = amt match {
        //说明
        case Dollar2(v) => "$" + v // $1000.0
        //说明
        case Currency2(v, u) => v + " " + u // 1000.0 RMB
        case NoAmount2 => "" // ""
      }
      println(amt + ": " + result)
    }

  }
}
abstract class Amount2  //项
case class Dollar2(value: Double) extends Amount2
case class Currency2(value: Double, unit: String) extends Amount2
case object NoAmount2 extends Amount2
