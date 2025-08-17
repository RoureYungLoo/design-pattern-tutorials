package com.luruoyang.test1;

import com.luruoyang.test1.configuration.YamlConfigParser;

/**
 * @author luruoyang
 */
public class Client {
  public static void main(String[] args) throws Exception {
    Service service = null;
    // ServiceProvider serviceProvider = new ConcreteServiceProviderA();
    // 通过配置文件动态调整 具体的ServiceProvider实现类
    String className = new YamlConfigParser().getProviderClassName();
    ServiceProvider serviceProvider = (ServiceProvider) Class.forName(className).getConstructor().newInstance();
    service = serviceProvider.getService();
    service.operation();
  }
}
