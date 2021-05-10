package com.practice.behavioral.template;

public abstract class Lunch {
    public final void prepareLunch(){
        prepareIngredients();
        cooking();
        eating();
        cleaning();
    }
    public abstract void prepareIngredients();
    public abstract void cooking();
    public void eating(){
        System.out.println("I am eating, please don't disturb");
    }
    public abstract void cleaning();
}
