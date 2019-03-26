package com.chapter08.mymixin

/**
  * @author zxfcode
  * @create 2018-11-17 9:35
  */
object MixinDemo01 {
  def main(args: Array[String]): Unit = {
    val oracleDb = new OracleDB3 with Operate3
    oracleDb.insert(100)

    val t = new MySQL3 {} //匿名子类

    //抽象类没有抽象方法时，混入
    val mySQl = new MySQL3 with Operate3
    mySQl.insert(200)

    //抽象类有抽象方法，动态混入
    val mySql_ = new MySQL3_ with Operate3 {
      override def say(): Unit = {
        println("say")
      }
    }
    mySql_.insert(999)
    mySql_.say()
  }
}

trait Operate3 {
  def insert(id: Int): Unit = {
    println("输入数据=" + id)
  }
}

class OracleDB3{

}

abstract class MySQL3{

}

abstract class MySQL3_{
def say()
}