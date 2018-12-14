package com.custmomercrt.app

import com.custmomercrt.view.CustomerView

/**
  * @author zxfcode
  * @create 2018-11-23 12:59
  */
object CustomerInter {
  def main(args: Array[String]): Unit = {
    val customerView = new CustomerView
    customerView.customerMenu()
  }
}
