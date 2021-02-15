package com.practice.behavioral.object;

public class TemperatureCustomer1 implements TemperatureObserver{

    @Override
    public void update(int temperature) {
        System.out.println("TemperatureCustomer1 updated with - "+temperature);
    }
}
