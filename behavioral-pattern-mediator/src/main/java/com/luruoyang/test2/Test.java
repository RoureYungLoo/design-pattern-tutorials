package com.luruoyang.test2;

public class Test {
  public static void main(String[] args) {
    ConcreteMediator mediator = new ConcreteMediator();

    Button button = new Button();
    List list = new List();
    ComboBox comboBox = new ComboBox();
    TextBox textBox = new TextBox();

    button.setMediator(mediator);
    list.setMediator(mediator);
    comboBox.setMediator(mediator);
    textBox.setMediator(mediator);

    mediator.setAddButton(button);
    mediator.setList(list);
    mediator.setComboBox(comboBox);
    mediator.setUserNameTextBox(textBox);

    button.change();
    System.out.println("---------------");
    list.change();
  }
}
