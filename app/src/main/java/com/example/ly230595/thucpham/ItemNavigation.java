package com.example.ly230595.thucpham;

/**
 * Created by ly230595 on 14/11/2015.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ItemNavigation {
    public String itemName;
    public int itemIcon;

    public ItemNavigation (int itemIcon, String itemName){
        this.itemIcon = itemIcon;
        this.itemName = itemName;
    }
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemIcon() {
        return itemIcon;
    }

    public void setItemIcon(int itemIcon) {
        this.itemIcon = itemIcon;
    }

}