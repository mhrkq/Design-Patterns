package src.com.minghui.designpatterns.creational.factory.factories;

import src.com.minghui.designpatterns.creational.factory.products.Burger;

public abstract class Restaurant {

    public void orderBurger() {
        System.out.println("Ordering Burger...");
        Burger burger = createBurger();
        burger.prepare();
    }

    protected abstract Burger createBurger(); // factory method, lets creator-subclasses decide which class to instantiate

}
