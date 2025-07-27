package com.luruoyang.test5;

public class Client {
  public static void main(String[] args) {
    CalculatorForm calculator = new CalculatorForm();
    AbstractCommand command = new AddCommand();
    calculator.setCommand(command);
    calculator.compute(5);
    calculator.compute(6);
    calculator.compute(13);
    calculator.undo();

    /* 连续多次撤销存在bug, 因为没有保存 命令对象的历史状态 */
    // calculator.undo();
    // calculator.undo();

    calculator.redo();

  }
}
