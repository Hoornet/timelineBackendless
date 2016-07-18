package com.sebast.timelinebackendless.base.mvp.activity.view;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.sebast.timelinebackendless.R;
import com.sebast.timelinebackendless.base.mvp.activity.BaseActivity;

/**
 * Created by Toped18 on 7/17/2016.
 */
public abstract class BaseActivityViewImpl <A extends BaseActivity>
        implements BaseActivityView {

    protected A activity;
    protected FragmentManager fragmentManager;

    public BaseActivityViewImpl(A activity){
        if(activity != null){
            this.activity = activity;
        }
        fragmentManager = activity.getSupportFragmentManager();

    }

    @Override
    public void inflateFragment(Fragment fragment, boolean isAddtoBackStack, String tag) {
        if (fragmentManager.findFragmentByTag(tag) == null) {
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment, tag);
            if(isAddtoBackStack)
                fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

}
