package com.luruoyang.test1;

public class Account {
  private String state; // 账户状态
  private int balance; // 余额

  /* 存款 */
  public void deposit(int amount) {
    balance += amount;
    stateCheck();
  }

  /* 取款 */
  public void withdraw(int amount) {
    if (state.equalsIgnoreCase("NormalState") ||
        state.equalsIgnoreCase("OverdraftState")) {
      balance -= amount;
      stateCheck();
    } else {
      System.out.println("取款受限: RestrictedState");
    }
  }

  /*计算利息*/
  public void computeInterest() {
    if (state.equalsIgnoreCase("OverdraftState") ||
        state.equalsIgnoreCase("RestrictedState ")) {
      System.out.println("计算利息");
    }
  }

  /* 状态检查并转换 */
  private void stateCheck() {
    if (balance >= 0) {
      state = "NormalState"; // 账户正常
      System.out.println(state);
    } else if (balance > -2000 && balance < 0) {
      state = "OverdraftState"; // 账户透支
    } else if (balance == -2000) {
      System.out.println(state);
      state = "RestrictedState"; // 账户受限
    } else if (balance < -2000) {
      System.out.println(state);
      System.out.println("操作受限");
    }
  }

  public Account() {
    state = "NormalState";
    balance = 0;
  }

  public String getState() {
    return state;
  }

  public int getBalance() {
    return balance;
  }

  /* 假设需要添加【账户冻结】状态, 需要修改哪些地方? */


  public static void main(String[] args) {
    Account account = new Account();
    account.deposit(3000);
    System.out.println(account.getState());
    account.withdraw(2000);
    account.withdraw(1001);
    account.withdraw(1998);
    account.withdraw(2);
    System.out.println(account.getState());
  }
}
