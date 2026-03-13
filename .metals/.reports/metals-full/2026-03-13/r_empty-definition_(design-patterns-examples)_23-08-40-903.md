file:///D:/work/Design-Patterns/src/main/java/com/minghui/designpatterns/behavioural/observer/Store.java
empty definition using pc, found symbol in pc: 
semanticdb not found
empty definition using fallback
non-local guesses:

offset: 233
uri: file:///D:/work/Design-Patterns/src/main/java/com/minghui/designpatterns/behavioural/observer/Store.java
text:
```scala
package com.minghui.designpatterns.behavioural.observer;

import static com.youtube.geekific.Event.*;

public class Store {

    private final NotificationService notificationService;

    public Store() {
        notificationService@@ = new NotificationService();
    }

    public void newItemPromotion() {
        notificationService.notifyCustomers(NEW_ITEM);
    }

    public void salePromotion() {
        notificationService.notifyCustomers(SALE);
    }

    public NotificationService getService() {
        return notificationService;
    }

}

```


#### Short summary: 

empty definition using pc, found symbol in pc: 