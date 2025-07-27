package com.luruoyang.test2;

public class Test {
  public static void main(String[] args) {

    ConcreteHandlerA handlerA = new ConcreteHandlerA();
    ConcreteHandlerB handlerB = new ConcreteHandlerB();
    ConcreteHandlerC handlerC = new ConcreteHandlerC();

    handlerA.setSuccessor(handlerB);
    handlerB.setSuccessor(handlerC);

    handlerA.handleRequest("012345678");
    handlerA.handleRequest("012345678901234567");
    handlerA.handleRequest("012345678901234567890");
    handlerA.handleRequest("0123456789012345678901234567890");
  }
}
