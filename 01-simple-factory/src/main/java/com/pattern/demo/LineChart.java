package com.pattern.demo;

public class LineChart implements Chart {
    @Override
    public void display() {
        System.out.println("显示折线图 LineChart");
    }
    public LineChart(){
        System.out.println("创建折线图 LineChart");
    }
}
