package com.pattern;

/**
 * 围棋类子类 充当抽象享元类
 */
public abstract class IgoChessman {
    public abstract String getColor();

    //    public void display(){
//        System.out.println("象棋的颜色"+this.getColor());
//    }
    //在原有的基础上增加一个显示坐标的参数
    public void display(Coordinates coordinates) {
        System.out.println("象棋的颜色" + this.getColor() + "棋子的坐标是：" + coordinates.getX() + coordinates.getY());
    }
}
