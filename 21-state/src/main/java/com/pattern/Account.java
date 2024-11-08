package com.pattern;

//银行账户 充当环境类
public class Account {
    private AccountState state;
    private String owner;
    private double balance = 0;

    public Account(String owner, double init) {
        this.owner = owner;
        this.balance = balance;
        this.state = new NormalState(this);//初始状态
        System.out.println(this.owner+"开户，初始金额为"+init);
    }

    public AccountState getState() {
        return state;
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        System.out.println(this.owner+"存款"+amount);
        state.deposit(amount);
        System.out.println("现在余额为"+this.balance);
        System.out.println("账户状态为"+this.state.getClass().getName());
        System.out.println("--------------------");
    }

    public void withdraw(double amount) {
        System.out.println(this.owner+"取款"+amount);
        state.withdraw(amount);
        System.out.println("现在余额为"+this.balance);
        System.out.println("账户状态为"+this.state.getClass().getName());
        System.out.println("--------------------");
    }
    public void computeInterest(){
        state.computeInterest();   //调用状态对象的computeInterset方法
    }
}
