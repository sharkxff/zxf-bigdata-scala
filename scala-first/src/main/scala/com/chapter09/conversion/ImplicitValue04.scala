package com.chapter09.conversion

/**
  * @author zxfcode
  * @create 2018-11-17 15:47
  */
object ImplicitValue04 {
  //implicit var str1:String = "scala"   //隐式值
  //implicit var str2:String = "world"   //隐式值
  //name是隐式参数
  def hello01(implicit name:String = "jack"): Unit ={  //hello$1
    println(name + "  hello")
  }

  //implicit和默认值，implicit的优先级高
  def hello02(implicit name:String = "jack"): Unit ={  //hello$1
    println(name + "  hello2")
  }

  //注销String类型的，没有匹配到隐式值，会使用默认值
  implicit val name:Int = 10
  def hello03(implicit name:String = "jack"): Unit ={  //hello$1
    println(name + "  hello3")
  }

  //没有隐式值，默认值，也没传值   三者优先级：传值>隐式值>默认值
  def hello04(implicit name:String): Unit ={  //hello$1
    println(name + "  hello4")
  }
  def main(args: Array[String]): Unit = {
    //hello01  //模糊，会报错(未注销str2时，匹配到两个隐式值，编译器不知用哪一个，出现了二义性)

    hello02  //hello scala

    hello03  //hello jack

    //hello04  //会报错

  }
}
