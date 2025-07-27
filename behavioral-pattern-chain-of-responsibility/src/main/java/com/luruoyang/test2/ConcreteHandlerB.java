package com.luruoyang.test2;

/* 具体请求处理者 */
public class ConcreteHandlerB extends AbstractHandler {
  @Override
  public void handleRequest(String request) {
    if (request.length() < 20) {
      System.out.println("ConcreteHandlerB 处理请求");
    } else {
      successor.handleRequest(request);
    }
  }
}
