package com.pattern;

//简单句子节点类
public class SentenceNode extends AbstractNode{

    private AbstractNode direction;
    private AbstractNode action;
    private AbstractNode distance;

    public SentenceNode(AbstractNode direction, AbstractNode action, AbstractNode distance) {
        this.direction = direction;
        this.action = action;
        this.distance = distance;
    }

    @Override
    public String interpret() {
        return direction.interpret() + " " + action.interpret() + " " + distance.interpret();
    }
}
