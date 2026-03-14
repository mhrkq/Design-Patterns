error id: file:///D:/work/Design-Patterns/src/main/java/com/minghui/designpatterns/behavioural/visitor/models/Bank.java:
file:///D:/work/Design-Patterns/src/main/java/com/minghui/designpatterns/behavioural/visitor/models/Bank.java
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 215
uri: file:///D:/work/Design-Patterns/src/main/java/com/minghui/designpatterns/behavioural/visitor/models/Bank.java
text:
```scala
package com.minghui.designpatterns.behavioural.visitor.models;

import com.minghui.designpatterns.behavioural.visitor.Visitor;
import lombok.Getter;

@Getter
public class Bank extends Client {

    private final int@@ branchesInsured;

    public Bank(String name, String address, String number, int branchesInsured) {
        super(name, address, number);
        this.branchesInsured = branchesInsured;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}

```


#### Short summary: 

empty definition using pc, found symbol in pc: 