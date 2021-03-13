package com.practice.creational.objectCreational.abstractFactory;

public class Tesla extends Car{

    @Override
    public Parts getWheels() {
        return new Parts("tesla wheels");
    }

    @Override
    public Parts getEngine() {
        return new Parts("tesla engine");
    }

    @Override
    public Parts getBody() {
        return new Parts("tesla body");
    }
}
