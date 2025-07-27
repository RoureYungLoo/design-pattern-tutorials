package com.luruoyang.test3;

public class Test {
  public static void main(String[] args) {
    Account account = new Account("lisi", 0.0);
    account.deposit(1000);
    account.computeInterest();
    account.withdraw(2000);
    account.computeInterest();
    account.deposit(3000);
    account.computeInterest();
    account.withdraw(4000);
    account.computeInterest();
    account.withdraw(1000);
    account.computeInterest();
  }
}
