package com.chapter10.queuedemo

/**
  * @author zxfcode
  * @create 2018-11-19 15:05
  */
object QueueDemo {
  def main(args: Array[String]): Unit = {
    import scala.collection.mutable
    val q1 = new mutable.Queue[Int]
    val q2 = new mutable.Queue[Any]
    println(q1)

    q1 += 9
    println("q1 = " +q1)

    q1 ++= List(3,4,5)  //默认加在队列的最后
    println(q1) //9，3，4，5
    //从队列的头部取出一个元素，q1本身会变
    val elem = q1.dequeue()
    println("queueElement="+elem +",q1="+q1)

    //入队列，从尾部入
  q1.enqueue(4,8,4)
    println(q1)


//    q2 += 66
//    q2 += List(10,0)  //将List(10,0)作为一个元素加入到队列中
//
//    val cat = new Cat002
//    cat +10
//    //Cat. + 20
//    println(cat.age)
  }
}

class Cat002{
  var age = 0
  def +(n:Int): Unit ={
    this.age += n
  }
}
