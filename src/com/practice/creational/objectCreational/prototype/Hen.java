package com.practice.creational.objectCreational.prototype;

public class Hen implements Animal{

    public Hen(){
        System.out.println("Hen is Made");
    }

    @Override
    public Animal makeCopy() throws CloneNotSupportedException {
        Hen henObject = null;
        try{
            henObject = (Hen) super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("Hen Clone failed, it was a busy day");
            e.printStackTrace();
        }
        return henObject;
    }
}