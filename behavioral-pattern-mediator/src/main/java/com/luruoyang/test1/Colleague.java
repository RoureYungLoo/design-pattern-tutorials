package com.luruoyang.test1;

/* 抽象同事类 */
public abstract class Colleague {
  /* 持有中介者引用 */
  protected Mediator mediator;

  public Colleague(Mediator mediator) {
    this.mediator = mediator;
  }

  /* 同事对象的 work() 方法 */
  public abstract void work();


  /* 调用中介者, 间接调用其他同事对象的方法 */
  public void communicate() {
    System.out.println("使用抽象同事类的方法与其他同事通信");
    mediator.operation();
  }
}
