package com.hanshushi.demo

/**
  * @author zxfcode
  * @create 2018-11-13 15:31
  */
object ThrowCommon {
  def main(args: Array[String]): Unit = {
    f11()
  }

  @throws(classOf[NumberFormatException]) // 等同于java NumberFormatException.class
  def f11() ={
    "abc".toInt
  }
}
