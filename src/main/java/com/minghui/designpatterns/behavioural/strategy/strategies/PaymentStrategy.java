package com.minghui.designpatterns.behavioural.strategy.strategies;

public interface PaymentStrategy {

    void collectPaymentDetails();

    boolean validatePaymentDetails();

    void pay(int amount);

}