package com.luruoyang.test1;

import java.util.Objects;

/* 具体中介者 */
public class ConcreteMediator extends Mediator {
  @Override
  public void operation() {
    Colleague colleague = colleagues.get(0);
    if (Objects.nonNull(colleague)) {
      /* 调用同事对象的 work() 方法 */
      colleague.work();
    } else {
      System.out.println("no colleague found");
    }
  }
}
