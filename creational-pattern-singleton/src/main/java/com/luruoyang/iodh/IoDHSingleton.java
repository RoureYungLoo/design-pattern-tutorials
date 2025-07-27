package com.luruoyang.iodh;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author luruoyang
 * IoDH Initialization Demand Holder
 */
public class IoDHSingleton {
  private static final AtomicInteger COUNTER = new AtomicInteger(0);

  /* 私有静态内部类 */
  private static class HolderClass {
    private static final IoDHSingleton INSTANCE = new IoDHSingleton();

    static {
      /* com.luruoyang.iodh.Singleton$HolderClass is being loading... */
      System.out.println(HolderClass.class.getName() + " is being loading...");
    }
  }

  /* 私有构造器 */
  private IoDHSingleton() {
    System.out.println("第" + COUNTER.incrementAndGet() + "次实例化");
  }

  /* 公有方法 */
  public static IoDHSingleton getInstance() {
    return HolderClass.INSTANCE;
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
