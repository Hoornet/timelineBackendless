package com.sebast.timelinebackendless.base.mvp.fragment.view;

import android.os.Bundle;
import android.view.View;

import com.sebast.timelinebackendless.base.mvp.fragment.presenter.BaseFragmentPresenter;

/**
 * Created by Toped18 on 7/16/2016.
 */
public interface BaseFragmentView {
    String TAG = "SEBAST";

    void setData(int type, Bundle data);
    void onError(int type, Object... data);

    int getFragmentLayout();

    void initView(View view);
}
