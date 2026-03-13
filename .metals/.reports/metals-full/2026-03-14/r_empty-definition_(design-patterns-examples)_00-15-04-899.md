error id: file:///D:/work/Design-Patterns/src/main/java/com/minghui/designpatterns/behavioural/state/MainApp.java:_empty_/Phone#
file:///D:/work/Design-Patterns/src/main/java/com/minghui/designpatterns/behavioural/state/MainApp.java
empty definition using pc, found symbol in pc: _empty_/Phone#
semanticdb not found
empty definition using fallback
non-local guesses:

offset: 222
uri: file:///D:/work/Design-Patterns/src/main/java/com/minghui/designpatterns/behavioural/state/MainApp.java
text:
```scala
package com.minghui.designpatterns.behavioural.state;

public class MainApp {

    /*
     * Video Reference: https://youtu.be/abX4xzaAsoc
     */
    public static void main(String[] args) {

        Phone phone = new Pho@@ne();
        simulatePhoneClicks(phone);

    }

    private static void simulatePhoneClicks(Phone phone) {
        System.out.println(phone.clickPower());
        System.out.println(phone.clickPower());
        System.out.println(phone.clickHome());
        System.out.println(phone.clickHome());
        System.out.println(phone.clickHome());
        System.out.println(phone.clickPower());
        System.out.println(phone.clickPower());
        System.out.println(phone.clickHome());
    }

}

```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/Phone#