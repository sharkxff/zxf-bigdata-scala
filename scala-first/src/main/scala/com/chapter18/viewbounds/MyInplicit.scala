package com.chapter18.viewbounds

/**
  * @author zxfcode
  * @create 2018-11-26 21:24
  */
object MyInplicit {
implicit def person3toOrderedPerson3(p3:Person3)=new Ordered[Person3]{
  override def compare(that: Person3): Int = {
    p3.age - that.age
  }
}
}
