package com.chapter12

/**
  * @author zxfcode
  * @create 2018-11-21 8:57
  */
object MatchObject {
  def main(args: Array[String]): Unit = {
    val number: Double = 36.0

    number match {
      //调用Square的unapply（z:Double),z的值为number，
      // 若返回值为Some(6),且Some里面的参数形式和case能够对应上，匹配成功，同时将6付给n
      case Square(n) => println(n)
      case _ => println("nothing matched")
    }

    val nameString = "Alice,Bob,Tomas"
    nameString match {
      //Alice,Bob,Tomas给strfirst,second,third
      case Names22(first, second, third) => {
        println(s"$first $second $third")
      }
      case _ => println("nothing match22")
    }


    val (x, y, z) = (1, 2, "hello")
    println(x)

    //匹配指定个数的变量
    val (q, r) = BigInt(10) /% 3
    println(BigInt(10) /% 3)  //(3,1) 这个函数返回的时一个二元组
    println(q + "," + r)

    //for循环
    val map = Map("A" -> 1, "B" -> 0, "C" -> 3)
    for ((k, v) <- map) println(k + "->" + v)
    println("*************************")
    for ((k, 0) <- map) println(k + "->" + 0)
    //注意：灵活使用守卫
    for ((k, v) <- map if v == 0) println(k + "->" + v)
  }
}

object Square {
  def unapply(z: Double): Option[Double] = Some(math.sqrt(z)) //some里的是具体的业务逻辑

  def apply(z: Double): Double = z * z
}

object Names22 {
  //参数只有一个
  //测试得到结论，单参和多参只能写一个，否则调用时会报错
//    def unapply(str: String): Option[Seq[String]] = {
//      if(str.contains(",")) Some(str.split(",")) else None
//    }

  //参数是多个
  def unapplySeq(str: String): Option[Seq[String]] = {
    if (str.contains(",")) Some(str.split(","))
    else None
  }
}