package com.luruoyang.test3;

import com.luruoyang.test1.PurchaseRequest;

/* 具体处理者 主任 */
public class Direcotr extends Approver {
  public Direcotr(String name) {
    super(name);
  }

  @Override
  public void processRequest(PurchaseRequest request) {
    if (request.getAmount() < 5000) {
      System.out.println(name + "主任审核: " + request.getAmount());
    } else {
      successor.processRequest(request);
    }
  }
}
