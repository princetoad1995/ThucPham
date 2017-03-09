package com.example.ly230595.thucpham.thucphamkinhau;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ly230595.thucpham.R;

public class Body extends Activity {
    Bitmap anh;
    String[] web = {
            "Bài thơ về các món kỵ nhau",
            "Mật ong và bột sắn dây",
            "Mật ong và sữa đậu nành hoặc đậu non",
            "Trứng ngỗng và tỏi",
            "Ba ba và rau dền",
            "Thịt chó và nước trà",
            "Gan và giá đỗ",
            "Ốc, trai, hến, cua + cà chua, ớt, cam, chanh",
            "Hải sản và hoa quả",
            "Khoai lang và quả hồng",
            "Thịt gà và rau kinh giới",
            "Cà chua và khoai tây",
            "Sữa và sôcôla",
            "Đường hóa học và lòng trắng trứng",
            "Khoai và chuối",
            "Hành tây và mật ong",
            "Đậu phụ và rau chân vịt",
            "Dưa chuột và cà chua",
            "Củ cải trắng và các loại lê táo nho",
            "Cá chép và thịt cầy",
            "Nhân sâm - củ cải và hải sản",
            "Rượu và thịt bò",
            "Rau dền và quả lê"

    } ;

    String[] body = {
            "Mật ong , sữa , sữa đậu nành ? \n" +
                    "Ăn cùng tắc tử - phải đành xa nhau! \n" +
                    "Gan lợn, giá, đậu nực cười? \n" +
                    "Xào chung, mất sạch bổ tươi ban đầu! \n" +
                    "Thịt gà, kinh giới kỵ nhau? \n" +
                    "Ăn cùng một lúc, ngứa đầu phát điên! \n" +
                    "Thịt dê, ngộ độc do đâu? \n" +
                    "Chỉ vì dưa hấu, xen vào bữa ăn! \n" +
                    "Ba ba ăn với dền, sam \n" +
                    "Bụng đau quằn quại, khó toàn vẹn thân! \n" +
                    "Động kinh, chứng bệnh rành rành? \n" +
                    "Là do thịt lợn, rang chung ấu Tầu! \n" +
                    "Chuối hột ăn với mật, đường? \n" +
                    "Bụng phình, dạ trướng, dọc đường phân rơi! \n" +
                    "Thịt gà, rau cải có câu? \n" +
                    "Âm dương, khí huyết thoát vào hư vô! \n" +
                    "Trứng vịt, lẫn tỏi, than ôi? \n" +
                    "Ăn vào chắc chết, mười mươi rõ ràng! \n" +
                    "Cải thìa, thịt chó xào vô? \n" +
                    "Ăn vào, đi tả, hôn mê khôn lường! \n" +
                    "Sữa bò, cam, quýt, bưởi, chanh? \n" +
                    "Ăn cùng một lúc, liên thanh sấm rền! \n" +
                    "Quả lê, thịt ngỗng thường thường? \n" +
                    "Ăn vào cơ thể đùng đùng sốt cao! \n" +
                    "Đường đen pha sữa đậu nành? \n" +
                    "Đau bụng, tháo dạ, hoành hành suốt đêm! \n" +
                    "Thịt rắn, kị củ cải xào? \n" +
                    "Ăn vào, sao thoát lưỡi đao tử thần! \n" +
                    "Nôn mửa, bụng dạ không yên? \n" +
                    "Vì do hải sản ăn liền trái cây! \n" +
                    "Cá chép, cam thảo, nhớ rằng? \n" +
                    "Ăn chung, trúng độc, không cần hỏi tra! \n" +
                    "Nước chè, thịt chó no say? \n" +
                    "Thỉnh thoảng như thế, có ngày ung thư! \n" +
                    "Chuối tiêu, môn, sọ phiền hà? \n" +
                    "Ruột đau quằn quại, như là dao đâm! \n" +
                    "Khoai lang, hồng, mận ăn vô? \n" +
                    "Dạ dày viêm loét, tổn hư tá tràng!\n" +
                    "Ai ơi, khi chưa dọn mâm? \n" +
                    "Nhắc nhau nấu nướng, sai lầm hiểm nguy! \n" +
                    "Giàu Vitamin C chớ có tham (1) \n" +
                    "Nấu cùng ốc, hến, cua, tôm, nghêu, sò! \n" +
                    "Ăn gì? ăn với cái gì? \n" +
                    "Là điều cần nhớ, nên ghi vào lòng! \n" +
                    "Chẳng may ăn phải, vài giờ? \n" +
                    "Chúng tạo chất độc bảng A chết người! \n" +
                    "Quý nhau mời tiệc lẽ thường! \n" +
                    "Thức ăn tương phản, trăm đường hại nhau!\n" +
                    "------Sưu tầm-------",
            "Trong Đông y, mật ong tính bình và sắn dây tính mát. Nếu kết hợp cả hai loại này cùng nhau không thể gây nên phản ứng chết người như lời đồn thổi.",
            "Thực chất khi mật ong kết hợp cùng sữa đậu nành hoặc đậu non sẽ gây ra phản ứng giữa axit formic trong mật và protein trong đậu tạo ra hiện tượng kết tủa và gây khó tiêu, chướng bụng đối với người dùng chứ không dẫn đến chết người. ",
            "Về nguyên tắc kết hợp thực phẩm, tỏi không nên dùng chung với trứng vì chúng vừa không nhất lại là tỏi cháy. Nó có thể sinh ra một chất gây độc hại cho cơ thể. ",
            "Nhiều lời đồn cho rằng sự kết hợp này có thể khiến chết người. Thực chất nó chỉ khiến người dùng cảm thấy khó tiêu, đầy bụng vì đó là sự kết hợp giữa một bên là hàn tính và bên kia là lưỡng tính.",
            "Protein trong thịt chó và axit tannic trong lá trà khi gặp nhau có thể sinh ra một chất với tên gọi là tannalbin. Chất này cản trở những chất độc được đào thải ra ngoài và sinh ra táo bón. Nếu tích tụ lâu sẽ sinh độc và gây ung thư đường ruột. Đây có thể coi là một kết hợp chết người.",
            "Phần lớn trong gan động vật, phổ biến là gan lợn đều chứa lượng đồng rất lớn. Nếu kết hợp cùng giá sẽ làm vitamin C có trong giá đỗ bị oxy hóa theo thời gian tiêu hóa thức ăn. Như vậy, bạn không tận dụng được nguồn dinh dưỡng trong giá đỗ.",
            "Nếu có thể nói đây là một sự kết hợp tiềm ẩn ngộ độc có thể đúng một phần. Bởi lẽ các loài hản sản này rất giàu chất asen, khi gặp vitamin C trong những loại trái kể trên asen ngay lập tức bị biến đổi và gây ra độc tố. Nếu độc tố sinh ra đủ nhiều có thể mang nguy hiểm đến cho người dùng. Nếu chưa đến mức nguy hiểm nó cũng khiến hệ thống miễn dịch của cơ thể suy giảm đáng kể.",
            "Nếu bạn không muốn bị tào tháo rượt ngay sau khi dùng hải sản thì không nên ăn liền các loại trái cây như hồng, nho, lựu… Trong các trái cây này thường có chứa axit tannic, khi gặp protein trong hải sản sẽ tạo nên hiện tượng đông đặc và sinh ra những chất khó tiêu hóa có thể khiến người dùng tiêu chảy, nôn mửa. Do đó, tốt nhất chỉ sau 4 tiếng dùng hải sản bạn mới có thể dùng tiếp trái cây.",
            "Bạn thấy trái hồng có vị chát. Đó là do trong đó có chất tanin và pectin. Nếu những chất này gặp phải tinh bột đường trong khoai lang sẽ làm thành những viên sỏi trong dạ dày. Nếu lâu ngày, những sỏi này có thể gây viêm loét dạ dày và xuất huyết kèm theo.",
            "Sự kết hợp này không phải gây ra bệnh phong thấp như nhiều người vẫn tưởng. Đó chỉ là chứng khó tiêu tức thời hoặc đi ngoài nhiều.",
            "Khi cùng lúc dùng cả hai loại này có thể khiến bạn tiêu chảy liên tục và gây nên chứng rối loạn tiêu hóa.",
            "Nếu bạn không muốn cơ thể dùng sữa mà lại thiếu hụt canxi, tốt nhất không nên pha chung sữa với sô cô la. Vì can xi trong sữa gặp phải axit oxalic trong sôcôla sẽ sinh ra canxi olate không tan. Chất này có thể khiến tóc trở nên khô và dễ gãy, đồng thời làm giảm sự hấp thụ canxi khiến cơ thể khó phát triển.",
            "Lysine và đường có trong sữa bò sẽ có phản ứng ở nhiệt độ cao, làm cho các acid amin mất đi. Trứng gà và đường không nên nấu cùng nhau cũng vì lý do này. Nhưng bạn có thể đun nóng sữa, nấu chín trứng gà rồi để nguội sau đó cho đường vào thì sẽ không có vấn đề gì.",
            "Bạn sẽ bị nổi những mụn nhỏ trên mặt nếu kết hợp khoai tây cùng với chuối trong bữa ăn của mình.",
            "Sự kết hợp này không tốt cho thị giác. Nặng hơn có thể dẫn đến mù lòa suốt đời. Đây là điều cấm kỵ bạn nên nhớ.",
            "Đậu phụ kỵ ăn cùng với rau chân vịt vì trong đậu phụ có chứa magnesium chloride, calcium sulfate, còn trong rau chân vịt lại chứa acid oxalic, hai chất này gặp nhau sẽ tạo thành magnesium oxalate và calcium oxalate. Hai chất lắng đọng màu trắng này không được cơ thể hoan nghênh, không những ảnh hưởng tới sự hấp thụ canxi của cơ thể mà còn dễ bị kết sỏi.",
            "Vì trong dưa chuột chứa một loại men phân giải VitaminC, khi ăn dưa chuột với Cà chua hay những loại thực phẩm giàu VitaminC sẽ không tốt vì làm giảm khả năng hấp thụ Vitamin C của cơ thể.",
            "Ceton đồng có trong những loại trái cây này phản ứng với axit cianogen lưu huỳnh trong củ cải, khiến người ăn bị suy tuyến giáp trạng và bướu cổ.",
            "Cá chép chứa nhiều hoạt chất sinh học, thịt cầy cũng với thành phần dinh dưỡng phong phú, hai thứ ăn chung xảy ra phản ứng hóa học phức tạp, sản sinh ra chất có hại cho cơ thể.",
            "Theo y học cổ truyền, củ cải và đồ biển đại hạ khí, còn nhân sâm đại bổ khí, hai thứ triệt tiêu lẫn nhau, gây hại cho người sử dụng.Dù là sắc hay hấp cách thủy, bạn cũng không được dùng đồ kim loại để nấu nhân sâm. Sau khi dùng loại dược liệu này, bạn không được uống trà, vì trà sẽ làm giảm tác dụng của nhân sâm.",
            "Thịt bò có tác dụng bồi bổ, rượu cũng là chất cay nóng, hai thứ ăn chung dễ dẫn đến các chứng như táo bón; viêm khóe miệng; mắt đỏ; ù tai",
            "Nếu ăn cùng sẽ dễ bị nôn. Ngoài ra, bạn cũng không nên tráng miệng bằng quả lê sau bữa ăn có thịt ngỗng, vì hai món này khi kết hợp dễ gây sốt."

    } ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body);

        ImageView imgView = (ImageView) findViewById(R.id.imgView);
        TextView tv = (TextView) findViewById(R.id.txtView);
        TextView title = (TextView) findViewById(R.id.txtTitle);
        Intent i = getIntent();
        String item = i.getStringExtra("select_item");
        title.setText(item);

