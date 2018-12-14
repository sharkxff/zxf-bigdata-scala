package com.chapter18.viewbounds

/**
  * @author zxfcode
  * @create 2018-11-26 21:23
  */
object ViewBounds03 {
  def main(args: Array[String]): Unit = {
    val p1 = new Person3("汤姆",13)
    val jieke = new Person3("jieke",10)
    import MyInplicit._
    val compare3 = new CompareCommon3(p1,jieke)
    println(compare3.greate)
  }
}

class Person3(val name: String, val age: Int) {
  override def toString: String = this.name + "\t" + this.age
}

class CompareCommon3[T <% Ordered[T]](obj1:T,obj2:T){
  def greate = if (obj1 > obj2) obj1 else obj2
  def greate2 = if(obj1.compareTo(obj2)>0)obj1 else obj2
}