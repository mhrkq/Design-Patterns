package com.minghui.designpatterns.behavioural.strategy.strategies;

import com.minghui.designpatterns.behavioural.strategy.CreditCard;

public class PaymentByCreditCard implements PaymentStrategy {

    private CreditCard card;

    @Override
    public void collectPaymentDetails() {
        card = new CreditCard("1234567890", "01/02/2345", "369");
        System.out.println("Collecting Card Details...");
    }

    @Override
    public boolean validatePaymentDetails() {
        System.out.println("Validating Card Info: " + card);
        return true;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using Credit Card");
        card.setAmount(card.getAmount() - amount);
    }

}
