package com.sean.mvvmtest.dagger;

import dagger.Module;
import dagger.Provides;

@Module
public class TestModule {
    @Provides
    String provideString(){
        return "测试的";
    }
}
