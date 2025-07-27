package com.luruoyang.test3;

import com.luruoyang.test1.PurchaseRequest;

public class Test {
  public static void main(String[] args) {
    PurchaseRequest request1 = new PurchaseRequest("手机", 20, 4999d);
    PurchaseRequest request2 = new PurchaseRequest("手机", 20, 6999d);
    PurchaseRequest request3 = new PurchaseRequest("手机", 20, 16999d);
    PurchaseRequest request4 = new PurchaseRequest("手机", 20, 56999d);
    PurchaseRequest request5 = new PurchaseRequest("手机", 20, 86999d);

    Approver zhangsan = new Direcotr("张三");
    Approver lisi = new VicePresident("李四");
    Approver wangwu = new President("王五");
    Approver zhaoliu = new Manager("赵六");
    Approver congress = new Congress("董事会");

    zhangsan.setSuccessor(lisi);
    lisi.setSuccessor(wangwu);
    wangwu.setSuccessor(zhaoliu);
    zhaoliu.setSuccessor(congress);


    zhangsan.processRequest(request1);
    zhangsan.processRequest(request2);
    zhangsan.processRequest(request3);
    zhangsan.processRequest(request4);
    zhangsan.processRequest(request5);

    /* 如果新增一个经理负责5w-8w的审核怎么操作? */


  }
}

class Manager extends Approver {

  public Manager(String name) {
    super(name);
  }

  @Override
  public void processRequest(PurchaseRequest request) {
    Double amount = request.getAmount();
    if (amount >= 50000 && amount < 80000) {
      System.out.println(name + "经理审核: " + amount);
    } else {
      successor.processRequest(request);
    }
  }
}