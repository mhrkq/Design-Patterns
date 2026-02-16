package src.com.minghui.designpatterns.creational.factory.factories;

import src.com.minghui.designpatterns.creational.factory.products.Burger;
import src.com.minghui.designpatterns.creational.factory.products.ClassicBurger;

public class ClassicRestaurant extends Restaurant {

    @Override
    protected Burger createBurger() {
        System.out.println("Cooking Classic Burger...");
        return new ClassicBurger();
    }

}
