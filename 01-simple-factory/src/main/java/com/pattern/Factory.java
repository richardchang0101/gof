package com.pattern;

public class Factory {
    //静态工厂方法
    public static Product getProduct(String arg) {
        Product product = null;
        if (arg.equals("A")) {
            product=new ConcreteProductA();

        }else if (arg.equals("B")) {
            product=new ConcreteProductB();
        }
        return product;
    }
}
