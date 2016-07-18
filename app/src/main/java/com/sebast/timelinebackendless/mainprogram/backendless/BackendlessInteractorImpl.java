package com.sebast.timelinebackendless.mainprogram.backendless;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;

import com.backendless.Backendless;
import com.backendless.BackendlessCollection;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;
import com.backendless.persistence.BackendlessDataQuery;
import com.sebast.timelinebackendless.mainprogram.recyclerview.model.Post;

import java.util.List;

/**
 * Created by Toped18 on 7/18/2016.
 */
public class BackendlessInteractorImpl implements BackendlessInteractor{

    public BackendlessInteractorImpl(Context context){
        Backendless.initApp(context, APP_ID, SECRET_KEY, APP_VERSION);
    }

    @Override
    public void savePost(Post post) {
        Backendless.Persistence.save(post, new AsyncCallback<Post>()
        {
            @Override
            public void handleResponse( Post result)
            {
                Log.i( TAG, "Got new post from " + result.getTitle() + result.getTitle());
            }

            @Override
            public void handleFault(BackendlessFault fault) {

            }
        });
    }

    @Override
    public void getAllPost(final InteractorListener listener) {
        getPost(listener, "");
    }

    @Override
    public void getUserPost(InteractorListener listener, String user) {
        String whereClause = queryUser(user);
        getPost(listener, whereClause);
    }

    @NonNull
    private String queryUser(String user) {
        return "user = '" + user + "'";
    }

    @Override
    public void getPost(final InteractorListener listener, String whereClause) {
        if(listener == null) return;
        BackendlessDataQuery dataQuery = new BackendlessDataQuery();
        dataQuery.setWhereClause(whereClause);
        Backendless.Persistence.of(Post.class).find(dataQuery, new AsyncCallback<BackendlessCollection<Post>>() {
            @Override
            public void handleResponse(BackendlessCollection<Post> timelineBackendlessCollection) {
                Log.d(TAG, timelineBackendlessCollection.getCurrentPage().get(0).toString());
                listener.onSuccessGetData(timelineBackendlessCollection.getCurrentPage());
            }

            @Override
            public void handleFault(BackendlessFault backendlessFault) {
                Log.e(TAG, backendlessFault.toString());
                listener.onFailureGetData(backendlessFault.toString());
            }
        });
    }

}
