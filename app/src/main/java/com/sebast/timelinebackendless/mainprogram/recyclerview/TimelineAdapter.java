package com.sebast.timelinebackendless.mainprogram.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sebast.timelinebackendless.mainprogram.recyclerview.model.Post;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Toped18 on 7/17/2016.
 */
public class TimelineAdapter extends RecyclerView.Adapter<TimelineViewHolder> {

    List<Post> postArrayList;

    public TimelineAdapter(){
        postArrayList = new ArrayList<>();
    }

    @Override
    public TimelineViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(TimelineViewHolder.getItemViewLayout(),parent,false);
        return new TimelineViewHolder(v,this);
    }

    @Override
    public void onBindViewHolder(TimelineViewHolder holder, int position) {
        holder.setPost(postArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return postArrayList.size();
    }

    public void addData(List<Post> postList) {
        postArrayList.addAll(postList);
        notifyDataSetChanged();
    }

    public void clearData() {
        postArrayList.clear();
    }
}
