package com.sean.mvvmtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.sean.mvvmtest.dagger_login.Login2Activity;
import com.sean.mvvmtest.login.LoginActivity;
import com.sean.mvvmtest.recycler_view.RecyclerViewActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        findViewById(R.id.normal_mvvm_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SplashActivity.this, LoginActivity.class));
            }
        });
        findViewById(R.id.dagger2_mvvm_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SplashActivity.this, Login2Activity.class));
            }
        });
        findViewById(R.id.recycler_view_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SplashActivity.this, RecyclerViewActivity.class));
            }
        });
    }


}
