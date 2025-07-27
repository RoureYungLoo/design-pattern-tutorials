package com.luruoyang.test6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
  private static File path;

  static {
    File parent = new File("behavioral-pattern-command/log");
    if (!parent.exists()) {
      boolean b = parent.mkdir();
      if (b) {
        System.out.println("文件夹创建成功");
        path = new File(parent, "config.log");
      } else {
        throw new RuntimeException("文件夹创建失败");
      }
    }
  }

  public static void writeCommands(ArrayList<Command> commands) {
    try {
      FileOutputStream file = new FileOutputStream(path);
      ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(file));
      oos.writeObject(commands);
      oos.close();
    } catch (IOException e) {
      System.out.println("命令保存失败");
      throw new RuntimeException(e);
    }
  }

  public static List<Command> readCommands() {
    List<Command> list = null;
    try {
      FileInputStream file = new FileInputStream(path);
      ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(file));
      list = (List<Command>) ois.readObject();
      ois.close();
    } catch (Exception e) {
      System.out.println("命令读取失败");
      throw new RuntimeException(e);
    }
    return list;
  }
}
