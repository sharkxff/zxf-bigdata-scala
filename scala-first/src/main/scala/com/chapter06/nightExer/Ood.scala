package com.chapter06.nightExer

/**
  * @author zxfcode
  * @create 2018-11-14 18:07
  */
object Ood {
  def main(args: Array[String]): Unit = {
    //    println(getNum(4))
    //    println(getNum(3))
//    getImage(3, 2, "*")
    println(getColector(3,2,"/"))
  }


  def getNum(num: Int): String = {
    if (num % 2 == 0) {
      "ood"
    } else {
      "not ood"
    }
  }

  def getImage(line: Int, col: Int, fu: String): Unit = {
    for (i <- 0 to line) {
      for (j <- 0 to col) {
        print(fu)
      }
      println()
    }
  }

  def getColector(n: Int, m: Int, co: String) = {
    if("+".equals(co)){
      n+m
    }else if("-".equals(co)){
      n-m
    }else if("*".equals(co)){
      n*m
    }else{
      n/m
    }
  }
}
