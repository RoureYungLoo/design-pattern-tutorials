package com.luruoyang.lazy;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author luruoyang
 * 单例模式, 懒汉式, 延迟加载, Lazy Loading
 */
public class LazySingleton {
  // private static LazySingleton instance = null;

  // 双重检查锁需要使用volatile, 确保多个线程能正确处理
  private volatile static LazySingleton instance = null;

  private static final AtomicInteger COUNTER = new AtomicInteger(0);

  // 懒汉式单例
   /*synchronized public static LazySingleton getInstance() {
    if (instance == null) {
      // 此处存在并发安全, 方法上添加 synchronized 以保证线程安全, 但效率不高
      try {
        // 模拟重量级对象实例化
        Thread.sleep(new Random().nextInt(60 - 20 + 1) + 20);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      instance = new LazySingleton();
    }
    return instance;
  }*/

  // 单检锁
  /*public static LazySingleton getInstance() {
    if (instance == null) {
      synchronized (LazySingleton.class) {
        // 存在并发安全, 添加synchronized以保证线程安全, 优化 synchronized 的粒度
        try {
          // 模拟重量级对象实例化
          Thread.sleep(new Random().nextInt(60 - 20 + 1) + 20);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
        instance = new LazySingleton();
      }
    }
    return instance;
  }*/

  public static LazySingleton getInstance() {
    // 第一重判断
    if (instance == null) {
      // 存在并发安全, 添加synchronized以保证线程安全
      synchronized (LazySingleton.class) {
        // 第二重判断, 即双重检查锁 DCL (Double Check Lock)
        if (instance == null) {
          instance = new LazySingleton();
        }
      }
    }
    System.out.println("第" + COUNTER.incrementAndGet() + "次获取实例");

    return instance;
  }

  private LazySingleton() {
    System.out.println("第" + COUNTER.incrementAndGet() + "次实例化");
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
