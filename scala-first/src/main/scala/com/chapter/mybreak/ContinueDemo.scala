package com.chapter.mybreak


/**
  * @author zxfcode
  */
object ContinueDemo {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10 if(i != 2 && 2 != 3)){
      println("i = " +i)
    }

    for (i <- 1 to 10 ){
      if(i != 2 && 2 != 3){
        println("i = " +i)
      }
    }
  }
}
