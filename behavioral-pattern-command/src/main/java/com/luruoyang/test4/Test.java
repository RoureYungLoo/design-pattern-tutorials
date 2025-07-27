package com.luruoyang.test4;

import com.luruoyang.Utils;

public class Test {
  public static void main(String[] args) {
    CommandQueue commandqueue = new CommandQueue();
    commandqueue.addCommand(Utils.parseCommands());
    Invoker invoker = new Invoker(commandqueue);
    invoker.call();
  }
}
