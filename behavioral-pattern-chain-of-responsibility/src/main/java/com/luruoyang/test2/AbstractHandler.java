package com.luruoyang.test2;

/* 抽象请求处理者 */
public abstract class AbstractHandler {
  /* 维护请求处理链上的下一个请求处理者 */
  protected AbstractHandler successor;

  public abstract void handleRequest(String request);

  public void setSuccessor(AbstractHandler successor) {
    this.successor = successor;
  }
}
