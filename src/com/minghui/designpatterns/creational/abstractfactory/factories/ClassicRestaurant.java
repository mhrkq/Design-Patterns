package src.com.minghui.designpatterns.creational.abstractfactory.factories;

import src.com.minghui.designpatterns.creational.abstractfactory.products.ClassicPizza;
import src.com.minghui.designpatterns.creational.abstractfactory.products.Pizza;
import src.com.minghui.designpatterns.creational.abstractfactory.products.Burger;
import src.com.minghui.designpatterns.creational.abstractfactory.products.ClassicBurger;

public class ClassicRestaurant extends Restaurant {

    @Override
    public Burger createBurger() {
        return new ClassicBurger();
    }

    @Override
    public Pizza createPizza() {
        return new ClassicPizza();
    }

}
