package com.practice.behavioral.strategy;

public class Bird extends Animal {
    public Bird() {
        super();
        aviator = new CanFly();
    }
}
