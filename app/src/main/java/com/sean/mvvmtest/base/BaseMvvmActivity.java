package com.sean.mvvmtest.base;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

/**
 * @author sean
 */
public abstract class BaseMvvmActivity<T extends ViewDataBinding, VM extends BaseMvvmViewModel> extends AppCompatActivity {

    protected T mBinding;
    @Inject
    protected VM mViewModel;

    protected Context mContext;

    /**
     * 引入 View
     *
     * @return
     */
    protected abstract int inflateView();

    /**
     * 初始化
     */
    protected abstract void init();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, inflateView());

        mContext = this;
        init();
    }

    @Override
    protected void onDestroy() {
        if (null != mBinding) {
            mBinding = null;
        }
        if (null != mViewModel) {
            mViewModel = null;
        }
        super.onDestroy();
    }
}
