package com.practice.structural.bridge;

public class SonyTV extends TV{
    Remote remoteType;
    public SonyTV(Remote r){
        super(r);
        this.remoteType = r;
    }

    @Override
    public void on() {
        System.out.println("SonyTv ON:");
        remoteType.on();
    }

    @Override
    public void off() {
        System.out.println("SonyTv OFF:");
        remoteType.off();
    }
}
