package com.luruoyang.test2;

import java.util.ArrayList;
import java.util.List;

/* 抽象目标类(被观察者, 观察对象, 被依赖项) */
public abstract class Subject {
  /* 状态 */
  protected Object state;

  public abstract Object getState();

  public abstract void setState(Object state);

  /* 观察者集合 */
  protected List<Observer> observerList = new ArrayList<>();

  /*观察者加入 */
  public void attach(Observer observer) {
    boolean added = observerList.add(observer);
    if (added) {
      System.out.println("观察者" + observer + "attach");
    }
  }

  /* 观察者退出 */
  public void detach(Observer observer) {
    boolean removed = observerList.remove(observer);
    if (removed) {
      System.out.println("观察者" + observer + "detach");
    }
  }

  /* 通知观察者 */
  public abstract void notifyObservers();
}
