package com.luruoyang.test2;

/* 抽象状态类 */
public abstract class State {
  public abstract void handle();

  /*  [状态管理方式一] 由具体的状态类管理状态 */
  public void checkState(Context ctx) {
  }
}


