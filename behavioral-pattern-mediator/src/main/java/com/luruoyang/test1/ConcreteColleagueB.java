package com.luruoyang.test1;

/* 具体同事类 */
public class ConcreteColleagueB extends Colleague {
  public ConcreteColleagueB(Mediator mediator) {
    super(mediator);
  }

  @Override
  public void work() {
    System.out.println("call ConcreteColleagueB work()");
  }

 /* @Override
  public void communicate() {
    System.out.println("ConcreteColleagueB communicate with mediator");
    mediator.operation();
  }*/
}
