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

public class CongDung extends Activity {
    ListView list;
    ArrayList<ItemDD> listarr = new ArrayList<ItemDD>();
    CustomListView customList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cong_dung);

        Bitmap d1 = BitmapFactory.decodeResource(this.getResources(), R.drawable.a1);
        Bitmap d2 = BitmapFactory.decodeResource(this.getResources(), R.drawable.a2);
        Bitmap d3 = BitmapFactory.decodeResource(this.getResources(), R.drawable.a3);
        Bitmap d4 = BitmapFactory.decodeResource(this.getResources(), R.drawable.a4);
        Bitmap d5 = BitmapFactory.decodeResource(this.getResources(), R.drawable.a5);
        Bitmap d6 = BitmapFactory.decodeResource(this.getResources(), R.drawable.a6);
        Bitmap d7 = BitmapFactory.decodeResource(this.getResources(), R.drawable.a7);
        Bitmap d8 = BitmapFactory.decodeResource(this.getResources(), R.drawable.a8);
        Bitmap d9 = BitmapFactory.decodeResource(this.getResources(), R.drawable.a9);
        Bitmap d10 = BitmapFactory.decodeResource(this.getResources(), R.drawable.a10);
        Bitmap d11 = BitmapFactory.decodeResource(this.getResources(), R.drawable.a11);
        Bitmap d12 = BitmapFactory.decodeResource(this.getResources(), R.drawable.a12);
        Bitmap d13 = BitmapFactory.decodeResource(this.getResources(), R.drawable.a13);
        Bitmap d14 = BitmapFactory.decodeResource(this.getResources(), R.drawable.a14);
        Bitmap d15 = BitmapFactory.decodeResource(this.getResources(), R.drawable.a15);
        Bitmap d16 = BitmapFactory.decodeResource(this.getResources(), R.drawable.a16);
        Bitmap d17 = BitmapFactory.decodeResource(this.getResources(), R.drawable.a17);
        Bitmap d18 = BitmapFactory.decodeResource(this.getResources(), R.drawable.a18);
        Bitmap d19 = BitmapFactory.decodeResource(this.getResources(), R.drawable.a19);
        Bitmap d20 = BitmapFactory.decodeResource(this.getResources(), R.drawable.a20);

        listarr.add(new ItemDD(d1, "1. 10 loại quả có công dụng phòng chữa bệnh rất hữu ích"));
        listarr.add(new ItemDD(d2, "2. 14 thực phẩm giúp ổn định đường huyết và giảm cân hiệu quả"));
        listarr.add(new ItemDD(d3, "3. 19 thực phẩm có màu sắc đẹp bắt mắt bạn nên ăn nhiều"));
        listarr.add(new ItemDD(d4, "4. 3 loại trái cây nên chọn sau mỗi bữa ăn"));
        listarr.add(new ItemDD(d5, "5. 5 loại quả màu đỏ giúp giảm béo siêu hạng"));
        listarr.add(new ItemDD(d6, "6. 5 lợi ích tuyệt vời cho sức khỏe từ rau diếp"));
        listarr.add(new ItemDD(d7, "7. 5 thực phẩm ăn, uống sống sẽ rất nguy hiểm"));
        listarr.add(new ItemDD(d8, "8. 5 thực phẩm giàu chất béo nhưng không làm bạn tăng cân"));
        listarr.add(new ItemDD(d9, "9. 6 loại rau củ quả giúp hạ lipid máu, bảo vệ tim mạch"));
        listarr.add(new ItemDD(d10, "10. 6 thực phẩm giúp làm sạch độc tố trong đường ruột"));
        listarr.add(new ItemDD(d11, "11. 7 loại thực phẩm giúp giảm bớt chứng viêm họng"));
        listarr.add(new ItemDD(d12, "12. 7 loại thực phẩm giúp xua tan mệt mỏi"));
        listarr.add(new ItemDD(d13, "13. 7 lý do tại sao bạn nên ăn quả ôliu"));
        listarr.add(new ItemDD(d14, "14. 7 thực phẩm phòng bệnh hiệu quả"));
        listarr.add(new ItemDD(d15, "15. 7 'vệ sĩ' giúp bạn chống dị ứng hiệu quả"));
        listarr.add(new ItemDD(d16, "16. 8 loại thực phẩm tốt nhất cho xương chắc khỏe"));
        listarr.add(new ItemDD(d17, "17. 8 lời khuyên cho những người thích ăn đồ ăn nhanh"));
        listarr.add(new ItemDD(d18, "18. 8 thực phẩm 'đánh bay' những khó chịu do rượu"));
        listarr.add(new ItemDD(d19, "19. Bông cải giúp trị viêm khớp"));
        listarr.add(new ItemDD(d20, "20. Cà rốt, lê và táo giúp trắng răng"));

        list = (ListView) findViewById(R.id.listView);
        customList = new CustomListView(this, R.layout.listview_single, listarr);
        list.setAdapter(customList);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String text = listarr.get(position).getTitle().toString();
                Intent intent = new Intent(CongDung.this, BodyCongDung.class);
                intent.putExtra("select_item", text);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cong_dung, menu);
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
