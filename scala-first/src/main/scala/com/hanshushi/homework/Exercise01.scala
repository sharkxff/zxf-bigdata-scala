package com.hanshushi.homework

/**
  * @author zxfcode
  * @create 2018-11-13 19:43
  */
object Exercise01 {
  def main(args: Array[String]): Unit = {
    //一个数字如果为正数，则它的signum为1;
    // 如果是负数,则signum为-1;
    // 如果为0,则signum为0.编写一个函数来计算这个值
    println(getReturn(0))
  }

  def getReturn(n : Int) : Int ={
    if(n>0){
      1
    }else if(n<0){
      -1
    }else{
      0
    }
  }
}
