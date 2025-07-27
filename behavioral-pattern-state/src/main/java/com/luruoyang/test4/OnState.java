package com.luruoyang.test4;

public class OnState extends State {
  @Override
  public void on(Switch s) {
    System.out.println("已经打开!");
  }

  @Override
  public void off(Switch s) {
    System.out.println("关闭");
    s.setSharedState(Switch.getState("off")); // 设置开关的共享状态
  }
}
