package com.chapter.mybreak
import  util.control.Breaks._
/**
  * @author zxfcode
  */
object BreakDemo {
  def main(args: Array[String]): Unit = {
    breakable{
      for(i <- 1 to 10){
        println(" i = "+i)
        if( i == 20){
          break()
        }
      }
    }

  }
}
