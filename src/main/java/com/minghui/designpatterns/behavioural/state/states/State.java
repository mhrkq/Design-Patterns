package com.minghui.designpatterns.behavioural.state.states;

import com.minghui.designpatterns.behavioural.state.Phone;

public abstract class State {

    protected Phone phone;

    public State(Phone phone) {
        this.phone = phone;
    }

    public abstract String onHome();

    public abstract String onOffOn();

}
