package com.luruoyang.test4;

import java.util.Vector;

/* 抽象观察对象 */
public abstract class Observable {
  private boolean changed = false; // 状态
  private Vector<Observer> observers; // 观察者

  public Observable() {
  }

  void addObserver(Observer observer) {
    observers.add(observer);
    System.out.println("添加观察者" + observer);
  }

  void deleteObserver(Observer observer) {
    observers.remove(observer);
    System.out.println("移除观察者" + observer);
  }

  void notifyObservers() {
    System.out.println("通知观察者");
    for (Observer observer : observers) {
      observer.update(this, null);
    }
    clearChanged(); // 已经通知了所有的观察者对象
  }

  void notifyObservers(Object arg) {
    System.out.println("通知观察者 args");
    for (Observer observer : observers) {
      observer.update(this, arg);
    }
    clearChanged(); // 者已经通知了所有的观察者对象
  }

  void deleteObservers() {
    observers.clear();
    System.out.println("清空观察者");
  }

  public boolean hasChanged() {
    return changed;
  }

  public void setChanged(boolean changed) {
    this.changed = changed;
  }

  int countObservers() {
    return observers.size();
  }

  public void clearChanged() {
    changed = false;
  }
}
