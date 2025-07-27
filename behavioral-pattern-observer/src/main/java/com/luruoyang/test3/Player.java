package com.luruoyang.test3;

/* 具体观察者 */
public class Player implements Observer {
  private String name;

  public Player(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  /* 支援盟友 */
  @Override
  public void help() {
    System.out.println("坚持住" + this.name + "来救你了");
  }

  /* 被攻击, 通知被攻击 */
  @Override
  public void beAttacked(AllyControlCenter acc) {
    System.out.println(name + "正在被攻击");
    acc.notifyObserver(name);
  }
}
