package com.luruoyang.test3;

/* 新增: 截屏命令类 */
public class ScreenCommand extends Command {

  private ScreenHandler screenHandler;

  public ScreenCommand() {
    this.screenHandler = new ScreenHandler();
  }

  @Override
  public void execute() {
    screenHandler.screen();
  }
}
