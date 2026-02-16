error id: file:///D:/work/Design-Patterns/src/main/java/com/minghui/designpatterns/creational/prototype/VehicleCache.java:_empty_/Vehicle#clone#
file:///D:/work/Design-Patterns/src/main/java/com/minghui/designpatterns/creational/prototype/VehicleCache.java
empty definition using pc, found symbol in pc: _empty_/Vehicle#clone#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 600
uri: file:///D:/work/Design-Patterns/src/main/java/com/minghui/designpatterns/creational/prototype/VehicleCache.java
text:
```scala
package com.minghui.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.minghui.designpatterns.creational.builder.model.Car;

public class VehicleCache {

    private final Map<String, Vehicle> cache = new HashMap<>();

    public VehicleCache() {
        Car car = new Car("Bugatti", "Chiron", "Blue", 261);
        Bus bus = new Bus("Mercedes", "Setra", "White", 48);

        cache.put("Bugatti Chiron", car);
        cache.put("Mercedes Setra", bus);
    }

    public Vehicle get(String key) {
        return cache.get(key).cl@@one();
    }

    public void put(List<Vehicle> vehicles) {
        vehicles.forEach(vehicle -> cache.put(vehicle.getBrand() + " " + vehicle.getModel(), vehicle));
    }

}

```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/Vehicle#clone#