package com.atguigu

/**
  * @author zxfcode
  */
object DocTest {
    def main(args: Array[String]): Unit = {
      sum(10, 20)
      println(sum(20,30))

      var a:Int = 10
      var b:String = "yue"
      var c:Boolean = true
      var d:Float = 1.2f
      var e:Double = 2.3
      var f:Char = 'b'
      println(s"a=${a+f}\tc=${c}")

      var ispass = true
      println(ispass)
    }

  /**
    * @example
    * 输入n1=10 n2=20 return 30
    * @param n1
    * @param n2
    * @return 求和
    */
  def sum(n1: Int, n2: Int): Int = {
    return n1 + n2
  }
}
