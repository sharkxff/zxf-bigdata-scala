package com.chapter18.viewbounds

/**
  * @author zxfcode
  * @create 2018-11-26 16:46
  */
object ViewBounds {
  def main(args: Array[String]): Unit = {
    val common1 = new CompareComm(10, 40) //Int没有继承Comparable，会报错
    println(common1.greater)

    val common2 = new CompareComm(Integer.valueOf(10), Integer.valueOf(40))
    println(common2.greater)

    val common3 = new CompareComm(java.lang.Float.valueOf(10.0f), java.lang.Float.valueOf(2.3f))
    println(common3.greater)

    val common4 = new CompareComm(1.1f, 2.1f)
    println(common4)

    val common5 = new CompareComm[java.lang.Float](1.1f, 2.1f)
    println(common5.greater)
  }
}

//<%范围大于<:,而且支持隐式转换
class CompareComm[T <% Comparable[T]](obj1: T, obj2: T) {
  def greater = if (obj1.compareTo(obj2) > 0) obj1 else obj2
}
