package com.luruoyang.level3;

public class App {
    public static void main(String[] args) throws Exception {
//        Chart chart = ChartFactory.getChart("line");
//        chart.display();
//
//        chart = ChartFactory.getChart("pie");
//        chart.display();

        String chartType = XMLUtil.getChartType(); // 读取配置文件参数
        Chart c = ChartFactory.getChart(chartType); // 创建产品对象
        c.display();
    }
}
