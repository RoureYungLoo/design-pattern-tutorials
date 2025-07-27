package com.luruoyang.test3;

public class Test {
  public static void main(String[] args) {
    AllyControlCenter acc = new ConcreteAllyControlCenter("天行者");
    Observer player1 = new Player("张三");
    Observer player2 = new Player("李四");
    Observer player3 = new Player("王五");
    Observer player4 = new Player("赵六");

    acc.join(player1);
    acc.join(player2);
    acc.join(player3);
    acc.join(player4);

    player4.beAttacked(acc);

  }
}
