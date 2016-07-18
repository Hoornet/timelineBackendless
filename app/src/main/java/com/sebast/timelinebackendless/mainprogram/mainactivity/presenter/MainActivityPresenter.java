package com.sebast.timelinebackendless.mainprogram.mainactivity.presenter;

import com.sebast.timelinebackendless.base.mvp.activity.presenter.BaseActivityPresenterImpl;
import com.sebast.timelinebackendless.mainprogram.mainactivity.MainActivity;

/**
 * Created by Toped18 on 7/17/2016.
 */
public abstract class MainActivityPresenter extends BaseActivityPresenterImpl<MainActivity> {

    public MainActivityPresenter(MainActivity activity) {
        super(activity);
    }

    public abstract void startAddFragment();
}
