package com.luruoyang.one;

import com.luruoyang.four.doc.PrototypeManager;

/* 抽象建造者 */
public abstract class Builder {
    protected Product PRODUCT = new Product();

    abstract void buildPartA();
    abstract void buildPartB();
    abstract void buildPartC();

    public Product getResult(){
        return PRODUCT;
    }
}
