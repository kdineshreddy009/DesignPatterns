package com.practice.structural.bridge;

abstract public class TV {
    Remote remote;
    public TV(Remote r){
        this.remote = r;
    }
    public abstract void on();
    public abstract void off();
}
