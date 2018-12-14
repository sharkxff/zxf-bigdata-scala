package com.chapter11

/**
  * @author zxfcode
  * @create 2018-11-20 14:12
  */
object ViewDemo01 {
  def main(args: Array[String]): Unit = {
    var viewSquares1 = (1 to 100).filter(eq)
    println(viewSquares1)
    //view,用到的时候再给数据，不会调eq，体现出缓存特性
    //map,filter,reduce,fold....不希望立即执行，在使用时才执行，可以哟个view来优化
    var viewSquares2 = (1 to 100).view.filter(eq)
    println(viewSquares2)

    //遍历,会调eq
    for (item <- viewSquares2){
      println("item = " + item)
    }
  }


  def eq(i:Int):Boolean={
    //println("eq")
    i.toString.equals(i.toString.reverse)
  }
}
