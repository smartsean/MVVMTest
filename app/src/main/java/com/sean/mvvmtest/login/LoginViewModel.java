package com.sean.mvvmtest.login;

import android.content.Intent;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.sean.mvvmtest.BR;
import com.sean.mvvmtest.MainActivity;

/**
 * @author sean
 */
public class LoginViewModel extends BaseObservable {
    private LoginActivity mActivity;
    private LoginModel mModel;
    private String userName;
    private String password;


    public LoginViewModel(LoginActivity activity) {
        mActivity = activity;
        mModel = new LoginModel();
    }

    @Bindable
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        notifyPropertyChanged(BR.userName);
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
    }


    public void login(View view) {
        if (TextUtils.isEmpty(userName)) {
            Toast.makeText(mActivity.getApplicationContext(), "请输入用户名", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(password)) {
            Toast.makeText(mActivity.getApplicationContext(), "请输入密码", Toast.LENGTH_SHORT).show();
            return;
        }
        if (mModel.login(userName, password)) {
            mActivity.startActivity(new Intent(mActivity, MainActivity.class));
            Toast.makeText(mActivity.getApplicationContext(), "登录成功", Toast.LENGTH_SHORT).show();
            mActivity.finish();
        } else {
            Toast.makeText(mActivity.getApplicationContext(), "登录失败,请检查后重试", Toast.LENGTH_SHORT).show();
        }
    }
}
