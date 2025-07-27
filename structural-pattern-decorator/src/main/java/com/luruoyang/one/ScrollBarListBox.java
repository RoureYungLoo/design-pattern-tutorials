package com.luruoyang.one;

public class ScrollBarListBox extends ListBox {
  @Override
  void display() {
    setScrollBar();
    System.out.println("show ScrollBarListBox");

  }
  void setScrollBar(){
    System.out.println("set ListBox ScrollBar");
  }
}
