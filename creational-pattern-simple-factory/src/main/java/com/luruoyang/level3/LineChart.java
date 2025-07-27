package com.luruoyang.level3;

/* 具体产品角色 */
public class LineChart extends Chart{
    public LineChart() {
        System.out.println("创建折线图");
    }

    @Override
    public void display() {
        System.out.println("显示折线图");
    }
}
