package com.luruoyang.test2;

/* 请求发送者/命令调用者 */
public class Invoker {
  private AbstractCommand command;

  /* 构造注入 */
  public Invoker(AbstractCommand command) {
    this.command = command;
  }

  /* 设值注入 */
  public void setCommand(AbstractCommand command) {
    this.command = command;
  }

  /* 调用命令的execute方法 */
  public void call() {
    command.execute(); // 不同的具体命令, 有着不同的业务方法
  }
}
