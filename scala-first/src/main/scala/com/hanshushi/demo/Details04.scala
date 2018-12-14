package com.hanshushi.demo

/**
  * @author zxfcode
  * @create 2018-11-13 11:46
  */
object Details04 {
  def main(args: Array[String]): Unit = {
    printf(sayOk()) //jack ok!
    printf(sayOk("mary")) //mary ok!

    //多参数覆盖，从左到右
    //带名参数覆盖某个参数
  }

  def sayOk(name:String = "jack"): String ={
    return name + "ok!"
  }
}
