package com.luruoyang.test2;

/* 具体组件 */
public class TextBox extends Component {

  /* 更新文本框 */
  @Override
  public void update() {
    System.out.println("客户信息增加成功后文本框清空");
  }

  public void setText() {
    System.out.println("文本框显示");
  }
}
