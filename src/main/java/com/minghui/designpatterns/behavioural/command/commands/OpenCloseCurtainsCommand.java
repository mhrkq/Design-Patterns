package com.minghui.designpatterns.behavioural.command.commands;

import com.minghui.designpatterns.behavioural.command.components.Curtains;

// use 'record' when the class is mostly a data holder
// immutable by default
// reduces boilerplate code
// can implement interfaces, but cannot extend other classes

// OpenCloseCurtainsCommand
// its only purpose is to hold a reference to a Curtains object
// it provides the execute() method to delegate the action
// the curtains field is final, and its value does not change once the command is created

// use a record here because record automatically provides:
// Final field curtains
// Constructor OpenCloseCurtainsCommand(Curtains curtains)
// Getter curtains()
// equals(), hashCode(), and toString()
// so do not have to write boilerplate code

public record OpenCloseCurtainsCommand(Curtains curtains) implements Command {

    @Override
    public void execute() {
        curtains.openClose();
    }

}
