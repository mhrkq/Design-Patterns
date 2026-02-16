package com.minghui.designpatterns.creational.abstractfactory.factories;

import com.minghui.designpatterns.creational.abstractfactory.products.Pizza;
import com.minghui.designpatterns.creational.abstractfactory.products.Burger;

public abstract class Restaurant {

    // Business logic can be added here or in another class

    public abstract Burger createBurger();

    public abstract Pizza createPizza();

}
