package com.luruoyang;

import com.luruoyang.test3.Command;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Utils {
  public static List<Command> parseCommands() {

    List<Command> commands = null;
    try {
      ClassLoader classLoader = ClassLoader.getSystemClassLoader();
      InputStream in = classLoader.getResourceAsStream("application.properties");
      Properties properties = new Properties();
      properties.load(in);
      String classNameStr = properties.getProperty("command.className");
      String[] classNameArr = classNameStr.split(",");
      commands = new ArrayList<>();
      for (String s : classNameArr) {
        Class<?> clazz = Class.forName(s);
        Object o = clazz.getConstructor().newInstance();
        commands.add((Command) o);
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
    return commands;
  }

}
