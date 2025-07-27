package com.luruoyang.test3;

/* 最小化命令 */
public class MinimizeCommand extends Command {

  /*请求接收者*/
  private WindowsHandler handler;

  public MinimizeCommand() {
    this.handler = new WindowsHandler();
  }

  @Override
  public void execute() {
    handler.minimize();
  }
}
