error id: file:///D:/work/Design-Patterns/src/com/minghui/designpatterns/creational/prototype/Vehicle.java:_empty_/ToString#
file:///D:/work/Design-Patterns/src/com/minghui/designpatterns/creational/prototype/Vehicle.java
empty definition using pc, found symbol in pc: _empty_/ToString#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 67
uri: file:///D:/work/Design-Patterns/src/com/minghui/designpatterns/creational/prototype/Vehicle.java
text:
```scala
package com.minghui.designpatterns.creational.prototype;

@Getter
@@@ToString
public abstract class Vehicle {

    private final String brand;
    private final String model;
    private final String color;

    public Vehicle(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    protected Vehicle(Vehicle vehicle) {
        this.brand = vehicle.brand;
        this.model = vehicle.model;
        this.color = vehicle.color;
    }

    public abstract Vehicle clone();

}

```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/ToString#