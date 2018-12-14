package com.chapter13.exercise

/**
  * @author zxfcode
  * @create 2018-11-22 11:49
  */
object MatchDuiou {
  def main(args: Array[String]): Unit = {
    /*
    利用模式匹配，编写一个swap函数，接受一个整数的对偶，返回对偶的两个组成部件互换位置的新对偶
     */
    def swap[S,I](tuple2: (S,I))={
      tuple2 match {
        case (x,y) => (y,x)
      }
    }

    //println(swap("hello", 2))

    /*
    2、利用模式匹配，编写一个swap函数，交换数组中的前两个元素的位置，前提条件是数组长度至少为2
     */
    def swap22(list:List[Any])={
      list match{
        case List(first,second,rst @ _*) =>List(second,first)++rst
        case _ => "长度小于2"
      }
    }
    //println(swap22(List(2, 4, 1, 5)))
    /*
    3、编写一个函数，计算List[Option[Int]]中所有非None值之和。不得使用match语句。
     */

    def removeZero(list : List[Option[Int]]) = list.map(_.getOrElse(0)).sum
    println(removeZero(List(Some(2),None,Some(3))))
  }
//  def swap(t: Tuple2[Int,Int)])= (t2:Tuple2[Int,Int])=>{
//
//  }
}
