package com.pattern;

import java.awt.*;

public class BlackBorderDecorator extends ComponentDecorator {
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    public void display() {
        this.setBlackBorder();
        super.display();
    }
    public void setBlackBorder() {
        System.out.println("set black border");
    }
}
