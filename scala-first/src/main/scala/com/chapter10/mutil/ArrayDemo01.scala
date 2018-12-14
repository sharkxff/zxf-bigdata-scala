package com.chapter10.mutil

/**
  * @author zxfcode
  * @create 2018-11-19 10:01
  */
object ArrayDemo01 {
  def main(args: Array[String]): Unit = {
    //定长数组只有置空，不可以删除

    //使用的时 object Array的apply
    //直接初始化数组，因为给了整数和字符串，这里数组的泛型就是Any
    var arr02 = Array(1,2,3,"xxx")
    for(i <- arr02){
      println(i)
    }

    //传统方式
    for(index <- 0 to arr02.length-1){
      printf("arr02[%d]=%s",index,arr02(index)+"\t")
    }
    println()
    println("***********************************")

    //[Int] 类型  [Any]任意类型  没有赋值时，默认值为类型的初始值，这里为0
    val arr01= new Array[Int](4)  //底层int[] arr01 = new int[4]
    println(arr01.length)
    println("arr01(0)="+arr01(0))

    //遍历
    for(i <- arr01){
      println(i)
    }
    println("====================")
    //修改第四个
    arr01(3) = 10
    for(i <- arr01){
      println(i)
    }
  }
}

