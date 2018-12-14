package com.chapter06.nightExer

import scala.io.StdIn

/**
  * @author zxfcode
  * @create 2018-11-14 18:46
  */
object Visitor {
  def main(args: Array[String]): Unit = {
    val visitor = new Vis
    var flg = true
    do{
      println("请输入游客姓名：")
      var vname = StdIn.readLine()
      visitor.name = vname
      flg = visitor.getBre()
      if(!flg){
        return
      }
      println("请输入游客年龄：")
      var age = StdIn.readInt()
      visitor.age = age
      visitor.getRes()
    }while(flg)

  }
}

class Vis() {
  var name: String = _
  var age: Int = _

  def getBre() :Boolean={
    if("n".equals(name)){
      println("退出程序")
      false
    }else{
      true
    }

  }
  def getRes(): Unit ={

      if(age>18){
        println("票价20元")
      }else{
        println("免费")
      }

  }
}