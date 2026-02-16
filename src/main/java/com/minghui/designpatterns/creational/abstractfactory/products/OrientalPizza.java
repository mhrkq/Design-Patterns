package com.minghui.designpatterns.creational.abstractfactory.products;

public class OrientalPizza implements Pizza {

    @Override
    public void bake() {
        System.out.println("Baking Oriental Pizza...");
    }

}
