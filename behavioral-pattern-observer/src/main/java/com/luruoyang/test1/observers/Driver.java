package com.luruoyang.test1.observers;

import com.luruoyang.test1.target.Color;

/* 抽象观察者 */
public interface Driver {

  /* 前进 */
  void moveForward();

  /* 刹车 */
  void brake();

  /* 减速慢行 */
  void slowDown();

  public default void reactive(Color color) {
    if (color == Color.green) {
      brake();
    } else if (color == Color.yellow) {
      slowDown();
    } else if (color == Color.red) {
      moveForward();
    }
  }
}
