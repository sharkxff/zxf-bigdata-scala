package com.chapter.home

import scala.io.StdIn

/**
  * @author zxfcode
  */
object Exercise2 {
  def main(args: Array[String]): Unit = {

    //实现登录验证，有三次机会，如果用户名为”张无忌” ,密码”888”提示登录成功，
    // 否则提示还有几次机会，请使用for 循环完成
    var jihui = 3

    var flg : Boolean = false
    for(i <- 1 to 3 if !flg){
      println("请输入用户名：")
      var username = StdIn.readLine()
      println("请输入密码：")
      var password = StdIn.readLong()
      if ("张无忌".equals(username) && (password == 888)){
        flg = true
      }else {
        jihui -=1
        flg = false
      }
      if(flg){
        println("登录成功")
      }else{
        printf(s"账号错误，还有%d次机会\n",jihui)
      }
    }



  }
}
