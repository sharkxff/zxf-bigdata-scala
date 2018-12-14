package com.chapter11

/**
  * @author zxfcode
  * @create 2018-11-20 11:14
  */
object ScanDemo01 {
  def main(args: Array[String]): Unit = {
    def minus(n1:Int,n2:Int):Int={
      //print("("+n1+")"+n2)
      n1 - n2
    }
    def add(n1:Int,n2:Int):Int={
      //print("("+n1+")"+n2)
      n1 + n2
    }


    //5 (1,2,3,4,5)  => (5,4,2,-1,-5,-10)  (5, 5-1, 4-2, 2-3, -1-4 , -5-5)
    val i8 = (1 to 5).scanLeft(5)(minus)   //IndexedSeq[Int]  i8
    println(i8)

    //(1,2,3,4,5)5==>(20,19,17,14,10,5)  ====  (1+19,2+17,3+14,4+10,5+5,5)
    val i9 = (1 to 5).scanRight(5)(add)
    println(i9)
  }
}
