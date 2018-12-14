package com.chapter18.upprtbounds

/**
  * @author zxfcode
  * @create 2018-11-26 15:41
  */
object demo01 {
  def main(args: Array[String]): Unit = {
    val compareInt = new CompareInt(10,30)
    println(compareInt.greater)

//    val common1 = new CommonCompare(10,40)  //Int没有继承Comparable，会报错
//    println(common1.greater)

    val common2 = new CommonCompare(Integer.valueOf(10),Integer.valueOf(40))
    println(common2.greater)

    val common3 = new CommonCompare(java.lang.Float.valueOf(10.0f),java.lang.Float.valueOf(2.3f))
    println(common3.greater)

//    val common4 = new CommonCompare(1.1f,2.1f) //Float没有继承Comparable，故也跑不起来(报错)
//    println(common4)

    val common5 = new CommonCompare[java.lang.Float](1.1f,2.1f) //隐式转换
    println(common5.greater)
  }
}
//传统方法
class CompareInt(n1: Int, n2: Int) {
  def greater = if (n1 > n2) n1 else n2
}

//使用上界(上限)
//T<:Comparable[T]  :便是T类型是Comparable子类型，传入的T需要继承Comparable接口
class CommonCompare[T<:Comparable[T]](obj1:T,obj2:T){
  def greater = if(obj1.compareTo(obj2)>0) obj1 else obj2
}