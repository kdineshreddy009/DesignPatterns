package com.practice.creational.objectCreational.prototype;

public interface Animal extends Cloneable {
    public Animal makeCopy() throws CloneNotSupportedException;
}
