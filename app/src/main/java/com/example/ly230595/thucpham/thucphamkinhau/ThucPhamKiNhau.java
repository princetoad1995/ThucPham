package com.example.ly230595.thucpham.thucphamkinhau;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import com.example.ly230595.thucpham.R;

import java.util.ArrayList;

public class ThucPhamKiNhau extends Activity {

    GridView grid;
    ArrayList<Item> gridArray = new ArrayList<Item>();
    CustomGrid customGrid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thuc_pham_ki_nhau);

        Bitmap tho = BitmapFactory.decodeResource(this.getResources(), R.drawable.kinhau);
        Bitmap anh1 = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh1);
        Bitmap anh2 = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh2);
        Bitmap anh3 = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh3);
        Bitmap anh4 = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh4);
        Bitmap anh5 = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh5);
        Bitmap anh6 = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh6);
        Bitmap anh7 = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh7);
        Bitmap anh8 = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh8);
        Bitmap anh9 = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh9);
        Bitmap anh10 = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh10);
        Bitmap anh11 = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh11);
        Bitmap anh12 = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh12);
        Bitmap anh13 = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh13);
        Bitmap anh14 = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh14);
        Bitmap anh15 = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh15);
        Bitmap anh16 = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh16);
        Bitmap anh17 = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh17);
        Bitmap anh18 = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh18);
        Bitmap anh19 = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh19);
        Bitmap anh20 = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh20);
        Bitmap anh21 = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh21);
        Bitmap anh22 = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh22);


        gridArray.add(new Item(tho,"Bài thơ về các món kỵ nhau"));
        gridArray.add(new Item(anh1,"Mật ong và bột sắn dây"));
        gridArray.add(new Item(anh8,"Mật ong và sữa đậu nành hoặc đậu non"));
        gridArray.add(new Item(anh2,"Trứng ngỗng và tỏi"));
        gridArray.add(new Item(anh9,"Ba ba và rau dền"));
        gridArray.add(new Item(anh3,"Thịt chó và nước trà"));
        gridArray.add(new Item(anh10,"Gan và giá đỗ"));
        gridArray.add(new Item(anh4,"Ốc, trai, hến, cua + cà chua, ớt, cam, chanh"));
        gridArray.add(new Item(anh11,"Hải sản và hoa quả"));
        gridArray.add(new Item(anh12,"Khoai lang và quả hồng"));
        gridArray.add(new Item(anh5,"Thịt gà và rau kinh giới"));
        gridArray.add(new Item(anh13,"Cà chua và khoai tây"));
        gridArray.add(new Item(anh6,"Sữa và sôcôla"));
        gridArray.add(new Item(anh14,"Đường hóa học và lòng trắng trứng"));
        gridArray.add(new Item(anh7,"Khoai và chuối"));
        gridArray.add(new Item(anh15,"Hành tây và mật ong"));
        gridArray.add(new Item(anh16,"Đậu phụ và rau chân vịt"));
        gridArray.add(new Item(anh17,"Dưa chuột và cà chua"));
        gridArray.add(new Item(anh18,"Củ cải trắng và các loại lê táo nho"));
        gridArray.add(new Item(anh19,"Cá chép và thịt cầy"));
        gridArray.add(new Item(anh20,"Nhân sâm - củ cải và hải sản"));
        gridArray.add(new Item(anh21,"Rượu và thịt bò"));
        gridArray.add(new Item(anh22,"Rau dền và quả lê"));

        grid = (GridView) findViewById(R.id.gridView1);
        customGrid = new CustomGrid(this, R.layout.grid_single, gridArray);
        grid.setAdapter(customGrid);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView textView = (TextView) findViewById(R.id.textView);
//                String text = web[position] + " " + gridArray.get(position).getTitle().toString();
                String text = gridArray.get(position).getTitle().toString();
                Bitmap anh = gridArray.get(position).getImage();
                Intent intent = new Intent(ThucPhamKiNhau.this, Body.class);
                intent.putExtra("select_item", text);
//                intent.putExtra("select_img", anh);
                startActivity(intent);
            }
        });

    }
}
