package com.pattern.demo;

import sun.java2d.marlin.stats.Histogram;

public class ChartFactory {
    //静态工厂方法
    public static Chart getChart(String type){
        Chart chart = null;
        if(type.equals("histogram")){
            chart = new HistogramChart();
        }else if(type.equals("pie")){
            chart = new PieChart();
        }else if(type.equals("line")){
            chart = new LineChart();
        }
        return chart;
    }
}
