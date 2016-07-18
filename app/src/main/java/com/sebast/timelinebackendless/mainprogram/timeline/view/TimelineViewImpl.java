package com.sebast.timelinebackendless.mainprogram.timeline.view;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.sebast.timelinebackendless.R;
import com.sebast.timelinebackendless.mainprogram.mainactivity.MainActivity;
import com.sebast.timelinebackendless.mainprogram.timeline.TimelineFragment;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by Toped18 on 7/17/2016.
 */
public class TimelineViewImpl extends TimelineView {

    @BindView(R.id.edit_filter)
    EditText editFilter;

    @BindView(R.id.recyclerview_timeline)
    RecyclerView timeline;

    @OnClick(R.id.button_filter)
    void onClickFilter(){
        fragment.getFragmentPresenter().clearPost();
        if(!editFilter.getText().equals("")){
            fragment.getFragmentPresenter().getUserPost(editFilter.getText().toString());
        } else {
            fragment.getFragmentPresenter().getAllPost();
        }
    }

    @OnClick(R.id.fab_new_post)
    void onClickAdd(){
        if(fragment.getActivity() instanceof MainActivity) {
            ((MainActivity) fragment.getActivity()).addNewPost();
        }
    }

    public TimelineViewImpl(TimelineFragment fragment) {
        super(fragment);
    }

    @Override
    public void setData(int type, Bundle data) {

    }

    @Override
    public void onError(int type, Object... data) {
        switch (type){
            case GET_DATA:
                Toast.makeText(fragment.getActivity(),(String)data[0],Toast.LENGTH_SHORT).show();
                break;
        }

    }

    @Override
    public int getFragmentLayout() {
        return R.layout.fragment_timeline;
    }

    @Override
    public void initView(View view) {
        timeline.setAdapter(fragment.getFragmentPresenter().getAdapter());
        timeline.setLayoutManager(new LinearLayoutManager(fragment.getActivity()));
    }

}
