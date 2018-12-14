package com.chapter11

/**
  * @author zxfcode
  * @create 2018-11-20 10:46
  */
object FoldDemo01 {
  def main(args: Array[String]): Unit = {
    val list1 = List(3, 5, 7,33,12)
    println(list1.foldLeft(10)(minus)) //List(10,3, 5, 7,33,12).reduceLeft(minus)
    println(list1.foldRight(10)(minus))//List(3, 5, 7,33,12,10).reduceRight(minus)

    var list4 = List(1,9)
    var i6 = (1 /: list4)(minus)   //list4.foldLeft(1)(minus)   (1-1)-9

    i6 = (100 /: list4)(minus)

    i6 = (list4 :\ 10)(minus)  //2   list4.foldRight(10)(minus)   1-(9-10)
  }

  def minus(n1:Int,n2:Int):Int={
    //print("("+n1+")"+n2)
    n1 - n2
  }


}
