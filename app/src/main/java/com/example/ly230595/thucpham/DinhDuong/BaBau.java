package com.example.ly230595.thucpham.DinhDuong;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.ly230595.thucpham.R;

import java.util.ArrayList;

public class BaBau extends Activity {
    ListView list;
    ArrayList<ItemDD> listarr = new ArrayList<ItemDD>();
    CustomListView customList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ba_bau);

        Bitmap d1 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b1);
        Bitmap d2 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b2);
        Bitmap d3 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b3);
        Bitmap d4 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b4);
        Bitmap d5 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b5);
        Bitmap d6 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b6);
        Bitmap d7 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b7);
        Bitmap d8 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b8);
        Bitmap d9 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b9);
        Bitmap d10 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b10);
        Bitmap d11 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b11);
        Bitmap d12 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b12);
        Bitmap d13 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b13);
        Bitmap d14 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b14);
        Bitmap d15 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b15);
        Bitmap d16 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b16);
        Bitmap d17 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b17);
        Bitmap d18 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b18);
        Bitmap d19 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b19);
        Bitmap d20 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b20);

        listarr.add(new ItemDD(d1, "1/ 12 thực phẩm dồi dào sắt cho bà bầu"));
        listarr.add(new ItemDD(d2, "2/ 7 bước cho thai kỳ khỏe mạnh"));
        listarr.add(new ItemDD(d3, "3/ 9 thực phẩm tốt cho mẹ bầu"));
        listarr.add(new ItemDD(d4, "4/ Ăn thực phẩm đắng dễ bị sảy thai ?"));
        listarr.add(new ItemDD(d5, "5/ An toàn khi mẹ bầu ăn đậu phụ"));
        listarr.add(new ItemDD(d6, "6/ An toàn vệ sinh thực phẩm khi mang thai"));
        listarr.add(new ItemDD(d7, "7/ Bà bầu có nên ăn sữa chua thường xuyên ?"));
        listarr.add(new ItemDD(d8, "8/ Bưởi - Trái cây cực tốt với bà bầu"));
        listarr.add(new ItemDD(d9, "9/ Cà rốt - 'nhân sâm bình dân' cho mẹ bầu"));
        listarr.add(new ItemDD(d10, "10/ Cam sành giúp mẹ bầu phòng cảm cúm"));
        listarr.add(new ItemDD(d11, "11/ Cẩn trọng thực phẩm gây xảy thai"));
        listarr.add(new ItemDD(d12, "12/ Chế độ ăn theo từng quý thai kỳ"));
        listarr.add(new ItemDD(d13, "13/ Chọn thực phẩm an thai cho mẹ bầu"));
        listarr.add(new ItemDD(d14, "14/ Đã mang bầu thì đừng ăn chay"));
        listarr.add(new ItemDD(d15, "15/ Đậu bắp - Món đại bổ cho mẹ bầu"));
        listarr.add(new ItemDD(d16, "16/ Đúng sai về chuyện ăn uống khi bầu bí"));
        listarr.add(new ItemDD(d17, "17/ Lưu ý khi ăn thịt lúc mang thai"));
        listarr.add(new ItemDD(d18, "18/ Lưu ý khi bà bầu ăn ngao"));
        listarr.add(new ItemDD(d19, "19/ Mách bà bầu ăn hoa quả đúng cách"));
        listarr.add(new ItemDD(d20, "20/ Mẹ bầu đừng ăn khoai tây chiên nhé"));

        list = (ListView) findViewById(R.id.listView);
        customList = new CustomListView(this, R.layout.listview_single, listarr);
        list.setAdapter(customList);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String text = listarr.get(position).getTitle().toString();
                Intent intent = new Intent(BaBau.this, BodyBaBau.class);
                intent.putExtra("select_item", text);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ba_bau, menu);
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