package com.luruoyang.test3;

/* 环境类 */
public class Account {
  private AccountState state;
  private String owner;
  private double balance;

  public Account(String owner, double balance) {
    this.owner = owner;
    this.balance = balance;
    this.state = new NormalState(this);
    System.out.println(owner + "开户, 初始金额" + balance);
    System.out.println("---------------------");
  }


  /* 设置账户状态 */
  public void setState(AccountState state) {
    this.state = state;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  /*调用不同状态的方法, 体现继承多态*/
  public void deposit(double amount) {
    System.out.println(owner + "存款" + amount);
    state.deposit(amount);
    System.out.println("余额:" + balance);
    System.out.println("账户状态:" + state.getClass().getName());
    System.out.println("-----------------------");
  }

  public void withdraw(double amount) {
    System.out.println(owner + "取款" + amount);
    state.withdraw(amount);
    System.out.println("余额:" + balance);
    System.out.println("账户状态:" + state.getClass().getName());
    System.out.println("-----------------------");

  }

  public void computeInterest() {
    state.computeInterest();
  }

}
