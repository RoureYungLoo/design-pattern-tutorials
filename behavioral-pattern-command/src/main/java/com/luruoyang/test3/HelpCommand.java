package com.luruoyang.test3;

/* 帮助命令 */
public class HelpCommand extends Command {

  /* 请求接收者 */
  private HelperHandler handler;

  public HelpCommand() {
    this.handler = new HelperHandler();
  }

  @Override
  public void execute() {
    handler.display();
  }
}
