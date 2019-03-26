package com.chapter12

/**
  * @author zxfcode
  * @create 2018-11-21 10:41
  */
object bookCase {
  def main(args: Array[String]): Unit = {
    val sale = Bundle("书籍", 10, Book("漫画", 40), Bundle("文学作品", 20, Book("《阳关》", 80), Book("《围城》", 30)))

    val res = sale match {
      case Bundle(_, _, Book(desc, _), _*) => desc
    }
    //println("res = " + res) //res = 漫画

    val res2 = sale match {
      case Bundle(_, _, book@Book(desc, _), rest@_*) => (book, rest)
    }
    //res2 = (Book(漫画,40.0),WrappedArray(Bundle(文学作品,20.0,WrappedArray(Book(《阳关》,80.0), Book(《围城》,30.0)))))
    //println("res2 = " + res2)

    val res3 = sale match {
      case Bundle(_, _, book3@Book(desc, _), rest3) => (book3, rest3)
    }
    //res3 = (Book(漫画,40.0),Bundle(文学作品,20.0,WrappedArray(Book(《阳关》,80.0), Book(《围城》,30.0))))
    //println("res3 = " + res3)

    //案例完成
    val sumprice = price(sale)
    println("price = " + sumprice)
  }

  //用到了递归调用
  def price(it: Item): Double = {
    it match {
      case Book(_, p) => p
        //分析过程：[40,([80,30].sum-20)].sum-10
      case Bundle(_, disc, ites @ _*) => ites.map(price).sum - disc
    }
  }
}

abstract class Item // 项
//书名，价格
case class Book(description: String, price: Double) extends Item

//书名，优惠价格，可变数量的item
case class Bundle(description: String, discount: Double, item: Item*) extends Item
