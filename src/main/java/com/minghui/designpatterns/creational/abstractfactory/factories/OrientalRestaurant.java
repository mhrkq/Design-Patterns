package com.minghui.designpatterns.creational.abstractfactory.factories;

import com.minghui.designpatterns.creational.abstractfactory.products.OrientalPizza;
import com.minghui.designpatterns.creational.abstractfactory.products.Pizza;
import com.minghui.designpatterns.creational.abstractfactory.products.Burger;
import com.minghui.designpatterns.creational.abstractfactory.products.OrientalBurger;

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
