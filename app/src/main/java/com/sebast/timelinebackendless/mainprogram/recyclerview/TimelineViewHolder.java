package com.sebast.timelinebackendless.mainprogram.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.sebast.timelinebackendless.R;
import com.sebast.timelinebackendless.mainprogram.recyclerview.model.Post;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Toped18 on 7/17/2016.
 */
public class TimelineViewHolder extends RecyclerView.ViewHolder{

    TimelineAdapter adapter;

    @BindView(R.id.post_user)
    TextView postUser;

    @BindView(R.id.post_image)
    ImageView postImage;

    @BindView(R.id.post_title)
    TextView postTitle;

    @BindView(R.id.post_detail)
    TextView postDetail;


    public TimelineViewHolder(View itemView, TimelineAdapter adapter) {
        super(itemView);
        ButterKnife.bind(this,itemView);
        this.adapter = adapter;
    }


    public void setPost(Post post){
        if(post != null) {
            postUser.setText(post.getUser());
            postTitle.setText(post.getTitle());
            postDetail.setText(post.getDetail());
        }
    }


    public static int getItemViewLayout() {
        return R.layout.item_post_timeline;
    }
}
