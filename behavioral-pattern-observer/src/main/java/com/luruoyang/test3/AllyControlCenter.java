package com.luruoyang.test3;

import java.util.ArrayList;
import java.util.List;

/* 抽象观察目标对象, 战队控制中心 */
public abstract class AllyControlCenter {
  protected String allyName; // 战队名称
  protected List<Observer> players = new ArrayList<>(); // 战队玩家

  public String getAllyName() {
    return allyName;
  }

  public void setAllyName(String allyName) {
    this.allyName = allyName;
  }

  /* 玩家(观察者)加入战队(观察目标) */
  public void join(Observer observer) {
    System.out.println("玩家" + observer.getName() + "加入" + allyName + "战队");
    players.add(observer);
  }

  /* 玩家(观察者)退出战队(观察目标) */
  public void quit(Observer observer) {
    System.out.println("玩家" + observer.getName() + "离开" + allyName + "战队");
    players.remove(observer);
  }

  /* 抽象通知方法, 向所有玩家发送通知 */
  public abstract void notifyObserver(String playerName);
}
