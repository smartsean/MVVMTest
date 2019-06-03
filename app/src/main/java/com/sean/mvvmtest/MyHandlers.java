package com.sean.mvvmtest;

import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MyHandlers {
    private static final String TAG = "MyHandlers";
    public void onClickButton(final View view) {
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(view.getContext(), "测试", Toast.LENGTH_SHORT).show();
            }
        });
        Log.d(TAG, "onClickButton: "+((Button)view).getText());
    }

    public void afterFirstNameChanged(Editable s) {  }
}
