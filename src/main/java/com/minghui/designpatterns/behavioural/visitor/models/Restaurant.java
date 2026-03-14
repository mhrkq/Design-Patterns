package com.minghui.designpatterns.behavioural.visitor.models;

import com.minghui.designpatterns.behavioural.visitor.Visitor;

public class Restaurant extends Client {

    public final boolean availableAbroad;

    public Restaurant(String name, String address, String number, boolean availableAbroad) {
        super(name, address, number);
        this.availableAbroad = availableAbroad;
    }

    public boolean isAvailableAbroad() {
        return availableAbroad;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}