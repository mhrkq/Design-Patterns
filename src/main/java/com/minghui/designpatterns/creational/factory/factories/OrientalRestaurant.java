package com.minghui.designpatterns.creational.factory.factories;

import com.minghui.designpatterns.creational.factory.products.Burger;
import com.minghui.designpatterns.creational.factory.products.OrientalBurger;

public class OrientalRestaurant extends Restaurant {

    @Override
    protected Burger createBurger() {
        System.out.println("Creating Oriental Burger...");
        return new OrientalBurger();
    }

}
