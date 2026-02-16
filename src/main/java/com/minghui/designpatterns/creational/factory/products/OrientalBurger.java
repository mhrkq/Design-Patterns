package com.minghui.designpatterns.creational.factory.products;

public class OrientalBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("Preparing Oriental Burger...");
    }

}
