package com.pattern;

import java.sql.SQLOutput;

public class VIPDIscount implements Discount{
    private final double DISCOUNT=0.5;
    @Override
    public double calculate(double price) {
        System.out.println("VIP票：");
        System.out.println("增加积分");
        return price * DISCOUNT;
    }
}
