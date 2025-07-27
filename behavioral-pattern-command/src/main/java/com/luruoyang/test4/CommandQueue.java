package com.luruoyang.test4;

import com.luruoyang.test3.Command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* 命令队列, 类似批处理操作 */
public class CommandQueue {
  /* 存储命令 */
  private final List<Command> commands = new ArrayList<>();

  public void addCommand(Command... command) {
    commands.addAll(Arrays.asList(command));
  }

  public void addCommand(Collection<Command> cmds) {
    commands.addAll(cmds);
  }

  public void removeCommand(Command command) {
    commands.remove(command);
  }

  /* 执行命令 */
  public void execute() {
    for (Command command : commands) {
      command.execute();
    }
  }
}
