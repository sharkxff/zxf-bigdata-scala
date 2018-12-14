package com.hanshushi.homework

/**
  * @author zxfcode
  * @create 2018-11-13 21:13
  */
object Exercise09 {
  def main(args: Array[String]): Unit = {
    //编写函数计算 ,其中n是整数，使用如下的递归定义
    println(getSum(-1,2))
  }

  def getSum(n:Int,x:Int): Double ={
//    if(n > 0){
//      x*(x^(n-1))
//    }else if(n<0){
//      1/(x^(-n))
//    }else{
//      1
//    }
    if(n>0){
      x*getSum(n-1,x)
    }else if(n<0){
      1 / getSum(-n,x)
    }else{
      1
    }
  }
}
