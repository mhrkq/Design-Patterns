package com.minghui.designpatterns.creational.factory.factories;

import com.minghui.designpatterns.creational.factory.products.Burger;
import com.minghui.designpatterns.creational.factory.products.ClassicBurger;

public class ClassicRestaurant extends Restaurant {

    @Override
    protected Burger createBurger() {
        System.out.println("Cooking Classic Burger...");
        return new ClassicBurger();
    }

}
