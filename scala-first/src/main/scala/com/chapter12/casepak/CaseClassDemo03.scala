package com.chapter12.casepak

/**
  * @author zxfcode
  * @create 2018-11-21 10:21
  */
object CaseClassDemo03 {
  def main(args: Array[String]): Unit = {
    val amt = new Currency3(3000.0,"RMB")
    val amt2 = amt.copy()  //类似于克隆
    println("amt2.value" + amt2.value+"\tamt2.unit" + amt2.unit)
    println(amt2)  //底层重写了toString方法
    //克隆时更改值
    val amt3 = amt.copy(value = 8000.0)
    println(amt3)
    val amt4 = amt.copy(unit = "英镑")
    println(amt4)
  }
}
abstract class Amount3
case class Dollar3(value: Double) extends Amount3
case class Currency3(value: Double, unit: String) extends Amount3
case object NoAmount3 extends Amount3
