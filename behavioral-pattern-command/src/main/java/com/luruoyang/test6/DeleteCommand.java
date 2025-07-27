package com.luruoyang.test6;

import java.io.Serializable;

/* 具体命令类 */
public class DeleteCommand extends Command implements Serializable {
  public DeleteCommand(String name) {
    super(name);
  }

  @Override
  void execute() {
    configOperator.delete(args);
  }

  @Override
  void execute(String args) {
    this.args = args;
    configOperator.delete(args);
  }
}
