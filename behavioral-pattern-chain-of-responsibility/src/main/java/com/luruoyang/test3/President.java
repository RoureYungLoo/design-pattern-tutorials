package com.luruoyang.test3;

import com.luruoyang.test1.PurchaseRequest;

/* 具体处理者 董事长 */
public class President extends Approver {
  public President(String name) {
    super(name);
  }

  @Override
  public void processRequest(PurchaseRequest request) {
    if (request.getAmount() < 50000) {
      System.out.println(name + "董事长审核: " + request.getAmount());
    } else {
      successor.processRequest(request);
    }
  }
}
