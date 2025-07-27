package com.luruoyang.test3;

/* 抽象策略 */
public interface AbstractDiscountStrategy {
  default double calculate(double price) {
    return price;
  }
}
