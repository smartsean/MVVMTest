package com.sean.mvvmtest.dagger_login.di;

import com.sean.mvvmtest.base.BaseMvvmActivity;
import com.sean.mvvmtest.base.di.BaseModule;
import com.sean.mvvmtest.dagger_login.Login2Model;
import com.sean.mvvmtest.dagger_login.Login2ViewModel;

import dagger.Module;
import dagger.Provides;

/**
 * @author sean
 */
@Module
public class Login2Module extends BaseModule {
    public Login2Module(BaseMvvmActivity activity) {
        super(activity);
    }

    @Provides
    Login2ViewModel provideViewModle(Login2Model model) {
        return new Login2ViewModel(model, mActivity);
    }
}