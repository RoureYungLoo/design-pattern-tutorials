package com.luruoyang.test4.demo2;

public class OrderAsync implements OrderStrategy {
  @Override
  public void insert() {
    System.out.println("异步插入订单");
  }
}
