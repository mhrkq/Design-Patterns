package com.minghui.designpatterns.behavioural.strategy;

import com.minghui.designpatterns.behavioural.strategy.strategies.PaymentByCreditCard;
import com.minghui.designpatterns.behavioural.strategy.strategies.PaymentByPayPal;

// defines a family of behaviours
// puts each of them in a separate class
// make their objects interchangeable

// single responsibility
// open-closed

public class MainApp {

    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();

        paymentService.setStrategy(new PaymentByCreditCard());
        paymentService.processOrder(100);

        System.out.println("==========================================");

        paymentService.setStrategy(new PaymentByPayPal());
        paymentService.processOrder(100);

    }

}
