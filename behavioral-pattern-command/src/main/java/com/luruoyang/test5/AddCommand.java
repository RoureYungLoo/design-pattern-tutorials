package com.luruoyang.test5;

/* 加法命令 */
public class AddCommand extends AbstractCommand {

  private Adder adder;
  private int value;

  public AddCommand() {
    adder = new Adder();
    value = Integer.MIN_VALUE;
  }

  @Override
  int execute(int value) {
    this.value = value;
    return adder.add(value);
  }

  @Override
  int undo() {
    return adder.add(-value);
  }

  @Override
  int redo() {
    return adder.add(value);
  }
}
