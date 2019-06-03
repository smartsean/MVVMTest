package com.sean.mvvmtest.base;

import android.databinding.BaseObservable;

import javax.inject.Inject;

/**
 * @author sean
 */
public class BaseMvvmViewModel<M extends BaseMvvmModel> extends BaseObservable {

    protected M mModel;


    protected BaseMvvmActivity mActivity;

    public BaseMvvmViewModel(M model, BaseMvvmActivity activity) {
        mModel = model;
        mActivity = activity;
    }
}
