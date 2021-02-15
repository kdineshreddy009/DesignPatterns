package com.practice.behavioral.strategy;

public class Animal {
    private String name;
    private String food;
    public FlyAble aviator;

    public FlyAble getAviator() {
        return aviator;
    }

    public void setAviator(FlyAble aviator) {
        this.aviator = aviator;
    }

    public String isFly(){
        return aviator.fly();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
