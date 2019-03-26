package com.chapter08.mymixin

/**
  * @author zxfcode
  * @create 2018-11-17 11:21
  */
object MixInSm {
  def main(args: Array[String]): Unit = {
    val ff1 = new FFs()
    //混入特质时，对象还没有创建（实际是构建类对象）
    //E.. A.. B.. C.. D.. F..
    println(ff1)

    val ff2 = new KKs() with CCs with DDs
    //先创建自己再混入特质(实际是构建匿名子类)
    //先创建KKs(有超类先构建超类，再构建自己),然后再混入  E.. K.. A.. B.. C.. D..
    println(ff2)

  }
}
trait AAs {
  println("A...")
}
trait BBs extends  AAs {
  println("B....")
}
trait CCs extends  BBs {
  println("C....")
}
trait DDs extends  BBs {
  println("D....")
}
class EEs {
  println("E...")
}
//先继承EEs类 再继承CCs、DDs
class FFs extends EEs with CCs with DDs {
  println("F....")
}
class KKs extends EEs {
  println("K....")
}
