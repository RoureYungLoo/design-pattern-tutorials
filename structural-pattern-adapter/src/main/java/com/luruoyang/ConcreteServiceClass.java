package com.luruoyang;

/* 具体业务类 */
public class ConcreteServiceClass extends AbstractServiceClass{
    @Override
    public void serviceMethod3() {
        System.out.println("选择性地实现抽象方法");
    }
}
