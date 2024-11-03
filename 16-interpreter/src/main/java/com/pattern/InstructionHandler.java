package com.pattern;

import java.util.Stack;

public class InstructionHandler {
    private AbstractNode node;
    public void handle(String instruction) {
        AbstractNode left = null;
        AbstractNode right = null;
        AbstractNode direction = null;
        AbstractNode action = null;
        AbstractNode distance = null;
        Stack<AbstractNode> stack = new Stack();//声明一个栈对象用于存储抽象语法树
        String[] tokens = instruction.split(" "); //以空格分隔指令字符串
        for (int i = 0; i < tokens.length; i++) {
            /**
             * 本实例采用栈的方式处理指令，如果遇到and则将其后三个单词作为三个终结符表达式连成一个简单的句子SentenceNode作为and的右表达式，
             * 而将从栈顶弹出的表达式作为and的左表达式，最后将新的and表达式压入栈中
             */
            if (tokens[i].equals("and")) {
                left = stack.pop();
                String token = tokens[++i];
                direction = new DirectionNode(token);
                String token2 = tokens[++i];
                action = new ActionNode(token2);
                String token3 = tokens[++i];
                distance = new DistanceNode(token3);
                right = new SentenceNode(direction, action, distance);
                stack.push(new AndNode(left, right));
            }
            //如果是从头开始进行解释，则将前面3个单词组成一个简单的句子SentenceNode并将该句子压入栈中
            else {
                String token = tokens[i];
                direction = new DirectionNode(token);
                String token2 = tokens[++i];
                action = new ActionNode(token2);
                String token3 = tokens[++i];
                distance = new DistanceNode(token3);
                left = new SentenceNode(direction, action, distance);
                stack.push(left);
            }
        }
        this.node = stack.pop();
    }
    public String output() {
        return node.interpret();
    }

}
