package com.pattern;

import javax.xml.parsers.ParserConfigurationException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParserConfigurationException {
        ActorBuilder actorBuilder;
        actorBuilder= (ActorBuilder) XMLUtil.getBean();

        ActorController actorController = new ActorController();
        Actor actor = actorController.construct(actorBuilder);

        String type = actor.getType();
        System.out.println(type);
        System.out.println(actor.getSex());
        System.out.println(actor.getFace());
        System.out.println(actor.getCostume());
        System.out.println(actor.getHairstyle());
    }
}