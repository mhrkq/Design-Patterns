error id: file:///D:/work/Design-Patterns/src/main/java/com/minghui/designpatterns/behavioural/state/states/OffState.java:com/minghui/designpatterns/behavioural/state/Phone#
file:///D:/work/Design-Patterns/src/main/java/com/minghui/designpatterns/behavioural/state/states/OffState.java
empty definition using pc, found symbol in pc: com/minghui/designpatterns/behavioural/state/Phone#
semanticdb not found
empty definition using fallback
non-local guesses:

offset: 117
uri: file:///D:/work/Design-Patterns/src/main/java/com/minghui/designpatterns/behavioural/state/states/OffState.java
text:
```scala
package com.minghui.designpatterns.behavioural.state.states;

import com.minghui.designpatterns.behavioural.state.Pho@@ne;

public class OffState extends State {

    public OffState(Phone phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        phone.setState(new LockedState(phone));
        return phone.turnOn();
    }

    @Override
    public String onOffOn() {
        phone.setState(new LockedState(phone));
        return phone.turnOn();
    }

}

```


#### Short summary: 

empty definition using pc, found symbol in pc: com/minghui/designpatterns/behavioural/state/Phone#