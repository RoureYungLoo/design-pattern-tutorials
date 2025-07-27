package com.luruoyang.test1;

public class Test {
  public static void main(String[] args) {
    /* 创建中介者 */
    Mediator mediator = new ConcreteMediator();

    Colleague cb = new ConcreteColleagueB(mediator);
    Colleague ca = new ConcreteColleagueA(mediator);

    /* 注册同事 */
    mediator.register(ca);
    mediator.register(cb);
    cb.communicate();
  }
}
