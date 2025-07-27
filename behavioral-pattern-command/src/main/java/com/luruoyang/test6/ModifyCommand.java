package com.luruoyang.test6;

import java.io.Serializable;

public class ModifyCommand extends Command implements Serializable {
  public ModifyCommand(String name) {
    super(name);
  }

  @Override
  void execute() {
    configOperator.modify(this.args);
  }

  @Override
  void execute(String args) {
    this.args = args;
    configOperator.modify(args);
  }
}
