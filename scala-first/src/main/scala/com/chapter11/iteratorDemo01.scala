package com.chapter11

/**
  * @author zxfcode
  * @create 2018-11-20 11:55
  */
object iteratorDemo01 {
  def main(args: Array[String]): Unit = {
    val list11 = List(8,1,2,3,4,7).iterator  //得到迭代器
    while (list11.hasNext){
      print(list11.next() +"\t")
    }

    //需要重新置到最开头的指针
    println("\n方式二")
    val list33 = List(8,1,9,2,3,4,7).iterator
    for( item <- list33){
      print(item +"\t")
    }
  }
}
