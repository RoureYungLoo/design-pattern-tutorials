package com.luruoyang.test2;

/* 环境类 */
public class Context {
  private State state; // 持有抽象状态的引用
  private int value; // 其他成员变量, 可以会引起State的改变

  public void setState(State state) {
    this.state = state;
  }

  public State getState() {
    return state;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public void request() {
    /*其他代码*/

    /* 处理状态 */
    state.handle();

    /*其他代码*/
  }

  /* [状态管理方式二]  由环境类充当状态管理器(State Manager) */
  public void checkState() {
    if (value == 0) {
      setState(new ConcreteStateA());
    } else if (value == 1) {
      setState(new ConcreteStateB());
    } else if (value == 2) {
      setState(new ConcreteStateC());
    }

    request();
  }
}
