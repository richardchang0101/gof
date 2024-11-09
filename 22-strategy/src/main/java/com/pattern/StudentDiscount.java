package com.pattern;

//学生票折扣类 充当具体策略类
public class StudentDiscount implements Discount {
    private final double DISCOUNT = 0.8;

    @Override
    public double calculate(double price) {
        System.out.println("学生票：");
        return DISCOUNT * price;
    }
}
