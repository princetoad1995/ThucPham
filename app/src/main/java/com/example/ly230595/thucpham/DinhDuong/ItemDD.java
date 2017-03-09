package com.example.ly230595.thucpham.DinhDuong;

import android.graphics.Bitmap;

/**
 * Created by PRINCE TOAD on 26/11/2015.
 */
public class ItemDD {
    Bitmap image;
    String title;

    public ItemDD(Bitmap image, String title) {
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
