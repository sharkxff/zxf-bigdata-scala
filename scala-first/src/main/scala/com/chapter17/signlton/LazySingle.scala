package com.chapter17.signlton

/**
  * @author zxfcode
  * @create 2018-11-25 15:24
  */
object LazySing {
  def main(args: Array[String]): Unit = {
    val single1: LazySingle = LazySingle.getInstance()
    val single2: LazySingle = LazySingle.getInstance()
    if (single1 == single1) {
      println("ll")
    }
  }
}

class LazySingle private() {}

object LazySingle {
  private var s: LazySingle = _

  def getInstance() = {
    if (s != null) {
      s = new LazySingle
    }
    s
  }
}
