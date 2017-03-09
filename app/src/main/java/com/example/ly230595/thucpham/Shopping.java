package com.example.ly230595.thucpham;

/**
 * Created by ly230595 on 04/11/2015.
 */

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.ly230595.thucpham.DinhDuong.DinhDuong;
import com.example.ly230595.thucpham.VideoManage.VideoMain;
import com.example.ly230595.thucpham.thucphamkinhau.ThucPhamKiNhau;

import java.util.ArrayList;


public class Shopping extends ActionBarActivity {
    private DrawerLayout mDrawerLayout;
    private ListView mleftList;
    private ActionBarDrawerToggle mDrawerToggle;
    private ArrayList arrLeft;
    private WebView webView;
    private Toolbar toolbar;
    private ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
// Add du lieu vao array
        initArrayForListViewDrawer();
//        progressDialog = ProgressDialog.show(Shopping.this, "", "Loading...");
//
//        new Thread() {
//
//            public void run() {
//
//                try{
//
//                    sleep(3000);
//
//                } catch (Exception e) {
//
//                    Log.e("tag", e.getMessage());
//
//                }
//
//// dismiss the progress dialog
//
//                progressDialog.dismiss();
//
//            }
//
//        }.start();
        webView = (WebView) findViewById(R.id.webkit);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://standardfood.vn/");
//        webView.setWebViewClient(new myWebClient());
        // Link den code
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mleftList = (ListView) findViewById(R.id.left_drawer);
        View header = getLayoutInflater().inflate(R.layout.header, null);
        View footer=getLayoutInflater().inflate(R.layout.layout_item,null);
        mleftList.addFooterView(footer);
        mleftList.addHeaderView(header);
// bat su kien click cua list ben trai
        mleftList.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int pos,
                                    long arg3) {
                // TODO Auto-generated method stub

                switch (pos) {
                    case 1:

                        webView.loadUrl("http://standardfood.vn/");
                        Toast.makeText(Shopping.this, "Trang chủ",
                                Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        Intent intent2 = new Intent(Shopping.this, DinhDuong.class);
                        startActivity(intent2);
                        Toast.makeText(Shopping.this, "Chế độ dinh dưỡng", Toast.LENGTH_LONG).show();
                        break;
                    case 3:
                        Intent intent3 = new Intent(Shopping.this, ThucPhamKiNhau.class);
                        startActivity(intent3);
                        Toast.makeText(Shopping.this, "Thực phẩm kị nhau", Toast.LENGTH_LONG).show();
                        break;
                    case 4:
                        Intent intent = new Intent(Shopping.this, VideoMain.class);
                        startActivity(intent);
                        Toast.makeText(Shopping.this, "Video dạy nấu ăn", Toast.LENGTH_LONG).show();
                        break;

                    default:
                        break;
                }

                mleftList.setItemChecked(pos, true);
                // Dong Drawer khi click xong
                mDrawerLayout.closeDrawer(mleftList);

            }
        });

        // Set Adapter cho list ben trai
        ItemAdapter adapterLeft = new ItemAdapter(this, arrLeft);
        mleftList.setAdapter(adapterLeft);

        // Set Adapter cho list ben phai


        mDrawerToggle = new ActionBarDrawerToggle(this, // Activity chua Actionbar
                mDrawerLayout,toolbar, // DrawerLayout de lien ket den ActionBar
                // Hinh anh Drawer
                R.string.drawer_open, // Chuoi mo ta hanh dong mo Drawer "open drawer"
                R.string.drawer_close // Chuoi mo ta hanh dong dong Drawer "close drawer"

        ) {
            public void onDrawerClosed(View drawerView) {
                // Code here will be triggered once the drawer closes as we dont want anything to happen so we leave this blank
                super.onDrawerClosed(drawerView);
            }

            public void onDrawerOpened(View drawerView) {
                // Code here will be triggered once the drawer open as we dont want anything to happen so we leave this blank
                super.onDrawerOpened(drawerView);
            }
        };


        mDrawerLayout.setDrawerListener(mDrawerToggle);
        // Pressing the app icon in the action bar will navigate to the parent activity.
    }

    // Them du lieu vao array
    private void initArrayForListViewDrawer() {
        // TODO Auto-generated method stub
        arrLeft = new ArrayList();

        ItemNavigation ItemNavigation1 = new ItemNavigation(
                R.drawable.ic_action_shopping_cart, "Trang chủ");
        arrLeft.add(ItemNavigation1);
        ItemNavigation ItemNavigation2 = new ItemNavigation(
                R.drawable.ic_action_favorite, "Dinh dưỡng");
        arrLeft.add(ItemNavigation2);
        ItemNavigation ItemNavigation3 = new ItemNavigation(
                R.drawable.ic_action_report_problem, "Thức ăn kị nhau");
        arrLeft.add(ItemNavigation3);
        ItemNavigation ItemNavigation4 = new ItemNavigation(
                R.drawable.ic_av_video_collection, "Video nấu ăn");
        arrLeft.add(ItemNavigation4);

    }

    /**
     * Khi su dung ActionBarDrawerToggle, ban phai goi toi 2 phuong thuc
     * onPostCreate() va onConfigurationChanged()...
     */
    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // The action bar home/up action should open or close the drawer.
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }



    /*
     * Khi goi invalidateOptionsMenu() thi chung ta phai override lai phuong
     * thuc nay
     */
    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        // Neu drawer ben trai dang mo thi an cac item cua actionbar

        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

// Gan cac icon vào Actionbar
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }



}
