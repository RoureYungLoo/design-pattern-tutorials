package com.luruoyang.test2;

/* 具体组件 */
public class ComboBox extends Component {

  /* 更新组合框 */
  @Override
  public void update() {
    System.out.println("组合框增加一项");
  }

  public void select(){
    System.out.println("组合框中选项");
  }

}
