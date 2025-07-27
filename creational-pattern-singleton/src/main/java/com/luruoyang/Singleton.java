package com.luruoyang;

import java.util.Random;

/**
 * 单例模式
 *
 * @author luruoyang
 */
public class Singleton {
  /* 私有类变量 */
  private static Singleton instance = null;

  /* 私有构造器 */
  private Singleton() {
  }

  /* 公有 static 工厂方法 */
  public static Singleton getInstance() {
    /* 方法加锁, 可保证多线程安全, 但高并发性能低下 */
    // public synchronized static Singleton getInstance() {
    // 非多线程安全
    if (instance == null) {
      try {
        // 模拟重量级对象实例化
        Thread.sleep(new Random().nextInt(60 - 20 + 1) + 20);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      instance = new Singleton();
    }
    return instance;
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }
}
