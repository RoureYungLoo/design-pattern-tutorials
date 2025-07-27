package com.luruoyang.test2;

/* 具体组件 */
public class List extends Component {
  /* 更新列表框 */
  @Override
  public void update() {
    System.out.println("列表框增加一项");
  }

  public void select() {
    System.out.println("列表框选中项");
  }
}
