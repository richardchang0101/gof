package com.pattern;

import javax.xml.ws.Dispatch;

//电影票类 充当具体策略角色
public class MovieTicket {
    private double price;
    private Discount discount;//维持一个抽象折扣类的引用

    public void setPrice(double price) {
        this.price = price;
    }

    //注入一个折扣类对象
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double getPrice() {
        //调用折扣类的折扣计价方法
        return discount.calculate(this.price);
    }
}
