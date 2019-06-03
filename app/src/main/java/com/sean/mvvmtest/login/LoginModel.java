package com.sean.mvvmtest.login;

/**
 * @author sean
 */
public class LoginModel {

    public boolean login(String username, String password) {
        if (username.equals("sean") && password.equals("123")) {
            return true;
        }
        return false;
    }
}
