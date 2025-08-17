package com.luruoyang.test1;

/**
 * 具体服务实现类B
 *
 * @author luruoyang
 */
public class ConcreteServiceB implements Service {
  @Override
  public void operation() {
    System.out.println("调用服务B的业务方法");
  }
}
