package com.minghui.designpatterns.behavioural.template;

// TEMPLATE PATTERN

// defines the skeleton of an algorithm in the superclass but
// lets subclasses override specific steps of the algorithm without changing its structure
// eliminates code duplication by pulling up the steps with similar implementations 
// into the superclass housing the template method

// 1. break down the algorithm into a series of methods
// 2. put a series of calls to these methods or steps inside a single "template method"
// 3. the steps may either be abstract, or have some default implementation inside the parent class
// 4. to use the algorithm, the client must provide its own subclass and implement all abstract steps

public class MainApp {

    public static void main(String[] args) {

        BaseGameLoader wowLoader = new WorldOfWarcraftLoader();
        wowLoader.load();

        System.out.println("==========================================");

        BaseGameLoader diabloLoader = new DiabloLoader();
        diabloLoader.load();

    }

}
