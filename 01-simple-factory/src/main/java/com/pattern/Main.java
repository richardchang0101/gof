package com.pattern;
public class Main {
    public static void main(String[] args) {
        Product product ;
        product=Factory.getProduct("A");//通过工厂类实现对象的创建
        product.methodSame();
        product.methodDifferent();
    }
}