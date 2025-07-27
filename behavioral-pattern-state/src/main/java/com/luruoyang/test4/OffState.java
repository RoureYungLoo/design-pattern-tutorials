package com.luruoyang.test4;

public class OffState extends State {
  @Override
  public void on(Switch s) {
    System.out.println("打开");
    s.setSharedState(Switch.getState("on"));// 设置开关的共享状态
  }

  @Override
  public void off(Switch s) {
    System.out.println("已经关闭");
  }
}
