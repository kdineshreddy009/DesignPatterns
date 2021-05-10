package com.practice.structural.bridge;

public class NewRemote implements Remote {
    @Override
    public void on() {
        System.out.println("TV on with old remote");
    }

    @Override
    public void off() {
        System.out.println("TV off with old remote");
    }
}
