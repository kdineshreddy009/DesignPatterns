package com.practice.creational.objectCreational.abstractFactory;

public class Ford extends Car{

    @Override
    public Parts getWheels() {
        return new Parts("Ford Wheels");
    }

    @Override
    public Parts getEngine() {
        return new Parts("Ford engine");
    }

    @Override
    public Parts getBody() {
        return new Parts("Ford body");
    }
}
