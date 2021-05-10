package com.practice.behavioral.template;

public class KFCLunch extends Lunch{
    @Override
    public void prepareIngredients() {
        System.out.println("Getting chiken fries, drinks");
    }

    @Override
    public void cooking() {
        System.out.println("I am cooking KFC meal");
    }

    @Override
    public void eating() {
        System.out.println("the tacos are tasty");
    }

    @Override
    public void cleaning() {
        System.out.println("Cleaning KFC dishes");
    }
}
