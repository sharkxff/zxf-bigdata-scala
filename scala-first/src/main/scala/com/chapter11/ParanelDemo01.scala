package com.chapter11

/**
  * @author zxfcode
  * @create 2018-11-20 14:32
  */
object ParanelDemo01 {
  def main(args: Array[String]): Unit = {
    (1 to 5).foreach(print(_ ))   //明确指定数据读取后放到哪,等价于foreach(println)
    println("********par**********")
    //结果无序，将println分配给不同cpu
    (1 to 5).par.foreach(println(_))

    val list = List(1,2,3,4,5)
//    list.par.map()  //测试数据快慢


    val result01 = (1 to 10).map{case _ => Thread.currentThread().getName}.distinct
    val result02 = (1 to 10).par.map{case _ => Thread.currentThread().getName}.distinct
    println("=========thread==========")
    println(result01)
    println("=========.par.thread==========")
    println(result02)
  }
}
