package com.sebast.timelinebackendless.base.mvp.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sebast.timelinebackendless.base.mvp.fragment.presenter.BaseFragmentPresenter;
import com.sebast.timelinebackendless.base.mvp.fragment.view.BaseFragmentView;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Toped18 on 7/16/2016.
 */
public abstract class BaseFragment
        <P extends BaseFragmentPresenter, V extends BaseFragmentView>
        extends Fragment{

    protected String TAG = "SEBAST";

    protected P fragmentPresenter;
    protected V fragmentView;
    protected Context context;
    protected Unbinder binder;

    @Override
    public void onAttach(Context context) {
        Log.d(TAG, getClass().getName() + " is Attaching... ");
        super.onAttach(context);
        this.context = context;
        initialListener(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d(TAG, getClass().getName() + " is Creating... ");
        super.onCreate(savedInstanceState);
        setRetainInstance(isRetainInstance());
        initialPresenter();
        initialView();
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(TAG, getClass().getName() + " is Creating View ...");
        return inflater.inflate(getFragmentView().getFragmentLayout(), container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binder = ButterKnife.bind(fragmentView, view);
        getFragmentView().initView(view);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getFragmentPresenter().fetchArguments(getArguments());
        getFragmentPresenter().initDataInstance(context);
        getFragmentPresenter().getDataInstance(savedInstanceState);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        getFragmentPresenter().saveDataInstance(outState);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binder.unbind();
    }

    protected abstract void initialListener(Context context);

    protected abstract void initialPresenter();

    protected abstract void initialView();

    protected abstract boolean isRetainInstance();

    public P getFragmentPresenter() {
        return fragmentPresenter;
    }

    public V getFragmentView() {
        return fragmentView;
    }

    public void setFragmentPresenter(P fragmentPresenter) {
        this.fragmentPresenter = fragmentPresenter;
    }

    public void setFragmentView(V fragmentView) {
        this.fragmentView = fragmentView;
    }
}
