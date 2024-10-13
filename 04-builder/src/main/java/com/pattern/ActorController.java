package com.pattern;

public class ActorController {
    public Actor construct(ActorBuilder builder) {
        builder.buildType();
        builder.buildSex();
        builder.buildFace();
        builder.buildCostume();
        builder.buildHairstyle();
        Actor actor = builder.createActor();
        return actor;
    }
}
