package com.chapter12

/**
  * @author zxfcode
  * @create 2018-11-21 10:29
  */
object MidCase {
  def main(args: Array[String]): Unit = {
    List(1, 3, 5, 9,6,2) match { //修改并测试
      //1.两个元素间::叫中置表达式,至少first，second两个匹配才行.
      //2.first 匹配第一个 second 匹配第二个, rest 匹配剩余部分(5,9,6,2)
      case first :: second :: rest => println(first + " " + second + " " + rest.length) //1 3 4
      case _ => println("匹配不到...")
    }

  }
}
