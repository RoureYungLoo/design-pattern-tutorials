package com.luruoyang.test1;

/**
 * 具体服务提供者A
 *
 * @author luruoyang
 */
public class ConcreteServiceProviderA implements ServiceProvider {
  @Override
  public Service getService() {
    return new ConcreteServiceA();
  }
}
