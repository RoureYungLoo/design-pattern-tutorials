package com.luruoyang.test1;

/* 具体同事类 */
public class ConcreteColleagueA extends Colleague {
  public ConcreteColleagueA(Mediator mediator) {
    super(mediator);
  }

  @Override
  public void work() {
    System.out.println("call ConcreteColleagueA work()");
  }

  @Override
  public void communicate() {
    System.out.println("ConcreteColleagueA communicate with mediator");
    mediator.operation();
  }
}
