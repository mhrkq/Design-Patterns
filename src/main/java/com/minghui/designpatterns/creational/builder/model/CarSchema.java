package com.minghui.designpatterns.creational.builder.model;

// we cannot reuse the CarBuilder as it returns a different object

public class CarSchema {

    private final int id;
    private final int height;
    private final String brand;
    private final String model;
    private final String color;
    private final String engine;
    private final int nbrOfDoors;

    CarSchema(int id, String brand, String model, String color, int height, String engine, int nbrOfDoors) {
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
        return String.format("CarSchema {\n    id=%s,\n    height=%s,\n    brand=%s,\n    model=%s,\n    color=%s,\n    engine=%s,\n    nbrOfDoors=%s\n}", id, height, brand, model, color, engine, nbrOfDoors);
    }

}
