package com.luruoyang.test3;


import java.util.ArrayList;

public class FBSettingWindow {
  private String title;
  private ArrayList<FunctionButton> functionButtonArrayList = new ArrayList<>();

  public FBSettingWindow(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void addFunctionButtons(FunctionButton fb) {
    functionButtonArrayList.add(fb);
  }

  public void RemoveFunctionButtons(FunctionButton fb) {
    functionButtonArrayList.remove(fb);
  }

  public void display() {
    System.out.println("显示窗口" + this.title);
    System.out.println("显示功能键: ");
    for (FunctionButton functionButton : functionButtonArrayList) {
      System.out.println(functionButton.getName());
    }
    System.out.println("----------------------------------------------------");
  }

}
