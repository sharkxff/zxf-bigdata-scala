package com.chapter.ifelse

import scala.io.StdIn

/**
  * @author zxfcode
  */
object exercise {
  def main(args: Array[String]): Unit = {
    println("请输入成绩")
    val score = StdIn.readDouble()
    if(score == 100){
      println("成绩为100分时，奖励一台bmw")
    }else if(score > 80 && score <= 99){//写法1：使用范围  写法2：严格的判断
      println("成绩为(80,99]分时，奖励一台iphone")
    }else if(score >= 60 && score <= 80){//写法1：使用范围  写法2：严格的判断
      println("成绩为[60,80]分时，奖励一台ipad")
    }else{
      println("什么都没有")
    }
  }
}
