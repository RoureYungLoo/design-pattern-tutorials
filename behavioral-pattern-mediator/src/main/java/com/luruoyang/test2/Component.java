package com.luruoyang.test2;

/* 抽象组件类(充当同事类) */
public abstract class Component {
  protected Mediator mediator;

  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  /* 转发调用 */
  public void change() {
    mediator.componentChanged(this);
  }

  /* 更新组件 */
  public abstract void update();
}
