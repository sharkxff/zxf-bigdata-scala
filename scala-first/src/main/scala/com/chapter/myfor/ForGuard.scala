package com.chapter.myfor

/**
  * @author zxfcode
  */
object ForGuard {
  def main(args: Array[String]): Unit = {
    //引入变量
    for (i <- 1 to 3 if i != 2) {
     // println(i + " ")
    }

    for (i <- 1 to 3; j = 4 - i) {
      //println(j + " ")
    }
    //上述等价于
    for (i <- 1 to 3) {
      val j = 4 - i
      //println(j + " ")
    }

    //多重循环，嵌套循环
    for (i <- 1 to 3;j <- 1 to 3) {
     // println("i = " + i +"\tj = " +j)
    }
    //上述等价于
    for (i <- 1 to 3;j <- 1 to 3) {
      for (j <- 1 to 3) {
       // println("i = " + i + "\tj = " + j)
      }
    }

    //循环返回值  将遍历过程中处理的结果返回到一个新的集合中
    //对1 to 10 进行遍历，  yield i 将每次循环得到的i放入到集合中，并返回给res
    //i这里是一个代码块
    //重要语法特点；将一个集合中各个数据进行处理，并返回给新的集合
    var res = for (i <- 1 to 10) yield i * 2
      //println(res)

    var res2 = for (i <- 1 to 10) yield {
      if(i % 2 == 0){
        i
      }else{
        "不是偶数"
      }
    }
    println(res2)
  }
}
