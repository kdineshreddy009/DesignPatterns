package com.practice.structural.decorator;

public class ColorDecorator extends HouseDecorator{

    public ColorDecorator(House house) {
        super(house);
    }

    public String makeHouse(){
        return house.makeHouse() + addColors();
    }

    public String addColors(){
        return " + colours";
    }
}
