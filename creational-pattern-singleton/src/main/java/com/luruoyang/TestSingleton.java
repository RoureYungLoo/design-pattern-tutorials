package com.luruoyang;

import com.luruoyang.eager.EagerSingleton;
import com.luruoyang.iodh.IoDHSingleton;
import com.luruoyang.lazy.LazySingleton;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author luruoyang
 */
public class TestSingleton {
  public static void main(String[] args) throws Exception {
    // testCommonSingleton();
    // testEagerSingleton();
    // testLazySingleton();
    testIoDHSingleton();
  }

  public static void testCommonSingleton() throws Exception {
    Set<Singleton> set = Collections.synchronizedSet(new HashSet<>());
    for (int i = 0; i < 1000; i++) {
      new Thread(() -> {
        /* 单例对象 SET */
        set.add(Singleton.getInstance());
      }) {
      }.start();
    }

    while (true) {
      Thread.sleep(1000);
      /* SET 大小不为 1 , 说明实例化出来的对象不止一个! */
      System.out.println(set.size());
    }
  }

  public static void testEagerSingleton() throws Exception {
    Set<EagerSingleton> set = Collections.synchronizedSet(new HashSet<>());
    for (int i = 0; i < 1000; i++) {
      new Thread(() -> {
        /* 单例对象 SET */
        set.add(EagerSingleton.getInstance());
      }) {
      }.start();
    }

    while (true) {
      Thread.sleep(1000);
      /* SET 大小不为 1 , 说明实例化出来的对象不止一个! */
      System.out.println(set.size());
    }
  }

  public static void testLazySingleton() throws Exception {
    Set<LazySingleton> set = Collections.synchronizedSet(new HashSet<>());
    for (int i = 0; i < 2000; i++) {
      new Thread(() -> {
        /* 单例对象 SET */
        set.add(LazySingleton.getInstance());
      }) {
      }.start();
    }

    while (true) {
      Thread.sleep(1000);
      /* SET 大小不为 1 , 说明实例化出来的对象不止一个! */
      System.out.println(set.size());
    }
  }

  public static void testIoDHSingleton() throws Exception {
    Set<IoDHSingleton> set = Collections.synchronizedSet(new HashSet<>());
    for (int i = 0; i < 2000; i++) {
      new Thread(() -> {
        /* 单例对象 SET */
        set.add(IoDHSingleton.getInstance());
      }) {
      }.start();
    }

    while (true) {
      Thread.sleep(1000);
      /* SET 大小不为 1 , 说明实例化出来的对象不止一个! */
      System.out.println(set.size());
      System.out.println(set);
    }
  }

}
