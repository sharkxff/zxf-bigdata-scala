package com.custmomercrt.service

import com.custmomercrt.bean.CustomerBean

import scala.collection.mutable.ListBuffer

/**
  * @author zxfcode
  * @create 2018-11-23 12:00
  */
class CustomerService {
  //id: Int, name: String, gender: Char, age: Short, tel: String, email: String
  var list = ListBuffer(new CustomerBean(1, "yueyue", '男', 24, "15160990000", "yueyue@sina.com"))
  //给一个变量用来存储用户id
  var numCustomer = 1

  def getList(): ListBuffer[CustomerBean] = {
    this.list
  }

  //添加customer并且返回添加是否成功
  def addCustomer(cus:CustomerBean): Boolean ={
    numCustomer += 1
    cus.id = numCustomer
    list.append(cus)
    true
  }

  //删除customer，根据id删除相关信息
  def deleCustomer(id:Int):Boolean={
    //用一个index来保存列表里对应customer的索引，这里的索引和id可能不相同多以需要判断
    var cusIndex = -1
    for(i<-  0 until  list.length){
      if(list(i).id == id){
        cusIndex = i
        list.remove(cusIndex)
      }
    }
    if(cusIndex != -1)true else false
  }

  //根据输入的id值获得索引对应的信息，并且返回对应的信息
  def getInfo(id:Int):CustomerBean={
    var cusIndex = -1
    for(i<-  0 until  list.length){
      if(list(i).id == id){
        cusIndex = i
      }
    }
    if(cusIndex == -1) null else list(cusIndex)
  }

  //根据传入的信息，更改list里的数据
  def updateInfo(id:Int,cus:CustomerBean): Boolean ={
    for(i<-  0 until  list.length){
      if(list(i).id == id){
        list.update(i,cus)
      }
    }
    true
  }

  //查询名字，根据输入的名字查询list里的数据
  def fingByName(name:String):CustomerBean={
    var itemCus:CustomerBean = new CustomerBean()
    for(item<- list){
      if(item.name.contains(name)) itemCus = item else itemCus = null
    }
    itemCus
  }
}

