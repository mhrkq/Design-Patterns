error id: file:///D:/work/Design-Patterns/src/main/java/com/minghui/designpatterns/behavioural/command/MainApp.java:_empty_/FloorLamp#isLightOn#
file:///D:/work/Design-Patterns/src/main/java/com/minghui/designpatterns/behavioural/command/MainApp.java
empty definition using pc, found symbol in pc: _empty_/FloorLamp#isLightOn#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 634
uri: file:///D:/work/Design-Patterns/src/main/java/com/minghui/designpatterns/behavioural/command/MainApp.java
text:
```scala
package com.minghui.designpatterns.behavioural.command;

public class MainApp {

    /*
     * Video Reference: https://youtu.be/UfGD60BYzPM
     */
    public static void main(String[] args) {

        Room room = new Room();
        room.setCommand(new OpenCloseCurtainsCommand(room.getCurtains()));
        room.executeCommand();
        System.out.println(room.curtainsOpen());

        System.out.println("==========================================");

        FloorLamp lamp = new FloorLamp();
        lamp.setCommand(new SwitchLightsCommand(lamp.getLight()));
        lamp.executeCommand();
        System.out.println(lamp.isLi@@ghtOn());

    }

}

```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/FloorLamp#isLightOn#