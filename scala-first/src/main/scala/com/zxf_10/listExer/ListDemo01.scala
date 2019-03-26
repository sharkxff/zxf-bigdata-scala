package com.chapter10.listExer

/**
  * @author zxfcode
  * @create 2018-11-19 14:07
  */
object ListDemo01 {
  def main(args: Array[String]): Unit = {
    val list01 = List(1,2,3,"hello")
    println(list01)

    val list02 = Nil
    println(list02)

    val value1 = List(1)
    println("value1 = " + value1)

    val list4 = List(3,4,5,"hello")
    val list5 = list4::7::8::9::Nil
//    val list8 = 7::8::9::list4::10  //会报错，最右边应该为集合
    println(list5)  //List(3, 4, 5, hello), 7, 8, 9)

    val list6 = 7::8::9::list4:::Nil

//    val list7 = 7::8::9:::list4  //报错：:::两头都必须是集合，把左边的集合打散放入右边的集合
    println(list6) //7, 8, 9, 3, 4, 5, hello
  }
}
