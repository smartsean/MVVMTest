package com.sean.mvvmtest.recycler_view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sean.mvvmtest.R;
import com.sean.mvvmtest.databinding.ActivityRecyclerViewBinding;

/**
 * @author sean
 */
public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityRecyclerViewBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_recycler_view);
        RecyclerViewViewModel model = new RecyclerViewViewModel(this);
        binding.setRecyclerModel(model);
    }
}
