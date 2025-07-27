package com.luruoyang.test1.observers;

/* 具体观察者 */
public class VanDriver implements Driver {
  @Override
  public void moveForward() {
    System.out.println("Van Driver moveForward ");
  }

  @Override
  public void brake() {
    System.out.println("Van Driver brake ");
  }

  @Override
  public void slowDown() {
    System.out.println("Van Driver slowDown ");
  }
}
