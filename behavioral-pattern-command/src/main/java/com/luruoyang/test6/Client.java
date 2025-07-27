package com.luruoyang.test6;

public class Client {
  public static void main(String[] args) {
    ConfigSettingWindow csw = new ConfigSettingWindow();
    Command cmd;
    ConfigOperator co = new ConfigOperator();

    cmd = new InsertCommand("增加");
    cmd.setConfigOperator(co);
    csw.setCommand(cmd);
    csw.call("网站首页");

    cmd = new InsertCommand("增加");
    cmd.setConfigOperator(co);
    csw.setCommand(cmd);
    csw.call("端口号");

    cmd = new ModifyCommand("修改");
    cmd.setConfigOperator(co);
    csw.setCommand(cmd);
    csw.call("网站首页");

    cmd = new ModifyCommand("修改");
    cmd.setConfigOperator(co);
    csw.setCommand(cmd);
    csw.call("端口号");

    System.out.println("----------------------------");
    System.out.println("保存配置");
    csw.save();

    System.out.println("-----------------------------");
    System.out.println("恢复配置");
    csw.recover();
  }
}
