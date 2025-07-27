package com.luruoyang;

// 抽象原型类
public interface Prototype {
    public Prototype clone();

    void setAttr(String attr);
}
