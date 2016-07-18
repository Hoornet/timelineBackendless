package com.sebast.timelinebackendless.mainprogram.addpost.view;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.sebast.timelinebackendless.R;
import com.sebast.timelinebackendless.mainprogram.addpost.AddPostFragment;

import butterknife.BindView;

/**
 * Created by Toped18 on 7/18/2016.
 */
public class AddPostViewImpl extends AddPostView {

    @BindView(R.id.edit_text_title_post)
    EditText titlePost;

    @BindView(R.id.edit_text_detail_post)
    EditText detailPost;

    @BindView(R.id.edit_text_user_id)
    EditText userId;

    public AddPostViewImpl(AddPostFragment fragment) {
        super(fragment);
    }

    @Override
    public void setData(int type, Bundle data) {

    }

    @Override
    public void onError(int type, Object... data) {

    }

    @Override
    public int getFragmentLayout() {
        return R.layout.fragment_add_post;
    }

    @Override
    public void initView(View view) {

    }
}
