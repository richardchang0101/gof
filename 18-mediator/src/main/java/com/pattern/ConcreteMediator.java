package com.pattern;

import java.awt.*;
//具体中介者类 维持对各个同事对象的引用
public class ConcreteMediator extends Mediator {
    public Button button;
    public List list;
    public TextBox textBox;
    public ComboBox comboBox;

    @Override
    public void componentChanged(Component component) {
        //单机按钮
        if (component == button) {
            System.out.println("Button clicked");
            list.update();
            comboBox.update();
            textBox.update();
        }else if (component == list) {
            System.out.println("List clicked");
            comboBox.select();
            textBox.setText();
        }else if (component == comboBox) {
            System.out.println("ComboBox clicked");
            comboBox.select();
            textBox.setText();
        }
    }
}
