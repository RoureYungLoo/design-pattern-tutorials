package com.luruoyang.test1;

/**
 * 具体服务实现类A
 *
 * @author luruoyang
 */
public class ConcreteServiceA implements Service {
  @Override
  public void operation() {
    System.out.println("调用服务A的业务方法");
  }
}
