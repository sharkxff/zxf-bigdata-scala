package com.hanshushi.demo

/**
  * @author zxfcode
  */
object Demo01 {
  def main(args: Array[String]): Unit = {
    //方法：一段代码作为成员变量
    //函数：一段代码作为函数（普通变量），可以接收函数，也可以返回函数，是一系列功能的集合
    //    解决代码冗余和不好管理的缺点
     val n1 = 10
     val n2 = 20
     println("res = "+getRes(1,2,'）'))

  }
  //定义函数/方法
  //:Int=返回值必须是Int类型的
  //= 用类型推导，返回值类型不确定
  def getRes(n1:Int, n2:Int,oper:Char)={
    if(oper == '+'){
      n1 + n2  //可以不写return
    }else if(oper == '-'){
      n1 - n2
    }else{
      //说明输入有问题
      null
    }
  }
}
