package com.pattern;

public class ComboBox extends Component {
    @Override
    public void update() {
        System.out.println("组合框增加一项：张无忌");
    }

    public void select() {
        System.out.println("组合框中选中项：小龙女");
    }
}
