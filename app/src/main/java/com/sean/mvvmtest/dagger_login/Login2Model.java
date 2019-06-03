package com.sean.mvvmtest.dagger_login;

import com.sean.mvvmtest.base.BaseMvvmModel;

import javax.inject.Inject;

/**
 * @author sean
 */
public class Login2Model implements BaseMvvmModel {
    @Inject
    public Login2Model() {
    }

    public boolean login(String username, String password) {
        if (username.equals("sean") && password.equals("123")) {
            return true;
        }
        return false;
    }
}
