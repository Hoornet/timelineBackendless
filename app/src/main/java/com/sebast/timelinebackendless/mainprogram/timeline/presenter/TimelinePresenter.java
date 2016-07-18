package com.sebast.timelinebackendless.mainprogram.timeline.presenter;

import com.sebast.timelinebackendless.base.mvp.fragment.presenter.BaseFragmentPresenterImpl;
import com.sebast.timelinebackendless.mainprogram.recyclerview.TimelineAdapter;
import com.sebast.timelinebackendless.mainprogram.timeline.TimelineFragment;

/**
 * Created by Toped18 on 7/17/2016.
 */
public abstract class TimelinePresenter extends BaseFragmentPresenterImpl<TimelineFragment> {

    public TimelinePresenter(TimelineFragment fragment) {
        super(fragment);
    }

    public abstract TimelineAdapter getAdapter();

    public abstract void getAllPost();

    public abstract void getUserPost(String user);

    public abstract void clearPost();
}
