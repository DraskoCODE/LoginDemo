package com.code.login.handler;

import com.code.login.models.User;

import java.util.ArrayList;
import java.util.List;

public class LoginHandler {

    public User user;

    public LoginHandler() {

    }

    public LoginHandler(User user) {
        this.user = user;
    }

    //userName
    private boolean isUserNameEmpty() {
        boolean toReturn = false;
        if(user.userName.equals("")) {
            toReturn = true;
        }
        return toReturn;
    }

    private boolean userExits(List<User> users) {
        boolean toReturn = false;
        for(int i = 0; i < users.size(); i++) {
            if(users.get(i).userName.equals(user.userName)) {
                toReturn = true;
                break;
            }
        }
        return toReturn;
    }

    private boolean ifPasswordLenghts() {
        boolean toReturn = false;
        if(user.password.length() > 8) {
            toReturn = true;
        }
        return toReturn;
    }

    private boolean ifPasswordContainstSpecialCharacter() {
        List<Character> specChar = new ArrayList<Character>();
        specChar.add('#');
        specChar.add('$');
        specChar.add('!');

        boolean toReturn = false;

        for(int i = 0; i < user.password.length(); i++) {
           char temp = user.password.charAt(i);
           for(int j = 0; j < specChar.size(); j++) {
               if(temp == specChar.get(j)) {
                   toReturn = true;
                   break;
               }
           }
           if(toReturn) {
               break;
           }
        }
        return toReturn;
    }


    public void login(List<User> users) {
        if(isUserNameEmpty()) {
            System.out.println("User name is empty");
            return;
        }

        if(userExits(users)) {
            System.out.println("User already exist");
            return;
        }

        if(!ifPasswordLenghts()) {
            System.out.println("Password should contains 8 char min");
            return;
        }

        if(!ifPasswordContainstSpecialCharacter()) {
            System.out.println("Password should contains spec char");
            return;
        }


        System.out.println("Succsessfully");

    }



}
