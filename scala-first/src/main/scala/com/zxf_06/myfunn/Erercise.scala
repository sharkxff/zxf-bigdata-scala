package com.chapter06.myfunn

/**
  * @author zxfcode
  * @create 2018-11-14 9:29
  */
object Erercise {
  def main(args: Array[String]): Unit = {
    val ran = new Rangle
    //ran.getRan(5,6)
    //println(ran.getArea(2,3))

    println(isOod(3))
}
  def isOod(n:Int): String ={
    if(n%2==0){
      "Ood"
    }else{
      "notOod"
    }
  }
}

class Rangle{
  def getRan(n:Double,m:Double): Unit ={
    for ( i <- 0 to n.toInt){
      for(j<- 0 to m.toInt){
        print("*")
      }
     println()
    }
  }

  def getArea(len:Double,width:Double): Double ={
    len * width
  }
}
