package com.practice.creational.objectCreational;

public class Singleton {
    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance==null){
            /* below is critical section, acquires lock only if instance is null,
            other way is to have synchronized word in method itself */
            synchronized (Singleton.class){
                instance = new Singleton();
            }
        }
        return instance;
    }
}
