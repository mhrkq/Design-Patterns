package com.minghui.designpatterns.behavioural.chainofresponsibility;

import com.minghui.designpatterns.behavioural.chainofresponsibility.handlers.Handler;

public class AuthService {

    private final Handler handler;

    public AuthService(Handler handler) {
        this.handler = handler;
    }

    public boolean logIn(String email, String password) {
        if (handler.handle(email, password)) {
            System.out.println("Authorization was successful!");
            // do stuff for authorised users
            return true;
        }
        return false;
    }

}
