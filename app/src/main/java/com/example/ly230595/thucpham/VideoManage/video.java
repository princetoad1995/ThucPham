package com.example.ly230595.thucpham.VideoManage;

/**
 * Created by nguen on 05/11/2015.
 */
public class video {
    private String title;
    private String url;

    public video(String title, String url) {
        this.title = title;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return title;
    }
}
