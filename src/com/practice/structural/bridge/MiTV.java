package com.practice.structural.bridge;

public class MiTV extends TV{
    Remote remoteType;
    public MiTV(Remote r){
        super(r);
        this.remoteType = r;
    }

    @Override
    public void on() {
        System.out.println("Mi TV ON:");
        remoteType.on();
    }

    @Override
    public void off() {
        System.out.println("Mi TV OFF:");
        remoteType.off();
    }
}
