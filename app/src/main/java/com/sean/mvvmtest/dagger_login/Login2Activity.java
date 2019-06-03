package com.sean.mvvmtest.dagger_login;

import com.sean.mvvmtest.R;
import com.sean.mvvmtest.base.BaseMvvmActivity;
import com.sean.mvvmtest.dagger_login.di.DaggerLogin2Component;
import com.sean.mvvmtest.dagger_login.di.Login2Module;
import com.sean.mvvmtest.databinding.ActivityLogin2Binding;

/**
 * @author sean
 */
public class Login2Activity extends BaseMvvmActivity<ActivityLogin2Binding, Login2ViewModel> {

    @Override
    protected int inflateView() {
        return R.layout.activity_login2;
    }

    @Override
    protected void init() {
        DaggerLogin2Component.builder().login2Module(new Login2Module(this)).build().inject(this);
        mBinding.setLoginModel(mViewModel);
    }

}
