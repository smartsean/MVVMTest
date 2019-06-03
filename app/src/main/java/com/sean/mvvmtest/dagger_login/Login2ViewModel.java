package com.sean.mvvmtest.dagger_login;

import android.content.Intent;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.jakewharton.rxbinding3.view.RxView;
import com.sean.mvvmtest.BR;
import com.sean.mvvmtest.MainActivity;
import com.sean.mvvmtest.base.BaseMvvmActivity;
import com.sean.mvvmtest.base.BaseMvvmViewModel;

import io.reactivex.functions.Consumer;
import kotlin.Unit;

/**
 * @author sean
 */
public class Login2ViewModel extends BaseMvvmViewModel<Login2Model> {
    private static final String TAG = "Login2ViewModel";
    private String userName;
    private String password;
    private String avatar = "https://markdown-1258186581.cos.ap-shanghai.myqcloud.com/20190603001604.png";

    public Login2ViewModel(Login2Model model, BaseMvvmActivity activity) {
        super(model, activity);
    }


    @Bindable
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
        notifyPropertyChanged(BR.avatar);
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

    public void login(View v) {
        Log.d(TAG, "login: " + mActivity.getPackageName());
        if (TextUtils.isEmpty(userName)) {
            Toast.makeText(mActivity, "请输入用户名", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(password)) {
            Toast.makeText(mActivity, "请输入密码", Toast.LENGTH_SHORT).show();
            return;
        }
        if (mModel.login(userName, password)) {
            mActivity.startActivity(new Intent(mActivity, MainActivity.class));
            Toast.makeText(mActivity, "登录成功", Toast.LENGTH_SHORT).show();
            mActivity.finish();
        } else {
            Toast.makeText(mActivity, "登录失败,请检查后重试", Toast.LENGTH_SHORT).show();
        }
    }

    public void register(View view) {
        avatar = "https://markdown-1258186581.cos.ap-shanghai.myqcloud.com/20190603001604.png";
        RxView.clicks(view).subscribe(new Consumer<Unit>() {
            @Override
            public void accept(Unit unit) throws Exception {
                Toast.makeText(mActivity, "你点击了注册", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
