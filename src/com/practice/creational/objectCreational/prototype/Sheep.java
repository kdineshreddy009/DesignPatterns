package com.practice.creational.objectCreational.prototype;

public class Sheep implements Animal{

    public Sheep(){
        System.out.println("Sheep is Made");
    }

    @Override
    public Animal makeCopy() throws CloneNotSupportedException {
        Sheep sheepObject = null;
        try{
            sheepObject = (Sheep) super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("Sheep clone failed, it was a busy day");
            e.printStackTrace();
        }
        return sheepObject;
    }
}
