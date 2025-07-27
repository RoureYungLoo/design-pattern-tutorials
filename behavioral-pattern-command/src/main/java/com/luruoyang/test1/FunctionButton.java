package com.luruoyang.test1;

/* 请求发送者/命令调用者 */
public class FunctionButton {
  private HelperHandler handler;

  public void onClick(){
    handler = new HelperHandler();
    handler.display();
  }
}

/*
缺点: 违背开闭原则, 违背依赖倒置原则
*/