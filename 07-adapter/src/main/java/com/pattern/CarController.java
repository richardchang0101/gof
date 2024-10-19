package com.pattern;

public abstract class CarController {
    public void move() {
        System.out.println("cat move");
    }

    public abstract void phonate();//发出声音

    public abstract void twinkle(); //灯光闪烁
}
