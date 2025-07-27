package com.luruoyang.eager;

import java.util.Random;

/**
 * @author luruoyang
 * 单例模式, 饿汉式
 */
public class EagerSingleton {
  /* 私有类变量, 线程安全，类加载时创建, final 防止单例实例引用被修改 */
  private static final EagerSingleton INSTANCE = new EagerSingleton();

  /* 私有构造器 */
  private EagerSingleton() {
  }

  /* 公有 static 工厂方法 */
  public static EagerSingleton getInstance() {
    try {
      // 模拟重量级对象实例化
      Thread.sleep(new Random().nextInt(60 - 20 + 1) + 20);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    return INSTANCE;
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
