package com.minghui.designpatterns.creational.builder.model;

public class Car {
    private final int id;
    private final int height;
    private final String brand;
    private final String model;
    private final String color;
    private final String engine;
    private final int nbrOfDoors;

    Car(int id, String brand, String model, String color, int height, String engine, int nbrOfDoors) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.height = height;
        this.engine = engine;
        this.nbrOfDoors = nbrOfDoors;
    }

    @Override
    public String toString() {
        return "Car {\n" +
                "    id=" + id + ",\n" +
                "    height=" + height + ",\n" +
                "    brand=" + brand + ",\n" +
                "    model=" + model + ",\n" +
                "    color=" + color + ",\n" +
                "    engine=" + engine + ",\n" +
                "    nbrOfDoors=" + nbrOfDoors + "\n" +
                "}";
    }
}
