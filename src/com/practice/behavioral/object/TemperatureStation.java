package com.practice.behavioral.object;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TemperatureStation implements TemperatureSubject{

    Set<TemperatureObserver> temperatureObservers;
    int temperature;

    public TemperatureStation(int initialTemperature){
        this.temperature = initialTemperature;
        temperatureObservers = new HashSet<>();
    }

    @Override
    public void addObserver(TemperatureObserver temperatureObserver) {
        temperatureObservers.add(temperatureObserver);
    }

    @Override
    public void removeObserver(TemperatureObserver temperatureObserver) {
        temperatureObservers.remove(temperatureObserver);
    }

    @Override
    public void notifyObservers() {
        Iterator<TemperatureObserver> it = temperatureObservers.iterator();
        while(it.hasNext()){
            TemperatureObserver to = it.next();
            to.update(temperature);
        }
    }

    public void setTemperatures(int updatedTemperature){
            System.out.println("Updating temperature");
            this.temperature = updatedTemperature;
            notifyObservers();
    }
}
