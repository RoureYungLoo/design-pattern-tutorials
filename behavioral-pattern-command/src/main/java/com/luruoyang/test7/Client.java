package com.luruoyang.test7;

public class Client {
  public static void main(String[] args) {

    Invocker invocker = new Invocker();

    MacroCommand macroCommand = new MacroCommand();
    ConcreteCommandA cmdA = new ConcreteCommandA();
    ConcreteCommandB cmdB = new ConcreteCommandB();
    macroCommand.addCommand(cmdA);
    macroCommand.addCommand(cmdB);

    invocker.setCommand(macroCommand);
    invocker.call();
  }
}
