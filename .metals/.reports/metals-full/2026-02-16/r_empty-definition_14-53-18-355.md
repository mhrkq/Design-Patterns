error id: file:///D:/work/Design-Patterns/src/com/minghui/designpatterns/creational/prototype/Bus.java:_empty_/Bus#doors.
file:///D:/work/Design-Patterns/src/com/minghui/designpatterns/creational/prototype/Bus.java
empty definition using pc, found symbol in pc: _empty_/Bus#doors.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 112
uri: file:///D:/work/Design-Patterns/src/com/minghui/designpatterns/creational/prototype/Bus.java
text:
```scala
@ToString(callSuper = true)
public class Bus extends Vehicle {

    private final int doors;

    public Bus(Str@@ing brand, String model, String color, int doors) {
        super(brand, model, color);
        this.doors = doors;
    }

    private Bus(Bus bus) {
        super(bus);
        this.doors = bus.doors;
    }

    @Override
    public Bus clone() {
        return new Bus(this);
    }

}

```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/Bus#doors.