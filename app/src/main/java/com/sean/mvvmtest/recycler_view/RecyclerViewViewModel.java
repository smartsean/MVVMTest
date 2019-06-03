package com.sean.mvvmtest.recycler_view;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.sean.mvvmtest.BR;

import java.util.ArrayList;
import java.util.List;


/**
 * @author sean
 */
public class RecyclerViewViewModel extends BaseObservable {

    private RecyclerViewActivity mActivity;

    private RecyclerViewAdapter adapter;

    private RecyclerView.LayoutManager layoutManager;

    private RecyclerViewModel mRecyclerViewModel;

    public RecyclerViewViewModel(RecyclerViewActivity activity) {
        mActivity = activity;
        layoutManager = new LinearLayoutManager(mActivity);
        adapter = new RecyclerViewAdapter(new ArrayList<String>());
    }

    @Bindable
    public RecyclerViewAdapter getAdapter() {
        return adapter;
    }

    public void setAdapter(RecyclerViewAdapter adapter) {
        this.adapter = adapter;
        notifyPropertyChanged(BR.adapter);
    }

    @Bindable
    public RecyclerView.LayoutManager getLayoutManager() {
        return layoutManager;
    }

    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        this.layoutManager = layoutManager;
        notifyPropertyChanged(BR.layoutManager);
    }

    public void getData(View v) {
        if (mRecyclerViewModel == null) {
            mRecyclerViewModel = new RecyclerViewModel();
        }
        List<String> list = mRecyclerViewModel.getList(100);
        if (list != null) {
            adapter.setData(list);
            adapter.notifyDataSetChanged();
        }
    }
}
