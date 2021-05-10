package com.practice.behavioral.template;

public class McDonaldLunch extends Lunch{
    @Override
    public void prepareIngredients() {
        System.out.println("Getting chicken patty, onions, french fries");
    }

    @Override
    public void cooking() {
        System.out.println("I am cooking McD meal");
    }

    @Override
    public void cleaning() {
        System.out.println("cleaning McD plates");
    }
}
