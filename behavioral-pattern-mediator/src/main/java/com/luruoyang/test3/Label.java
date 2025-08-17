package com.luruoyang.test3;

import com.luruoyang.test2.Component;

/* 具体同事类 */
public class Label extends Component {
  @Override
  public void update() {
    System.out.println("文本标签内容改变, 客户信息总数增加");
  }
}
