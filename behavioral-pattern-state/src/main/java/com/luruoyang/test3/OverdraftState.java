package com.luruoyang.test3;

/* 具体状态类 */
public class OverdraftState extends AccountState {

  public OverdraftState(AccountState state) {
    account = state.account;
  }

  @Override
  public void deposit(double amount) {
    account.setBalance(account.getBalance() + amount);
    checkStatus();
  }

  @Override
  public void withdraw(double amount) {
    account.setBalance(account.getBalance() - amount);
    checkStatus();
  }

  @Override
  public void computeInterest() {
    System.out.println("账户已经透支, 计算利息");
  }

  /* 状态转换 */
  @Override
  public void checkStatus() {
    if (account.getBalance() >= 0) {
      account.setState(new NormalState(this));
    } else if (account.getBalance() == -2000) {
      account.setState(new RestrictedState(this));
    } else if (account.getBalance() < -2000) {
      System.out.println("操作受限");
    }
  }
}
