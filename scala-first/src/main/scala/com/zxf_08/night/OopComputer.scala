package com.chapter08.night

/**
  * @author zxfcode
  */
object OopComputer {
  def main(args: Array[String]): Unit = {
    val pc = new PC
    val note = new NotePad

    pc.cpu = "Intel"
    pc.neicun = "16G"
    pc.disk = "500G"
    pc.brand = "levon"
    note.cpu = "Intel core"
    note.neicun = "32G"
    note.disk = "1G"
    note.color = "black"
    pc.getDetail()
    note.getDetail()
  }
}

class Computer {
  var cpu: String = _
  var neicun: String = _
  var disk: String = _

  def getDetail(): Unit = {
    println("cpu:" + this.cpu + "\tneicun:" + this.neicun + "\tdisk:" + this.disk)
  }
}

class PC extends Computer {
  var brand: String = _

  override def getDetail(): Unit = {
    println("cpu:" + cpu + "\tneicun:" + neicun + "\tdisk:" + disk + "\tbrand:" + brand)
  }
}

class NotePad extends Computer {
  var color: String = _

  override def getDetail(): Unit = {
    println("cpu:" + cpu + "\tneicun:" + neicun + "\tdisk:" + disk + "\tcolor:" + color)
  }
}