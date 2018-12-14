package com.chapter08.mymixin

/**
  * @author zxfcode
  * @create 2018-11-17 10:49
  */
object MixinDemo02 {
  def main(args: Array[String]): Unit = {
//    val mysql5 = new MySQL5 with DB5  with File5
//    mysql5.insert(100)

    //val mysql5_ = new MySQL5 with  File5  with DB5
    //下面的是错误的
    //val mysql5_ = new MySQL5 with File5
    //mysql5_.insert(666)
  }
}
trait Operate5 {
  println("Operate4...")
  def insert(id : Int)
}

trait File5 extends Operate5 {
  //这个方法没有完全实现，因此需要声明为abstract override，调用者须实现这个方法才可以用
  //作用：super.insert(id)的调用和动态混入的顺序有密切关系
  abstract override  def insert(id : Int): Unit = {
    println("保存文件。。。 " )
    super.insert(id) //不加abstract override运行时会报错，
  }
}

trait DB5 extends  Operate5 {
  def insert( id : Int ): Unit = {
    println("将数据保存到数据库中..")
  }
}
class MySQL5 {}

