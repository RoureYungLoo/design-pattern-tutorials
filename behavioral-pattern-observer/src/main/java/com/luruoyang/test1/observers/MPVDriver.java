package com.luruoyang.test1.observers;

public class MPVDriver implements Driver {
  @Override
  public void moveForward() {
    System.out.println("MPV Driver moveForward ");
  }

  @Override
  public void brake() {
    System.out.println("MPV Driver brake ");
  }

  @Override
  public void slowDown() {
    System.out.println("MPV Driver slowDown ");
  }
}
