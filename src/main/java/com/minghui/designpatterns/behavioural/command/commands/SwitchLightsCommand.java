package com.minghui.designpatterns.behavioural.command.commands;

import com.minghui.designpatterns.behavioural.command.components.Light;

// use 'record' when the class is mostly a data holder
// immutable by default
// reduces boilerplate code
// can implement interfaces, but cannot extend other classes

public record SwitchLightsCommand(Light light) implements Command {

    @Override
    public void execute() {
        light.switchLights();
    }

}
