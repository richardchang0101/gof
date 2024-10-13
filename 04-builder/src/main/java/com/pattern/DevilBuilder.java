package com.pattern;



public class DevilBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("devil");
    }

    @Override
    public void buildSex() {
        actor.setSex("male");
    }

    @Override
    public void buildFace() {
        actor.setFace("female");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("male");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("female");
    }
}
