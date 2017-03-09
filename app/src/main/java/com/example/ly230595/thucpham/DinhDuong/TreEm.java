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

public class TreEm extends Activity {
    ListView list;
    ArrayList<ItemDD> listarr = new ArrayList<ItemDD>();
    CustomListView customList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tre_em);

        Bitmap d1 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d1);
        Bitmap d2 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d2);
        Bitmap d3 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d3);
        Bitmap d4 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d4);
        Bitmap d5 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d5);
        Bitmap d6 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d6);
        Bitmap d7 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d7);
        Bitmap d8 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d8);
        Bitmap d9 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d9);
        Bitmap d10 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d10);
        Bitmap d11 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d11);
        Bitmap d12 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d12);
        Bitmap d13 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d13);
        Bitmap d14 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d14);
        Bitmap d15 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d15);
        Bitmap d16 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d16);
        Bitmap d17 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d17);
        Bitmap d18 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d18);
        Bitmap d19 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d19);
        Bitmap d20 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d20);
        Bitmap d21 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d21);
        Bitmap d22 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d22);
        Bitmap d23 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d23);
        Bitmap d24 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d24);
        Bitmap d25 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d25);
        Bitmap d26 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d26);
        Bitmap d27 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d27);
        Bitmap d28 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d28);
        Bitmap d29 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d29);
        Bitmap d30 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d30);
        Bitmap d31 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d31);
        Bitmap d32 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d32);
        Bitmap d33 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d33);
        Bitmap d34 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d34);
        Bitmap d35 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d35);
        Bitmap d36 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d36);
        Bitmap d37 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d37);
        Bitmap d38 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d38);
        Bitmap d39 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d39);
        Bitmap d40 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d40);
        Bitmap d41 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d41);
        Bitmap d42 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d42);
        Bitmap d43 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d43);
        Bitmap d44 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d44);
        Bitmap d45 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d45);
        Bitmap d46 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d46);
        Bitmap d47 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d47);
        Bitmap d48 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d48);
//        Bitmap d49 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d49);
//        Bitmap d50 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d50);
//        Bitmap d51 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d51);
//        Bitmap d52 = BitmapFactory.decodeResource(this.getResources(), R.drawable.d52);

        listarr.add(new ItemDD(d1, "1/ 10 món ăn bốc tốt cho trẻ"));
        listarr.add(new ItemDD(d2, "2/ 5 thực phẩm diệt IQ của trẻ"));
        listarr.add(new ItemDD(d3, "3/ 6 nguyên tắc dinh dưỡng quan trọng của trẻ"));
        listarr.add(new ItemDD(d4, "4/ 7 bí quyết dinh dưỡng của trẻ luôn khỏe"));
        listarr.add(new ItemDD(d5, "5/ Bé có nên uống nhiều sữa vào ban đêm"));
        listarr.add(new ItemDD(d6, "6/ Bé uống sữa nhiều nhưng vẫn không cao đúng chuẩn"));
        listarr.add(new ItemDD(d7, "7/ Bí quyết dinh dưỡng trong thức ăn của trẻ"));
        listarr.add(new ItemDD(d8, "8/ Bố mẹ thấp, liệu con có cao?"));
        listarr.add(new ItemDD(d9, "9/ Bổ sung sắt có thể gây nguy hiểm cho trẻ"));
        listarr.add(new ItemDD(d10, "10/ Bữa sáng nhanh gọn, giàu dinh dưỡng cho trẻ"));
        listarr.add(new ItemDD(d11, "11/ Cách chế biến bột rau, thịt cho bé dặm"));
        listarr.add(new ItemDD(d12, "12/ Cách nấu những món canh ngon cho bé tập ăn cơm"));
        listarr.add(new ItemDD(d13, "13/ Chế độ ăn giúp bé tăng sức đề kháng"));
        listarr.add(new ItemDD(d14, "14/ Chế độ ăn uống khi cho trẻ đi du lịch"));
        listarr.add(new ItemDD(d15, "15/ Chế độ dinh dưỡng cho trẻ 2 tuổi"));
        listarr.add(new ItemDD(d16, "16/ Cho trẻ ăn hải sản, đôi điều lưu ý"));
        listarr.add(new ItemDD(d17, "17/ Cho trẻ ăn trứng theo từng độ tuổi"));
        listarr.add(new ItemDD(d18, "18/ Cho trẻ ăn: 5 sai lầm phổ biến"));
        listarr.add(new ItemDD(d19, "19/ Cho trẻ uống nhiều Canxi có tốt?"));
        listarr.add(new ItemDD(d20, "20/ Dinh dưỡng cho bé từ 4-6 tuổi"));

        list = (ListView) findViewById(R.id.listView);
        customList = new CustomListView(this, R.layout.listview_single, listarr);
        list.setAdapter(customList);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String text = listarr.get(position).getTitle().toString();
                Intent intent = new Intent(TreEm.this, BodyTreEm.class);
                intent.putExtra("select_item", text);
                startActivity(intent);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tre_em, menu);
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