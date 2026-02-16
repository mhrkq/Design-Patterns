error id: file:///D:/work/Design-Patterns/src/com/minghui/designpatterns/creational/prototype/MainApp.java:java/io/PrintStream#println(+8).
file:///D:/work/Design-Patterns/src/com/minghui/designpatterns/creational/prototype/MainApp.java
empty definition using pc, found symbol in pc: java/io/PrintStream#println(+8).
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 754
uri: file:///D:/work/Design-Patterns/src/com/minghui/designpatterns/creational/prototype/MainApp.java
text:
```scala
package com.minghui.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

import com.minghui.designpatterns.creational.builder.model.Car;

public public class MainApp {

    /*
     * Video Reference: https://youtu.be/DcFhITC9v0E
     */
    public static void main(String[] args) {

        List<Vehicle> vehicles = List.of(
                new Car("car_brand", "car_model", "car_color", 300),
                new Bus("bus_brand", "bus_model", "bus_color", 8)
        );

        List<Vehicle> copyList = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            copyList.add(vehicle.clone());
        }

        copyList.forEach(System.out::println);

        System.out.pri@@ntln("==========================================");

        VehicleCache registry = new VehicleCache();
        registry.put(vehicles);
        System.out.println(registry.get("car_brand car_model"));

    }

} {
    
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/io/PrintStream#println(+8).