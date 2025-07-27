package com.luruoyang.test2;

public class Test {
  public static void main(String[] args) {
    Subject subject = new ConcreteSubject();
    subject.setState("状态1");

    ConcreteObserver observer1 = new ConcreteObserver(subject);
    ConcreteObserver observer2 = new ConcreteObserver(subject);
    ConcreteObserver observer3 = new ConcreteObserver(subject);

    subject.attach(observer1);
    subject.attach(observer2);
    subject.attach(observer3);

    subject.notifyObservers();
  }
}
