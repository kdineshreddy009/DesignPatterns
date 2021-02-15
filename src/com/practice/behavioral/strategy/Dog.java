package com.practice.behavioral.strategy;

public class Dog extends Animal{
    public Dog(){
        super();
        aviator = new CannotFly();
    }
}
