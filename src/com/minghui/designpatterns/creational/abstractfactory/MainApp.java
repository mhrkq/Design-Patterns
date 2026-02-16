package src.com.minghui.designpatterns.creational.abstractfactory;

// ABSTRACT FACTORY METHOD

// use when a single factory is not enough, and a scaled-up implementation is needed
// use it when your code needs to work with various families of related products
// many designs start with the factory method and then evolve to the abstract factory method
// follows the open-closed and single responsibility principles
// centralises the product creation code in 1 place in the program

import src.com.minghui.designpatterns.creational.abstractfactory.factories.Restaurant;
import src.com.minghui.designpatterns.creational.abstractfactory.factories.ClassicRestaurant;
import src.com.minghui.designpatterns.creational.abstractfactory.factories.OrientalRestaurant;
import src.com.minghui.designpatterns.creational.abstractfactory.products.Pizza;
import src.com.minghui.designpatterns.creational.abstractfactory.products.Burger;

public class MainApp {
    public static void main(String[] args) {

        Restaurant orientalRestaurant = new OrientalRestaurant();
        Restaurant classicRestaurant = new ClassicRestaurant();

        System.out.println("Abstract Factory Method");

        Pizza classicPizza = classicRestaurant.createPizza();
        Burger classicBurger = classicRestaurant.createBurger();
        Pizza orientalPizza = orientalRestaurant.createPizza();
        Burger orientalBurger = orientalRestaurant.createBurger();

        classicPizza.bake();
        classicBurger.prepare();
        orientalPizza.bake();
        orientalBurger.prepare();

    }
}
