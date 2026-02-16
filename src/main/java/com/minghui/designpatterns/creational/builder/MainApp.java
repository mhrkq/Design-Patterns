package com.minghui.designpatterns.creational.builder;

// BUILDER METHOD

// separate the construction of an object from its representation
// create a builder class containing the same fields of the object you need created
// add several setter methods for these fields, and a 'build' method responsible for creating the object
// think about creating a director if the same creation code is used to create several objects
// client must create both the builder and director

// produces different types and representations of an object using the same construction process
// extract the object construction or creation code out of its own class and move it to separate objects called 'builders'

// we may not need to fill all the fields of an object when constructing it
// to prevent creating many overloaded constructors with different combinations of arguments to be filled, 
// use the Builder Pattern

// try to make your object constructor non-public when the builder is not an inner-builder (inner class)
// by doing this, you force the users of your app to instantiate your object using the buider

import com.minghui.designpatterns.creational.builder.model.CarBuilder;
import com.minghui.designpatterns.creational.builder.model.CarSchemaBuilder;

public class MainApp {
    public static void main(String[] args) {

        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.buildBugatti(builder);
        builder.model("Chiron");
        System.out.println(builder.build());

        CarBuilder builder1 = new CarBuilder();
        director.buildBugatti(builder1);
        builder1.model("Mistral");
        System.out.println(builder1.build());

        CarSchemaBuilder schemaBuilder = new CarSchemaBuilder();
        director.buildLambo(schemaBuilder);
        schemaBuilder.engine("90").nbrOfDoors(3);
        System.out.println(schemaBuilder.build());

        CarSchemaBuilder schemaBuilder1 = new CarSchemaBuilder();
        director.buildLambo(schemaBuilder1);
        schemaBuilder1.engine("110").nbrOfDoors(7);
        System.out.println(schemaBuilder1.build());

    }
}
