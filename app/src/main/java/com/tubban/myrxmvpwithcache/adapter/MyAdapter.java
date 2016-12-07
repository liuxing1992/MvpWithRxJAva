package com.tubban.myrxmvpwithcache.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by liu_yao on 2016/12/7.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {



    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class  MyHolder extends  RecyclerView.ViewHolder{

        public MyHolder(View itemView) {
            super(itemView);
        }
    }
}
