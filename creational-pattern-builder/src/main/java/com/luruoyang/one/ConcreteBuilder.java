package com.luruoyang.one;

public class ConcreteBuilder extends Builder {
    @Override
    void buildPartA() {
        System.out.println(" build part A");
    }

    @Override
    void buildPartB() {
        System.out.println(" build part B");

    }

    @Override
    void buildPartC() {
        System.out.println(" build part C");

    }
}
