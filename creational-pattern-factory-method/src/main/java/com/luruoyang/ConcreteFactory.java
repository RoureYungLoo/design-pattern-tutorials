package com.luruoyang;

/* 具体工厂 */
public class ConcreteFactory extends Factory {
    @Override
    public Product getProduct() {
        return new ConcreteProduct();
    }
}
