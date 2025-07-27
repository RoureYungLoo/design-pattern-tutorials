package com.luruoyang.test3;

/* 抽象观察者 */
public interface Observer {
  String getName();

  void setName(String name);

  void help();// 支援

  void beAttacked(AllyControlCenter acc); //被攻击
}
