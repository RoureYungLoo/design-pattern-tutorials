package com.luruoyang.test5;

/* 请求发送者 */
public class CalculatorForm {
  private AbstractCommand command;

  public void setCommand(AbstractCommand command) {
    this.command = command;
  }

  /* 发送请求 */
  public void compute(int value) {
    int res = command.execute(value);
    System.out.println("execute res is " + res);
  }

  /* 撤销 */
  public void undo() {
    int res = command.undo();
    System.out.println("undo res is " + res);
  }

  /* 恢复 */
  public void redo() {
    int res = command.redo();
    System.out.println("redo res is " + res);
  }
}
