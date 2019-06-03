package com.sean.mvvmtest.base.di;

import com.sean.mvvmtest.base.BaseMvvmActivity;

/**
 * @author sean
 */
public class BaseModule {

    protected BaseMvvmActivity mActivity;

    public BaseModule(BaseMvvmActivity activity) {
        mActivity = activity;
    }
}
