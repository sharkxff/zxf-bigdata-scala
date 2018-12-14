package com.chapter13

/**
  * @author zxfcode
  * @create 2018-11-21 15:26
  */
object ClosureDemo {
  def main(args: Array[String]): Unit = {
    val f = makeSuffix(".jpg")
    println(f("dog.jpg"))  //dog.jpg
    println(f("cat"))  //cat.jpg

    val ff = makeSuffixCurry(".jpg")("panda")
    println(ff)   //panda.jpg
  }

  def makeSuffix(suffix:String) ={
    (file:String) => {
      if ( file.endsWith(".jpg")) file else file + suffix   //使用了闭包
    }
  }
  //柯里化
  def makeSuffixCurry(suffix:String)(file:String) ={

      if ( file.endsWith(".jpg")) file else file + suffix   //使用了函数柯里化
  }

}
