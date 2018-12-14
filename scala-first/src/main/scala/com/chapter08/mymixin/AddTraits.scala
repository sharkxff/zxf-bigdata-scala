package com.chapter08.mymixin

/**
  * @author zxfcode
  * @create 2018-11-17 10:34
  */
object AddTraits {
  def main(args: Array[String]): Unit = {
    //构建顺序 Operate4...  Data4     DB4
    val mysql = new MySQL4 with DB4 with File4
    //val mysql = new MySQL4 with File4 with DB4
    mysql.insert(888)
  }
}
trait Operate4 {
  println("Operate4...")
  def insert(id : Int)
}

trait Data4 extends Operate4 {
  println("Data4")
  override  def insert(id : Int): Unit = {
    println("插入数据 = " + id)
  }
}

trait DB4 extends Data4 {
  println("DB4")
  override def insert(id : Int): Unit = {
    print("向数据库")
    super.insert(id)
  }
}
trait File4 extends  Data4 {
  println("File4")
  override def insert(id : Int): Unit = {
    print("向文件")
    super[Data4].insert(id)
  }}
class MySQL4 {}
