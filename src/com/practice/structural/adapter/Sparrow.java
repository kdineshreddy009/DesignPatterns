package com.practice.structural.adapter;

public class Sparrow implements Bird{
    public void fly(){
        System.out.println("sparrow flying");
    }

    public void makeSound() {
        System.out.println("chirp chirp");
    }
}
