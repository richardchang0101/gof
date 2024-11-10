package com.pattern;

//具体子类 定期账户类
public class SavingAccount extends Account {
    @Override
    public void calculateInterset() {
        System.out.println("按照定期存款利息计算");
    }
}
