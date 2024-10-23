package com.pattern;

public class ScrollBarDecorator extends ComponentDecorator{
    public ScrollBarDecorator(Component component) {
        super(component);
    }

    public void display(){
        this.setScrollBar();
        super.display();
    }

    public void setScrollBar(){
        System.out.println("setScrollBar增加滚动条");
    }
}
