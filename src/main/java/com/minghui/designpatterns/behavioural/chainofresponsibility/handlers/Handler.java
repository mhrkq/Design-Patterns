package com.minghui.designpatterns.behavioural.chainofresponsibility.handlers;

public abstract class Handler {

    private Handler next;

    public Handler setNextHandler(Handler next) { // chain another Handler object to the current Handler object
        this.next = next;
        return next;
    }

    public abstract boolean handle(String username, String password);

    protected boolean handleNext(String username, String password) { // checks if there is a next Handler object chained to it
        if (next == null) {
            return true; // for if else check in AuthService
        }
        return next.handle(username, password); // if there is, run its handle function
    }

}
