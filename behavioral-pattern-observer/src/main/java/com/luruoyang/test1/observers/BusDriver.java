package com.luruoyang.test1.observers;

/* 具体观察者 */
public class BusDriver implements Driver {
  @Override
  public void moveForward() {
    System.out.println("Bus Driver moveForward ");
  }

  @Override
  public void brake() {
    System.out.println("Bus Driver brake ");
  }

  @Override
  public void slowDown() {
    System.out.println("Bus Driver slowDown ");
  }
}
