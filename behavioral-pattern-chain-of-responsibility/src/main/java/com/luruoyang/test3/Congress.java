package com.luruoyang.test3;

import com.luruoyang.test1.PurchaseRequest;

/* 具体处理者 董事会 */
public class Congress extends Approver {
  public Congress(String name) {
    super(name);
  }

  @Override
  public void processRequest(PurchaseRequest request) {
    System.out.println(name + "董事会审核: " + request.getAmount());
  }
}
