package com.luruoyang.test6;


import java.util.ArrayList;
import java.util.List;

/* 请求发送者 */
public class ConfigSettingWindow {
  /*保存每次操作的命令*/
  private ArrayList<Command> commands = new ArrayList<>();
  private Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public void call(String args) {
    command.execute(args);
    commands.add(command);
  }

  /* 保存日志 */
  public void save() {
    FileUtils.writeCommands(commands);
  }

  /* 恢复日志 */
  public void recover() {
    List<Command> list = FileUtils.readCommands();
    for (Command c : list) {
      c.execute();
    }
  }
}
