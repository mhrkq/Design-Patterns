package com.minghui.designpatterns.behavioural.observer;

import static com.minghui.designpatterns.behavioural.observer.Event.*;

// let objects subscribe to another object and automatically receive updates when its state changes

// pros:
// loose coupling (subject doesn't know details of observers)
// dynamic subscription/unsubscription
// easy to add new observers

// cons:
// too many observers → performance issues
// hard to track update chains in complex systems

public class MainApp {

    public static void main(String[] args) {

        Store store = new Store();
        store.getService().subscribe(NEW_ITEM, new EmailMsgListener("wintermute@gmail.com"));
        store.getService().subscribe(SALE, new EmailMsgListener("wintermute@gmail.com"));
        store.getService().subscribe(SALE, new EmailMsgListener("wintermute@hotmail.com"));
        store.getService().subscribe(NEW_ITEM, new MobileAppListener("brokenbot"));

        store.newItemPromotion();

        System.out.println("==========================================");

        store.salePromotion();

        System.out.println("==========================================");

        store.getService().unsubscribe(SALE, new EmailMsgListener("wintermute@hotmail.com"));
        store.salePromotion();

    }

}
