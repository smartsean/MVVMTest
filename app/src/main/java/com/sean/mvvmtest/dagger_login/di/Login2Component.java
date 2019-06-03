package com.sean.mvvmtest.dagger_login.di;

import com.sean.mvvmtest.dagger_login.Login2Activity;

import dagger.Component;

@Component(modules = Login2Module.class)
public interface Login2Component {
    void inject(Login2Activity activity);
}