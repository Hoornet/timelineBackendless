package com.sebast.timelinebackendless.mainprogram.mainactivity;

import android.support.v4.app.FragmentActivity;

import com.sebast.timelinebackendless.base.mvp.activity.BaseActivity;
import com.sebast.timelinebackendless.mainprogram.mainactivity.presenter.MainActivityPresenter;
import com.sebast.timelinebackendless.mainprogram.mainactivity.presenter.MainActivityPresenterImpl;
import com.sebast.timelinebackendless.mainprogram.mainactivity.view.MainActivityView;
import com.sebast.timelinebackendless.mainprogram.mainactivity.view.MainActivityViewImpl;

public class MainActivity
        extends BaseActivity<MainActivityPresenter, MainActivityView> {

    @Override
    protected void initialView() {
        setActivityView(new MainActivityViewImpl(this));
    }

    @Override
    protected void initialPresenter() {
        setActivityPresenter(new MainActivityPresenterImpl(this));
    }


    public void addNewPost() {
        getActivityPresenter().startAddFragment();
    }
}
