package com.pattern;

//账户状态类 充当抽象状态类
public abstract class AccountState {
    protected Account account;
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void computeInterest();
    public abstract void stateCheck();
}
