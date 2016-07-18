package com.sebast.timelinebackendless.base.mvp.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.sebast.timelinebackendless.base.mvp.activity.presenter.BaseActivityPresenter;
import com.sebast.timelinebackendless.base.mvp.activity.view.BaseActivityView;

import butterknife.ButterKnife;

/**
 * Created by Toped18 on 7/17/2016.
 */
public abstract class BaseActivity
        <P extends BaseActivityPresenter, V extends BaseActivityView>
        extends AppCompatActivity {

    private P activityPresenter;
    private V activityView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initialPresenter();
        initialView();

        setContentView(getActivityView().getLayoutId());
        ButterKnife.bind(getActivityPresenter(), this);
        getActivityView().initView();

        getActivityPresenter().getData();
        getActivityPresenter().setFragment();

    }

    public P getActivityPresenter() {
        return activityPresenter;
    }

    public V getActivityView() {
        return activityView;
    }

    public void setActivityPresenter(P activityPresenter) {
        this.activityPresenter = activityPresenter;
    }

    public void setActivityView(V activityView) {
        this.activityView = activityView;
    }

    protected abstract void initialView();

    protected abstract void initialPresenter();

}
