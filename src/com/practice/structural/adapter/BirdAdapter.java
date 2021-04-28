package com.practice.structural.adapter;

public class BirdAdapter implements ToyDuck{
    Bird bird;
    public BirdAdapter(Bird bird){
        this.bird=bird;
    }

    @Override
    public void squeak() {
        // translate the methods appropriately
        bird.makeSound();
    }
}
