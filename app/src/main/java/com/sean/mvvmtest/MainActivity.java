package com.sean.mvvmtest;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sean.mvvmtest.dagger.DaggerTestComponent;
import com.sean.mvvmtest.databinding.ActivityMainBinding;

/**
 * @author sean
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("Smart", " Sean");
        user.setOperation("点击我");
        binding.setUser(user);
        user.setFirstName("测试 1");
        user.setOperation("测试 2");

    }
}
