package com.luruoyang.test3;

/* 具体状态类 */
public class RestrictedState extends AccountState {

  public RestrictedState(AccountState state) {
    account = state.account;
  }

  @Override
  public void deposit(double amount) {
    account.setBalance(account.getBalance() + amount);
    checkStatus();
  }

  @Override
  public void withdraw(double amount) {
    System.out.println("账号受限, 取款失败");
  }

  @Override
  public void computeInterest() {
    System.out.println("账户已经限制操作, 计算利息");
  }

  /* 状态转换 */
  @Override
  public void checkStatus() {
    if (account.getBalance() >= 0) {
      account.setState(new NormalState(this));
    } else if (account.getBalance() > -2000) {
      account.setState(new OverdraftState(this));
    }
  }
}
