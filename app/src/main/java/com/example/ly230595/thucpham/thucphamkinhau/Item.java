package com.example.ly230595.thucpham.thucphamkinhau;

import android.graphics.Bitmap;

/**
 * Created by PRINCE TOAD on 25/11/2015.
 */
public class Item {
    Bitmap image;
    String title;

    public Item(Bitmap image, String title) {
        super();
        this.image = image;
        this.title = title;
    }
    public Bitmap getImage() {
        return image;
    }
    public void setImage(Bitmap image) {
        this.image = image;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
