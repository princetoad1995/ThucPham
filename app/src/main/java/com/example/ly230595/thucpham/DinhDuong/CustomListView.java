package com.example.ly230595.thucpham.DinhDuong;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ly230595.thucpham.R;

import java.util.ArrayList;

/**
 * Created by PRINCE TOAD on 26/11/2015.
 */
public class CustomListView extends ArrayAdapter<ItemDD> {
    private Context context;
    int layoutResourceId;
    ArrayList<ItemDD> data = new ArrayList<ItemDD>();

    public CustomListView(Context context, int resource, ArrayList<ItemDD> data) {
        super(context, resource, data);
        this.layoutResourceId =  resource;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        RecordHolder holder = null;

        if(row == null){
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            holder = new RecordHolder();
            holder.txtTitle = (TextView) row.findViewById(R.id.grid_text);
            holder.imageItem = (ImageView) row.findViewById(R.id.grid_image);
            row.setTag(holder);
        }
        else {
        holder = (RecordHolder) row.getTag();
    }

    ItemDD item = data.get(position);
    holder.txtTitle.setText(item.getTitle());
    holder.imageItem.setImageBitmap(item.getImage());
    return row;
    }

    static class RecordHolder {
        TextView txtTitle;
        ImageView imageItem;

    }
}
