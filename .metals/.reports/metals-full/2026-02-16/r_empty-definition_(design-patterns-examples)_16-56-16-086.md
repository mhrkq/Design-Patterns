error id: file:///D:/work/Design-Patterns/src/main/java/com/minghui/designpatterns/behavioural/chainofresponsibility/handlers/ValidPasswordHandler.java:_empty_/Database#isValidPassword#
file:///D:/work/Design-Patterns/src/main/java/com/minghui/designpatterns/behavioural/chainofresponsibility/handlers/ValidPasswordHandler.java
empty definition using pc, found symbol in pc: _empty_/Database#isValidPassword#
semanticdb not found
empty definition using fallback
non-local guesses:

offset: 375
uri: file:///D:/work/Design-Patterns/src/main/java/com/minghui/designpatterns/behavioural/chainofresponsibility/handlers/ValidPasswordHandler.java
text:
```scala
package com.minghui.designpatterns.behavioural.chainofresponsibility.handlers;

public class ValidPasswordHandler extends Handler {

    private final Database database;

    public ValidPasswordHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if (!database.isValidPassw@@ord(username, password)) {
            System.out.println("Wrong Password!");
            return false;
        }
        return handleNext(username, password);
    }

}

```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/Database#isValidPassword#