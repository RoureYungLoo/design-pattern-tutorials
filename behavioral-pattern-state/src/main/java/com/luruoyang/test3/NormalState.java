package com.luruoyang.test3;

/* 具体状态类 */
public class NormalState extends AccountState {

  public NormalState(Account account) {
    this.account = account;
  }

  public NormalState(AccountState state) {
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
    System.out.println("账户状态正常, 无需支付利息");
  }

  /* 状态转换 */
  @Override
  public void checkStatus() {
    if (account.getBalance() > -2000 && account.getBalance() <= 0) {
      account.setState(new OverdraftState(this));
    } else if (account.getBalance() == -2000) {
      account.setState(new RestrictedState(this));
    } else if (account.getBalance() < -2000) {
      System.out.println("操作受限制");
    }
  }
}
