package com.sebast.timelinebackendless.base.mvp.fragment.presenter;

import android.content.Context;
import android.os.Bundle;

import com.sebast.timelinebackendless.base.mvp.fragment.view.BaseFragmentView;

/**
 * Created by Toped18 on 7/16/2016.
 */
public interface BaseFragmentPresenter {
    String TAG = "SEBAST";

    void fetchArguments(Bundle arguments);

    void initDataInstance(Context context);

    void getDataInstance(Bundle savedInstanceState);

    void saveDataInstance(Bundle savedInstanceState);

}
