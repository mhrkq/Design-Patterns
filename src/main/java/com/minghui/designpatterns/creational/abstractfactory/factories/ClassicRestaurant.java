package com.minghui.designpatterns.creational.abstractfactory.factories;

import com.minghui.designpatterns.creational.abstractfactory.products.ClassicPizza;
import com.minghui.designpatterns.creational.abstractfactory.products.Pizza;
import com.minghui.designpatterns.creational.abstractfactory.products.Burger;
import com.minghui.designpatterns.creational.abstractfactory.products.ClassicBurger;

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
