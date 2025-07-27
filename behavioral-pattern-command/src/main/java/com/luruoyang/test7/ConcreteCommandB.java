package com.luruoyang.test7;

/* 具体命令 */
public class ConcreteCommandB extends Command {

  /* 命令执行者 */
  private ReceiverB rb;

  public ConcreteCommandB() {
    rb=new ReceiverB();
  }

  @Override
  protected void execute() {
    rb.action();
  }
}
