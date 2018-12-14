package com.chapter09.conversion

/**
  * @author zxfcode
  * @create 2018-11-17 16:15
  */
object ImplicitClass01 {
  def main(args: Array[String]): Unit = {
    //DB11是一个隐式类，在隐式类作用域内，创建MySQL002实例，隐式类就会生效
    //底层ImplicitClass01$DB11$2
    //隐式类不可以单独的放在外面，有一个范围；
    implicit class DB11(val m:MySQL002){
      def addSuffix():String = {
        m + "scala"
      }
    }

    //创建一个MySQL002实例
    val mySQL = new MySQL002
    mySQL.sayOk()
    mySQL.addSuffix()  //?  DB11$1(mySQL).addSuffic
  }
}
class MySQL002{
  def sayOk(): Unit ={
    println("ok")
  }
}