package com.pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //定义观察目标对象
        AllyControlCenter acc = new ConcreteAllyControlCenter("金庸");

        //定义观察者对象
        Observer play1, play2, play3, play4;
        play1 = new Player("杨过");
        acc.join(play1);

        play2 = new Player("令狐冲");
        acc.join(play2);

        play3 = new Player("张无忌");
        acc.join(play3);

        play4 = new Player("段誉");
        acc.join(play4);
        //遭受攻击
        play1.beAttacked(acc);
    }
}