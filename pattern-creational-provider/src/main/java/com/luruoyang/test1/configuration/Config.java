package com.luruoyang.test1.configuration;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author luruoyang
 */
@Data
@NoArgsConstructor
public class Config {
  private MyKitty myKitty = new MyKitty();

  @Data
  @NoArgsConstructor
  public static class MyKitty {
    private String provider;
  }
}