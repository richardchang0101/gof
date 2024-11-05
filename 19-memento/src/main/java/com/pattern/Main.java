package com.pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MementoCaretaker mementoCaretaker = new MementoCaretaker();
        Chessman chessman = new Chessman("车",1,1);
        display(chessman);
        //保存位置
        mementoCaretaker.setMemento(chessman.save());

        chessman.setX(3);
        display(chessman);
        mementoCaretaker.setMemento(chessman.save());

        chessman.setX(4);
        display(chessman);
//        mementoCaretaker.setMemento(chessman.save());

        System.out.println("悔棋");
        chessman.restore(mementoCaretaker.getMemento());
        display(chessman);

        System.out.println("悔棋");//不记录历史 只记录了上一步的步骤  如果要恢复历史记录需要list
        chessman.restore(mementoCaretaker.getMemento());
        display(chessman);
    }

    public static void display(Chessman chessman) {
        System.out.println("棋子："+chessman.getLabel()+"当前位置为"+chessman.getX()+","+chessman.getY());
    }
}