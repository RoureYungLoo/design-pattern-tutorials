package com.luruoyang.test3;

/* 请求发送者/命令调用者 */
public class FunctionButton {
  private String name;
  private Command command; // 抽象命令

  public FunctionButton(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  /* 设置命令 */
  public void setCommand(Command command) {
    this.command = command;
  }

  /* 执行命令 */
  public void onClick() {
    System.out.println("点击功能键: " + name);
    command.execute();
  }
}
