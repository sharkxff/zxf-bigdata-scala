package com.chapter07.homework

/**
  * @author zxfcode
  * @create 2018-11-14 20:51
  */
object TestStudent {
  def main(args: Array[String]): Unit = {
    val stu = new Student("zh",2022)
    println(stu.name)
    println(stu.id)
    stu.name = "zhang"
    println(stu.name)
  }
}

class Student(var name: String, var id: Long) {

}