package com.pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Component component,component1;
            component=new Window();
            component1=new ScrollBarDecorator(component);
            component1.display();
    }
}