package com.chapter13

/**
  * @author zxfcode
  * @create 2018-11-21 11:42
  */
object PartialFunDemo02 {
  def main(args: Array[String]): Unit = {


    val list = List(1, 2, 3, 4, "abc")
    //定义一个偏函数（匿名子类）  接收参数类型Any返回的类型是Int
    val partialFun = new PartialFunction[Any,Int] {
      //如果true调用apply构建对象实例，false时apply不执行，过滤掉x，本例中被调用5次
      override def isDefinedAt(x: Any): Boolean = x.isInstanceOf[Int]

      //本例被调用4次
      override def apply(v1: Any): Int = {
        v1.asInstanceOf[Int] + 1
      }
    }
    //使用偏函数不能用map，用collect
    //执行流程：遍历list，然后 val ele = if(partialFun-isDefinedAt(list 单个元素))partialFun-apply
    //每得到ele就放入新的集合
    val list2 = list.collect(partialFun)  //做了隐式转换
    println(list2)
  }
}
