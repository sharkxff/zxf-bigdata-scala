package com.chapter13.exercise

/**
  * @author zxfcode
  * @create 2018-11-22 11:03
  */
object DuiouFunExer01 {
  def main(args: Array[String]): Unit = {
    /*
    要得到一个序列的对偶很容易，比如:val pairs = (1 to 10) zip (11 to 20)
    编写函数adjustToPair,该函数接受一个类型为(Int,Int)=>Int的函数作为参数，
    并返回一个等效的, 可以以对偶作为参数的函数。
    举例来说就是:adjustToPair(_*_)((6,7))应得到42。然后用这个函数通过map计算出各个对偶的元素之和
     */
    //val dou = Map((3,4),(2,3))
    val pairs = (1 to 10) zip (11 to 20)
    //Vector((1,11), (2,12), (3,13), (4,14), (5,15), (6,16), (7,17), (8,18), (9,19), (10,20))
    println(pairs)
    println(pairs.map(adjustToPair(_*_)).sum)  //995
    println(adjustToPair(_ * _)(10, 4))  //40
  }

  def adjustToPair(f:(Int,Int) => Int) =(t: Tuple2[Int, Int]) =>{
    f(t._1,t._2)
  }

//  def fun(num1: Int, num2: Int): Int = {
//    num1 * num2
//  }
}
