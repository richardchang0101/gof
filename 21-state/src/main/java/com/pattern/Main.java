package com.pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account account =new Account("段誉",0.0);
        account.deposit(1000.0);
        account.withdraw(2000.0);
        account.deposit(3000.0);
        account.withdraw(4000.0);
        account.deposit(1000.0);
        account.computeInterest();
    }
}