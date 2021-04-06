package com.practice.creational.objectCreational.builder;

public class TipiHouseBuilder implements HouseBuilder{
    House house;
    public TipiHouseBuilder(){
        this.house = new House();
    }
    @Override
    public void buildBasement() {
        house.setBasement("WOOD POLES");
    }

    @Override
    public void buildStructure() {
        house.setStructure("WOOD SQUARE");
    }

    @Override
    public void bulidRoof() {
        house.setRoof("WOOD SEAL");
    }

    @Override
    public void buildInterior() {
        house.setInterior("TEAK WOOD");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
