package com.pattern.demo;

public class Client {
    public static void main(String[] args) {
        Chart chart=ChartFactory.getChart("line");
        chart.display();
    }

    /**
     * 简单工厂方法结构简单，一共包含三个角色
     * 工厂角色、抽象产品、具体产品
     * 本例子中实现对Chart抽象方法的不同实现，调用工厂方法可以产生三个实例，根据传参创建不同的实例
     * 但是有一个缺点，那就是违反了开闭原则，假如说在增加一个对象实现Chart，那么还需要修改工厂方法。
     *
     */
}
