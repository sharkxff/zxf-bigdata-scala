package com.chapter11

/**
  * @author zxfcode
  * @create 2018-11-20 11:48
  */
object ZipDemo01 {
  def main(args: Array[String]): Unit = {
    //将两个集合进行 对偶元祖合并 --拉链
    val list1 = List(1,2,3,4) //List((1,5), (2,6), (3,7))，个数不对应会丢失数据
    val list2 = List(5,6,7)
    //List((1,5), (2,6), (3,7))  对偶
    val list3 = list1.zip(list2)
    println(list3)

    for(item <- list3){
      println(item._1 +"->"+item._2)
    }
  }
}
