package com.chapter07.homework

/**
  * @author zxfcode
  * @create 2018-11-14 19:47
  */
object Packaging {
  def main(args: Array[String]): Unit = {
    val account = new Account("big", 1000.0, "000000")
    account.query("00000")
    //account.withDraw("00000",500.0)
    //account.deposit("00000",1000.0)
    account.query("000000")
  }
}

class Account(inName: String, inBalance: Double, inPassword: String) {
  var name: String = inName
  var balance: Double = inBalance
  var password: String = inPassword
  var len = name.length
  var pLen = password.length

  def setName(name: String): Unit = {
    if (len != 2 && len != 3 && len != 4) {
      println("名字长度为2位3位或4位！")
      this.name = "张三"
    }
  }

  def setBalan(balance: Double): Unit = {
    if (balance <= 20) {
      println("余额必须大于20")
      this.balance = 20
    }
  }

  def setPass(password: String): Unit = {
    if (pLen != 6) {
      println("密码长度必须是6位！")
      this.password = "0000000"
    }
  }

  //查询
  def query(apassword: String): Unit = {
    if (!this.password.equals(apassword)) {
      println("密码不正确！")
      return
    }
    printf("账号：%s 余额：%.2f \n", this.name, this.balance)

  }

  //取款
  def withDraw(apassword: String, count: Double): Unit = {
    if (!this.password.equals(apassword)) {
      println("密码不正确！")
      return
    }
    if (this.balance < count) {
      println("账户余额不足")
      return
    }
    balance -= count
  }

  def deposit(apassword: String, count: Double): Unit = {
    if (!this.password.equals(apassword)) {
      println("密码不正确！")
      return
    }
    balance += count
  }
}
