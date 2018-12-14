package com.hanshushi.homework

/**
  * @author zxfcode
  * @create 2018-11-13 19:46
  */
object Exercise02 {
  def main(args: Array[String]): Unit = {
    val a = {}
    //println(a) //() Unit类型

    //针对下列Java循环编写一个Scala版本:
    //for(int i=10;i>=0;i–)System.out.println(i);
    //getFor()

    //编写一个过程countdown(n:Int)，打印从n到0的数字
    //countdown(8)
    //编写一个for循环,计算字符串中所有字母的Unicode代码（toLong方法）的乘积。
    // 举例来说，"Hello"中所有字符串的乘积为9415087488L
    //    println(getWordPlus("Hello"))

    //同样是解决前一个练习的问题，请用StringOps的foreach方式解决。

    //println(getWordPlus2("Hello"))

    //编写一个函数product(s:String)，计算字符串中所有字母的Unicode代码（toLong方法）的乘积
    //把7练习中的函数改成递归函数
    //println("hello".drop(1))  //ello
    println(getWordPlus3("Hello"))

  }

  def getFor() {
    for (i <- 0 to 10 reverse) {
      println(i)
    }
  }

  def countdown(n: Int): Unit = {
    for (i <- 0 to n reverse) {
      println(i)
    }
  }

  def countdown2(n: Int) {
    1 to n foreach println
  }

  def getWordPlus(n: String): Long = {
    var plusSum = 1L
    for (i <- 1 to n.length) {
      plusSum *= n(i - 1)
    }
    return plusSum
  }

  def getWordPlus2(n: String): Long = {
    var plusum = 1L
    n.foreach(plusum *= _)
    plusum
  }

  //递归
  def getWordPlus3(str: String): Long = {
    if(str.length == 1){
      str(0)
    }else{
      str.charAt(0) * getWordPlus3(str.drop(1))
    }
  }
}
