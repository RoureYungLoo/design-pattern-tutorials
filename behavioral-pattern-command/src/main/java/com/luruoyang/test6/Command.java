package com.luruoyang.test6;

import java.io.Serializable;

/* 抽象命令类 */
public abstract class Command implements Serializable {
  protected String name;
  protected String args;
  protected ConfigOperator configOperator; // 请求接收者

  public Command(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setConfigOperator(ConfigOperator configOperator) {
    this.configOperator = configOperator;
  }

  abstract void execute();

  abstract void execute(String args);
}
