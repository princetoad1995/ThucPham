package com.example.ly230595.thucpham.VideoManage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by PRINCE TOAD on 24/11/2015.
 */
public class DownloadImg extends AsyncTask<String, Void, Bitmap> {
    private LayerAdapter.ViewHolder viewH;

    public DownloadImg(LayerAdapter.ViewHolder vh) {
        viewH = vh;
    }

    @Override
    protected Bitmap doInBackground(String... params) {
        Bitmap myBitmap = null;
        String link = params[0];
        try {

            URL url = new URL(link);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setDoInput(true);
            conn.connect();
            int statusconnect = conn.getResponseCode();
            if (statusconnect == 200) {
                InputStream is = conn.getInputStream();
                myBitmap = BitmapFactory.decodeStream(is);
            }
        } catch (Exception ex) {
            Log.i("Loi tai anh", ex.toString());
        }

        return myBitmap;
    }

    @Override
    protected void onPostExecute(Bitmap result) {

        viewH.imgAvatar.setImageBitmap(result);
    }
}
