package com.luruoyang.test5;

/* 抽象命令 */
public abstract class AbstractCommand {
  abstract int execute(int value);

  abstract int undo();

  abstract int redo();
}
