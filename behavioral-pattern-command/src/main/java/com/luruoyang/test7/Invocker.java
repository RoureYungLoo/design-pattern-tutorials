package com.luruoyang.test7;

/* 请求发送者 */
public class Invocker {
  private Command command;

  public Invocker() {
  }

  public Invocker(Command command) {
    this.command = command;
  }

  public void setCommand(Command command) {
    this.command = command;
  }

  /* 发起调用 */
  public void call() {
    command.execute();
  }

  public Command getCommand() {
    return command;
  }
}
