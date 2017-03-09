package com.example.ly230595.thucpham.VideoManage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ly230595.thucpham.R;

import java.util.ArrayList;

/**
 * Created by PRINCE TOAD on 24/11/2015.
 */
public class LayerAdapter extends ArrayAdapter<video> {
    Context context;// tao doi tuong Context
    ArrayList<video> arrItems = new ArrayList<video>();

    // ke thua lai ham tao 3 tham so nay
    public LayerAdapter(Context context, int customListview,
                        ArrayList<video> objects) {
        super(context, customListview, objects);
        this.context = context;
        arrItems = objects;
    }

    // tao lop ViewHolder co cac thuoc tinh tren giao dien custom
    public static class ViewHolder {
        TextView tvTitle, tvDate;
        ImageView imgAvatar;
        Bitmap bm;
        String link;
    }

    // override lai ham getView de xay dung du lieu cho 1 dong
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;
        ViewHolder vh;
        if (rowView == null) {// lan dau bat len thi rowview se null
            LayoutInflater inflate = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflate.inflate(R.layout.item, null);
            vh = new ViewHolder();
            vh.tvTitle = (TextView) rowView.findViewById(R.id.title);
//            vh.tvDate = (TextView) rowView.findViewById(R.id.date);
            vh.imgAvatar = (ImageView) rowView.findViewById(R.id.thumb);

            rowView.setTag(vh);// set du lieu tu viewHolder cho rowview
        } else {
            vh = (ViewHolder) convertView.getTag();
        }
        video item = arrItems.get(position);

//        Picasso.with(context).load(url).into();
        vh.tvTitle.setText(item.getTitle());
//        vh.tvDate.setText(item.getDate());
        vh.link = "http://img.youtube.com/vi/"+item.getUrl()+"/default.jpg"; // ??y l? c?ch l?y ?nh icon cho video ??. Sau ?? hi?n th? n? v?o view b?ng Picasso
//        vh.link = item.getUrl();
        new DownloadImg(vh).execute(vh.link);

        return rowView;
    }
}
