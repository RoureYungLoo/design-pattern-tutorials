package com.luruoyang.test2;

/* 具体组件 */
public class Button extends Component {

  /* 按钮无需更新 */
  @Override
  public void update() {
    System.out.println("点击按钮, 无交互产生");
  }
}
