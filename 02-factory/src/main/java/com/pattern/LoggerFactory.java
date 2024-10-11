package com.pattern;

/**
 * 抽象工厂类
 */
public interface LoggerFactory {
    public Logger createLogger();

    //不光可以抽象一个创建日志工厂方法 也可以实现多个创建对象的方法 可以重载等 实现对于多种多样的操作
}
