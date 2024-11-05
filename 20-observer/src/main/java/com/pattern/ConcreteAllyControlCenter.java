package com.pattern;

public class ConcreteAllyControlCenter extends AllyControlCenter {
    public ConcreteAllyControlCenter(String name) {
        System.out.println("战队" + name + "组件成功");
        System.out.println("------------------");
        this.allyName = name;
    }

    @Override
    public void notifyObservers(String name) {
        System.out.println(this.allyName + "战队通知" + name + "盟友遭受攻击");
        for (Object object : player) {
            if (!((Observer)object).getName().equals(name)) {
                ((Observer)object).help();
            }
        }
    }
}
