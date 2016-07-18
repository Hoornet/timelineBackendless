package com.sebast.timelinebackendless.mainprogram.backendless;

import com.sebast.timelinebackendless.mainprogram.recyclerview.model.Post;

import java.util.List;

/**
 * Created by Toped18 on 7/18/2016.
 */
public interface BackendlessInteractor {

    String TAG = "SEBAST";

    String APP_ID = "E81E58C4-EADB-1CFC-FFD9-08FF5824F200";
    String SECRET_KEY = "513652C0-9103-BBC7-FF17-892AD433B400";
    String APP_VERSION = "v1";

    interface InteractorListener{
        void onSuccessGetData(List<Post> postList);
        void onFailureGetData(String message);
    }

    void savePost(Post post);
    void getPost(final InteractorListener listener, String whereClause);
    void getAllPost(final InteractorListener listener);
    void getUserPost(InteractorListener listener, String user);
}
