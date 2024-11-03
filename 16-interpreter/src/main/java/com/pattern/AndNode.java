package com.pattern;

import org.w3c.dom.Node;

public class AndNode extends AbstractNode {

    private AbstractNode left;
    private AbstractNode right;
    public AndNode(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String interpret() {
        return left.interpret()+" 再 "+right.interpret();
    }
}
