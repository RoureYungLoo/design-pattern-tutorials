package com.luruoyang.test3;

import com.luruoyang.test2.Component;
import com.luruoyang.test2.ConcreteMediator;
import lombok.Data;

/* 新增具体中介者类 */
@Data
public class SubConcreteMediator extends ConcreteMediator {
  /* 持有新增的标签类的引用 */
  public Label label;

  @Override
  public void componentChanged(Component component) {
    if (component == addButton) {
      System.out.println("点击 addButton");
      list.update();
      comboBox.update();
      userNameTextBox.update();
      label.update();
    } else if (component == list) {
      System.out.println("从列表框选择客户");
      comboBox.select();
      userNameTextBox.setText();
    } else if (component == comboBox) {
      System.out.println("从组合框选择客户");
      comboBox.select();
      userNameTextBox.setText();
    }

  }
}
