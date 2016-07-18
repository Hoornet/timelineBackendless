package com.sebast.timelinebackendless.base.mvp.activity.presenter;

import com.sebast.timelinebackendless.base.mvp.activity.BaseActivity;

/**
 * Created by Toped18 on 7/17/2016.
 */
public abstract class BaseActivityPresenterImpl <A extends BaseActivity>
        implements BaseActivityPresenter {

    protected A activity;

    public BaseActivityPresenterImpl(A activity){
        if(activity != null){
            this.activity = activity;
        }
    }

}
