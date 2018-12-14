package com.chapter07.homework

/**
  * @author zxfcode
  * @create 2018-11-14 21:08
  */
import java.util.{List, HashMap => JavaHashMap}

import scala.collection.mutable
import scala.collection.mutable.HashMap
object TransferHash {
  def main(args: Array[String]): Unit = {

    var javamap = new JavaHashMap[String,Int]()
    javamap.put("shark",12)
    javamap.put("big",10)
    javamap.put("yue",20)
    var scamap = javahashToScalahash(javamap)
    scamap.foreach(println)
  }
  def javahashToScalahash(map:JavaHashMap[String,Int]):HashMap[String,Int]={
    var smap = new mutable.HashMap[String,Int]()
    for(key <- map.keySet().toArray()){
      smap += (key.toString() -> map.get(key))
    }
    smap
  }
}

