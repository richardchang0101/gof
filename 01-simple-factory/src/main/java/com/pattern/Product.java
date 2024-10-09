package com.pattern;

/**
 * 抽象产品类
 *
 *
 */
public abstract class Product {
    //所有产品的公共业务方法
    public void methodSame(){
        //公共方法的实现
        System.out.println("methodSame");
    }

    //声明的抽象业务方法
    public abstract void methodDifferent();
}
