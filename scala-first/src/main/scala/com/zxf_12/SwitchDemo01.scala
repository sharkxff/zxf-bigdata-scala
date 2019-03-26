package com.chapter12

/**
  * @author zxfcode
  * @create 2018-11-20 15:11
  */
object SwitchDemo01 {
  def main(args: Array[String]): Unit = {
    val oper = '#'
    val n1 = 10
    val n2 = 20
    var res = 0

    //match(类似java switch)和case是关键字
    oper match {
      case '+' => res = n1 + n2
      case '-' => res = n1 - n2
      case '*' => res = n1 * n2
      case '/' => res = n1 / n2
      //如果case后有条件守卫if，_不表示默认匹配，表示忽略传入的ch
      //      case _ if n1.toString.equals(n2)=> n1
      //      case _ if (oper > 0)=> n1 //守卫
      case _ => println("oper") //第一次匹配到后不往后匹配
      case _ => println("oper error")
    }

   // println("res = " + res)

    for (ch <- "+-3!") {
      var sign = 0
      var dight = 0
      ch match {
        case _ => dight = 3  //不往下匹配，忽略传入的ch
        case '+' => sign = 1
        case '-' => sign = -1
      }
      println(ch + "  " + sign + "  " + dight)
    }
  }
}
