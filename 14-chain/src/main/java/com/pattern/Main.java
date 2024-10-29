package com.pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Approver wjzhang= new Director("张无忌");
        Approver gyang = new VicePresident("杨过");
        Approver jguo = new President("郭靖");
        Approver meeting = new Congress("董事会");

        //创建职责链
        wjzhang.setSuccessor(gyang);
        gyang.setSuccessor(jguo);
        jguo.setSuccessor(meeting);

        //创建采购单
        PurchaseRequest p1 = new PurchaseRequest(45000,10001,"购买倚天剑");
        PurchaseRequest p2 = new PurchaseRequest(60000,10002,"购买葵花宝典");
        PurchaseRequest p3 = new PurchaseRequest(160000,10003,"购买金刚经");
        PurchaseRequest p4 = new PurchaseRequest(800000,100004,"购买桃花岛");

        wjzhang.processRequest(p1);
        wjzhang.processRequest(p2);
        wjzhang.processRequest(p3);
        wjzhang.processRequest(p4);
    }
}