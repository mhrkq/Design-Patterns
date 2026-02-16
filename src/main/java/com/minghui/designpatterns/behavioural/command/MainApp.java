package com.minghui.designpatterns.behavioural.command;

import com.minghui.designpatterns.behavioural.command.commands.OpenCloseCurtainsCommand;
import com.minghui.designpatterns.behavioural.command.commands.SwitchLightsCommand;
import com.minghui.designpatterns.behavioural.command.components.FloorLamp;
import com.minghui.designpatterns.behavioural.command.components.Room;

// COMMAND PATTERN

// turns a request or behaviour into a stand-alone object that contains everything about that request
// encapsulates all the relevant information needed to perform an action or trigger an event

// turns methods of components into objects
// the invoker just calls execute() on the object, and it does not know or care which component actually does the work
// this loosely couples “functions” (commands) from “components” (receivers)

// commands can be passed as method arguments, stored inside other objects, switched at runtime, queued, undone, or logged easily, because they are objects
// easy to read and write from a file
// multiple invokers can share the same command object

public class MainApp {

    public static void main(String[] args) {

        Room room = new Room(); // Room class does not have Command functions, they are in Component abstract class which Room extends
        room.setCommand(new OpenCloseCurtainsCommand(room.getCurtains()));
        room.executeCommand();
        System.out.println(room.curtainsOpen());

        System.out.println("==========================================");

        FloorLamp lamp = new FloorLamp();
        lamp.setCommand(new SwitchLightsCommand(lamp.getLight()));
        lamp.executeCommand();
        System.out.println(lamp.isLightOn());

    }

}
