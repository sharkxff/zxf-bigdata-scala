package com.chapter11

/**
  * @author zxfcode
  * @create 2018-11-20 9:25
  */
object MapOperateDemo02 {
  def main(args: Array[String]): Unit = {
    val list = List(3, 5, 7)

    //遍历=》getMul，得到新的Int，放入到新集合  getMul调用3次(list里有3个元素)
    val list2 = list.map(getMultiple)
    println(list2)

    val myList = MyList()
    val mylist22 = myList.map(getMultiple)
    println(mylist22)
  }

  def getMultiple(n: Int): Int = {
    println("multiple")
    2 * n
  }
}

//模拟实现
class MyList {
  val List3 = List(3, 5, 7, 9)

  var list2 = List[Int]()

  def map(f: Int => Int): List[Int] = {
    for (item <- this.List3) {
      list2 = list2 :+ f(item)
    }
    list2
  }
}

object MyList{
  def apply(): MyList = new MyList()
}