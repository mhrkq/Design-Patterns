package src.com.minghui.designpatterns.creational.abstractfactory.factories;

import src.com.minghui.designpatterns.creational.abstractfactory.products.OrientalPizza;
import src.com.minghui.designpatterns.creational.abstractfactory.products.Pizza;
import src.com.minghui.designpatterns.creational.abstractfactory.products.Burger;
import src.com.minghui.designpatterns.creational.abstractfactory.products.OrientalBurger;

public class OrientalRestaurant extends Restaurant {

    @Override
    public Burger createBurger() {
        return new OrientalBurger();
    }

    @Override
    public Pizza createPizza() {
        return new OrientalPizza();
    }

}
