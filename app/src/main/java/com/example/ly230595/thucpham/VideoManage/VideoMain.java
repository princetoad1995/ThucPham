package com.example.ly230595.thucpham.VideoManage;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.ly230595.thucpham.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

/**
 * Created by PRINCE TOAD on 16/11/2015.
 */
public class VideoMain extends Activity {
    ArrayList<video> list = new ArrayList<video>();
    ListView Video;

    class docJSON extends AsyncTask<String, Integer, String> {

        @Override
        protected String doInBackground(String... params) {
            return docNoiDung_Tu_URL(params[0]);
        }

        @Override
        protected void onPostExecute(String s) {
            ArrayList<video> arrtieude = new ArrayList<video>();
            Log.e("Gia tri tra ve", s);
            try {
                JSONArray mang = new JSONArray(s);
//                video v = new video("abc", mang.getJSONObject(0).getString("duonglink"));
                for(int i = 0; i < mang.length(); i++){
                    JSONObject tieude = mang.getJSONObject(i);
                    String title = tieude.getString("tieude");
                    String link = tieude.getString("duonglink");
                    video v = new video(title,link);
                    arrtieude.add(v);
                }
                list = arrtieude;

                LayerAdapter adapter = new LayerAdapter(VideoMain.this,R.layout.item,list);
                Video.setAdapter(adapter);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            // Toast.makeText(MainActivity.this, s, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.videomain);
//        them();
        new docJSON().execute("http://teamt3l-001-site1.1tempurl.com/json.php");

        Video = (ListView)findViewById(R.id.VideoLisView);
//
        Video.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(VideoMain.this, PlayerActivity.class);
                video current = list.get(position);
//                Toast.makeText(MainActivity.this, list.get(position).getTitle(), Toast.LENGTH_SHORT).show();
                String a = current.getUrl();
                intent.putExtra("url", a);
                startActivity(intent);
            }
        });

    }



    private static String docNoiDung_Tu_URL(String theUrl)
    {
        StringBuilder content = new StringBuilder();

        // many of these calls can throw exceptions, so i've just
        // wrapped them all in one try/catch statement.
        try
        {
            // create a url object
            URL url = new URL(theUrl);

            // create a urlconnection object
            URLConnection urlConnection = url.openConnection();

            // wrap the urlconnection in a bufferedreader
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

            String line;

            // read from the urlconnection via the bufferedreader
            while ((line = bufferedReader.readLine()) != null)
            {
                content.append(line + "\n");
            }
            bufferedReader.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return content.toString();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
