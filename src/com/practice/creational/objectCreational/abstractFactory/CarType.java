package com.practice.creational.objectCreational.abstractFactory;

public class CarType {
    private Car car;
    public Car getCar(String carMake){
        if(carMake.equals("Tesla")){
            car = new Tesla();
        }
        else if(carMake.equals("Kia")){
            car = new Kia();
        }
        else if(carMake.equals("Ford")){
            car = new Ford();
        }
        return car;
    }
}
