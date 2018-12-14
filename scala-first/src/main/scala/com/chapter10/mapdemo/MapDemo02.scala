package com.chapter10.mapdemo

import scala.collection.mutable

/**
  * @author zxfcode
  * @create 2018-11-19 15:43
  */
object MapDemo02 {
  def main(args: Array[String]): Unit = {

    //不可变映射
    //默认是Map是immutable.Map
    //key-value类型支持Any
    //每个key-value对应 Tuple2
    //声明和输出的顺序是一致的
    val map1 = Map("alice" -> 10,"bob" -> 50,"lotlin" -> 80,"cha" -> "北京")
    //println(map1)
    //方式一：确定map有这个key
    println(map1("alice"))
    //方式二：不能确定是否有这个key，而且有不同的业务逻辑，先判断再加入逻辑
    if(map1.contains("alice")){}else{}
    //方式三
    println(map1.get("alice").get)
    println(map1.get("alice~").get)  //get()是none，再get会抛异常
    //方式四：简单的希望得到一个值
    println(map1.getOrElse("alice","默认值是鱼 <·)))><<"))


    //可变映射   声明和输出的顺序是不一致的
    val map2 = mutable.Map("alice" -> 10,"bob" -> 50,"lotlin" -> 80,"cha" -> "北京")
    //println(map2)

    //空映射
    val map3 = new scala.collection.mutable.HashMap[String,Int]

    //对偶  tuple2
    var map4 = mutable.Map(("alice",10),("bob",20))

  }
}
