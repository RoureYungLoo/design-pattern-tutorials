package com.luruoyang.level3;

/* 工厂角色 */
public class ChartFactory {
    public static Chart getChart(String type) {
        Chart chart = null;
        if (type.equalsIgnoreCase("pie")) {
            chart = new PieChart();
            System.out.println("初始化设置饼状图");
        } else if (type.equalsIgnoreCase("line")) {
            chart = new LineChart();
            System.out.println("初始化设置折线图");
        } else if (type.equalsIgnoreCase("histogram")) {
            chart = new HistogramChart();
            System.out.println("初始化设置柱状图");
        }
        return chart;
    }
}
