package com.luruoyang.test1;

/**
 * 具体服务提供者B
 *
 * @author luruoyang
 */
public class ConcreteServiceProviderB implements ServiceProvider {
  @Override
  public Service getService() {
    return new ConcreteServiceB();
  }
}
