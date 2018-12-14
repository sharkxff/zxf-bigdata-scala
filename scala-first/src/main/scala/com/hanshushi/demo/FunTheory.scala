package com.hanshushi.demo

/**
  * @author zxfcode
  */
object FunTheory {
  def main(args: Array[String]): Unit = {
    val n1 = 10
    val n2 = 20
    println("res = "+getRes(1,2,'）'))
  }
  def getRes(n1:Int, n2:Int,oper:Char)= {
    if (oper == '+') {
      n1 + n2 //可以不写return
    } else if (oper == '-') {
      n1 - n2
    } else {
      //说明输入有问题
      null
    }
  }
}
