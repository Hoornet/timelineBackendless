package com.sebast.timelinebackendless.base.recyclerview.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.sebast.timelinebackendless.R;


import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Toped18 on 7/17/2016.
 */
public abstract class BaseViewHolder<A extends BaseAdapter> extends RecyclerView.ViewHolder {

    protected A adapter;


    public BaseViewHolder(View itemView, A adapter) {
        super(itemView);
        this.adapter = adapter;
        ButterKnife.bind(this, itemView);
    }

    public abstract int getItemViewLayout();

}
