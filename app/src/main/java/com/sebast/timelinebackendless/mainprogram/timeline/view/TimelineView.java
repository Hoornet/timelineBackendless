package com.sebast.timelinebackendless.mainprogram.timeline.view;

import com.sebast.timelinebackendless.base.mvp.fragment.view.BaseFragmentViewImpl;
import com.sebast.timelinebackendless.mainprogram.timeline.TimelineFragment;

/**
 * Created by Toped18 on 7/17/2016.
 */
public abstract class TimelineView extends BaseFragmentViewImpl<TimelineFragment> {

    public static final int GET_DATA = 1;

    public TimelineView(TimelineFragment fragment) {
        super(fragment);
    }
}
