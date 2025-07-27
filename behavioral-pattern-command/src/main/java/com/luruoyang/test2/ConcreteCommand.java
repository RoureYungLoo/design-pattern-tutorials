package com.luruoyang.test2;

/* 具体命令类 */
public class ConcreteCommand extends AbstractCommand {

  /* 请求接收者 */
  private Receiver receiver;

  public ConcreteCommand(Receiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void execute() {
    receiver.action(); // 调用请求接收者的业务方法action()
  }
}
