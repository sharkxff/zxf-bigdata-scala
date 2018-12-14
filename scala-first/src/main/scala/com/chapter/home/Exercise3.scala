package com.chapter.home

/**
  * @author zxfcode
  */
object Exercise3 {
  def main(args: Array[String]): Unit = {
    //某人有100,000元,每经过一次路口，需要交费,规则如下:
    //当现金>50000时,每次交5%
//      当现金<=50000时,每次交1000
//    编程计算该人可以经过多少次路口,使用 方式完成

    var sumMoney:Double = 100000.0
    var count = 0
    while(sumMoney>=1000.0){
      if(sumMoney>50000.0){
        sumMoney -= sumMoney*0.05
        count += 1
      }else{
        sumMoney -= 1000
        count += 1
      }
    }
    println(s"可以经过$count 个路口")
  }
}
