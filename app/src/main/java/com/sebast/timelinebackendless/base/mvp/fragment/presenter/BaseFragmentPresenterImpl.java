package com.sebast.timelinebackendless.base.mvp.fragment.presenter;

import com.sebast.timelinebackendless.base.mvp.fragment.BaseFragment;

/**
 * Created by Toped18 on 7/17/2016.
 */
public abstract class BaseFragmentPresenterImpl <F extends BaseFragment>
    implements BaseFragmentPresenter{

    protected F fragment;

    public BaseFragmentPresenterImpl(F fragment){
        if (fragment != null){
            this.fragment = fragment;
        }
    }

}
