package com.luruoyang.test2;

/* 具体目标类 */
public class ConcreteSubject extends Subject {
  /* 通知所有观察者 */
  @Override
  public void notifyObservers() {
    for (Observer observer : observerList) {
      observer.update(); // 调用观察者的方法
    }
  }


  public Object getState() {
    return state;
  }

  public void setState(Object state) {
    this.state = state;
  }
}
