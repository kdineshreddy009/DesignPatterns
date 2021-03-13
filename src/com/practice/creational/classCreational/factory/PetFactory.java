package com.practice.creational.classCreational.factory;

public class PetFactory {
    public Pet getPetBySound(String petSound){
        Pet pet = null;
        if("bow bow".equals(petSound)){
            pet = new Dog();
        }else if("meow meow".equals(petSound)){
            pet = new Cat();
        }
        return pet;
    }
}
