error id: file:///D:/work/Design-Patterns/src/main/java/com/minghui/designpatterns/behavioural/strategy/PaymentService.java:
file:///D:/work/Design-Patterns/src/main/java/com/minghui/designpatterns/behavioural/strategy/PaymentService.java
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 357
uri: file:///D:/work/Design-Patterns/src/main/java/com/minghui/designpatterns/behavioural/strategy/PaymentService.java
text:
```scala
package com.minghui.designpatterns.behavioural.strategy;

import com.minghui.designpatterns.behavioural.strategy.strategies.PaymentStrategy;

public class PaymentService {

    private int cost;
    private boolean includeDelivery = true;
    private PaymentStrategy strategy;

    public void setCost(int cost) {
        this.cost = cost;
    }

    public@@ void setIncludeDelivery(boolean includeDelivery) {
        this.includeDelivery = includeDelivery;
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processOrder(int cost) {
        this.cost = cost;
        strategy.collectPaymentDetails();
        if (strategy.validatePaymentDetails()) {
            strategy.pay(getTotal());
        }
    }

    private int getTotal() {
        return includeDelivery ? cost + 10 : cost;
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: 