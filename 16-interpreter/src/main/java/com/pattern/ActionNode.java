package com.pattern;

import org.w3c.dom.Node;

public class ActionNode extends AbstractNode {

    private String action;

    public ActionNode(String action) {
        this.action = action;
    }

    @Override
    public String interpret() {
        if (action.equalsIgnoreCase("move")){
            return "移动";
        }else if(action.equalsIgnoreCase("run")){
            return "奔跑";
        }else{
            return "无效指令";
        }
    }
}
