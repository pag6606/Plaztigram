package com.consultoresag.plaztigram.model;

/**
 * Created by paul on 21/11/16.
 */

public class Picture {
    private String picture;
    private String username;
    private String time;
    private String likes= "0" ;


    public Picture(String picture, String username,String time, String likes) {
        this.likes = likes;
        this.picture = picture;
        this.username = username;
        this.time = time;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }
}
