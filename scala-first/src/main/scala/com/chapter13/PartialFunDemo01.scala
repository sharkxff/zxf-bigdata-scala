package com.chapter13

/**
  * @author zxfcode
  * @create 2018-11-21 11:26
  */
object PartialFunDemo01 {
  def main(args: Array[String]): Unit = {
    //去除集合里的字符串并给数字加1
    //思路1：filter+map的方式  仅过滤一种类型就需要这么多方法 ，麻烦
    val list = List(1, 2, 3, 4, "abc")
    //先过滤在map
    println(list.filter(f1).map(f3).map(f2))  //List(2, 3, 4, 5)

    // 思路2 ：模式匹配,结果不好看
    println(list.map(addOne2))  //List(1, 2, 3, 4, ())

    //思路3：
  }

  def f1(n: Any): Boolean = {
     n.isInstanceOf[Int]
  }
  def f2(n:Int):Int={
    n+1
  }
  def f3(n:Any):Int={
    n.asInstanceOf[Int]
  }

  def addOne2(i:Any):Any={
    i match {
      case x:Int => x
      case _ =>
    }
  }
}
