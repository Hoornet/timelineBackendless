package com.sebast.timelinebackendless.mainprogram.recyclerview.model;

import java.util.Date;

/**
 * Created by Toped18 on 7/17/2016.
 */
public class Post {
    String imageUrl;
    String title;
    String detail;
    String user;
    String timeStamp;

    public Post(){}

    public Post(String title, String detail, String user){
        this.title = title;
        this.detail = detail;
        this.user = user;
        timeStamp = String.valueOf((new Date().getTime()) / 1000);
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
