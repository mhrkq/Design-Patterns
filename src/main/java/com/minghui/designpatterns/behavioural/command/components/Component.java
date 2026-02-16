package com.minghui.designpatterns.behavioural.command.components;

import com.minghui.designpatterns.behavioural.command.commands.Command;

public abstract class Component {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }

}
