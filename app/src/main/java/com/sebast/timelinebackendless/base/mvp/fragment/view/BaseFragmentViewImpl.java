package com.sebast.timelinebackendless.base.mvp.fragment.view;

import com.sebast.timelinebackendless.base.mvp.fragment.BaseFragment;

/**
 * Created by Toped18 on 7/17/2016.
 */
public abstract class BaseFragmentViewImpl <F extends BaseFragment> implements BaseFragmentView {

    protected F fragment;

    public BaseFragmentViewImpl(F fragment){
        if (fragment != null){
            this.fragment = fragment;
        }
    }

}
