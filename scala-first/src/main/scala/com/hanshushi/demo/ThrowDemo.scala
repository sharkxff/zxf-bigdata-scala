package com.hanshushi.demo

/**
  * @author zxfcode
  * @create 2018-11-13 15:22
  */
object ThrowDemo {
  def main(args: Array[String]): Unit = {
//    val res = test() //只是接收没有，没有捕获
//    println(res.toString)
//
//    println("ok") //这里不会输出

    //在test抛出异常后,代码可以正常执行,需要再处理
    try{
      test()
    }catch {
      case ex:Exception => println("捕获到异常 : " + ex.getMessage)
    }finally {

      //协商对try{}中资源的分配
      //例如:关闭资源,清理缓存
    }
    println("ok~~~")
  }

  def test():Nothing={
    throw new Exception("异常出现")
  }
}
