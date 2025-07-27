package com.luruoyang.test4.demo1;

public class Container {
  private LayoutManager layoutManager;

  public void setLayoutManager(LayoutManager layoutManager) {
    this.layoutManager = layoutManager;
  }

  public void show() {
    layoutManager.showLayout();
  }

}
