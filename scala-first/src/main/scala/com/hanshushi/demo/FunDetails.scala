package com.hanshushi.demo

/**
  * @author zxfcode
  */
object FunDetails {
  def main(args: Array[String]): Unit = {
    //形参列表和返回值列表的数据类型可以是值类型和引用类型
    var tiger = new Tiger
    val tiger2 = test01(10, tiger)
    printf(tiger2.name)
    printf(tiger.name)

    printf(tiger.hashCode() + " " + tiger2.hashCode())
  }

  def test01(n1: Int, tiger: Tiger): Tiger = {
    printf("n1 = " + n1)
    tiger.name = "jack"
    tiger
  }

  //明确写了return不能使用自行推断
  def test01(n1: Int, n2: Int): Int = {
    return n1 + n2
  }

  //这里的return返回()
  def test02(n1: Int, n2: Int){
    return n1 + n2
  }
  //和上面的等价
  def test022(n1: Int, n2: Int):Unit = {
    return n1 + n2
  }

  //没有return可以自行类型推断
  def test03(n1: Int, n2: Int) = {
    n1 + n2
  }
}

class Tiger {
  //一个名字属性
  var name = ""
}