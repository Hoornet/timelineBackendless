package com.sebast.timelinebackendless.mainprogram.mainactivity.view;

import android.widget.FrameLayout;

import com.sebast.timelinebackendless.R;
import com.sebast.timelinebackendless.mainprogram.mainactivity.MainActivity;

import butterknife.BindView;

/**
 * Created by Toped18 on 7/17/2016.
 */
public class MainActivityViewImpl extends com.sebast.timelinebackendless.mainprogram.mainactivity.view.MainActivityView {

    @BindView(R.id.fragment_container)
    FrameLayout fragmentContainer;

    public MainActivityViewImpl(MainActivity mainActivity){
        super(mainActivity);

    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {

    }


}
