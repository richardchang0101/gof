package com.pattern;

public class HeroBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("Hero");
    }

    @Override
    public void buildSex() {
        actor.setSex("Male");
    }

    @Override
    public void buildFace() {
        actor.setFace("Left");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("盔甲");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("White");
    }
}
