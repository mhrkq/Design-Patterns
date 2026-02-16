package com.minghui.designpatterns.creational.factory;

// FACTORY METHOD

// use it if you have no idea of the exact type of objects your code will work with
// makes it easy to extend the product construction code independently from the rest of the application
// allows introducing new products without breaking existing code
// centralises the product creation code in 1 place in the program

import com.minghui.designpatterns.creational.factory.factories.ClassicRestaurant;
import com.minghui.designpatterns.creational.factory.factories.OrientalRestaurant;
import com.minghui.designpatterns.creational.factory.factories.Restaurant;

public class MainApp {
    public static void main(String[] args) {

        Restaurant orientalRestaurant = new OrientalRestaurant();
        orientalRestaurant.orderBurger();

        System.out.println("==========================================");

        Restaurant classicRestaurant = new ClassicRestaurant();
        classicRestaurant.orderBurger();

    }
}
