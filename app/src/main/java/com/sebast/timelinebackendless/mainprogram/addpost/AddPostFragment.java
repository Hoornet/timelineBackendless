package com.sebast.timelinebackendless.mainprogram.addpost;

import android.content.Context;
import android.support.v4.app.Fragment;

import com.sebast.timelinebackendless.base.mvp.fragment.BaseFragment;
import com.sebast.timelinebackendless.mainprogram.addpost.presenter.AddPostPresenter;
import com.sebast.timelinebackendless.mainprogram.addpost.presenter.AddPostPresenterImpl;
import com.sebast.timelinebackendless.mainprogram.addpost.view.AddPostView;
import com.sebast.timelinebackendless.mainprogram.addpost.view.AddPostViewImpl;

/**
 * Created by Toped18 on 7/18/2016.
 */
public class AddPostFragment extends BaseFragment<AddPostPresenter, AddPostView> {
    public static final String TAG = "SEBAST";

    @Override
    protected void initialListener(Context context) {

    }

    @Override
    protected void initialPresenter() {
        fragmentPresenter = new AddPostPresenterImpl(this);
    }

    @Override
    protected void initialView() {
        fragmentView = new AddPostViewImpl(this);
    }

    @Override
    protected boolean isRetainInstance() {
        return false;
    }

    public static AddPostFragment createInstance() {
        AddPostFragment addPostFragment = new AddPostFragment();
        return addPostFragment;
    }
}
