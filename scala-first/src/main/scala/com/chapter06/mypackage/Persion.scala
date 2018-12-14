
//package com.chapter06{}
//scala支持在一个文件中，可以同时创建多个包，以及给各个包创建类，trait和object
package com.chapter06{ //包 com.chapter06
  package mypackage{ //包com.chapter06.mypackage
    object Persion {//在com.chapter06.mypackage创建object
  def main(args: Array[String]): Unit = {
    val user = new User  //类名相同时就近原则

    val user2 = new com.chapter06.User


  }
    }
    class User{

    }

  }
  object Mypac{
    def main(args: Array[String]): Unit = {
      import com.chapter06.mypackage.User
//      val user3 = new User
    }

  }
  class User{

  }

  package scala2{

  }


}


