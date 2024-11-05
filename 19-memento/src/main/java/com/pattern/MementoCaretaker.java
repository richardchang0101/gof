package com.pattern;

public class MementoCaretaker {

    //备忘录管理人 负责人类

    private ChessmanMemento memento;
    public ChessmanMemento getMemento() {
        return memento;
    }
    public void setMemento(ChessmanMemento memento) {
        this.memento = memento;
    }

}
