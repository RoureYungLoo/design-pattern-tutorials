package com.luruoyang.test3;

import com.luruoyang.test1.PurchaseRequest;

/* 抽象请求处理者 */
public abstract class Approver {
  protected Approver successor;
  protected String name;

  public Approver(String name) {
    this.name = name;
  }

  public void setSuccessor(Approver successor) {
    this.successor = successor;
  }

  public abstract void processRequest(PurchaseRequest request);
}
