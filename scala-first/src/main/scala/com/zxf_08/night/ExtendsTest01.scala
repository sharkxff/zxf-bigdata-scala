package com.chapter08.night

/**
  * @author zxfcode
  * @create 2018-11-16 21:08
  */
object ExtendsTest01 {
  def main(args: Array[String]): Unit = {
    val cha = new CheckingAccount(1000)
    val dbal = 1000
    val wbal = 800
    cha.deposit(dbal)
    println("存入 :" + dbal + "余额: " + cha.currentBalance)
    cha.withdraw(wbal)
    println("取出 :" + wbal + "余额: " + cha.currentBalance)

    //val save = new SavingsAccount(1000)

  }

}

class BankAccount(initialBalance: Double) {
  private var balance = initialBalance

  def deposit(amount: Double) = {
    balance += amount; balance
  }

  def withdraw(amount: Double) = {
    balance -= amount; balance
  }

  def currentBalance = balance
}

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance: Double) {

  override def deposit(camount: Double): Double = {
    super.deposit(camount - 1)
  }

  override def withdraw(camount: Double): Double = {
    super.withdraw(camount + 1)
  }

}

class SavingsAccount(initialBalance: Double) extends BankAccount(initialBalance: Double) {
  var freecount = 3
  val interRate: Double = 0.03

  override def deposit(camount: Double): Double = {
    if (freecount <= 0) {
      freecount -= 1
      super.deposit(camount - 1)

    } else {
      super.deposit(camount)
    }
  }

  override def withdraw(camount: Double): Double = {
    if (freecount <= 0) {
      freecount -= 1
      super.withdraw(camount + 1)

    } else {
      super.withdraw(camount )
    }
  }
  def earnMonthlyInterest(camount: Double): Double = {
    freecount = 3
    super.deposit(super.deposit(0)*interRate)
  }
}