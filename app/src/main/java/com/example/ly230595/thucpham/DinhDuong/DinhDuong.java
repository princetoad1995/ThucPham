package com.example.ly230595.thucpham.DinhDuong;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.ly230595.thucpham.R;

public class DinhDuong extends Activity {
    private Button btnTreEm, btnphunu, btnngbenh, btncongdung;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinh_duong);

        btnTreEm = (Button) findViewById(R.id.btntreem);
        btnTreEm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DinhDuong.this, TreEm.class);
                startActivity(intent);
            }
        });

        btnphunu = (Button) findViewById(R.id.btnphunu);
        btnphunu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DinhDuong.this, BaBau.class);
                startActivity(intent);
            }
        });

        btnngbenh = (Button) findViewById(R.id.btnngbenh);
        btnngbenh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DinhDuong.this, NgBenh.class);
                startActivity(intent);
            }
        });

        btncongdung = (Button) findViewById(R.id.btnthucan);
        btncongdung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DinhDuong.this, CongDung.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dinh_duong, menu);
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
