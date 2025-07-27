package com.luruoyang.test2;

public class ConcreteStateC extends State {
  @Override
  public void handle() {
    System.out.println("处理状态C");
  }

  /* 由具体状态类管理状态 */
  @Override
  public void checkState(Context ctx) {
    if (ctx.getValue() == 0) {
      ctx.setState(new ConcreteStateA());
    } else if (ctx.getValue() == 1) {
      ctx.setState(new ConcreteStateB());
    }
  }
}
