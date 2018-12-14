package com.chapter13

/**
  * @author zxfcode
  * @create 2018-11-21 15:52
  */
object ClosureDemo02 {
  def main(args: Array[String]): Unit = {
    val str1 = "hello"
//    str1.checkEq(("HellO")(eq))
    val bool = str1.checkEq("HelLO~")(eq)
    val boo22 = str1.checkEq("HEllo")(_.equals(_))
    println(bool)
    println(boo22)
  }
  def eq(s1:String,s2:String): Boolean ={
    s1.equals(s2)
  }
  implicit class Rest(s:String){
    def checkEq(ss:String)(f:(String,String) => Boolean): Boolean ={
      f(s.toLowerCase,ss.toLowerCase)
    }
  }
}
