package com.pattern;

public class ChildrenDiscount implements Discount {
    private final double DISCOUNT = 10;

    @Override
    public double calculate(double price) {
        System.out.println("儿童票");
        if (price >=20){
            return price-DISCOUNT;
        }else {
            return price;
        }
    }
}
