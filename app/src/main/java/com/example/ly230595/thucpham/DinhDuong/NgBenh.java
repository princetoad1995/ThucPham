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

public class NgBenh extends Activity {
    ListView list;
    ArrayList<ItemDD> listarr = new ArrayList<ItemDD>();
    CustomListView customList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ng_benh);

        Bitmap d1 = BitmapFactory.decodeResource(this.getResources(), R.drawable.c1);
        Bitmap d2 = BitmapFactory.decodeResource(this.getResources(), R.drawable.c2);
        Bitmap d3 = BitmapFactory.decodeResource(this.getResources(), R.drawable.c3);
        Bitmap d4 = BitmapFactory.decodeResource(this.getResources(), R.drawable.c4);
        Bitmap d5 = BitmapFactory.decodeResource(this.getResources(), R.drawable.c5);
        Bitmap d6 = BitmapFactory.decodeResource(this.getResources(), R.drawable.c6);
        Bitmap d7 = BitmapFactory.decodeResource(this.getResources(), R.drawable.c7);
        Bitmap d8 = BitmapFactory.decodeResource(this.getResources(), R.drawable.c8);
        Bitmap d9 = BitmapFactory.decodeResource(this.getResources(), R.drawable.c9);
        Bitmap d10 = BitmapFactory.decodeResource(this.getResources(), R.drawable.c10);
        Bitmap d11 = BitmapFactory.decodeResource(this.getResources(), R.drawable.c11);
        Bitmap d12 = BitmapFactory.decodeResource(this.getResources(), R.drawable.c12);
        Bitmap d13 = BitmapFactory.decodeResource(this.getResources(), R.drawable.c13);
        Bitmap d14 = BitmapFactory.decodeResource(this.getResources(), R.drawable.c14);
        Bitmap d15 = BitmapFactory.decodeResource(this.getResources(), R.drawable.c15);
        Bitmap d16 = BitmapFactory.decodeResource(this.getResources(), R.drawable.c16);
        Bitmap d17 = BitmapFactory.decodeResource(this.getResources(), R.drawable.c17);
        Bitmap d18 = BitmapFactory.decodeResource(this.getResources(), R.drawable.c18);
        Bitmap d19 = BitmapFactory.decodeResource(this.getResources(), R.drawable.c19);
        Bitmap d20 = BitmapFactory.decodeResource(this.getResources(), R.drawable.c20);

        listarr.add(new ItemDD(d1, "1. 10 lời khuyên về cách chọn thức ăn cho người bị viêm đại tràng mạn tính"));
        listarr.add(new ItemDD(d2, "2. 10 món bài thuốc trị đái tháo đường"));
        listarr.add(new ItemDD(d3, "3. 10 món ăn tốt cho tim"));
        listarr.add(new ItemDD(d4, "4. 16 thực phẩm tốt cho người bị tiểu đường"));
        listarr.add(new ItemDD(d5, "5. 20 thực phẩm tốt cho tim mạch"));
        listarr.add(new ItemDD(d6, "6. 5 Loại thức ăn tốt nhất cho tim"));
        listarr.add(new ItemDD(d7, "7. 7 món ăn - bài thuốc trị bất lực"));
        listarr.add(new ItemDD(d8, "8. 8 thực phẩm vàng trị trĩ"));
        listarr.add(new ItemDD(d9, "9. 9 lời khuyên dinh dưỡng cho huyết áp cao"));
        listarr.add(new ItemDD(d10, "10. Bí quyết ngăn ngừa bệnh sỏi thận"));
        listarr.add(new ItemDD(d11, "11. Canh hến: cường dương bổ tim mạch"));
        listarr.add(new ItemDD(d12, "12. Chế độ dinh dưỡng cho bệnh nhân Gout"));
        listarr.add(new ItemDD(d13, "13. Chế độ dinh dưỡng cho người bệnh tăng huyết áp"));
        listarr.add(new ItemDD(d14, "14. Chế độ dinh dưỡng cho người bị bệnh thận"));
        listarr.add(new ItemDD(d15, "15. Dinh dưỡng cho người bị lao phổi"));
        listarr.add(new ItemDD(d16, "16. Dinh dưỡng cho người mắc bệnh lao"));
        listarr.add(new ItemDD(d17, "17. Giảm cholesterol xấu nhờ bệnh đậu nành"));
        listarr.add(new ItemDD(d18, "18. Khổ qua rừng chữa bênh tiểu đường"));
        listarr.add(new ItemDD(d19, "19. Món ăn - Bài thuốc cho người bị bệnh gút"));
        listarr.add(new ItemDD(d20, "20. Món ăn - Bài thuốc cho người ngủ mơ"));

        list = (ListView) findViewById(R.id.listView);
        customList = new CustomListView(this, R.layout.listview_single, listarr);
        list.setAdapter(customList);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String text = listarr.get(position).getTitle().toString();
                Intent intent = new Intent(NgBenh.this, BodyNgBenh.class);
                intent.putExtra("select_item", text);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ng_benh, menu);
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
