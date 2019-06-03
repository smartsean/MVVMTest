package com.sean.mvvmtest.login;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sean.mvvmtest.R;
import com.sean.mvvmtest.databinding.ActivityLoginBinding;

/**
 * @author sean
 */
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLoginBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        final LoginViewModel model = new LoginViewModel(this);
        binding.setLoginModel(model);
    }
}
