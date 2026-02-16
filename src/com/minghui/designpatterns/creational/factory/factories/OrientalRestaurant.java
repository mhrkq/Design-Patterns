package src.com.minghui.designpatterns.creational.factory.factories;

import src.com.minghui.designpatterns.creational.factory.products.Burger;
import src.com.minghui.designpatterns.creational.factory.products.OrientalBurger;

public class OrientalRestaurant extends Restaurant {

    @Override
    protected Burger createBurger() {
        System.out.println("Creating Oriental Burger...");
        return new OrientalBurger();
    }

}
