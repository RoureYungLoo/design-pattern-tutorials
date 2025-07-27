package com.luruoyang.test2;

/* 具体观察者 */
public class ConcreteObserver implements Observer {
  private Subject subject;

  public ConcreteObserver(Subject subject) {
    this.subject = subject;
  }

  @Override
  public void update() {
    System.out.println("观察者" + this + "正在做出响应");
    Object state = subject.getState();
    System.out.println("当前观察目标的状态state: " + state);
  }
}
