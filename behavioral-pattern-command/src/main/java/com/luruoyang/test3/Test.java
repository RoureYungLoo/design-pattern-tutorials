package com.luruoyang.test3;

import java.util.List;

import static com.luruoyang.Utils.parseCommands;

public class Test {
  public static void main(String[] args) throws Exception {
    FBSettingWindow fbsw = new FBSettingWindow("功能键设置");
    /* 创建命令调用者(请求发送者) */
    FunctionButton fb1 = new FunctionButton("功能键1");
    FunctionButton fb2 = new FunctionButton("功能键2");
    FunctionButton fb3 = new FunctionButton("功能键3");

    List<Command> commands = parseCommands();

    /* 设置命令 */
    fb1.setCommand(commands.get(0));
    fb2.setCommand(commands.get(1));
    fb3.setCommand(commands.get(2));

    fbsw.addFunctionButtons(fb1);
    fbsw.addFunctionButtons(fb2);
    fbsw.addFunctionButtons(fb3);
    fbsw.display();

    /* 调用命令(发送请求) */
    fb1.onClick();
    fb2.onClick();
    fb3.onClick();
  }
}
