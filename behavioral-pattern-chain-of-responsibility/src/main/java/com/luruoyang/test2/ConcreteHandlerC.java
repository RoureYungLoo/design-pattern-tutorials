package com.luruoyang.test2;

/* 具体请求处理者 */
public class ConcreteHandlerC extends AbstractHandler {
  @Override
  public void handleRequest(String request) {
    if (request.length() < 30) {
      System.out.println("ConcreteHandlerC 处理请求");
    } else {
      System.out.println("没有人能处理");
    }
  }
}
