package com.sean.mvvmtest.bindingAdapter;

import android.databinding.BindingAdapter;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class BindingAdapterHelper {


    @BindingAdapter("url")
    public static void setUrl(ImageView imageView, String url) {
        Glide.with(imageView.getContext()).load(url).into(imageView);
    }

    @BindingAdapter("adapter")
    public static void setAdapter(RecyclerView recyclerView, RecyclerView.Adapter adapter) {
        if (null == recyclerView || adapter == null) {
            return;
        }
        recyclerView.setAdapter(adapter);
    }

    @BindingAdapter("recyclerLayoutManager")
    public static void setLayoutManager(RecyclerView recyclerView, RecyclerView.LayoutManager layoutManager) {

        if (null == recyclerView || null == layoutManager) {
            return;
        }
        recyclerView.setLayoutManager(layoutManager);
    }
}
