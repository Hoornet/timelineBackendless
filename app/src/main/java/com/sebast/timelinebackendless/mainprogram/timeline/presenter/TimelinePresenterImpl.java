package com.sebast.timelinebackendless.mainprogram.timeline.presenter;

import android.content.Context;
import android.os.Bundle;

import com.sebast.timelinebackendless.mainprogram.backendless.BackendlessInteractor;
import com.sebast.timelinebackendless.mainprogram.backendless.BackendlessInteractorImpl;
import com.sebast.timelinebackendless.mainprogram.recyclerview.TimelineAdapter;
import com.sebast.timelinebackendless.mainprogram.recyclerview.model.Post;
import com.sebast.timelinebackendless.mainprogram.timeline.TimelineFragment;
import com.sebast.timelinebackendless.mainprogram.timeline.view.TimelineView;

import java.util.List;

/**
 * Created by Toped18 on 7/17/2016.
 */
public class TimelinePresenterImpl extends TimelinePresenter {

    TimelineAdapter adapter;
    BackendlessInteractor backendlessInteractor;
    BackendlessInteractor.InteractorListener listener;

    public TimelinePresenterImpl(TimelineFragment fragment) {
        super(fragment);
        adapter = new TimelineAdapter();
        backendlessInteractor = new BackendlessInteractorImpl(fragment.getActivity());
    }

    @Override
    public TimelineAdapter getAdapter() {
        return adapter;
    }

    @Override
    public void fetchArguments(Bundle arguments) {

    }

    @Override
    public void initDataInstance(Context context) {
        getAllPost();
    }

    @Override
    public void getAllPost() {
        listener = getListener();
        backendlessInteractor.getAllPost(listener);
    }

    @Override
    public void getUserPost(String user){
        listener = getListener();
        backendlessInteractor.getUserPost(listener, user);
    }

    @Override
    public void clearPost() {
        adapter.clearData();
    }

    private BackendlessInteractor.InteractorListener getListener() {
        return new BackendlessInteractor.InteractorListener() {
            @Override
            public void onSuccessGetData(List<Post> postList) {
                adapter.addData(postList);
            }

            @Override
            public void onFailureGetData(String message) {
                fragment.getFragmentView().onError(TimelineView.GET_DATA, message);
            }
        };
    }

    @Override
    public void getDataInstance(Bundle savedInstanceState) {

    }

    @Override
    public void saveDataInstance(Bundle savedInstanceState) {

    }
}
