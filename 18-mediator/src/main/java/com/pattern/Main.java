package com.pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //定义中介者对象
        ConcreteMediator mediator = new ConcreteMediator();

        //定义同事
        Button addButton = new Button();
        List list = new List();
        ComboBox comboBox = new ComboBox();
        TextBox textBox = new TextBox();

        addButton.setMediator(mediator);
        list.setMediator(mediator);
        comboBox.setMediator(mediator);
        textBox.setMediator(mediator);

        mediator.button=addButton;
        mediator.list=list;
        mediator.comboBox=comboBox;
        mediator.textBox=textBox;

        addButton.changed();
        System.out.println("------------");
        list.changed();
    }
}