error id: file:///D:/work/Design-Patterns/src/main/java/com/minghui/designpatterns/creational/builder/model/CarSchema.java:java/lang/String#
file:///D:/work/Design-Patterns/src/main/java/com/minghui/designpatterns/creational/builder/model/CarSchema.java
empty definition using pc, found symbol in pc: 
found definition using semanticdb; symbol java/lang/String#
empty definition using fallback
non-local guesses:

offset: 446
uri: file:///D:/work/Design-Patterns/src/main/java/com/minghui/designpatterns/creational/builder/model/CarSchema.java
text:
```scala
package com.minghui.designpatterns.creational.builder.model;

// we cannot reuse the CarBuilder as it returns a different object

public class CarSchema {

    private final int id;
    private final int height;
    private final String brand;
    private final String model;
    private final String color;
    private final String engine;
    private final int nbrOfDoors;

    CarSchema(int id, String brand, String model, String@@ color, int height, String engine, int nbrOfDoors) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.height = height;
        this.engine = engine;
        this.nbrOfDoors = nbrOfDoors;
    }

    @Override
    public String toString() {
        return """
                CarSchema {
                    id=%s,
                    height=%s,
                    brand=%s,
                    model=%s,
                    color=%s,
                    engine=%s,
                    nbrOfDoors=%s
                }""".formatted(id, height, brand, model, color, engine, nbrOfDoors);
    }

}

```


#### Short summary: 

empty definition using pc, found symbol in pc: 