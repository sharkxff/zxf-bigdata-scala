package com.chapter10.mapdemo

import scala.collection.mutable

/**
  * @author zxfcode
  * @create 2018-11-19 19:12
  */
object MapDemo03 {
  def main(args: Array[String]): Unit = {
    val map1 = mutable.Map(("A",1),("B","北京"),("C",3))
    for((k,v) <- map1)println(k+ " is mapped to " +v)
    for(v<- map1.keys) println(v)
    for(v<-map1.values) println(v)
    for(v<-map1)println(v)
  }
}
