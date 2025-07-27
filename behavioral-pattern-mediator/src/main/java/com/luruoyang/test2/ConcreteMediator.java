package com.luruoyang.test2;

import lombok.*;

/* 具体中介者 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConcreteMediator extends Mediator {

  /* 持有同事对象的引用 */
  private Button addButton;
  private List list;
  private TextBox userNameTextBox;
  private ComboBox comboBox;

  /* 封装对象交互 */
  @Override
  public void componentChanged(Component component) {
    if (component == addButton) {
      System.out.println("点击 addButton");
      list.update();
      comboBox.update();
      userNameTextBox.update();
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
