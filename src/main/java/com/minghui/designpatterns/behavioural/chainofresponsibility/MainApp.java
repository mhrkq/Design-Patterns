package com.minghui.designpatterns.behavioural.chainofresponsibility;

import com.minghui.designpatterns.behavioural.chainofresponsibility.handlers.Handler;
import com.minghui.designpatterns.behavioural.chainofresponsibility.handlers.RoleCheckHandler;
import com.minghui.designpatterns.behavioural.chainofresponsibility.handlers.UserExistsHandler;
import com.minghui.designpatterns.behavioural.chainofresponsibility.handlers.ValidPasswordHandler;

// transforms particular behaviours into stand-alone objects called 'handlers'

// use this pattern when you encounter the need to execute several handlers in a particular order
// allows you to insert, remove, or reorder the handlers dynamically
// each handler must either process the request or pass it along the chain
// the client may trigger and handler in the chain, not just the first one

// UserExistsHandler object - check if username in DB - next (object) = ValidPasswordHandler object

// ValidPasswordHandler object - check if pw matches the username's pw in DB - next (object) = RoleCheckHandler object

// RoleCheckHandler object - check if user is admin (username = admin username) - next (object) = AuthService object 

// AuthService object - performs login

public class MainApp {

    public static void main(String[] args) {

        Database database = new Database();
        Handler handler = new UserExistsHandler(database);
        handler.setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckHandler());
        AuthService service = new AuthService(handler);

        System.out.println("==========================================");

        System.out.println(service.logIn("username", "password"));

        System.out.println("==========================================");

        System.out.println(service.logIn("user_username", "password"));

        System.out.println("==========================================");

        System.out.println(service.logIn("admin_username", "admin_password"));

        System.out.println("==========================================");

    }

}
