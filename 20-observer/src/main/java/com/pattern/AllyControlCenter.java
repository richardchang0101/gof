package com.pattern;

import java.util.ArrayList;


public abstract class AllyControlCenter {
    //指挥部 充当抽象目标类

    protected String allyName;
    protected ArrayList<Observer> player = new ArrayList<>();

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }
    public String getAllyName() {
        return allyName;
    }

    //注册方法
    public void join(Observer observer) {
        System.out.println("Joining " + observer);
        player.add(observer);
    }
    //注销方法
    public void quit(Observer observer) {
        System.out.println("Quiting " + observer);
        player.remove(observer);
    }

    //声明抽象通知方法
    public abstract void notifyObservers(String name);
}
