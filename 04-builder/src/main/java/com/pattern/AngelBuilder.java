package com.pattern;

public class AngelBuilder extends ActorBuilder{
    @Override
    public void buildType() {
        actor.setType("Angel");
    }

    @Override
    public void buildSex() {
        actor.setSex("nv");
    }

    @Override
    public void buildFace() {
        actor.setFace("nv");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("nv");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("nv");
    }
}
