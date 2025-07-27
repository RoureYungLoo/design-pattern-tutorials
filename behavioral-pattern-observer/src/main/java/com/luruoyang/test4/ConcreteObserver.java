package com.luruoyang.test4;

/* 具体观察者 */
public class ConcreteObserver implements Observer {
  @Override
  public void update() {
    System.out.println("调用具体观察者的方法");
  }
}
