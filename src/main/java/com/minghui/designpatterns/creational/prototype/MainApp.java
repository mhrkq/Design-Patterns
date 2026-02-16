package com.minghui.designpatterns.creational.prototype;

// PROTOTYPE PATTERN

// delegates the object duplication or cloning process to the actual objects that are being cloned
// without coupling the creation of the object to its class

// use it when your code should not depend on the concrete classes of the objects that you need to copy or duplicate
// will clone objects without coupling them to their concrete classes
// will get rid of repeated initialisation code
// will save resources and time

// start with interface prototype
// containing a single clone method
// that creates a brand new object of the current class
// and copies all the values of the fields of the old object into the new one

// we now have access to private fields

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        List<Vehicle> vehicles = List.of(
                new Car("car_brand", "car_model", "car_color", 300),
                new Car("chevrolet", "impala 1967", "black", 105),
                new Bus("bus_brand", "bus_model", "bus_color", 8)
        );

        List<Vehicle> copyList = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            copyList.add(vehicle.clone()); // client only works with abstract Vehicle type, no constructor called explicitly
        }

        copyList.forEach(System.out::println);

        System.out.println("==========================================");

        VehicleCache registry = new VehicleCache();
        registry.put(vehicles);
        System.out.println(registry.get("car_brand car_model"));
        System.out.println(registry.get("chevrolet impala 1967"));
        System.out.println(registry.get("Mercedes Setra"));

    }

}
