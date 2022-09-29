package com.company;

import com.code.login.handler.LoginHandler;
import com.code.login.models.User;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<User> existingUsers = new ArrayList<>();
        existingUsers.add(new User("drasko", "123456!!"));
        existingUsers.add(new User("stefan", "1234567!!"));
        existingUsers.add(new User("vukasin", "12345679!!"));
        existingUsers.add(new User("marija", "1234567!!"));


        User user = new User("", "123456!!");
        LoginHandler loginHandler = new LoginHandler();
        loginHandler.user = user;
        loginHandler.login(existingUsers);

        //loginHandler = new LoginHandler(new User("stefan", "1234567!!"));
        loginHandler.user = new User("nebojsa", "012567000");
        loginHandler.login(existingUsers);

        loginHandler.user = new User("predrag", "1234567!!");
        loginHandler.login(existingUsers);

        //LoginHandler loginHandler1 = new LoginHandler(new User("", ""));
    }
}
