package com.luruoyang.test1.observers;

public class SUVDriver implements Driver {
  @Override
  public void moveForward() {
    System.out.println("SUV Driver moveForward ");
  }

  @Override
  public void brake() {
    System.out.println("SUV Driver brake ");
  }

  @Override
  public void slowDown() {
    System.out.println("SUV Driver slowDown ");
  }

}
