package com.practice.creational.objectCreational.prototype;

public class CloneFactory {
    public Animal getClone(Animal animalObject) throws CloneNotSupportedException {
        return animalObject.makeCopy();
    }
}
