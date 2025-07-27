package com.luruoyang.test7;

/* 具体命令 */
public class ConcreteCommandA extends Command {

  /* 请求接收者 / 命令执行者 */
  private ReceiverA ra;

  public ConcreteCommandA() {
    ra = new ReceiverA();
  }

  @Override
  protected void execute() {
    ra.action();
  }
}
