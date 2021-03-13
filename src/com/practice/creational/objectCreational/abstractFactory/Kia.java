package com.practice.creational.objectCreational.abstractFactory;

public class Kia extends Car{

    @Override
    public Parts getWheels() {
        return new Parts("Kia heels");
    }

    @Override
    public Parts getEngine() {
        return new Parts("Kia engine");
    }

    @Override
    public Parts getBody() {
        return new Parts("Kia body");
    }
}