//        tv.setText("you selected " + item + " " + web[0]);
        if(item.equals(web[0])){
            tv.setText(body[0]);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.kinhau);
            imgView.setImageBitmap(anh);
        }
        else if(item.equals(web[1])){
            tv.setText(body[1]);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh1);
            imgView.setImageBitmap(anh);
        }
        else if(item.equals(web[2])){
            tv.setText(body[2]);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh8);
            imgView.setImageBitmap(anh);
        }
        else if(item.equals(web[3])){
            tv.setText(body[3]);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh2);
            imgView.setImageBitmap(anh);
        }
        else if(item.equals(web[4])){
            tv.setText(body[4]);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh9);
            imgView.setImageBitmap(anh);
        }
        else if(item.equals(web[5])){
            tv.setText(body[5]);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh3);
            imgView.setImageBitmap(anh);
        }
        else if(item.equals(web[6])){
            tv.setText(body[6]);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh10);
            imgView.setImageBitmap(anh);
        }
        else if(item.equals(web[7])){
            tv.setText(body[7]);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh4);
            imgView.setImageBitmap(anh);
        }
        else if(item.equals(web[8])){
            tv.setText(body[8]);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh11);
            imgView.setImageBitmap(anh);
        }
        else if(item.equals(web[9])){
            tv.setText(body[9]);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh12);
            imgView.setImageBitmap(anh);
        }
        else if(item.equals(web[10])){
            tv.setText(body[10]);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh5);
            imgView.setImageBitmap(anh);
        }
        else if(item.equals(web[11])){
            tv.setText(body[11]);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh13);
            imgView.setImageBitmap(anh);
        }
        else if(item.equals(web[12])){
            tv.setText(body[12]);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh6);
            imgView.setImageBitmap(anh);
        }
        else if(item.equals(web[13])){
            tv.setText(body[13]);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh14);
            imgView.setImageBitmap(anh);
        }
        else if(item.equals(web[14])){
            tv.setText(body[14]);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh7);
            imgView.setImageBitmap(anh);
        }
        else if(item.equals(web[15])){
            tv.setText(body[15]);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh15);
            imgView.setImageBitmap(anh);
        }
        else if(item.equals(web[16])){
            tv.setText(body[16]);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh16);
            imgView.setImageBitmap(anh);
        }
        else if(item.equals(web[17])){
            tv.setText(body[17]);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh17);
            imgView.setImageBitmap(anh);
        }
        else if(item.equals(web[18])){
            tv.setText(body[18]);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh18);
            imgView.setImageBitmap(anh);
        }
        else if(item.equals(web[19])){
            tv.setText(body[19]);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh19);
            imgView.setImageBitmap(anh);
        }
        else if(item.equals(web[20])){
            tv.setText(body[20]);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh20);
            imgView.setImageBitmap(anh);
        }
        else if(item.equals(web[21])){
            tv.setText(body[21]);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh21);
            imgView.setImageBitmap(anh);
        }
        else if(item.equals(web[22])){
            tv.setText(body[22]);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.anh22);
            imgView.setImageBitmap(anh);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_body, menu);
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