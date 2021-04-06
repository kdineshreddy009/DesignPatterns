package com.practice.creational.objectCreational.builder;

public class IglooHouseBuilder implements  HouseBuilder{
    House house;

    public IglooHouseBuilder(){
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        house.setBasement("ICE BARS");
    }

    @Override
    public void buildStructure() {
        house.setStructure("ICE BLOCKS");
    }

    @Override
    public void bulidRoof() {
        house.setRoof("ICE CRAVINGS");
    }

    @Override
    public void buildInterior() {
        house.setInterior("ICE DOME");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
