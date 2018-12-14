package com.custmomercrt.view

import com.custmomercrt.bean.CustomerBean
import com.custmomercrt.service.CustomerService

import scala.collection.mutable.ListBuffer
import scala.io.StdIn

/**
  * @author zxfcode
  * @create 2018-11-23 12:00
  */
class CustomerView {
  //控制是否退出循环变量
  var flag = true
  //定义一个字段用于接收用户输入的数字选项，以此来判断应该进入哪个功能
  var enterKey = ' '

  //定义一个service实例，来调用功能函数
  var customerService = new CustomerService()

  def customerMenu(): Unit = {
    //分析：用户进入主页面，选择对应的操作，进入对应的功能模块中
    //操作完退出功能模块，再次进入主页面，这里考虑用do while
    //while的条件是给定的一个Boolean，对应操作要怎么进行
    do {
      println("-----------------客户信息管理软件-----------------")
      println("                 1 添 加 客 户")
      println("                 2 修 改 客 户")
      println("                 3 删 除 客 户")
      println("                 4 客 户 列 表")
      println("                 5 查       询")
      println("                 6 退       出")
      print("请选择(1-6)：")
      enterKey = StdIn.readChar()
      enterKey match {
        case '1' => this.serviceAdd()
        case '2' =>this.edisCustomer()
        case '3' => this.deleteCus()
        case '4' => this.serviceList()
        case '5' => this.getName()
        case '6' => this.flag = false
        case _ =>
      }
    } while (flag)
    println("已经退出系统")
  }

  def serviceList() = {
    println("---------------------------客户列表---------------------------")
    val beansList = customerService.getList()
    for (bean <- beansList) {
      println(bean)
    }
    println("-------------------------客户列表完成-------------------------")
  }

  /*
  新增：将键盘输入的数据传入的信息保存在bean对象中，service进行保存
   */
  def serviceAdd() = {
    println("---------------------添加客户---------------------")
    println("姓名：")
    val name = StdIn.readLine()
    println("性别：")
    val gender = StdIn.readChar()
    println("年龄：")
    val age = StdIn.readShort()
    println("电话：")
    val tel = StdIn.readLine()
    println("邮箱：")
    val email = StdIn.readLine()
    //name: String, gender: Char, age: Short, tel: String, email: String
    val addCustomer = new CustomerBean(name, gender, age, tel, email)
    customerService.addCustomer(addCustomer)
    println("---------------------添加完成---------------------")

  }

  //进入删除功能模块，根据输入的数字来确定customer的id和索引，删除成功后提示删除成功
  def deleteCus(): Unit = {
    println("---------------------删除客户---------------------")
    println("请选择待删除客户编号(-1退出)：")
    val keyid = StdIn.readInt()
    var deleOrChanel: Char = ' '
    do {
      println("确认是否删除(Y/N)：")
      deleOrChanel = StdIn.readChar().toLower
    } while (deleOrChanel != 'y' && deleOrChanel != 'n')

    if (deleOrChanel == 'y') {
      val deleBool = customerService.deleCustomer(keyid)
      if (deleBool) {
        println("---------------------删除完成---------------------")
      }
    } else {
      println("---------------------删除失败---------------------")
    }
  }

  //修改用户：根据输入的id获得对应的索引，并且提取相关信息，
  // 最后传入更改后的信息，没有更改的传入的是旧数据
  def edisCustomer() = {
    println("---------------------修改客户---------------------")
    println("请选择待修改客户编号(-1退出)：")
    var keyEdis = StdIn.readInt()
    val editBean = customerService.getInfo(keyEdis)
    if(!editBean.equals(null)){
      println("姓名(" + editBean.name + ")：<直接回车表示不修改>")
      val ename = StdIn.readLine()
      if (!ename.equals("")) editBean.name = ename
      println("性别(" + editBean.gender + ")：")
      val egender = StdIn.readLine()
      if (!egender.equals("")) editBean.gender = egender.charAt(0)
      println("年龄(" + editBean.age + ")：")
      val eage = StdIn.readLine()
      if (!eage.equals("")) editBean.age = eage.toShort
      println("电话(" + editBean.tel + ")：")
      val etel = StdIn.readLine()
      if (!etel.equals("")) editBean.tel = etel
      println("邮箱(" + editBean.email + ")：")
      val eemail = StdIn.readLine()
      if (!eemail.equals("")) editBean.email = eemail
      editBean.id = keyEdis
      customerService.updateInfo(keyEdis,editBean)
    }else{
      println("这个用户不存在")
    }
    println("---------------------修改完成---------------------")
  }

  //提示输入要查询的用户的姓名
  def getName(): Unit ={
    println("---------------------通过姓名查询--------------------")
    println("请输入想要查询的用户的姓名：")
    var queryName = StdIn.readLine()
    var queryInfo = customerService.fingByName(queryName)
    if(queryInfo != null){
      println(queryInfo)
    }else{
      println("没有查到该用户")
    }
  }
}
