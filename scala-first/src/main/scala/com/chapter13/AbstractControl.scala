package com.chapter13

/**
  * @author zxfcode
  * @create 2018-11-21 16:14
  */
object AbstractControl {
  def main(args: Array[String]): Unit = {
    //练习一下while过程
    def myRunThred(f1:() => Unit) = {
      new Thread{
        override def run():Unit ={
          f1()
        }
      }.start()
    }

    myRunThred{
      () =>
        println("5s...")
        Thread.sleep(5000)
        println("ok")
    }
    println("********************")
    def myRunThred22(f1: => Unit) = {
      new Thread{
        override def run():Unit ={
          f1
        }
      }.start()
    }

    myRunThred22{
        println("5s...")
        Thread.sleep(5000)
        println("ok")
    }
    //借鉴它的效果，函数调用时放入代码块
//    breakable{
//      break()
//    }
  }
}
