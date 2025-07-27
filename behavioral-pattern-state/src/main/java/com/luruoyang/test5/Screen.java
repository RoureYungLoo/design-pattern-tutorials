package com.luruoyang.test5;

/* 环境类 */
public class Screen {
  private State currentState;
  private State normalState;
  private State largerState;
  private State largestState;

  public Screen() {
    normalState = new NormalState();
    largerState = new LargerState();
    largestState = new LargestState();
    currentState = normalState;
    currentState.display();
  }

  /* 设置状态 */
  public void setCurrentState(State state) {
    currentState = state;
  }

  /* 单击事件处理器, 状态管理器,  */
  /* 新增其他状态时, 无需修改已有状态类的源码, 只需新增状态类、修改环境类即可 */
  public void onClick() {
    if (currentState == normalState) {
      setCurrentState(largerState);
    } else if (currentState == largerState) {
      setCurrentState(largestState);
    } else if (currentState == largestState) {
      setCurrentState(normalState);
    }
    currentState.display();

  }
}
