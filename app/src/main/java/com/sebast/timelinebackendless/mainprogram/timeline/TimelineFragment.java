package com.sebast.timelinebackendless.mainprogram.timeline;

import android.content.Context;

import com.sebast.timelinebackendless.base.mvp.fragment.BaseFragment;
import com.sebast.timelinebackendless.mainprogram.timeline.presenter.TimelinePresenter;
import com.sebast.timelinebackendless.mainprogram.timeline.presenter.TimelinePresenterImpl;
import com.sebast.timelinebackendless.mainprogram.timeline.view.TimelineView;
import com.sebast.timelinebackendless.mainprogram.timeline.view.TimelineViewImpl;

/**
 * Created by Toped18 on 7/17/2016.
 */
public class TimelineFragment extends BaseFragment<TimelinePresenter, TimelineView> {

    public static String TAG = "TIMELINE";

    public static TimelineFragment createInstance(){
        return new TimelineFragment();
    }

    @Override
    protected void initialListener(Context context) {

    }

    @Override
    protected void initialPresenter() {
        setFragmentPresenter(new TimelinePresenterImpl(this));
    }

    @Override
    protected void initialView() {
        setFragmentView(new TimelineViewImpl(this));
    }

    @Override
    protected boolean isRetainInstance() {
        return false;
    }
}
