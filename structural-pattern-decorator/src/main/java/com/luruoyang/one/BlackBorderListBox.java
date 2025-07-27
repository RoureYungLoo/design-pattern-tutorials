package com.luruoyang.one;

public class BlackBorderListBox extends ListBox {
  @Override
  void display() {
    setBlackBorder();
    System.out.println("show BlackBorderListBox");
  }

  void setBlackBorder(){
    System.out.println("set ListBox BlackBorder");
  }
}
