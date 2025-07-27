package com.luruoyang.test3;

/* 适配器类 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.specificRequest();
    }
}
