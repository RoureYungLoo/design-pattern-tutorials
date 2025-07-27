package com.luruoyang.test3;

/* 具体观察目标 */
public class ConcreteAllyControlCenter extends AllyControlCenter {
  public ConcreteAllyControlCenter(String allyName) {
    this.allyName = allyName;
    System.out.println("战队" + this.allyName + "组建成功");
  }

  /* 通知玩家 */
  @Override
  public void notifyObserver(String playerName) {
    System.out.println("战队通知: 盟友" + playerName + "正在被攻击");

    /* 向盟友发送通知 */
    for (Observer player : players) {
      if (!(player.getName().equalsIgnoreCase(playerName))) {
        player.help();
      }
    }

  }
}
