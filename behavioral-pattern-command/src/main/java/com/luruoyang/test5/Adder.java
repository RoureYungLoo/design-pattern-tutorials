package com.luruoyang.test5;

/* 请求接收者/命令执行者 */
public class Adder {
  int num = 0;

  public int add(int value) {
    num += value;
    return num;
  }
}

