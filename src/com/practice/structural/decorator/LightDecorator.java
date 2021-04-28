package com.practice.structural.decorator;

public class LightDecorator extends HouseDecorator{

    public LightDecorator(House house) {
        super(house);
    }

    public String makeHouse(){
        return house.makeHouse()+addLights();
    }

    public String addLights(){
       return " + Lights";
    }
}
