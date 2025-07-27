package com.luruoyang.test4.demo2;

public class OrderSync implements OrderStrategy {
  @Override
  public void insert() {
    System.out.println("同步插入订单");
  }
}
