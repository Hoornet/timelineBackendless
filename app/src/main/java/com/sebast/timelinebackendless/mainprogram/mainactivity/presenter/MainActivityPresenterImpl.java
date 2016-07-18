package com.sebast.timelinebackendless.mainprogram.mainactivity.presenter;

import com.sebast.timelinebackendless.mainprogram.addpost.AddPostFragment;
import com.sebast.timelinebackendless.mainprogram.mainactivity.MainActivity;
import com.sebast.timelinebackendless.mainprogram.timeline.TimelineFragment;

/**
 * Created by Toped18 on 7/17/2016.
 */
public class MainActivityPresenterImpl extends com.sebast.timelinebackendless.mainprogram.mainactivity.presenter.MainActivityPresenter {
    public MainActivityPresenterImpl(MainActivity activity) {
        super(activity);
    }

    @Override
    public void startAddFragment() {
        activity.getActivityView().inflateFragment(AddPostFragment.createInstance(), false, AddPostFragment.TAG);
    }

    @Override
    public void getData() {

    }

    @Override
    public void setFragment() {
        activity.getActivityView().inflateFragment(TimelineFragment.createInstance(), false, TimelineFragment.TAG);

    }
}
