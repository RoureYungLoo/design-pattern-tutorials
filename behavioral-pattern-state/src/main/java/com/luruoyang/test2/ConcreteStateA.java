package com.luruoyang.test2;

/* 具体状态类A */
public class ConcreteStateA extends State {
  @Override
  public void handle() {
    System.out.println("处理状态A");
  }

  /* 由具体状态类管理状态 */
  @Override
  public void checkState(Context ctx) {
    if (ctx.getValue()==1){
      ctx.setState(new ConcreteStateB());
    }else if(ctx.getValue()==2){
      ctx.setState(new ConcreteStateC());
    }
  }
}
