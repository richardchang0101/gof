package com.pattern.demo;

public class PieChart implements Chart {
    @Override
    public void display() {
        System.out.println("显示Pie Chart");
    }

    public PieChart(){
        System.out.println("创建饼状图");
    }
}
