package com.sebast.timelinebackendless.base.mvp.activity.view;

import android.support.v4.app.Fragment;

import com.sebast.timelinebackendless.base.mvp.activity.presenter.BaseActivityPresenter;

/**
 * Created by Toped18 on 7/17/2016.
 */
public interface BaseActivityView {

    int getLayoutId();

    void initView();

    void inflateFragment(Fragment fragment, boolean isAddtoBackStack, String tag);

}
