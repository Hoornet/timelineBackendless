package com.sebast.timelinebackendless.mainprogram.addpost.presenter;

import com.sebast.timelinebackendless.base.mvp.fragment.presenter.BaseFragmentPresenterImpl;
import com.sebast.timelinebackendless.mainprogram.addpost.AddPostFragment;

/**
 * Created by Toped18 on 7/18/2016.
 */
public abstract class AddPostPresenter extends BaseFragmentPresenterImpl<AddPostFragment>{
    public AddPostPresenter(AddPostFragment fragment) {
        super(fragment);
    }
}
