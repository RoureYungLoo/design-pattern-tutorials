package com.luruoyang.test1;

import com.luruoyang.test1.observers.*;
import com.luruoyang.test1.target.Color;
import com.luruoyang.test1.target.Light;
import com.luruoyang.test1.target.TrafficLight;
import observer_pattern.test1.observers.*;

public class Test {
  public static void main(String[] args) {
    Light light = new TrafficLight(Color.red);

    Driver busDriver = new BusDriver();
    Driver mpvDriver = new MPVDriver();
    Driver suvDriver = new SUVDriver();
    Driver vanDriver = new VanDriver();

    light.enterCrossing(busDriver);
    light.enterCrossing(suvDriver);
    light.enterCrossing(vanDriver);
    light.enterCrossing(mpvDriver);

    light.setColor(Color.yellow);
    light.setColor(Color.green);
  }
}
