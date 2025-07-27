package com.luruoyang.test1;

/**
 * @author luruoyang
 */
public class PurchaseRequestHandler {
  public void sendRequestToDirector(PurchaseRequest request) {
    Double amount = request.getAmount();
    if (amount < 5000) {
      handleByDirector(request);
    } else if (amount < 10000) {
      handleByVicePresident(request);
    } else if (amount < 50000) {
      handleByPresident(request);
    } else {
      handleByCongress(request);
    }
  }

  public void handleByDirector(PurchaseRequest request) {
    System.out.println("主任审批采购单" + request.getAmount());
  }

  public void handleByVicePresident(PurchaseRequest request) {
    System.out.println("副董事长审批采购单" + request.getAmount());
  }

  public void handleByPresident(PurchaseRequest request) {
    System.out.println("董事长审批采购单" + request.getAmount());
  }

  public void handleByCongress(PurchaseRequest request) {
    System.out.println("董事会审批采购单" + request.getAmount());
  }

  public static void main(String[] args) {
    PurchaseRequestHandler handler = new PurchaseRequestHandler();
    PurchaseRequest request = new PurchaseRequest("电脑", 10, 100999d);
    handler.sendRequestToDirector(request);
  }
}
