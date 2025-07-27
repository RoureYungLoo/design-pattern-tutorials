package com.luruoyang.test6;

import java.io.Serializable;

/* 具体命令类 */
public class InsertCommand extends Command implements Serializable {
  public InsertCommand(String name) {
    super(name);
  }

  @Override
  void execute() {
    configOperator.insert(this.args);
  }

  @Override
  void execute(String args) {
    this.args = args;
    configOperator.insert(args);
  }
}
