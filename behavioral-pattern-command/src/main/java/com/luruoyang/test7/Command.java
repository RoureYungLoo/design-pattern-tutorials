package com.luruoyang.test7;

public abstract class Command {
  protected void addCommand(Command command) {
  }

  protected void removeCommand(Command command) {
  }

  protected Command getCommand(int i) {
    return null;
  }

  protected abstract void execute();
}
