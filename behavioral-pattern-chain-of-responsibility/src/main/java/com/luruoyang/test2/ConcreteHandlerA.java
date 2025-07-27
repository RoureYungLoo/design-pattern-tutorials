package com.luruoyang.test2;

/* 具体处理者A */
public class ConcreteHandlerA extends AbstractHandler {
  @Override
  public void handleRequest(String request) {
    if (request.length() < 10) {
      System.out.println("ConcreteHandlerA 处理请求");
    } else {
      successor.handleRequest(request);
    }
  }
}
