package com.luruoyang.test3;

import com.luruoyang.test2.*;

public class Test {
  public static void main(String[] args) {
    /* 中介者 */
    SubConcreteMediator mediator = new SubConcreteMediator();

    /* 同事对象 */
    Button button = new Button();
    List list = new List();
    ComboBox comboBox = new ComboBox();
    TextBox textBox = new TextBox();
    Label label = new Label();

    /* 设置中介者 */
    button.setMediator(mediator);
    list.setMediator(mediator);
    comboBox.setMediator(mediator);
    textBox.setMediator(mediator);
    label.setMediator(mediator);

    /* 设置同事对象 */
    mediator.setAddButton(button);
    mediator.setList(list);
    mediator.setComboBox(comboBox);
    mediator.setUserNameTextBox(textBox);
    mediator.setLabel(label);

    button.change();
    System.out.println("---------------");
    list.change();
  }
}
