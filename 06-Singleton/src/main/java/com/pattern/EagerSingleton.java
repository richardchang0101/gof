package com.pattern;

public class EagerSingleton {

    //饿汉式

    //静态私有成员变两次
    private final static EagerSingleton instance = new EagerSingleton();

    //私有构造函数
    private EagerSingleton() {
    }

    //公有静态工厂方法
    public static EagerSingleton getInstance() {
        return instance;
    }
}
