package com.practice;

import com.practice.behavioral.command.*;
import com.practice.behavioral.object.TemperatureCustomer1;
import com.practice.behavioral.object.TemperatureCustomer2;
import com.practice.behavioral.object.TemperatureStation;
import com.practice.behavioral.strategy.Animal;
import com.practice.behavioral.strategy.Bird;
import com.practice.behavioral.strategy.Dog;
import com.practice.behavioral.template.KFCLunch;
import com.practice.behavioral.template.Lunch;
import com.practice.behavioral.template.McDonaldLunch;
import com.practice.creational.classCreational.factory.Pet;
import com.practice.creational.classCreational.factory.PetFactory;
import com.practice.creational.objectCreational.abstractFactory.Car;
import com.practice.creational.objectCreational.abstractFactory.CarType;
import com.practice.creational.objectCreational.builder.CivilEngineer;
import com.practice.creational.objectCreational.builder.HouseBuilder;
import com.practice.creational.objectCreational.builder.IglooHouseBuilder;
import com.practice.creational.objectCreational.prototype.CloneFactory;
import com.practice.creational.objectCreational.prototype.Hen;
import com.practice.creational.objectCreational.prototype.Sheep;
import com.practice.structural.adapter.BirdAdapter;
import com.practice.structural.adapter.PlasticToyDuck;
import com.practice.structural.adapter.Sparrow;
import com.practice.structural.adapter.ToyDuck;
import com.practice.structural.bridge.*;
import com.practice.structural.decorator.ColorDecorator;
import com.practice.structural.decorator.House;
import com.practice.structural.decorator.LightDecorator;
import com.practice.structural.decorator.SimpleHouse;
import com.practice.structural.facade.MyGUI;

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


        /*classCreational.factory -
        There can be various subclasses, Factory class can help you instantiate a required subclass
        */
        System.out.println("---classCreational.factory---");
        PetFactory petFactory = new PetFactory();
        Pet pet = petFactory.getPetBySound("bow bow");
        System.out.println(pet.getSound());
        System.out.println();

        /* Objectcreational.abstractfactory - this provides method which provides an object(required "Car" type object)
        which in-turn consists of generic things
        (can be varied from Object to other object, say engine/wheels/body here)
        * */
        System.out.println("---objectCreational.abstractfactory---");
        CarType carType = new CarType();
        Car car = carType.getCar("Tesla");
        System.out.println(car.getEngine().getSpecification());
        System.out.println(car.getBody().getSpecification());
        System.out.println(car.getWheels().getSpecification());
        System.out.println();

        /* objectCreational.builder - https://www.geeksforgeeks.org/builder-design-pattern/
           Product - house
           Builder - HouseBuilder
           ConcreteBuilders - Igloo,Tipi
           Director - civil engg.
        * */
        // Builder class impl
        System.out.println("---objectCreational.builder---");
        HouseBuilder iglooBuilder = new IglooHouseBuilder();
        CivilEngineer civilEngineer = new CivilEngineer(iglooBuilder);
        civilEngineer.constructHouse();
        civilEngineer.getHouse();
        System.out.println();

        /*objectCreational.prototype
        http://www.newthinktank.com/2012/09/prototype-design-pattern-tutorial/
        * */
        System.out.println("---objectCreational.prototype---");
        CloneFactory animalMaker = new CloneFactory();
        // Sheep clone
        Sheep jerry = new Sheep();
        Sheep clonedSheep = null;
        try {
            clonedSheep = (Sheep) animalMaker.getClone(jerry);
        } catch (CloneNotSupportedException e) {
            System.out.println("Failed sheep Cloning from Driver");
        }
        System.out.println("jerry HashCode: " + System.identityHashCode(System.identityHashCode(jerry)));
        System.out.println("Cloned jerry HashCode: " + System.identityHashCode(System.identityHashCode(clonedSheep)));

        // Hen Clone
        Hen lilly = new Hen();
        Hen clonedHen = null;
        try {
            clonedHen = (Hen) animalMaker.getClone(lilly);
        } catch (CloneNotSupportedException e) {
            System.out.println("Failed hen Cloning from Driver");
        }
        System.out.println("lilly HashCode: " + System.identityHashCode(System.identityHashCode(lilly)));
        System.out.println("Clone lilly  HashCode: " + System.identityHashCode(System.identityHashCode(clonedSheep)));
        System.out.println();

        /*behavioral.decorator - peeling DPs */
        System.out.println("---behavioral.decorator---");
        House house = new LightDecorator(new ColorDecorator(new SimpleHouse()));
        System.out.println(house.makeHouse());
        System.out.println();

        // https://www.geeksforgeeks.org/command-pattern/
        System.out.println("---behavioral.command---");
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        StereoMusic stereoMusic = new StereoMusic();
        remote.setCommand(new LightOnCommand(light));
        remote.buttonWasPressed();
        remote.setCommand(new StereoOnWithCDCommand(stereoMusic));
        remote.buttonWasPressed();
        System.out.println();

        /*Suppose you have a Bird class with fly() , and makeSound()methods. And also a ToyDuck class with squeak() method.

        Let’s assume that you are short on ToyDuck objects and you would like to use Bird objects in their place.
        Birds have some similar functionality but implement a different interface, so we can’t use them directly.
         So we will use adapter pattern. Here our client would be ToyDuck and adaptee would be Bird.

         https://www.geeksforgeeks.org/adapter-pattern/
         class BirdAdapter implements ToyDuck  -- You need to implement the interface your client expects to use.
        */
        System.out.println("---structural.adapter---");
        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();
        // Wrap a bird in a birdAdapter so that it
        // behaves like toy duck
        ToyDuck birdAdapter = new BirdAdapter(sparrow);
        System.out.println("Sparrow...");
        sparrow.fly();
        sparrow.makeSound();
        System.out.println("ToyDuck...");
        toyDuck.squeak();
        // toy duck behaving like a bird
        System.out.println("BirdAdapter...");
        birdAdapter.squeak();
        System.out.println();

        // reference Peeling design patterns
        System.out.println("structual.facade");
        MyGUI myGui = new MyGUI();
        myGui.drawGUI();

        /*bridge pattern - Used when we have hierarchies both in interfaces & implementations,
                           It decouples abstraction from its implementation.
                           ref: https://www.youtube.com/watch?v=1HL0V7vz5mA
        */
        System.out.println("---structural.bridge---");
        TV sonyTVWithOldRemote = new SonyTV(new OldRemote());
        sonyTVWithOldRemote.on();
        sonyTVWithOldRemote.off();

        TV sonyTVWithNewRemote = new SonyTV(new NewRemote());
        sonyTVWithNewRemote.on();
        sonyTVWithNewRemote.off();

        TV MiTVWithOldRemote = new MiTV(new OldRemote());
        MiTVWithOldRemote.on();
        MiTVWithOldRemote.off();

        TV MiTVWithNewRemote = new MiTV(new NewRemote());
        MiTVWithNewRemote.on();
        MiTVWithNewRemote.off();
        System.out.println();

        /* template method pattern - ref from PD book; implements the algorithm differently with subclasses
        * */
        System.out.println("---behavioral.template---");
        System.out.println("---McD lunch---");
        Lunch lunch1 = new McDonaldLunch();
        lunch1.prepareLunch();
        System.out.println("---KFC lunch---");
        Lunch lunch2 = new KFCLunch();
        lunch2.prepareLunch();
        System.out.println();

        
        // iterator, composite, flyweight, state, proxy, chain of responsibility, interpreter, mediator,vistor
        // https://www.youtube.com/watch?v=wiQdrH2YpT4&list=PLF206E906175C7E07&index=5
    }
}
