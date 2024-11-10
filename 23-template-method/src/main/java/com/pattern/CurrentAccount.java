package com.pattern;

//具体子类 -活期存款类
public class CurrentAccount extends Account {
    @Override
    public void calculateInterset() {
        System.out.println("按照活期存款利息计算");
    }
}
