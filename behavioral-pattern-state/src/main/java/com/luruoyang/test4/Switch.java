package com.luruoyang.test4;

/* 环境类 */
public class Switch {

  /* 不同开关的共享状态 */
  private static State sharedState;
  private static State onState, offState;
  private String name;

  public Switch(String name) {
    this.name = name;
    onState = new OnState();
    offState = new OffState();
    this.sharedState = onState;  // 开关初始状态为开
  }

  /* 设置状态 */
  public void setSharedState(State state) {
    this.sharedState = state;
  }

  /* 获取开关状态 */
  public static State getState(String type) {
    if (type.equalsIgnoreCase("on")) {
      return onState;
    } else {
      return offState;
    }
  }

  /* 打开开关 */
  public void on() {
    System.out.print(name);
    sharedState.on(this);
  }

  /* 关闭开关 */
  public void off() {
    System.out.print(name);
    sharedState.off(this);
  }
}
