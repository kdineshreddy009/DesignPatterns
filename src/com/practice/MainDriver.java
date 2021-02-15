package com.practice;

import com.practice.behavioral.object.TemperatureCustomer1;
import com.practice.behavioral.object.TemperatureCustomer2;
import com.practice.behavioral.object.TemperatureStation;
import com.practice.behavioral.strategy.Animal;
import com.practice.behavioral.strategy.Bird;
import com.practice.behavioral.strategy.Dog;

public class MainDriver {

    public static void main(String[] args) {

        /* behavioral.strategy - We can apply Strategy pattern when we need different variants of an algorithm
        (each algorithm can be assumed as a separate class) and these related classes differ only in their behavior.
        A Strategy defines a set of algorithms that can be used interchangeably

        Negatives - Too many objects gets created with this(one for each subclass irrespective of their need)

        UML https://www.youtube.com/watch?v=-NCgRD9-C6o&list=PLF206E906175C7E07&index=3
        code http://www.newthinktank.com/2012/08/strategy-design-pattern-tutorial/ */
        System.out.println("---behavioral.strategy---");
        Animal puppy = new Dog();
        Animal kingfisher = new Bird();
        System.out.println(puppy.isFly());
        System.out.println(kingfisher.isFly());
        System.out.println();

        /*behavioral.Observer - When the subject changes, it notifies the observers.
        There are 2 methods of passing the data from the subject to the observer when the state is changed in the subject side
        -- push & pull
        This is also called as Dependents, Publish-Subscribe patterns.
        Can be a broadcasting support, The subject doesn’t know the concrete class of any observer.
        */
        System.out.println("---behavioral.observer---");
        TemperatureStation temperatureStation = new TemperatureStation(0);
        TemperatureCustomer1 tc1 = new TemperatureCustomer1();
        TemperatureCustomer2 tc2 = new TemperatureCustomer2();
        temperatureStation.addObserver(tc1);
        temperatureStation.addObserver(tc2);
        System.out.println("Will be updating");
        temperatureStation.setTemperatures(10);
        System.out.println();
    }
}
