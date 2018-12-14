package com.chapter.myfor

/**
  * @author zxfcode
  */
object usefor {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 3; j = i * 2) {
      //println("i = " + i + "\tj = " + j)
    }
    //println("-------------------")
    //等价
    for {
      i <- 1 to 3
      j = i * 2 } {
      //println("i = " + i + "\tj = " + j)
    }

    //控制步长
    for( i <- 1 to 10){
      //println("i = " = i)
    }
    //步长控制为2
    //Range(1,10,3) 对应的构建方法是 def apply(start:Int,end:Int,step:Int):Range = new Range (start,end,step)
    for( i <- Range(1,10,2)){
      //println("i = " + i)
    }

    //方式2：守卫
    for( i <- 1 to 10 if i %2 ==1){
      println("i = " + i)
    }
  }
}
