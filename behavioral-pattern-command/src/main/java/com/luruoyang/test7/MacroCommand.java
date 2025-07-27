package com.luruoyang.test7;

import java.util.ArrayList;
import java.util.List;

public class MacroCommand extends Command {
  private final List<Command> commandList = new ArrayList<>();


  @Override
  protected void addCommand(Command command) {
    commandList.add(command);
  }

  @Override
  protected void removeCommand(Command command) {
    commandList.remove(command);
  }

  @Override
  protected Command getCommand(int i) {
    return commandList.get(i);
  }

  @Override
  protected void execute() {
    commandList.forEach(Command::execute);
  }
}
