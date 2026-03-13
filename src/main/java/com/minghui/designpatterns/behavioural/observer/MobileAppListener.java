package com.minghui.designpatterns.behavioural.observer;

public record MobileAppListener(String username) implements Listener {

    @Override
    public void update(Event eventType) {
        // actually send the push notification to username
        System.out.println("Sending mobile app notification to " + username + " concerning " + eventType);
    }

}
