package com.hanshushi.demo

/**
  * @author zxfcode
  *
  */
object Detail03 {
  def main(args: Array[String]): Unit = {
    //地位和sayok一样，底层会定义为私有的 private final
    def f1(): Unit ={
      printf("f1")

    }

    //private final void sayOk$1()
    def sayOk(): Unit ={
      printf("main ")
      //private final void sayOk$2()
      def sayOk(): Unit ={
        printf("sayOk sayOk ")
      }
    }
  }

  //public void sayOk()  是一个成员
  def sayOk(): Unit ={
    printf("main sayok")
  }
}
