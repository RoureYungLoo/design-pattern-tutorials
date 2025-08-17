package com.luruoyang.test1;

import java.util.ArrayList;

/* 抽象中介者 */
public abstract class Mediator {
  /* 持有同事对象List的引用 */
  protected ArrayList<Colleague> colleagues = new ArrayList<>();

  /* 注册同事对象 */
  public void register(Colleague colleague) {
    colleagues.add(colleague);
  }

  /* 抽象业务方法 */
  public abstract void operation();

}
