package com.chapter09.conversion

/**
  * @author zxfcode
  * @create 2018-11-17 15:26
  */
object ImplicitDemo02 {
  //可以将隐式函数写在一个文件里，用import引入
  implicit def addDelete(mysql:MySQL):DB={
    new DB
  }

  def main(args: Array[String]): Unit = {
    //编写隐式函数，丰富mysql功能
    val mySQL = new MySQL
    mySQL.insert()
    mySQL.delete()  //addDelete(mySQL).delete()
    mySQL.update() //DB类里有的方法就可以
  }
}

class MySQL{
  def insert(): Unit ={
    println("insert")
  }
}

class DB{
  def delete(): Unit ={
    println("delete")
  }
  def update(): Unit ={
    println("update")
  }
}