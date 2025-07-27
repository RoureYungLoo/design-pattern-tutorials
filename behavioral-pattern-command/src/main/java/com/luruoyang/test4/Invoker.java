package com.luruoyang.test4;

/* 请求发送者(命令调用者) */
public class Invoker {
  private CommandQueue commandQueue; // 命令队列

  public Invoker(CommandQueue commandQueue) {
    this.commandQueue = commandQueue;
  }

  public void setCommandQueue(CommandQueue commandQueue) {
    this.commandQueue = commandQueue;
  }

  /* 调用命令队列的execute() */
  public void call() {
    commandQueue.execute();
  }
}
