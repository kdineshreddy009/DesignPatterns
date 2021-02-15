package com.practice.behavioral.object;

public class TemperatureCustomer2 implements TemperatureObserver{

    @Override
    public void update(int temperature) {
        System.out.println("TemperatureCustomer2 updated with - "+temperature);
    }
}
