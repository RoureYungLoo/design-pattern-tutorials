package com.luruoyang.test2;

/* 具体状态类B */
public class ConcreteStateB extends State {
  @Override
  public void handle() {
    System.out.println("处理状态B");
  }

  /* 由具体状态类管理状态 */
  @Override
  public void checkState(Context ctx) {
    if (ctx.getValue() == 0) {
      ctx.setState(new ConcreteStateA());
    } else if (ctx.getValue() == 2) {
      ctx.setState(new ConcreteStateC());
    }
  }
}
