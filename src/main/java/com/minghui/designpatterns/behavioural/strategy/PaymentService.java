package com.minghui.designpatterns.behavioural.strategy;

import com.minghui.designpatterns.behavioural.strategy.strategies.PaymentStrategy;

public class PaymentService {

    private int cost;
    private boolean includeDelivery = true;
    private PaymentStrategy strategy;

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setIncludeDelivery(boolean includeDelivery) {
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
