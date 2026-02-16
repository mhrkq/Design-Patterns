error id: file:///D:/work/Design-Patterns/src/com/minghui/designpatterns/creational/prototype/VehicleCache.java:java/util/Map#
file:///D:/work/Design-Patterns/src/com/minghui/designpatterns/creational/prototype/VehicleCache.java
empty definition using pc, found symbol in pc: java/util/Map#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 219
uri: file:///D:/work/Design-Patterns/src/com/minghui/designpatterns/creational/prototype/VehicleCache.java
text:
```scala
package com.minghui.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

import com.minghui.designpatterns.creational.builder.model.Car;

public class VehicleCache {

    private final @@Map<String, Vehicle> cache = new HashMap<>();

    public VehicleCache() {
        Car car = new Car("Bugatti", "Chiron", "Blue", 261);
        Bus bus = new Bus("Mercedes", "Setra", "White", 48);

        cache.put("Bugatti Chiron", car);
        cache.put("Mercedes Setra", bus);
    }

    public Vehicle get(String key) {
        return cache.get(key).clone();
    }

    public void put(List<Vehicle> vehicles) {
        vehicles.forEach(vehicle -> cache.put(vehicle.getBrand() + " " + vehicle.getModel(), vehicle));
    }

}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/util/Map#