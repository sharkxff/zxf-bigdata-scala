package com.dataconvert

import scala.io.StdIn

/**
  * @author zxfcode
  */
object Demo01 {
  def main(args: Array[String]): Unit = {
    //多种数据类型进行计算，会转换为范围大的那一个
    var n1 = 10
    var n2 = 1.1f
    var n3 = n1 + n2

    var n4: Byte = 10
    //var char : Char = n4//错误，Byte不能给Char

    var num1: Int = 10 * 3.5.toInt
    val s4: String = "12.5"
    //val s5 = s4.toInt //error   9.38
    val s6 = s4.toDouble //ok
    //println(s5)
    // println(s6)

    //首字符为操作符，后续字符也需跟操作符，至少一个
    // ++ => $plus$plus
    val ++ = "hello,world"
    // println(++)

    //    val + = 90//编译不通过
    //    val +- = 90//0k
    //    val +a  = 100 //error
    //    val ++a = 100//error

    //关键字做标识符，需要加上` `
    var `true` = "hello,scala"
    //println(`true`)

    var c = 10
    c &= 2
    c |= 2
    println(c)

    var a = 10
    var b = 1
    a = a + b
    b = a - b
    a = a - b
//    printf("a=%d,b=%d", a, b)

    println("请输入姓名")
    val name = StdIn.readLine()
    println("请输入年龄")
    val age = StdIn.readInt()
    println("请输入薪资")
    val sal = StdIn.readDouble()

    printf("name:%s   age:%d   sal:%f",name,age,sal)

    //如何查看某个包下包含的内容,光标放在想要看的地方，ctrl+b即可
    scala.io.StdIn
  }
}
