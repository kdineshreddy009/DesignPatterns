package com.practice.behavioral.strategy;

public interface FlyAble {
    String fly();
}

class CanFly implements FlyAble{
    public String fly(){
        return "I can fly";
    }
}

class CannotFly implements FlyAble{
    public String fly(){
        return "I cannot fly";
    }
}
