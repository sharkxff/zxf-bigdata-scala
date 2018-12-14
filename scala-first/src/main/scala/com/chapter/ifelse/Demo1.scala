package com.chapter.ifelse

/**
  * @author zxfcode
  */
object Demo1 {
  def main(args: Array[String]): Unit = {

    val num1 = 3;
    val num2 = 10;
    val sum = num1 + num2
    if(sum %3 ==0 && sum %5 ==0){
      println("$sum 可以被整除")
    }else{
      println("$sum 不可以被整除")
    }

    val year = 2018
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
      println(s"${year} 是闰年")
    }else{
      println(s"${year} 不是闰年")
    }
  }
}
