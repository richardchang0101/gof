package com.pattern;

/**
 * 具体产品类
 */
public class ConcreteProductB extends Product {
    @Override
    public void methodDifferent() {
        //业务方法实现
        System.out.println("methodDifferentB");
    }
}
