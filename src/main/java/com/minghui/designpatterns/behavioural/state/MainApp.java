package com.minghui.designpatterns.behavioural.state;

// State vs Strategy

// single responsibility - each state is organised in a separate class
// open-closed - easily introduce new states

// State:
// can be dependent as able to easily jump from one state to another
// doing different things based on the state, so result may vary

// Strategy:
// completely independent and unaware of each other
// having different implementation that acomplish the same thing

public class MainApp {

    public static void main(String[] args) {

        Phone phone = new Phone();
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
