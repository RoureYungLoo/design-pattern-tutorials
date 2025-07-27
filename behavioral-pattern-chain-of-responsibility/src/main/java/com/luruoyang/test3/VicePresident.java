package com.luruoyang.test3;

import com.luruoyang.test1.PurchaseRequest;

/* 具体处理者 副董事长 */
public class VicePresident extends Approver {
  public VicePresident(String name) {
    super(name);
  }

  @Override
  public void processRequest(PurchaseRequest request) {
    if (request.getAmount() < 10000) {
      System.out.println(name + "副董事长审核: " + request.getAmount());
    } else {
      successor.processRequest(request);
    }
  }
}
