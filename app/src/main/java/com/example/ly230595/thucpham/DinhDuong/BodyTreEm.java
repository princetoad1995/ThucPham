package com.example.ly230595.thucpham.DinhDuong;

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

public class BodyTreEm extends Activity {
    private Bitmap anh;
    private ImageView imgIcon;
    private TextView txtTiledd, txtBodydd;

    String[] Tile = {
            "1/ 10 món ăn bốc tốt cho trẻ",
            "2/ 5 thực phẩm diệt IQ của trẻ",
            "3/ 6 nguyên tắc dinh dưỡng quan trọng của trẻ",
            "4/ 7 bí quyết dinh dưỡng của trẻ luôn khỏe",
            "5/ Bé có nên uống nhiều sữa vào ban đêm",
            "6/ Bé uống sữa nhiều nhưng vẫn không cao đúng chuẩn",
            "7/ Bí quyết dinh dưỡng trong thức ăn của trẻ",
            "8/ Bố mẹ thấp, liệu con có cao?",
            "9/ Bổ sung sắt có thể gây nguy hiểm cho trẻ",
            "10/ Bữa sáng nhanh gọn, giàu dinh dưỡng cho trẻ",
            "11/ Cách chế biến bột rau, thịt cho bé dặm",
            "12/ Cách nấu những món canh ngon cho bé tập ăn cơm",
            "13/ Chế độ ăn giúp bé tăng sức đề kháng",
            "14/ Chế độ ăn uống khi cho trẻ đi du lịch",
            "15/ Chế độ dinh dưỡng cho trẻ 2 tuổi",
            "16/ Cho trẻ ăn hải sản, đôi điều lưu ý",
            "17/ Cho trẻ ăn trứng theo từng độ tuổi",
            "18/ Cho trẻ ăn: 5 sai lầm phổ biến",
            "19/ Cho trẻ uống nhiều Canxi có tốt?",
            "20/ Dinh dưỡng cho bé từ 4-6 tuổi"
    };

    String[] body = {
            "Hầt hết các bé dưới 1 tuổi đều thích ăn bốc bằng tay. Khoai lang, đậu Hà Lan, thịt cá mềm, quả chín... đều có thể làm thành món ngon cho bé cầm tay ăn. \n" +
                    "\"Bãi chiến trường\" tạo ra sau bữa ăn có vẻ khó coi (và cả khó dọn), nhưng cách này lại tốt cho sự phát triển của trẻ - và tạo sự thoải mái cho bố mẹ ăn cùng với con mình. Dưới đây là những món dễ làm, bổ dưỡng cho các bé ăn bốc: \n" +
                    "\n1. Khoai lang\n" +
                    "\n" +
                    "Giàu cả vitamin A và C, khoai lang rất bổ dưỡng, lại có hương vị ngọt thơm, dễ ăn. Rửa sạch khoai, gọt vỏ, nấu trong lò vi sóng 2-5 phút, tùy vào kích thước củ.\n" +
                    "\n" +
                    "Sau khi nấu chín, cắt đôi khoai và để nguội. Cạo bớt phần cứng bên ngoài, cắt thành miếng nhỏ và thêm bơ nếu bé thích.\n" +
                    "\n" +
                    "2. Đậu Hà Lan đông lạnh\n" +
                    "\n" +
                    "Có nguồn chất xơ tốt và giàu vitamin, khoáng chất, trong đó có chất sắt, đậu Hà Lan là một thức ăn tuyệt vời cho các bé đang phát triển. Bạn có thể nấu theo hướng dẫn trên bao bì của nhà sản xuất hay để đậu tự tan đá rồi chế biến các món mình thích. Không có món nào dễ hơn món này.\n" +
                    "\n" +
                    "3. Thịt mềm\n" +
                    "\n" +
                    "Hội Nhi Khoa Mỹ mới đây công bố một báo cáo cho thấy 15% trẻ dưới 3 tuổi không nhận đủ chất sắt - chất cần thiết trong những năm đầu đời của bé. Bạn cần biết là chất sắt trong thịt được hấp thụ tốt và đễ dàng, là một thực phẩm lý tưởng cho trẻ nhỏ. \n" +
                    "\n" +
                    "Thịt dai không chỉ dễ gây hóc mà còn không hấp dẫn đối với trẻ. Thử nấu thịt trong nồi hầm để thịt mềm, nhừ. Lựa chọn tốt nhất là thịt gà, thịt lợn, thịt xay.\n" +
                    "\n" +
                    "4. Cá\n" +
                    "\n" +
                    "Não đang phát triển của trẻ cần những chất béo thiết yếu như omega-3 DHA... Vì các chất béo chủ yếu đến từ các nguồn như cá, nên đây là một phần quan trọng trong chế độ ăn của trẻ tuổi chập chững. \n" +
                    "\n" +
                    "Hãy thử các loại cá có độ thủy ngân thấp như cá hồi, cá ngừ đóng hộp nhỏ và cá rô phi  - những loại mềm và dễ cắt thành miếng nhỏ. Bạn cũng có thể chiên cá hình que để bé dễ cầm và hấp dẫn. \n" +
                    "\n" +
                    "5. Trứng\n" +
                    "\n" +
                    "Với hàm lượng protein cao và rất tốt, đồng thời chứa sắt, choline, vitamin B12, B2 và nhiều chất dinh dưỡng thiết yếu khác, trứng là thực phẩm hoàn hảo cho trẻ nhỏ. Bạn có thể bác trứng cùng với rau như rau chân vịt hay nấm xào trứng hoặc luộc trứng trước. Trứng chế biến rất nhanh, cung cấp nguồn protein bổ dưỡng cho trẻ phát triển. \n" +
                    "\n" +
                    "6. Rau, quả mềm\n" +
                    "\n" +
                    "Quả và rau là chất bổ sung tuyệt vời cho bất kỳ bữa ăn nào của trẻ. Cắt trái cây chín, mềm thành miếng nhỏ. Đảm bảo loại trái cây và rau ăn hằng ngày của bé có ít nhất một loại vitamin C như dưa vàng, đu đủ, xoài, kiwi, bông cải xanh, súp lơ và dâu tây.\n" +
                    "\n" +
                    "Với rau, hấp cho đến khi chúng mềm và cắt thành miếng nhỏ và mang cho bé ăn. Đảm bảo mỗi loại rau hay quả bé ăn hằng ngày giàu vitamin A như bí đỏ, cà rốt, khoai lang và rau cải bó xôi.\n" +
                    "\n" +
                    "7. Táo nghiền\n" +
                    "\n" +
                    "Táo thường bị bỏ ngoài chế độ ăn của trẻ dưới một tuổi vì độ cứng của nó. Nhưng vọt vỏ và nghiền táo, bạn có thể tạo ra một loại thực phẩm ăn bốc tuyệt vời, nhờ nó giàu chất xơ hòa tan, giúp tăng cường hệ miễn dịch cho trẻ.\n" +
                    "\n" +
                    "8. Pho mát nghiền\n" +
                    "\n" +
                    "Thêm pho mát nghiền vào rau, đậu, trứng và quả để bé ăn trong bữa chính hay bữa phụ. Pho mát là một nguồn protein và canxi rất tốt, nó cũng chứa chất béo đặc biệt cần thiết cho hai năm đầu đời của trẻ.\n" +
                    "\n" +
                    "9. Đậu\n" +
                    "\n" +
                    "Giàu protein, vitamin B, sắt và chất xơ và dễ cầm ăn bởi các ngón tay nhỏ xíu, đậu có thể thay thế tuyệt vời cho thịt trong bữa ăn. Cần đảm bảo đậu mềm và cắt những hạt đậu to làm đôi. Cho bé ăn cùng bơ và trái cây hay rau giàu vitamin C để giúp tăng cường hấp thụ sắt.\n" +
                    "\n" +
                    "Bạn có thể nấu ngay đậu đã đóng sẵn trong hộp hay ngâm đậu khô qua đêm và nấu trong nồi hầm. Dù bằng cách nào thì đậu cũng rất giàu dinh dưỡng và dễ ăn no nên bạn có thể để nó là một phần trong chế độ ăn của trẻ trong những năm tới.\n" +
                    "\n" +
                    "10. Ngũ cốc nguyên hạt\n" +
                    "\n" +
                    "Từ mì đến các hạt ngũ cốc giàu sắt, bánh mì đều là lựa chọn tốt cho bữa ăn của trẻ. Nhớ rằng ngũ cốc nguyên hạt chứa tất cả các thành phần của ngũ cốc bao gồm cả mầm, cám - những thứ chứa chất xơ và giàu chất dinh dưỡng.",
            "Trí não của trẻ sẽ bị tổn thương rất lớn nếu như cha mẹ cứ mặc trẻ thích gì ăn nấy.\n" +
                    "Dưới đây là 5 thực phẩm không tốt cho trí não trẻ, các bậc cha mẹ nên biết để tránh.\n" +
                    "\n" +
                    "1. Thực phẩm chứa chất béo oxi hóa\n" +
                    "\n" +
                    "Nếu như ăn quá lượng chất béo oxi hóa trong thời gian dài, các chất này sẽ tích tụ trong cơ thể khiến một số hệ thống chất xúc tác trong cơ thể bị tổn thương, dẫn đến não bộ sớm thoái hóa hoặc kém phát triển.\n" +
                    "2. Đường trắng\n" +
                    "Đường trắng có tính axit. Cho trẻ ăn đồ ngọt (đường trắng và những sản phẩm được chế biến từ đường trắng) trong thời gian dài sẽ hình thành thể chất và não mang tính axit, ảnh hưởng không tốt đến phát triển trí lực của bé.\n" +
                    "\n" +
                    "Không những thế, cho trẻ ăn quá nhiều đường trắng và bánh kẹo, nước ngọt sẽ gây khó khăn cho chức năng gan và gây sâu răng.\n" +
                    "\n" +
                    "3. Thực phẩm quá mặn\n" +
                    "\n" +
                    "Những loại thực phẩm chứa quá nhiều muối sẽ gây ra bệnh cao huyết áp, xơ cứng động mạch, hơn nữa còn làm tổn thương huyết quản, ảnh hưởng đến việc cung cấp máu cho các tổ chức ở não, gây ra tình trạng thiếu máu, thiếu dưỡng khí ở tế bào não, dẫn đến trí nhớ bị giảm sút, phản ứng chậm chạp.\n" +
                    "\n" +
                    "Đối với người trưởng thành, chỉ cần dùng dưới 7g muối/ngày, trẻ em nên giới hạn trong khoảng dưới 4g/ngày. Trong bữa ăn cho trẻ, cần hạn chế những loại thực phẩm nhiều muối như cải muối, cà muối, thịt muối, cá khô, mắm, chao, tương hột…\n" +
                    "4. Gạo tinh luyện và các loại mỳ\n" +
                    "Gạo tinh luyện và các loại mỳ là những thực phẩm tinh bột đã qua quá trình tinh chế, những thành phần có lợi như vitamin B và đường gluco đã giảm đi và chỉ còn lại cacbon hydrat. Cacbon hydrat sẽ làm giảm sự hoạt động của các nơron thần kinh.\n" +
                    "\n" +
                    "5. Thực phẩm chứa nhôm\n" +
                    "\n" +
                    "Thường xuyên cho trẻ ăn các thực phẩm có hàm lượng nhôm cao sẽ khiến trí nhớ giảm sút, phản ứng chậm chạp, thậm chí còn gây ra chứng đần độn. Nhôm thường có nhiều trong những loại thực phẩm chiên rán như bánh quẩy, bánh tiêu…",
            "Ăn vặt, bỏ ăn sáng, nghiền nước ngọt, snack,… đều là những thói quen ăn uống không tốt dẫn đến chứng béo phì ở trẻ em và thiếu niên. Một vài nguyên tắc sau đây sẽ trang bị kiến thức cho các bà mẹ đang chăm sóc con trong độ tuổi phát triển này.\n" +
                    "Những nguyên tắc cần nhớ\n" +
                    " \n" +
                    "1. Ít nhất một chế phẩm từ sữa mỗi ngày\n" +
                    " \n" +
                    "Tương đương với 2 hũ sữa chua.\n" +
                    " \n" +
                    "Ở các bé gái, việc cung cấp đủ can-xi cho cơ thể có tác dụng ngăn chặn nguy cơ mắc phải chứng loãng xương. Hệ xương sẽ dừng phát triển khi ở độ tuổi 20, vì thế, ngay từ tuổi thiếu niên, hãy cung cấp một lượng can-xi nhiều nhất có thể!\n" +
                    " \n" +
                    "2. Một phần protein động vật ngày\n" +
                    " \n" +
                    "Cụ thể hơn, các chuyên gia dinh dưỡng khuyên rằng, mỗi ngày, một em bé 3 tuổi cần được bổ sung 40gr protein (từ thịt, cá hoặc trứng) và cứ thêm một tuổi thì lượng protein cần cung cấp cho cơ thể tăng thêm 10gr. Như vậy, trẻ 4 tuổi cần 50gr, 7 tuổi cần 80gr, 9 tuổi cần 100gr…\n" +
                    " \n" +
                    "3. 5 phần hoa quả và rau xanh mỗi ngày\n" +
                    " \n" +
                    "Một “phần” tương đương khoảng 80gr hoa quả và rau xanh mỗi ngày, cụ thể là:\n" +
                    " \n" +
                    "1/2 đĩa rau củ chín hoặc 1 đĩa nhỏ hoa quả tươi hoặc 1 bát súp rau củ.\n" +
                    " \n" +
                    "1 quả họ táo, lê, cam hoặc 2 quả họ mơ, quýt, kiwi hoặc một vài quả dâu, sơri, vải…\n" +
                    " \n" +
                    "4. Tinh bột trong tất cả các bữa ăn\n" +
                    " \n" +
                    "Bánh mỳ, bột nhào, cơm tẻ, rau củ khô hay khoai tây đều giàu tinh bột, rất cần thiết cho cơ thể trẻ.\n" +
                    " \n" +
                    "5. Hạn chế đồ ngọt\n" +
                    " \n" +
                    "Bạn chỉ nên cho trẻ ăn nhiều các loại bánh kẹo và đồ ngọt khác vào dịp đặc biệt. Ngày thường, bạn không nên dự trữ chúng để thỉnh thoảng trẻ “nhâm nhi”. Thói quen này thật sự không tốt đối với sức khỏe của các em. Ngoài ra, để tránh cho trẻ nguy cơ mắc các bệnh như béo phì hay sâu răng… bạn cũng không nên cho trẻ uống quá nhiều nước ngọt và đồ uống có ga.\n" +
                    " \n" +
                    "6. Tạo thói quen uống đủ nước\n" +
                    " \n" +
                    "Đây là loại đồ uống duy nhất có lợi cho cơ thể (mà không gây bất cứ một “tác dụng phụ” nào). Tuyệt đối không nên cho đường vào nước để đánh lừa vị giác của trẻ, bạn nên phân biệt chúng một cách rạch ròi.\n" +
                    " \n" +
                    "Lưu  ý cuối cùng, đồ ăn nhanh (fast-food) là loại thực phẩm bạn nhất thiết không được để trẻ  quá lạm dụng. Tuy nhiên, như vậy không có nghĩa là buộc trẻ phải “tẩy chay” loại thực phẩm hấp dẫn này. Một suất đồ ăn nhanh với khẩu phần phù hợp có thể được lặp lại sau 3-6 tuần.",
            "Thói quen ăn uống lành mạnh chính là chỉ thói quen ăn uống dựa trên 4 nguyên tắc cơ bản là đa dạng hóa, tính cân bằng, lượng vừa phải và cá thể hóa, quán triệt toàn diện trong hành vi ăn uống hàng ngày.\n\n" +
                    "1. Đa dạng thực phẩm\n" +
                    " \n" +
                    "Trên thế giới này chẳng có loại thức ăn nào có thể cung cấp toàn bộ chất dinh dưỡng mà cơ thể cần do đó cần phải ăn đa dạng thực phẩm. Điều này có nghĩa bất kể việc kén chọn thực phẩm nào đều cản trở sự hấp thụ đủ dưỡng chất.\n" +
                    " \n" +
                    "ó một số trẻ chỉ thích ăn 1 loại thực phẩm nào đó thì có thể hướng trẻ tới những thực phẩm khác cùng nhóm để thay đổi nhưng nếu không ăn rau xanh thì sẽ không thể có sự thay thể nào.\n" +
                    " \n" +
                    "Thực đơn mỗi ngày phải đủ 5 nhóm dinh dưỡng, không thể thiếu một nhóm nào.\n" +
                    " \n" +
                    "2. Cân bằng các loại thực phẩm\n" +
                    " \n" +
                    "Mỗi thực phẩm có 1 thành phần dinh dưỡng và với mỗi loại dưỡng chất đều có quy định rõ về lượng, ít hơn hay nhiều hơn đều không tốt.\n" +
                    " \n" +
                    "Nếu ăn nhiều những thứ mình thích, ăn ít hoặc không ăn những thứ không thích thì dù có đa dạng thực phẩm thì tỉ lệ các chất dinh dưỡng đưa vào cơ thể có thể bị phá vỡ tính cân bằng.\n" +
                    " \n" +
                    "Do đó, nên chú ý phối hợp giữa các thức ăn cùng nhóm, như kết hợp giữa thô và mịn, sẫm màu và nhạt màu, thịt cá và thịt gia cầm…\n" +
                    " \n" +
                    "3. Ăn uống đúng giờ\n" +
                    " \n" +
                    "3 bữa chính trong ngày là nguồn cung cấp dưỡng chất, năng lượng cơ bản cho thể. Ăn vặt không giờ giấc, ăn sát với bữa chính đều làm ảnh hưởng đếu chất lượng dung nạp dinh dưỡng của bữa chính.\n" +
                    " \n" +
                    "Những món ăn vặt sau giờ tan học bán tại cổng trường không những không có dinh dưỡng, mà phần lớn đều có vấn đề về vệ sinh. Ở nhà các vị phụ huynh nên chuẩn bị đồ ăn cho các bé sau khi tan học nhưng số lượng không được quá nhiều để không ảnh hưởng đến bữa ăn chính.\n" +
                    " \n" +
                    "4. Ăn no vừa phải\n" +
                    " \n" +
                    "Tổng năng lượng đưa vào cơ thể của 3 bữa phân chia như sau: bữa sáng chiếm 30%, bữa trưa 40% và còn lại là bữa tối.\n" +
                    " \n" +
                    "Không ăn hoặc ăn ít vào bữa sáng có thể ảnh hưởng đến sức khỏe cơ thể, làm giảm thể lực và ảnh hưởng đến hoạt động bình thường của đại não.\n" +
                    " \n" +
                    "Nếu bữa trưa ăn qua loa thì bữa tối sẽ dễ bị quá no.\n" +
                    " \n" +
                    "Ngoài ra, vào những ngày lễ tết hay gia đình có tiệc tùng thì đều nên ăn vừa phải thôi, không được ăn uống quá nhiều, càng không được ăn nhanh nuốt vội, nếu không sẽ làm ảnh hưởng đến dạ dày, sinh ra các vấn đề ở đường tiêu hóa.\n" +
                    " \n" +
                    "5. Ăn uống thanh đạm\n" +
                    " \n" +
                    "Tỉ lệ năng lượng trẻ nạp vào mỗi ngày được phân chia như sau: 1 nửa là từ lương thực, khoảng 1/6 là từ protein, 1/4 là từ chất béo còn lại là chất xơ, vitamin và khoáng chất.... Do đó nếu quá nhiều dầu mỡ và đường không những khiến cơ thể phải hấp thu quá nhiều năng lượng mà còn làm tăng nguy cơ mắc những căn bệnh thời văn minh hiện đại như cao huyết áp, mỡ máu cao, béo phì, bệnh mạch vành…\n" +
                    " \n" +
                    "Ngoài ra những thức ăn nhiều dầu mỡ quá ngấy và khó tiêu hóa, lại thiếu chất xơ sẽ dễ dẫn đến chứng táo bón, viêm dạ dày…\n" +
                    " \n" +
                    "6. Chọn những thức ăn phù hợp với thể chất\n" +
                    " \n" +
                    "Thức ăn có thể nuôi người nhưng cũng có thể hại người, ví dụ như những đứa trẻ mà tì vị hư hàn nhưng lại ham ăn những thực phẩm lạnh dễ dẫn đến đi ngoài, tràng vị khó chịu, những đứa trẻ mà bị nhiệt trong tương đối nghiêm trọng nhưng lại thích ăn những món ăn nhiều dầu mỡ chiên rán hoặc ăn lẩu dê dẫn đến lở loét miệng hoặc táo bón, đi ngoài phân khô cứng. Đó là vì thuộc tính của thức ăn không phù hợp với thể chất của trẻ.\n" +
                    " \n" +
                    "Các vị phụ huynh nên hiểu rõ những thuộc tính ôn nóng hay mát của thực phẩm để lựa chọn cho các con những thức ăn phù hợp với thể chất, đồng thời còn phải dựa theo thời tiết để điều chỉnh thức ăn.\n" +
                    " \n" +
                    "7. Bữa ăn văn minh\n" +
                    " \n" +
                    "Môi trường của bữa ăn cũng cần yên tĩnh, tạo thói quen nhai kỹ nuốt chậm, âm nhạc nhẹ nhàng có thề có lợi cho tâm trạng vui vẻ. Khi ngồi vào bàn ăn bố mẹ có thể kết hợp nói cho các con nghe những câu chuyện về đồ ăn để kích thích nhu cầu ăn uống của trẻ hoặc giới thiệu giá trị dinh dưỡng của thức ăn.\n" +
                    " \n" +
                    "Bàn ăn nhất định không phải là nơi để mắng mỏ, sửa chữa những thói quen ăn uống không tốt của trẻ, nên cố gắng dạy dỗ lúc bình thường chứ không nên đến khi ăn mới dạy.",
            "Cháu 2 tuổi, rất hay uống sữa đêm, 9h tối uống 200 ml rồi ngủ, 2h sáng uống tiếp 120 ml, sáng dậy lại uống thêm một bình.\n" +
                    "Tôi muốn hỏi, bé uống sữa đêm như vậy có tốt cho sức khỏe không? Cháu là bé gái, 25 tháng tuổi, nặng 14 kg và cao 86 cm. Cháu ăn uống bình thường, không nhiều nhưng rất thích sữa. Tôi nuôi cháu hoàn toàn bằng sữa ngoài vì sau sinh tôi không có sữa. Từ lúc sinh tới khi một tuổi, cháu uống sữa ngoại, sau đó chuyển qua sữa nội.\n" +
                    "\n" +
                    "Ba mẹ cháu đều lùn, mẹ cao 1,53 m, còn ba cao 1,60 m. Chiều cao cân nặng của cháu hiện tại có phát triển bình thường không, làm thế nào cho tương lai của cháu cao hơn ba mẹ. (Nguyễn Lê)\n\n" +
                    "Trả lời\n" +
                    "\n" +
                    "Chào bạn,\n" +
                    "\n" +
                    "Bé gái 25 tháng có cân nặng trung bình khoảng 11,5 kg, cao 86,5 cm. Như vậy về chiều cao con bạn bình thường nhưng bé thừa cân. Uống sữa đêm không gây tác hại gì nhưng bạn cần chú ý vì trẻ dễ bị sặc do vừa ngủ vừa uống. Ngoài ra ăn sữa đêm gây tăng cân vì thế con bạn bị thừa cân.\n" +
                    "\n" +
                    "Chiều cao của trẻ phụ thuộc vào nhiều yếu tố, trong đó yếu tố về gene và yếu tố dinh dưỡng là quan trọng nhất. Yếu tố gene thì bạn không thay đổi được, nhưng yếu tố dinh dưỡng thì có thể thay đổi được. Bạn nên cho bé ăn uống đầy đủ chất dinh dưỡng sẽ giúp bé cao hơn.\n" +
                    "\n" +
                    "Chúc bé luôn vui khỏe, phát triển toàn diện. ",
            "Con gái tôi 5 tuổi, cao 100cm và nặng 15kg. Cháu ăn bình thường, uống 3-4 hộp sữa mỗi ngày, không thích uống sữa bột. So với bạn bè cùng tuổi, tôi thấy cháu vẫn hơi thấp, tôi phải làm thế nào để cháu cao nhanh hơn? (Tuyết Anh, Hà Nội)\n" +
                    "Trả lời:\n" +
                    "\n" +
                    "Đúng là bé của bạn thiếu chiều cao và cân nặng so với tuổi (chuẩn là 109cm và 18,3kg với bé gái 5 tuổi), nhưng cân nặng của bé cân đối so với chiều cao. Mỗi tháng, nếu bé vẫn tăng cân và chiều cao phù hợp với tốc độ tăng trưởng của lứa tuổi thì cũng không đáng lo và chứng tỏ chế độ dinh dưỡng của bé cũng tạm được.\n" +
                    "Để tốc độ tăng trưởng chiều cao tốt hơn, bạn có thể chọn cho bé những thức ăn giàu canxi hơn như cua đồng, tôm tép nhỏ ăn cả vỏ, cá nhỏ nấu mềm hay chiên giòn ăn cả xương, duy trì sữa và chế phẩm sữa đủ. Bạn đừng cho bé ăn quá nhiều đạm. Muối cũng làm hạn chế khả năng hấp thụ và sử dụng canxi của cơ thể, ảnh hưởng không tốt đến chiều cao. Ngoài ra, bạn có thể cho bé uống thêm các loại men vi sinh có chứa thành phần sữa non có lợi cho việc phát triển chiều cao của con trẻ. Bạn cũng nên chú ý cho trẻ vận động ngoài trời, các bài tập hợp lý và phù hợp với lứa tuổi; ngủ ngon và đủ giấc cũng giúp trẻ tăng trưởng chiều cao.\n" +
                    "\n" +
                    "Bác sĩ Nguyễn Thị Thu Hậu",
            "Chế biến thức ăn nói chung và thức ăn cho trẻ nói riêng, nếu không biết cách, nhiều chất bổ có thể bị mất đi một cách phí phạm, thậm chí bị biến đổi thành những chất không có lợi cho sức khỏe.\n" +
                    "Các loại rau, củ, quả\n" +
                    "1. Đảm bảo các loại rau củ quả bạn mua cho con là tươi ngon nhất. Mua rau củ vào buổi sáng, đặc biệt lúc vừa được người bán thu hái rất lý tưởng vì lúc đó, rau củ là tươi ngon và nhiều dinh dưỡng nhất.\n" +
                    "2. Không nên ngâm ngập rau quả trong chậu nước mà nên rửa dưới vòi nước chảy. Như vậy, bạn sẽ tránh được việc các vitamin B, C và một số khoáng chất tan biến vào trong nước.\n" +
                    "3. Thử cho bé ăn một số rau củ không cần gọt vỏ vì hấu hết các chất dinh dưỡng được lưu trữ trong hoặc ngay dưới lớp vỏ củ quả. Tuy nhiên, bạn cần chọn lọc vì không phải loại nào cũng cho bé ăn cả vỏ được.\n" +
                    "4. Thành phần vitamin chủ yếu nằm trong vỏ và phần ngay dưới vỏ quả vì vậy bạn nên gọt vỏ mỏng nhất có thể. Thậm chí, bạn để lại chút ít vỏ nếu tin tưởng quả đó đảm bảo vệ sinh an toàn thực phẩm.\n" +
                    "5. Nên cho trẻ ăn rau quả tươi bất kỳ khi nào có thể. Với những bé mới ăn dặm hoặc khi bạn nghi ngờ độ an toàn của rau quả tươi thì ăn sống không phải cách thích hợp. Hãy dựa vào số tuổi, nguy cơ dị ứng và nguồn gốc rau quả khi bạn cho bé ăn sống.\n" +
                    "6. Nên chọn cách hấp rau củ hơn là cách luộc vì vitamin ít bị mất theo cách này. Một số nghiên cứu cho thấy, chế biến thức ăn dặm bằng lò vi sóng giữ lại nhiều dinh dưỡng hơn hấp dù phần lớn cha mẹ không thích dùng lò vi sóng để chế biến.\n" +
                    "7. Để giữ vitamin C, cần dùng rau quả, rửa rồi mới gọt - thái, và thái rồi cần nấu ngay, nấu nhanh và sau đó ăn ngay. Cần nấu rau quả trong thời gian ngắn nhất có thể, khi rau chín vừa là đủ. Lâu quá sẽ khiến vitamin trong rau củ bay hết\n" +
                    "8. Nêm muối ngay khi bắt đầu xào, cách này giúp rau chóng mềm và giúp rau giữ lại chất dinh dưỡng, đồng thời tiết ra chất ngọt của rau củ (do muối rất dương nên có ái lực hút vị ngọt rau củ - vốn rất âm – ra ngoài.\n" +
                    "9. Hãy dùng nước luộc rau, củ khi chế biến thức ăn cho trẻ. Điều này tận dụng được tối đa lượng chất dinh dưỡng thất thoát.\n" +
                    "10. Không đựng rau củ vào bát, đĩa bằng đồng vì đồng sẽ phá huỷ vitamin\n" +
                    "11. Cần bảo quản rau củ cho bé ở tủ lạnh để giảm thiểu thất thoát vitamin C. Nhưng dưa chuột, bí ngô, khoai tây hay cà chua… mất đi các giá trị dinh dưỡng khi được giữ lạnh và chịu đựng tủ lạnh rất kém, do đó, tốt hơn cả là nấu chín các loại rau, củ, quả này trước khi để vào tủ lạnh (khoai tây nghiền, sốt cà chua...).\n" +
                    "Các thực phẩm khác\n" +
                    "Vitamin là chất dễ bị mất khi nấu nướng nhất. Các vitamin tan trong chất béo như A, D, E, K tương đối bền vững với nhiệt độ, chỉ hao hụt 15-20% trong quá trình nấu nướng bình thường. Với hầu hết các nhóm thực phẩm, việc nấu lâu trên lửa đều không tốt.\n" +
                    "1. Thịt: Nấu ở nhiệt độ cao quá lâu, chất đạm sẽ giảm dinh dưỡng và khó tiêu. Việc chế biến lâu cũng làm mất chất khoáng, vitamin và khiến chất béo, đường trở nên độc hại.\n" +
                    "2. Cá: Khi đun nóng ở nhiệt độ 70 độ C, protit đông vón lại rồi bị thoái hóa. Khi có kèm theo giấm và các quả chua, axit làm quá trình này xảy ra ở nhiệt độ thấp hơn. Cần phải nấu cá không dưới 8-10 phút (đã cắt thành miếng nhỏ, hay nguyên con (từ 500g trở lên) không dưới nửa giờ. Cũng như đối với thịt, nên cho cá vào nước sôi, sau đó hạ lửa nhỏ xuống ngay. Khi rán (chiên), nhất định phải tẩm bột để cá không bị chảy mất nước. Và cần theo dõi không để rán quá, vì khi đó protein trở nên cứng và mất giá trị dinh dưỡng. Tốt hơn hết, nên rán cá ở cả hai mặt cho đến khi có vỏ vàng, sau đó nướng tiếp trong lò nướng 5-7 phút\n" +
                    "3. Dầu, mỡ: Ở nhiệt độ 102 độ C trở xuống, dầu mỡ không có biến đổi đáng kể. Nhưng khi đun lâu ở nhiệt độ cao hơn, các axit béo không no mất tác dụng có ích và tạo thành các chất có hại\n" +
                    "4. Tinh bột: Ở nhiệt độ đun sôi các loại đường đơn không có biến đổi đáng kể. Việc chế biến nóng làm cho tinh bột dễ tiêu hơn. Nhưng khi chế biến ở nhiệt độ cao, đặc biệt là trong môi trường khô, các thành phần tinh bột cũng bị biến đổi thành khó tiêu hóa hoặc độc hại với cơ thể\n" +
                    "5. Các loại hạt: Các loại hạt ít mất chất dinh dưỡng nhất. Nhưng không nên nấu chúng lâu. Bột mì chỉ nấu trong 10-15 phút; gạo, lúa mì trong 30-40 phút. Nên ngâm hạt đậu xanh, đậu Hà Lan trong nước lạnh khoảng 2 giờ. Sau đó đổ nước đó đi, cho vào nước lạnh mới và nấu\n" +
                    "6. Sữa: Không nên nấu sữa quá lâu và nấu sôi nhiều lần, nếu không protein trong sữa sẽ bị phân rã và các vitamin bị phá huỷ. Khi nấu sôi sữa, không giữ trên lửa quá 1-2 phút. Khi nấu các thực phẩm khác như bột, gạo, rau... với sữa, trước hết cần nấu những thứ đó trong nước, sau mới đổ sữa tươi vào, đun tiếp đến sôi và bắc ra ngay.\n" +
                    "7. Nên đậy vung khi chế biến để vitamin không bay hơi thật nhanh ra ngoài.\n" +
                    "8.  Các loại chất khoáng (canxi, photpho, kali, magiê...) trong quá trình nấu có các biến đổi về số lượng do chúng hòa tan vào nước. Do vậy, nên sử dụng thức ăn cả phần cái và phần nước để đảm bảo chất dinh dưỡng trong thức ăn cho trẻ.\n" +
                    ">> Tham khảo thêm cách nấu các món ngon ,món ngon cho bé, món ngon mỗi ngày, món ngon cuối tuần\n" +
                    "Giã đông thực phẩm đông lạnh\n" +
                    "1. Khi giải lạnh thực phẩm phải để thực phẩm giã đông từ từ vì thực phẩm dễ bị vỡ, các chất dinh dưỡng theo nước chảy ra ngoài làm giảm giá trị thực phẩm. Càng ít tiếp xúc với không khí bên ngoài thì chất lượng các thực phẩm càng được giữ tốt hơn.\n" +
                    "2. Nếu không có thời gian giã đông, bạn có thể nấu ngay. Nguyên liệu đang để lạnh bị chế biến nóng đột ngột cũng không làm mất nhiều chất dinh dưỡng, chỉ mất nhiều nhất là vitamin trong rau quả\n" +
                    "3. Bạn có thể yên tâm với một số loại sản phẩm được hướng dẫn sử dụng không cần giã đông trước khi nấu.",
            "Tôi cao 1m48, chồng tôi cao 1m59, so với chiều cao trung bình hiện nay thì hơi thấp, do vậy tôi rất sợ con sau này lùn giống bố mẹ. Xin bác sĩ cho biết, liệu con tôi có thể cao đúng chuẩn không và tôi cần phải làm gì? (Nguyễn Thúy, Hà Nội)\n\n"+
                    "Trả lời:\n" +
                    "\n" +
                    "Theo một số nghiên cứu, chiều cao chịu ảnh hưởng của nhiều yếu tố như dinh dưỡng (31%-32%); di truyền (23%); rèn luyện thể lực (20%), môi trường sống (16%), ánh nắng, tâm lý, bệnh tật, giấc ngủ… Nếu được nuôi dưỡng tốt, trong cùng một gia đình, thế hệ sau luôn luôn có chiều cao vượt hơn thế hệ trước.\n" +
                    "\n" +
                    "Trước đây, điều kiện dinh dưỡng của chúng ta chưa tốt nên có thể ngay cả ông bà cha mẹ cũng chưa phát huy hết tiềm năng về chiều cao của mình. Sữa là thực phẩm giúp tăng chiều cao tốt, dễ sử dụng. Các lọai sữa có đăng ký và kiểm tra chất lượng thì đều giúp bé tăng chiều cao, hoàn toàn không gây dậy thì sớm như đồn thổi. Bạn có thể cho bé uống thêm các loại men vi sinh có chứa thành phần sữa non sẽ giúp bé hấp thụ tốt và hỗ trợ tăng trưởng chiều cao tốt. Nếu chăm sóc hợp lý mà chiều cao của bé vẫn không bằng các bạn nhưng bé khỏe mạnh, thông minh và ngoan ngoãn thì vẫn hơn những bé cao mà không ngoan, hay bệnh.Trong 5 năm đầu tiên, vấn đề dinh dưỡng là yếu tố chính quyết định phát triển thể lực- trong đó có chiều cao. Những bé được nuôi dưỡng trong một môi trường tốt, vận động hợp lý sẽ cao gần như nhau. Bạn cứ tận dụng tối đa khả năng tăng chiều cao của con bằng chăm sóc hợp lý cho bé nhé.\n" +
                    "\n" +
                    "Bác sĩ Nguyễn Thị Thu Hậu",
            "Việc bổ sung sắt cho trẻ là rất quan trọng. Tuy nhiên, các phụ huynh nên chú ý liều lượng và tìm hiểu kỹ điều này vì việc thừa sắt có thể gây nguy hiểm tới tính mạng của trẻ.\n" +
                    "Thiếu sắt là bệnh khá phổ biến ở trẻ nhỏ. Việc bổ sung sắt hàng ngày cần căn cứ theo độ tuổi và nhu cầu của cơ thể. Thông thường, ở người lớn, việc bài tiết sắt hàng ngày khá ổn định nên nhu cầu sắt người lớn cần mỗi ngày là khoảng 1mg/ngày.\n" +
                    "\n" +
                    "Ở trẻ nhỏ, vì đây là giai đoạn phát triển nên nhu cầu về sắt cũng cao hơn. Thường thì trẻ sau sinh từ 4 tháng đến 3 tuổi cần khoảng 1mg sắt/1 kg trọng lượng cơ thể. Đối với trẻ sinh non thì cần nhiều hơn, khoảng 2mg/1kg trọng lượng cơ thể mỗi ngày.\n" +
                    "Tổng số lượng sắt được bổ sung vào cơ thể ở trẻ em không được vượt quán 15 mg mỗi ngày. Những trẻ em không bị thiếu sắt nếu cứ được bổ sung một cách quá liều lượng sẽ gây ra hiện tượng thừa sắt. Điều này không chỉ lãng phí tiền bạc mà còn gây ra những ảnh hưởng không lường tới sức khỏe của trẻ.\n" +
                    "Khi cơ thể bị thừa sắt sẽ dẫn đến rối loạn sinh lý, rối loạn chức năng nội tạng. Triệu chứng của việc hiện tượng thừa sắt là trẻ sẽ cảm thấy khó tiêu hóa, buồn nôn, chán ăn, đau bụng, táo bón… Nguy hiểm hơn là xuất hiện các triệu chứng đau đầu, chóng mặt, đổ mồ hôi, tim đập nhanh, thậm chí gây rối loạn chức năng gan và thận.\n" +
                    "\n" +
                    "Không chỉ có vậy, việc bổ sung sắt quá liều lượng còn có thể gây ra một số biến chứng đường tiêu hóa như viêm dạ dày, viêm đại tràng và một số biến chứng khác.\n" +
                    "Mới đây, Bộ Y tế Anh vừa đưa ra lời cảnh báo: Việc dùng sắt bổ sung quá liều có thể gây chết người ở trẻ nhỏ và các loại thuốc viên chứa sắt phải được giữ ngoài tầm với của trẻ.\n" +
                    "\n" +
                    "Theo Giáo sư Alasdair Breckenridge, Chủ tịch Uỷ ban An toàn Thuốc của Anh, phụ nữ mang thai và các bà mẹ cho con bú thường dùng sắt bổ sung hằng ngày trong khẩu phần ăn, nhưng họ chưa ý thức được sự nguy hiểm của sắt đối với trẻ nhỏ. Hằng năm, tại Anh, có khoảng 600 trẻ dưới 4 tuổi nhập viện do nuốt phải các viên sắt, trong đó có trung bình 1 trường hợp tử vong.\n" +
                    "\n" +
                    "Giáo sư này cũng cho biết rằng, nếu dùng săt đúng liều sẽ rất tốt. Tuy nhiên nếu dùng không đúng cách thì có thể gây chết người. Khi trẻ bị thiếu máu cũng chưa hẳn có nguyên nhân là do thiếu sắt. Người lớn nên cho trẻ tới bệnh viện khám trước khi tự ý bổ sung sắt cho con mình.",
            "Ăn sáng là một trong các bữa ăn quan trọng nhất trong ngày vì nó cung cấp năng lượng và chất dinh dưỡng để thực hiện các chức năng về thể chất và nhận thức. \n" +
                    "\n" +
                    "Nó đặc biệt quan trọng đối với học sinh, những người phải tiếp thu kiến thức mới và làm bài kiểm tra, bài thi tốt.\n" +
                    "\n" +
                    "Một số món ăn sáng khỏe mạnh có thể giúp cung cấp năng lượng và sự tập trung của trẻ khi tới trường.\n" +
                    "\n" +
                    "1. Bánh mì\n" +
                    "\n" +
                    "Bánh mì quét bơ đậu phộng: Cung cấp tinh bột, protein và chất béo tự nhiên từ bơ đậu phộng là nguồn năng lượng đủ cho bữa sáng của bé.\n" +
                    "\n" +
                    "Bạn cũng có thể thay bánh quy thay thế bánh mỳ để thay đổi khẩu vị và bữa ăn cho trẻ, giúp trẻ “hào hứng” với bữa sáng hơn.\n" +
                    "\n" +
                    "2. Trái cây\n" +
                    "\n" +
                    "Bạn chọn các loại trái cây như táo, cam, lê, chuối, đu đủ và dâu để giúp bổ sung các khoáng chất và vitamin.\n" +
                    "\n" +
                    "Hỗn hợp cam, chuối, sữa chua ít béo hoặc không béo là những chất có hàm lượng đường, tinh bột, chất xơ cao. Chứa nhiều vitamin và khoáng chất, cả canxi nữa.\n" +
                    "\n" +
                    "Các loại quả mọng: Hỗn hợp chuối, nước ép táo, quả việt quất sẽ cung cấp cho trẻ nhiều chất chống oxy hóa.\n" +
                    "\n" +
                    "Sa lát hoa quả: Thêm một chút sữa chua lên trên, khiến trẻ vừa thích thú ăn lại giúp thêm canxi, cũng như protein.\n" +
                    "\n" +
                    "3. Bột yến mạch\n" +
                    "\n" +
                    "Bột yến mạch dồi dào protein và vitamin B, tốt cho việc học tập của trẻ, làm giảm sự lo lắng qua các bài kiểm tra. Nó cũng chứa chất xơ, giúp kiểm soát nồng độ đường trong máu và ngăn ngừa mệt mỏi. Kết hợp bột yến mạch với quả tươi, ví dụ như quả việt quất hay lát dâu tây để thêm vitamin C và chất chống oxy hóa, giúp hỗ trợ hệ miễn dịch và ngăn ngừa tổn thương tế bào.\n" +
                    "\n" +
                    "4. Bánh bột gạo lứt\n" +
                    "\n" +
                    "Bạn kết hợp bánh bột gạo lứt với đậu phộng hoặc bơ hay chuối chín.\n" +
                    "\n" +
                    "5. Lòng trắng trứng\n" +
                    "\n" +
                    "Lòng trắng trứng giúp cung cấp năng lượng cho chức năng nhận thức và thể chất. Bạn nên thêm rau tươi khi chế biến thành món ăn cho trẻ, chẳng hạn như hành tây, lá rau bina, cà chua, ớt chuông và tỏi…",
            "Nhiều bậc cha mẹ băn khoăn khi bé đã đến kỳ ăn dặm mà chưa biết phải chế biến thực đơn mỗi bữa ăn dặm của trẻ.\n" +
                    "\n" +
                    "1. Cách chế biến chung\n" +
                    "\n" +
                    "Cách thức nghiền\n" +
                    "\n" +
                    "Bột rau: Rửa sạch lá rau (cải, dền, cải thảo, bắp cải…) trước, bỏ cuống, xé nhỏ, chần qua nước sôi rồi vớt ra, để vào một chiếc rá kim loại, dùng thìa canh dằm hoặc nghiền nát, lọc bột rau ra. Nếu không có rá kim loại thì có thể xắt nhỏ rau ra, cho dầu ăn vào chảo và xào bằng lửa lớn cho mềm. Một cách nữa là bỏ vào máy xay sinh tố để xay nhuyễn và cho vào cháo đun sôi lại.\n" +
                    "\n" +
                    "Bột cá: Rửa sạch cá khúc (cá trắm, cá hố, cá thu…) đựng vào bát. Nêm chút gia vị rồi hấp cá trong 10 -15 phút, sau khi nguội lột bỏ Da và xương rồi dùng thìa ép thành dạng bột.\n" +
                    "\n" +
                    "Bột thịt: Rửa sạch thịt nạc, bỏ gân, băm nhỏ hoặc xay rồi cho thêm chút bột mì, rượu và gia vị trộn đều, sau đó bỏ vào nồi hấp chín.\n" +
                    "\n" +
                    "Bột gan lợn: Rửa sạch gan, khía ra, cạo nhẹ mặt khía, cho một tí rượu và gia vị hấp chín, nghiền thành bột. Nếu là gan gà, vịt thì việc nghiền càng dễ dàng hơn.\n" +
                    "\n" +
                    "Bột tôm: Bóc vỏ tôm rửa sạch, băm nhỏ, nêm gia vị, trộn đều và hấp chín.\n" +
                    "\n" +
                    "Những lưu ý về tỉ lệ\n" +
                    "\n" +
                    "Thành phần dinh dưỡng trong việc ăn uống của bé cũng cần 1 tỉ lệ thích hợp, thông thường tỉ lệ thích hợp là: 3: 2: 1. Ví dụ: Gạo 30g thì bột thịt khoảng 20g và rau là 10g. Sau khi nấu xong, cần thêm vào vài giọt dầu thực vật để tăng thêm hương vị và nhiệt năng.\n" +
                    "\n" +
                    "Chế biến và cho bé ăn hợp lý là trên cơ sở chất bột, thêm các loại thực phẩm có nguồn gốc động và thực vật vào cũng cần một tỉ lệ hợp lý. Bất kể xuất phát từ nhu cầu sinh trưởng của trẻ hay mùi vị thì cũng không nên lấy khẩu vị người lớn làm tiêu chuẩn vì nếu quá mặn sẽ bắt thận của bé làm việc quá sức, thậm chí phù nề. Đặc biệt nên hạn chế bột nêm, hương liệu, mì chính…trong khẩu phần ăn của trẻ.\n" +
                    "2. Cách chế biến một số món\n" +
                    "\n" +
                    "1. Súp lơ\n" +
                    "\n" +
                    "Đầy ắp folate, chất xơ, canxi, súp lơ còn được biết tới là một thực phẩm chống ung thư hiệu quả. Đồng thời, mùi vị của súp lơ cũng phù hợp cho bé ăn dặm.\n" +
                    "\n" +
                    "Chế biến: Hấp chín một vài miếng súp lơ. Sau đó, nghiền nhỏ hoặc cắt dạng hạt lựu để bé ăn bốc. Súp lơ để nguội khiến bé dễ ăn hơn vì nó giảm được mùi hăng, nồng như lúc còn nóng. Súp lơ nguội để ngăn mát tủ lạnh còn là đồ nhấm nháp làm dịu cơn đau mọc răng của bé.\n" +
                    "\n" +
                    "2. Thịt\n" +
                    "\n" +
                    "Nhiều người trong chúng ta nghĩ thịt không tốt cho bé nhưng các chuyên gia dinh dưỡng khẳng định, thịt là một trong 10 loại thực phẩm hữu ích cho bé. “Thịt là nguồn dồi dào kẽm và sắt” – chuyên gia Brown giải thích.\n" +
                    "\n" +
                    "Chế biến: Hầm (ninh) thịt thật nhừ. “Thịt hầm (ninh) là ý tưởng phù hợp khi chế biến thịt cho bé vì nó dễ làm, bé lại dễ ăn và cách này được áp dụng với mọi loại thịt” – chuyên gia Matthew Amster-Burton (tác giả cuốn Hungry Monkey: A Food-Loving Father's Quest to Raise an Adventurous Eater – tạm dịch Băn khoăn của người cha về chuyện nuôi con) cho biết.\n" +
                    "\n" +
                    "Thịt có thể nấu cháo (bột) với hầu hết các loại rau củ, theo mùa. Nhớ là nếu ninh thịt thì nên ninh đủ lâu để thịt mềm, nhừ. Khi cho bé ăn thì cần cho ăn cả nước và cái.\n" +
                    "\n" +
                    "3. Quýt ngọt\n" +
                    "\n" +
                    "Chứa làm lượng cao vitamin C và chất chống oxy hóa, quýt ngọt là thực phẩm thú vị để bé bốc ăn. Các bé rất thích hương vị ngọt tự nhiên của quýt.\n" +
                    "\n" +
                    "Chế biến: Tách những tép quýt thành những đoạn ngắn, vừa với bé khi nhai và cho bé ăn bốc.\n" +
                    "\n" +
                    "4. Rau có lá màu xanh sẫm\n" +
                    "\n" +
                    "Rau có lá màu xanh sẫm chứa lượng sắt và folate cao. Cải bó xôi là loại rau điển hình nhất trong nhóm này.\n" +
                    "\n" +
                    "Chế biến: Rau đem nấu bột (cháo) cho bé.",
            "Một món canh ngon mẹ nấu cũng giúp bé tập ăn cơm dễ dàng hơn. Các mẹ tham khảo một số món canh phù hợp với bé tập ăn cơm dưới đây:\n"+
                    "Canh trứng gà cà chua\n" +
                    "1. Nguyên liệu:\n" +
                    "Cà chua 2 quả; Trứng gà 2 quả; Hạt nêm; Hành xanh\n" +
                    "2. Cách làm:\n" +
                    "Cà chua rửa sạch, thái múi cau. Trứng đập ra bát đánh tan. Hành xanh thái nhỏ.\n" +
                    "Đặt chảo lên bếp, cho 2 thìa dầu ăn đun nóng, phi đầu hành cho thơm.\n" +
                    "Cho cà chua vào xào, nêm hạt nêm. Xào cà chua chín thì cho nước vào.\n" +
                    "Đun nước canh sôi, nêm nếm lại cho vừa ăn. Từ từ cho trứng vào nồi nước, vừa cho vừa dùng đũa khuấy liên tục theo 1 chiều.\n" +
                    "Để lửa vừa cho canh sôi trở lại, trứng chín nổi thành nhiều vân nhỏ là được. Rắc hành xanh vào rồi tắt bếp.\n" +
                    "Múc ra bát ăn nóng.\n" +
                    "Canh bí đao nấu sườn\n" +
                    "1. Nguyên liệu:\n" +
                    "300g sườn; 500g bí đao; Hành lá; Hạt nêm\n" +
                    "2. Cách làm:\n" +
                    "Sườn rửa sạch cho vào nồi cùng với lưng âu canh nước lã. Ninh nhừ sườn, khi sôi hớt bọt cho nước thật trong.\n" +
                    "Cho bí đao xắt khúc vào nấu, đến khi chín tới là được.\n" +
                    "Xắt hành cho vào nồi rồi bắc ra ngay.\n" +
                    "Canh thịt nấu chua\n" +
                    "1. Nguyên liệu:\n" +
                    "50g thịt nạc; 1 quả cà chua chín; 2-3 quả sấu hoặc viên canh chua; Hành hoa, gia vị.  \n" +
                    "2. Cách làm:\n" +
                    "Hòa thịt nạc với nước (đủ để nấu canh), đun cho tới khi sôi lăn tăn thì dùng hớt bọt hớt thật sạch lớp váng ở trên đi (điều này rất quan trọng, nếu để nước canh đục sẽ mất ngon.\n" +
                    "Cà chua bỏ vỏ, thái miếng cau cho vào cùng với sấu hoặc viên canh chua, nêm gia vị, đun nhỏ lửa khoảng 5-7 phút thì tắt bếp, cho hành hoa cắt khúc vào.\n" +
                    "Canh gà nấm\n" +
                    "1. Nguyên liệu:\n" +
                    "1 bộ xương gà; 100g thịt lườn gà; 100g nấm các loại, tùy theo khẩu vị; 1 miếng gừng nhỏ; Gia vị.\n" +
                    "2. Thực hiện:\n" +
                    "Sơ chế nấm: Cắt bỏ chân nấm, rửa sạch, để ráo nước.\n" +
                    "Xương gà ninh lấy nước cùng với gừng, bỏ khung xương và bã gừng. Nêm vừa miệng. \n" +
                    "Cho nấm theo thứ tự từ những loại nấm dày, khó chín trước. Sau cùng là nấm nhỏ, nhanh chín.\n" +
                    "Múc ra bát, dùng khi còn nóng.\n" +
                    "Nấm là một loại nguyên liệu bổ dưỡng, ngon miệng, có thể được chế biến thành nhiều món, từ các món xào đến các món canh, soup.  Đặc biệt, vị của nấm rất thích hợp với vị gà. Canh gà nấm là một loại canh rất tốt cho sức khỏe.\n" +
                    "Canh sườn hầm khoai lang, nước dừa\n" +
                    "1. Nguyên liệu:\n" +
                    "150g sườn non; 1 củ khoai lang; 50g đậu cúc; 1 trái dừa xiêm, 1 thìa cà phê muối, 1/3 thìa cà phê hạt nêm, Một ít hành ngò\n" +
                    "2. Thực hiện:\n" +
                    "Sườn non rửa sạch, chặt khúc vừa\n" +
                    "Khoai lang gọt vỏ, xắt hạt lựu, cho vào nước ngâm cho sạch mủ. Đậu cúc ngâm nở, bóc bỏ vỏ lụa. Hành, ngò rửa sạch, xắt nhuyễn\n" +
                    "Dừa lấy nước. Hầm sườn chung với nước dừa, cho thêm ít nước, hầm đến khi sườn mềm, cho tiếp đậu cúc, khoai lang, nêm muối, hạt nêm, nấu thật mềm. Vớt sườn ra, xé nhỏ, bỏ xương, cho trở lại nồi canh. Khi canh sôi lại, cho vào ít hành ngò xắt nhuyễn, nhắc xuống. Món này dùng kèm cơm tán nhuyễn.\n" +
                    "Canh cua mồng tơi\n" +
                    "1. Nguyên liệu:\n" +
                    "300g cua đồng xay; 1 bó rau mồng tơi; Củ hành, hạt nêm, dầu ăn\n" +
                    ">> Tham khảo thêm: món ngon , món ngon dễ làm, món ngon mỗi ngày, món ngon cho bé \n" +
                    "2. Thực hiện:\n" +
                    "Rau mồng tơi lặt lấy lá non, bỏ cọng, rửa sạch, xắt ngắn.\n" +
                    "Gỡ gạch cua bỏ vào chén, chuẩn bị hành tím bào.\n" +
                    "Chuẩn bị 1lít nước, bỏ cua vào khuấy cho tan, lược bỏ xác cua.\n" +
                    "Bắc lên bếp nấu lửa nhỏ, nước sôi cua sẽ nổi lên trên, vớt cua ra bỏ vô tô. Cho mướp và rau mồng tơi vào, nước sôi, nêm cho vừa ăn.\n" +
                    "Bắc chảo nóng, phi hành cho thơm, bỏ gạch cua vào xào.\n" +
                    "Khi múc canh ra tô, để cua lên trên rồi thêm gạch cua đã xào vào.",
            "Con gái tôi 19 tháng, nặng 9,5kg, cao 74cm. Bé ngủ đêm không ngon giấc, thường bắt mẹ gãi ngứa suốt đêm và hay bị viêm đường hô hấp trên. Tôi phải làm gì để tăng sức đề kháng cho con? (Minh Trí, Hà Nội)\n" +
                    "Trả lời:\n" +
                    "\n" +
                    "Con gái bạn có cân nặng ở mức dọa suy dinh dưỡng (trung bình ở lứa tuổi này là 10,5kg) và chiều cao thì ở mức suy dinh dưỡng thể thấp còi (trung bình 81,7cm). Với chiều cao như trên và những triệu chứng bạn mô tả thì bé đã bị còi xương.\n" +
                    "Bé cần được cung cấp đầy đủ các chất dinh dưỡng để cao lớn và phòng chống bệnh, bạn nên tham khảo những phần tư vấn trước trong chuyên mục này. Tuy nhiên, con bạn cần chú ý đặc biệt đến phần canxi và vitamin D để điều trị còi xương. Bé cần được điều trị thêm với bác sĩ chuyên khoa để có liều lượng thích hợp.\n" +
                    "\n" +
                    "Những bé suy dinh dưỡng luôn có đề kháng kém nên hay bệnh và bệnh lâu khỏi, bệnh nhiều lại làm bé suy dinh dưỡng hơn, đây là một vòng luẩn quẩn mà chúng ta cần cắt đứt sớm. Bạn có thể cho bé sử dụng thêm những thực phẩm làm tăng sức đề kháng như sữa non kết hợp với 5 loại lợi khuẩn có ích cho sức khỏe của trẻ, vitamin, kẽm. Bổ sung men vi sinh có thể giúp trẻ hấp thụ chất dinh dưỡng tốt hơn, từ đó cải thiện tình hình của trẻ.\n" +
                    "\n" +
                    "Bác sĩ Nguyễn Thị Thu Hậu",
            "Khi đi chơi xa và nhiều ngày, phụ huynh cần có kế hoạch để bảo đảm chế độ ăn uống hợp lý, không làm ảnh hưởng đến sức khỏe của trẻ.\n" +
                    "Sau những ngày miệt mài học tập và trải qua các kỳ thi căng thẳng, trẻ em lại có kỳ nghỉ hè để về quê hay du lịch cùng gia đình. Tùy vào độ tuổi, thời gian xa nhà, địa điểm và dịch vụ du lịch mà trẻ có những chế độ ăn uống khác nhau. Nhưng cho dù lúc đi chơi không thể thuận tiện và chu đáo như khi ở nhà thì trẻ vẫn cần được cung cấp những bữa ăn đủ lượng và chất, phù hợp với mức sinh hoạt và vận động nhiều hơn hẳn ngày thường.\n" +
                    "\n" +
                    "\n" +
                    "Ăn nhiều bữa trong ngày\n" +
                    "\n" +
                    "Đang trong giai đoạn phát triển nên trẻ em cần được cung cấp đủ năng lượng và dưỡng chất để sống và đáp ứng nhu cầu tăng trưởng. Tuy nhiên, thể tích dạ dày tỉ lệ thuận với lứa tuổi nên các bậc cha mẹ cần cho trẻ ăn thành nhiều bữa nhỏ.\n" +
                    "Ngoài ra, do thức ăn của trẻ thường là sữa, bột, cháo, bún và các thức ăn lỏng, loãng, ít năng lượng, mau tiêu, mau đói nên khi đi du lịch, chúng ta cần cung cấp thức ăn thành nhiều lần trong ngày thì mới đạt đủ số năng lượng và dưỡng chất cần thiết. Với nhũ nhi thì cần cả những cữ bú sữa ban đêm.\n" +
                    "\n" +
                    "Những bữa ăn chính vào buổi sáng, trưa, tối và cả những bữa ăn phụ giữa các bữa ăn chính đều rất cần thiết cho trẻ. Buổi sáng, thường diễn ra nhiều hoạt động vui chơi nên đòi hỏi cơ thể phải nạp năng lượng đầy đủ. Mặt khác, sau một giấc ngủ dài, cơ thể rất cần bổ sung từ 25% - 35%  tổng năng lượng trong ngày để duy trì hoạt động.\n" +
                    "\n" +
                    "Bữa phụ là những bữa ăn nhẹ xen kẽ giữa các bữa chính để hỗ trợ kịp thời khi các bữa chính cách xa nhau 4-5 giờ. Trẻ nên ăn bữa phụ tầm 9 giờ, 15-16 giờ và trước khi đi ngủ buổi tối. Thức ăn trong bữa phụ có thể là hộp sữa tươi, hũ sữa chua, cái bánh bông lan, củ khoai, trái bắp, rau câu, ly kem, trái cây… Các loại thức ăn nên đa dạng và thay đổi để cung cấp đủ dinh dưỡng.\n" +
                    "\n" +
                    "Các bậc cha mẹ nên từ bỏ ý nghĩ bữa phụ của trẻ chỉ là ly nước cam, cái bánh quy, viên kẹo hay vài múi quýt là ổn. Những món ăn vặt này sẽ không cung cấp đủ lượng và chất dinh dưỡng cần thiết cho trẻ trong điều kiện phải hoạt động nhiều. Vì vậy, nên cho trẻ ăn kèm ngay sau bữa ăn chính, không nên ăn rải rác suốt ngày sẽ làm trẻ bị “no ngang”, dẫn đến biếng ăn vào bữa chính.\n" +
                    "\n" +
                    "Đối với trẻ em, tổng lượng thức ăn trong ngày là rất quan trọng. Nếu bữa nào gặp món ăn cho dù là đặc sản nhưng không hợp khẩu vị lắm thì trẻ có thể ăn ít hơn ngày thường. Lúc này, bạn có thể cho trẻ uống bù thêm một ít sữa, bánh flan, kem... ngay sau khi ăn bữa chính hoặc ăn cữ ăn sau sớm hơn.\n" +
                    "\n" +
                    "Lưu ý khi đi chơi xa\n" +
                    "\n" +
                    "Khi đi du lịch, các loại thức ăn công nghiệp chế biến sẵn không thể thiếu vì tiện mang theo và lâu hư. Giò lụa, lạp xưởng chiên, bánh chưng, bánh giò, xôi nếp, gà chiên có thể dùng trong 1-2 ngày; các loại xúc xích, patê hộp, thịt hộp, phô mai, sữa hộp, mì gói, cháo ăn liền, phở gói, bánh quy có thể bảo quản lâu hơn.\n" +
                    "Ngoài ra, các chuyến du lịch không thể thiếu trái cây và khoai củ, dưa leo, cà chua, củ sắn. Trong trường hợp thiếu rau xanh, có thể thay bằng trái cây để bảo đảm bữa ăn tươi, cung cấp nhiều vitamin và chất xơ.\n" +
                    "\n" +
                    "Nếu trẻ cùng gia đình du lịch ngắn ngày thì vấn đề ăn uống trễ giờ, thiếu bữa, thiếu chất dinh dưỡng có thể chấp nhận được. Nhưng khi đi chơi xa từ 4-5 ngày trở lên thì cần có kế hoạch bảo đảm chế độ ăn uống, không làm ảnh hưởng đến sức khỏe của trẻ.\n" +
                    "\n" +
                    "Khi khẩu phần ăn của trẻ bị sút giảm kết hợp với mất sức do vui chơi nhiều, ngủ ít thì không chỉ gặp nguy cơ thiếu năng lượng, thiếu dinh dưỡng mà còn làm giảm sức đề kháng của cơ thể. Lúc này, trẻ dễ mắc bệnh và ăn kém ngay trong chuyến du lịch hoặc sau khi về nhà.\n" +
                    "Bữa sáng đừng qua loa\n" +
                    "\n" +
                    "Bữa ăn sáng cũng như bữa trưa, tối phải có đủ 4 nhóm thực phẩm là bột đường (cơm, cháo, bún, mì, nui, phở, khoai…); đạm (thịt, cá, tôm, trứng, đậu hũ…); chất béo (dầu, mỡ), rau củ và trái cây. Chẳng hạn, với bữa sáng cho trẻ trên 2 tuổi, nếu ăn mì gói thì cần thêm ít thịt hay xúc xích, xà lách, trái chuối; ăn xôi đậu có dừa nạo thì thêm một miếng thanh long; bánh ướt có chả lụa thì thêm giá trụng, rau thơm; tô bún có thịt xào, mỡ hành và dưa leo xắt nhỏ.",
            "Sau 2-3 tuổi đa số các bé đã cai sữa mẹ, bé cũng không còn ăn bột, cháo nữa và bé đã có thể \"vô tư\" ăn các loại thức ăn cứng. Điều quan trọng lúc này là một chế độ ăn đa dạng, đáp ứng đủ nhu cầu dinh dưỡng của cơ thể bé. \n" +
                    "Để cung cấp đủ dưỡng chất cần thiết ở lứa tuổi này một ngày các bạn cần cho bé ăn như sau:\n" +
                    "- 2-3 bữa cơm nát nhưng phải đủ 4 nhóm chất bao gồm: chất bột (gạo, đỗ, mỳ...), chất đạm (thịt, cá, tôm, cua, trứng...), chất béo (dầu ăn, mỡ), vitamin và chất khoáng. Bạn lưu ý nhóm chất béo cần được cung cấp đủ, việc thiếu chất béo cũng dẫn tới việc hấp thu một số các vitamin (A, D, E, K) bị hạn chế, vì đó là các vitamin tan trong dầu.\n" +
                    "- 2-3 bữa phụ bao gồm: sữa, sữa chua, súp, bún, phở, bánh ngọt...thay đổi. Lứa tuổi này nguồn cung cấp năng lượng từ sữa vẫn rất quan trọng, mỗi ngày bạn nên cho bé uống khoảng 500-600 sữa (có thể gồm sữa công thức, sữa chua, sữa tươi...).\n" +
                    "- 1-2 bữa hoa quả chín hoặc nước hoa quả sau mỗi bữa ăn theo nhu cầu của bé.  \n" +
                    "Trong đó lượng thực phẩm trong một ngày cho bé ở lứa tuổi này là: 150-200g gạo, 120-150g thịt, hoặc 150-200g cá, tôm… và 3-4 quả trứng mỗi tuần), 150-200g rau xanh, 30-40g dầu ăn hoặc mỡ.",
            "Món ăn thuỷ hải sản thường giàu đạm và các dưỡng chất cần thiết khác, giúp trẻ khoẻ mạnh và tăng trưởng cân đối. Tuy nhiên, nếu không biết lựa chọn, bảo quản và chế biến đúng cách, lại ăn không có mức độ thì “lợi bất cập hại”.\n" +
                    "Ăn gì, kiêng gì?\n" +
                    "Những loại tốt cho trẻ: cá biển là thực phẩm tuyệt vời do chứa đạm, có giá trị sinh học cao với tỷ lệ cân đối, phù hợp với cơ thể người. Cá còn rất giàu chất béo không no omega-3 cần để tạo màng tế bào thần kinh, phát triển thị giác và phòng chống bệnh tim mạch. Gan cá còn rất giàu vitamin A và D. Do đó, ăn cá ít nhất ba lần/tuần rất có lợi cho sức khoẻ.\n" +
                    "Hàu thì rất giàu kẽm là thành phần của hơn 300 enzyme bên trong cơ thể, là chất cần thiết để trẻ tăng trưởng, cũng rất cần để phát triển hệ sinh dục. Hầu hết các loại hải sản đều giàu canxi (nhất là các loại cá nhỏ ăn được cả xương) nên rất cần cho xương và răng. Cá đồng tuy không chứa nhiều các axít béo chưa no như cá biển nhưng cũng chứa nhiều chất đạm quý dễ hấp thu, lại ít gây dị ứng hơn cá biển.\n" +
                    "Những hải sản không nên cho trẻ ăn: đó là cá mập, cá kình, cá lưỡi kiếm (cá cờ), cá thu lớn, cá ngừ lớn… và những loại cá có thể chứa hàm lượng thuỷ ngân cao vì sống ở vùng biển ô nhiễm. Không ăn hải sản đã chết vì dễ gây ngộ độc.\n" +
                    "Trẻ tuổi nào có thể ăn thuỷ sản?\n" +
                    "Do đạm trong hải sản thường hay gây dị ứng cho trẻ, nên tốt nhất là cho bé ăn từ tháng thứ bảy trở đi, cho ăn từng ít một để bé thích nghi dần, ở dạng bột sệt hoặc nghiền nhuyễn. Với những trẻ có cơ địa dị ứng thì các bà mẹ cần thận trọng hơn.\n" +
                    "Khi trẻ bắt đầu ăn cá, các bà mẹ nên cho ăn cá đồng trước, chọn cá nạc ít xương như cá lóc, cá trắm, cá trê... Với cá biển, nên ăn cá hồi, cá thu, cá ngừ (nhỏ)... vốn chứa nhiều omega-3. Tôm cũng giàu đạm và canxi, từ tháng thứ bảy trở đi các bà mẹ có thể cho con ăn tôm đồng, tôm biển. Cua đồng chứa hàm lượng canxi cao, nên cho trẻ ăn thường xuyên. Các loại hải sản có vỏ như hàu, ngao, hến, trai… chứa nhiều kẽm, một vi chất quan trọng với trẻ, nên cho trẻ ăn khi đã một tuổi, dùng nước nấu cháo, còn thịt xay băm nhỏ.\n" +
                    " \n" +
                    "Ăn bao nhiêu là đủ?\n" +
                    "Ngày nào cũng có thể cho bé ăn 1 – 2 bữa từ thuỷ hải sản, nhưng phải tập cho ăn ít một, chọn loại tươi ngon, nấu chín kỹ để tránh ngộ độc. Tuỳ theo tháng tuổi mà lượng ăn mỗi bữa khác nhau:\n" +
                    "Trẻ 7 – 12 tháng: mỗi bữa có thể ăn 20 – 30g thịt cá, tôm (đã bỏ xương, vỏ) nấu với bột, cháo, mỗi ngày có thể ăn một bữa, 3 – 4 bữa/tuần.\n" +
                    "Trẻ 1 – 3 tuổi: mỗi ngày ăn một bữa hải sản nấu với cháo hoặc ăn mì, bún, súp… mỗi bữa ăn 30 – 40g thịt của hải sản.\n" +
                    "Trẻ 4 tuổi trở lên: có thể ăn 1 – 2 bữa hải sản/ngày, mỗi bữa có thể ăn 50 – 60g thịt hải sản, nếu ăn ghẹ có thể ăn nửa con/bữa, tôm to có thể ăn 1 – 2 con/bữa (100g cả vỏ).\n" +
                    " \n" +
                    "Lưu ý cả cách chế biến\n" +
                    "Hải sản chế biến chưa chín hẳn (gỏi cá, hàu sống, sò, mực nướng…) có thể ẩn chứa vi trùng và ký sinh trùng đường ruột. Ngày nay, khi môi trường ngày một ô nhiễm thì còn phải kể đến nguy cơ nhiễm kim loại nặng như thuỷ ngân. Để hạn chế các nguy cơ này, cần lưu ý khi chế biến.\n" +
                    "Trẻ còn trong giai đoạn ăn bột và cháo: xay, nghiền nhỏ cá, tôm để nấu bột hoặc cháo. Nếu là cá đồng nhiều xương, nên luộc chín cá rồi gỡ xương. Cá biển nạc có thể xay sống như xay thịt rồi cho vào nấu bột, nấu cháo. Với cua đồng thì giã lọc lấy nước để nấu bột, cháo. Tôm to bóc vỏ, sau đó xay hoặc băm nhỏ, với tôm quá nhỏ có thể giã lọc lấy nước như nấu bột cua. Với các loại hải sản có vỏ, luộc chín lấy nước nấu cháo, bột, thịt xay hoặc băm nhỏ cho vào cháo, bột.\n" +
                    "Trẻ ba tuổi trở lên, ngoài ăn các loại cháo, mì, miến… nấu với hải sản, có thể cho bé ăn tôm, cua, ghẹ, ngao nguyên con dạng luộc, hấp. Điều quan trọng nhất là phải nấu chín kỹ.",
            "Trứng là món ăn bổ dưỡng nhưng dễ khiến trẻ đầy bụng, khó tiêu và đặc biệt là dễ gây dị ứng cho trẻ em. Theo kinh nghiệm, nhiều người thường bổ sung trứng vào thực đơn lúc trẻ bắt đầu ăn dặm. Nhưng cho trẻ ăn trứng sao cho thật hợp lý và cách chế biến trứng ngon là điều không ít bậc cha mẹ băn khoăn.\n" +
                    "Dưới đây là một vài gợi ý hay cho các bậc phụ huynh:\n" +
                    "Lượng trứng cho trẻ ăn bao nhiêu là đủ?\n" +
                    "Tuy trứng là thực phẩm rất tốt nhưng cũng không nên cho ăn quá nhiều, vì hàm lượng chất béo trong trứng cao làm bé dễ bị đầy bụng, khó tiêu rối loạn tiêu hóa.\n" +
                    "Cho trẻ ăn trứng theo từng độ tuổi - 1\n" +
                    "Trứng là món ăn bổ dưỡng nhưng dễ gây dị ứng cho trẻ em. (Ảnh minh họa).\n" +
                    "Tùy theo tháng tuổi mà cho bé ăn trứng với số lượng khác nhau:\n" +
                    "Chú ý:\n" +
                    "- Không cho trẻ ăn trứng khi đang cảm sốt vì lượng protein cao trong trứng sẽ làm nhiệt độ cơ thể tăng khiến trẻ khó bình phục.\n" +
                    "- Nếu trẻ bị dị ứng (hoặc gia đình có cha/mẹ bị dị ứng với trứng), nên cho ăn trứng sau 1 tuổi.\n" +
                    "- Dị ứng trứng thường xảy ra với trẻ từ 1 - 3 tuổi. Vì thế, cha mẹ cần theo dõi và hỏi ý kiến của các bác sĩ nhi khoa.\n" +
                    "- Trẻ 6-7 tháng tuổi: chỉ nên ăn 1/2 lòng trứng gà/bữa, ăn 2-3 lần/tuần\n" +
                    "- Trẻ 8-12 tháng tuổi: ăn 1 lòng đỏ/bữa, ăn 3-4 bữa trong 1 tuần.\n" +
                    "- Trẻ 1-2 tuổi: nên ăn 3-4 quả trứng/tuần. ăn cả lòng trắng.\n" +
                    "- Trẻ từ 2 tuổi trở lên nếu bé thích trứng có thể cho ăn 1 quả/ngày.\n" +
                    "Chế biến trứng cho trẻ tùy theo tháng tuổi:\n" +
                    "Trẻ 6-12 tháng: nên cho ăn bột trứng.\n" +
                    "Cách nấu bột trứng: nấu chín bột mới cho trứng. Đập lòng đỏ trứng vào bát đã có rau băm nhỏ, đánh đều trứng và rau, nồi bột sôi trên bếp đổ trứng và rau vào quấy đều nhanh tay, bột sôi lên là được, không nên đun kỹ quá.\n" +
                    "Trẻ 1-2 tuổi: có thể ăn cháo trứng\n" +
                    "Cũng tương tự như nấu bột trứng, khi cháo chín mới cho trứng, đun sôi lại là được, ngoài ra có thể cho trẻ ăn trứng luộc vừa chín tới.\n" +
                    "Trẻ từ 2 tuổi trở lên: có thể ăn cháo trứng, trứng luộc, trứng rán đúc thịt, trứng sốt cà chua ăn với cơm.\n" +
                    "Khi cho trẻ ăn trứng, không nên:\n" +
                    "- Cho đường vào trứng: Vì cách làm này khiến protein trong trứng kết hợp với axit amoni trong đường glucozo tạo thành hợp chất khó hấp thu khiến trẻ ợ chua, khó tiêu và ảnh hưởng không tốt cho sức khỏe.\n" +
                    "- Để trẻ uống sữa đậu nành trước hoặc sau khi ăn trứng: Trong sữa đậu nành có men protidaza kiềm chế các protein trong trứng khiến trẻ bị đầy bụng và khó chịu.\n" +
                    "- Để trứng còn sống: Nên cho trẻ ăn trứng đã nấu chin kỹ vì lúc này protein – một chất vốn có kết cấu chặt chẽ trong trứng trở nên xốp lại, giúp trẻ dễ tiêu hóa hơn. ",
            "Do lỗi của cha mẹ, nhiều trẻ đang phải 'sống trong sợ hãi' mỗi khi bữa ăn đến.\n" +
                    "\n" +
                    "Hàng xóm nhà tôi thường diễn ra 2 hoạt cảnh: Một nhà, bé trai đã học tới lớp 2 nhưng vẫn thích vừa ăn, vừa chơi và mẹ hoặc người giúp việc vẫn phải bón cơm. Mỗi bữa ăn kéo dài không dưới 1 tiếng đồng hồ, bát cơm chảy nước ròng ròng vẫn cố đút cho con bằng được..\n" +
                    "\n" +
                    "Một nhà khác, cứ đến giờ ăn của thằng bé là cả xóm biết. Vì sao? Vì bé sẽ khóc ngằn ngặt, khóc gằn từng tiếng và tiếng khóc như 'chuông báo động' vang ầm cả khu, báo hiệu nó đang phải ăn bột. Thường sau mỗi bữa ăn, má thằng bé đỏ lựng vì bị… mẹ tát. Cứ ngậm là… tát. Tát xong thì khóc, thế là nuốt miếng bột đang ngậm trong mồm. Cứ thế, trường ca ngậm – tát – khóc tiếp diễn ngày này qua ngày khác.\n" +
                    "Ăn uống được xếp hạng là một trong 'tứ khoái' của đời người. Nhưng do sai lầm của cha mẹ, rất nhiều trẻ đang phải 'sống trong sợ hãi' mỗi khi bữa ăn đến. Để giúp trẻ 'thoát' khỏi nỗi sợ, bản thân cha mẹ phải nhận ra sai lầm.\n" +
                    "\n" +
                    "Dưới đây là 5 lỗi phổ biến của các bậc phụ huynh khi cho trẻ ăn\n" +
                    "\n" +
                    "1. Coi đồ ăn như một phần thưởng\n" +
                    "\n" +
                    "Không sử dụng một loại thức ăn như là một phần thưởng cho việc ăn một loại thức ăn khác. Chẳng hạn: “Con ăn hết 2 bát cơm, mai mẹ sẽ cho con đi ăn KFC”… Làm như vậy sẽ khiến trẻ ăn cơm như là một nghĩa vụ và một điều bắt buộc. Rất có thể những lần sau trẻ sẽ đem những món ăn chúng thích ra làm điều kiện với cha mẹ chúng. Đồng thời cha mẹ cũng không nên dùng thức ăn để xoa dịu tâm trạng của trẻ. Nếu con bạn đang buồn, đang tức giận nhất định sẽ không đem lại cảm giác ngon miệng khi ăn.\n" +
                    "\n" +
                    "2. Cho trẻ uống nhiều nước có gas, nước ngọt\n" +
                    "\n" +
                    "Cho trẻ thưởng thức đồ uống có chứa lượng calo cao chính là cha mẹ đang 'tiếp tay' cho căn bệnh thừa cân, béo phì ở trẻ nhỏ.\n" +
                    "\n" +
                    "Nhấm nháp một quả táo hay vài quả nho có thể khiến trẻ đói bụng và ăn uống ngon miệng nhưng uống một cốc nước táo hay nước nho ép thì không. Ngoài ra, ăn hoa quả còn cung cấp chất xơ có lợi cho hệ tiêu hóa của trẻ.\n" +
                    "3. Bắt trẻ ăn nhiều và phải ăn hết khẩu phần ăn\n" +
                    "\n" +
                    "Ở mỗi độ tuổi, nhu cầu năng lượng của trẻ khác nhau và mẹ nên cung cấp một lượng vừa phải. Nếu bắt trẻ ăn nhiều quá, mà bữa nào cũng cố ép ăn hết bát, bé sẽ chán và sợ ăn.\n" +
                    "\n" +
                    "Trẻ bị ép ăn nhiều dẫn đến lượng lipid trong máu cao gây ra bệnh gan nhiễm mỡ. Các nghiên cứu đã cho thấy tỷ lệ trẻ em bị ép ăn quá nhiều sẽ có nguy cơ mắc bệnh béo phì là 31,4%, tỷ lệ mắc bệnh gan nhiễm mỡ tăng 7,8% so với các trẻ em khác. Vì vậy, nếu trẻ nói con no rồi hoặc không muốn ăn thì bạn đừng cố nài ép.\n" +
                    "\n" +
                    "4. Cho trẻ vừa chơi, vừa ăn\n" +
                    "\n" +
                    "Trẻ ở độ tuổi mẫu giáo thích khám phá nên thường tận dụng thời gian để nghịch ngợm, mày mò, khám phá và lý giải các sự vật, hiện tượng xảy ra xung quanh. Vì vậy, tật xấu vừa ăn vừa chơi, thiếu tập trung trong bữa ăn là căn bệnh 'chung' của nhiều trẻ.\n" +
                    "\n" +
                    "Trẻ ham chơi, bỏ ăn là việc thường xảy ra ở mọi gia đình trẻ do thiếu kinh nghiệm trong cách giáo dục. Nguyên nhân là do ngay từ đầu các bậc cha mẹ không biết phương pháp dạy cho trẻ ăn đúng mà thường nuông chiều dẫn đến mỗi khi cho ăn, trẻ thường đòi hỏi những trò chơi thì mới chịu ăn. Do đó, chúng ta phải thay đổi phương pháp giáo dục cho trẻ ăn chứ không có thuốc nào trị bệnh trẻ ham chơi bỏ ăn.\n" +
                    "\n" +
                    "5. Ăn fast food quá nhiều\n" +
                    "\n" +
                    "Trẻ em ăn nhiều các loại đồ ăn nhanh như khoai tây chiên, bánh quy, pizza… trước 3 tuổi có chỉ số IQ thấp hơn các em khác. Những loại thức ăn này có thể gây thiệt hại về lâu dài cho trí tuệ của các em - một dự án nghiên cứu tại ĐH Bristol khẳng định.\n" +
                    "\n" +
                    "Thức ăn nhanh luôn hấp dẫn trẻ nhỏ nhưng lại không phải là những món ăn bổ dưỡng và có lợi cho sức khỏe. Do đó, bạn cần phải hết sức lưu ý khi cho trẻ ăn đồ ăn này.",
            "Con tôi 4 tuổi, thấp hơn so với bạn đồng lứa. Tôi muốn con cao hơn nên định bổ sung canxi cho cháu, không biết uống nhiều canxi có bị cứng xương, khiến xương khó phát triển không? (Xuân Hiếu, Hà Nội)\n" +
                    "Trả lời:\n" +
                    "\n" +
                    "Canxi là một trong những yếu tố dinh dưỡng giúp tăng chiều cao. Ở trẻ từ 2 tuổi trở lên, nếu cân nặng phát triển tốt hoặc thừa thì có thể chuyển một phần sang sữa canxi (thường là sữa tách béo một phần) hoặc các loại thực phẩm chức năng thúc đẩy tăng trưởng chiều cao như sữa non.\n" +
                    "Trong dinh dưỡng, quá thừa hay quá thiếu đều không có lợi. Trong từng trường hợp cụ thể mà cách can thiệp có khác nhau. Bạn có thể tham khảo thêm ý kiến bác sĩ chuyên khoa nhé.\n" +
                    "\n" +
                    "Bác sĩ Nguyễn Thị Thu Hậu",
            "Dinh dưỡng cho trẻ 4 – 6 tuổi\n" +
                    "\n" +
                    "Về chất: Các nhu cầu về dinh dưỡng của các bé 4 – 6 tuổi, cũng như với tất cả các bé tuổi mẫu giáo đều tương tự với nhu cầu về dinh dưỡng của các thành viên khác trong gia đình.\n" +
                    "\n" +
                    "Về lượng: Khẩu phần của mỗi bé ở mỗi độ tuổi lại khác nhau. Nhưng nói chung, các bé cần các nhóm thực phẩm cơ bản sau:\n" +
                    "* Tinh bột: gạo, bánh mì, ngũ cốc\n" +
                    "* Rau\n" +
                    "* Hoa quả\n" +
                    "* Sữa, Sữa chua và phomat\n" +
                    "* Các loại thịt đỏ (bò, lợn…), thịt gia cầm, cá, trứng, đỗ quả, đỗ hạt.\n" +
                    "\n" +
                    "Bé sẽ nhận đủ dinh dưỡng khi bạn để bé tự lựa chọn thức ăn trong số các thực phẩm này.\n" +
                    "Tinh bột: 6 phần mỗi ngày:\n" +
                    "\n" +
                    "Tinh bột có chứa chất xơ (hỗ trợ hệ thống tiêu hoá) và các loại đường phức (cung cấp năng lượng kéo dài). Hơn nữa, tinh bột còn chứa các loại vitamin B và một số loại ngũ cốc làm sẵn cung cấp nhiều vitamin và khoáng chất cần thiết.\n" +
                    "Đối với bé 4 tuổi, một phần tinh bột bằng:\n" +
                    "\n" +
                    "* 1 lát bánh mì.\n" +
                    "* Hoặc 3 chiếc bánh quy vuông.\n" +
                    "* Hoặc 1/2 bát cơm hoặc mì sợi.\n" +
                    "* Hoặc 1/2 bát cháo bột yến mạch.\n" +
                    "\n" +
                    "Hoa quả và rau xanh: 5 phần mỗi ngày\n" +
                    "\n" +
                    "ImageImageHoa quả và rau xanh cung cấp nhiều chất xơ, như vitamin A, C và kali. Ngoài ra, hầu hết rau quả đều chứa các chất chống oxy hoá, các chất giúp cơ thể chống lại bệnh tật, giảm nguy cơ mắc bệnh ung thư và bệnh về tim mạch.\n" +
                    "\n" +
                    "Đối với bé 4 – 6 tuổi, một phần hoa quả và rau xanh bằng:\n" +
                    "\n" +
                    "* 2 nhánh bông cải xanh.\n" +
                    "* Hoặc 1/2 cốc súp cà chua.\n" +
                    "* Hoặc 1/2 cốc quả việt quất.\n" +
                    "* Hoặc 3/4 cốc nước cam.\n" +
                    "Hoặc 1 quả chuối nhỡ.\n" +
                    "\n" +
                    "Thịt: 2 phần mỗi ngày\n" +
                    "\n" +
                    "Bé cần protein để lớn lên. Protein có trong sữa, thịt, cá, trứng, thịt gia cầm, pho mát, đỗ hạt và đỗ quả. Những loại thực phẩm này còn cung cấp sắt, kẽm và một số vitamin B. Bởi vì USDA khuyên bé 4 – 6 tuổi ăn 0,14kg thịt mỗi ngày và các loại thực phẩm giàu đạm khác. Dưới đây là khẩu phần một số các thực phẩm giàu đạm.\n" +
                    "\n" +
                    "Đối với bé 4 tuổi, 1 phần thực phẩm giàu đạm bằng:\n" +
                    "\n" +
                    "* 2,5 quả trứng.\n" +
                    "* Hoặc 4 thìa bơ đậu phộng.\n" +
                    "* Hoặc 1/4 bát đậu nấu chín\n" +
                    "\n" +
                    "ImageSản phẩm từ sữa: 2 phần mỗi ngày\n" +
                    "\n" +
                    "Hầu hết các sản phẩm từ sữa đều chứa nhiều canxi giúp răng và xương bé chắc khỏe. Sản phẩm từ Sữa còn cung cấp nhiều đạm – đó là sản phẩm thay thế khi con bạn không thích ăn thịt.\n" +
                    "Đối với bé 4 tuổi, một phần sản phẩm từ Sữa bằng:\n" +
                    "\n" +
                    "* 1 cốc sữa.\n" +
                    "* Hoặc 1 cốc Sữa chua.\n" +
                    "* Hoặc 1 1/3 miếng pho mát dài.\n" +
                    "\n" +
                    "Chất béo, dầu và đường:\n" +
                    "\n" +
                    "Chất béo: là nguồn cung cấp năng lượng và các dinh dưỡng cần thiết để trẻ hoạt động và lớn lên. Với các bé trên 2 tuổi, bạn không cần hạn chế chất béo trong khẩu phần ăn. Với các bé trên 2 tuổi, hàm lượng chất béo chiếm khoảng 30% tổng lượng calo mỗi ngày. Giống với chế độ ăn uống của người lớn, bạn nên hạn chế chất béo no và chứa nhiều cholestorol trong khẩu phần ăn của bé trên 2 tuổi. Hãy giúp bé có thói quen sử dụng các thực phẩm và đồ uống ít béo như: Sữa tách bơ hoặc Sữa có hàm lượng chất béo thấp, thay vì sử dụng Sữa nguyên kem.\n" +
                    "\n" +
                    "Đường: cung cấp một số loại dinh dưỡng và bạn nên hạn chế sử dụng trong khẩu phần của con. Các thực phẩm chứa đường là một trong những tác nhân khiến con hỏng răng. Bạn có thể hướng dẫn con đánh răng cẩn thận mỗi ngày để hạn chế tác động của đường tới răng.\n" +
                    "\n" +
                    "Bạn có thể tham khảo một số lời khuyên dưới đây để giới hạn đường trong chế độ ăn uống của bé:\n" +
                    "\n" +
                    "* Dùng thịt nạc và các sản phẩm làm từ Sữa ít béo hoặc tách bơ.\n" +
                    "* Sử dụng các loại dầu thực vật không no hoặc các loại bơ có dầu thực vật là thành phần chính.\n" +
                    "* Đọc kỹ nhãn các thực phẩm đóng chai, lọ, hộp để kiểm tra hàm lượng chất béo chứa trong đó.\n" +
                    "* Sử dụng hạn chế các loại thực phẩm chứa phần lớn các loại dầu no.\n" +
                    "* Sử dụng hạn chế các thực phẩm ngọt do đường.\n" +
                    "\n" +
                    "Vitamin và muối khoáng: Tốc độ sinh trưởng và phát dục ở tuổi nhi đồng và thiếu niên rất nhanh, sự trao đổi chất mạnh mẽ, nhu cầu vitamin và muối kháng tương đối cao, đa số các lượng và các loại gần bằng người lớn, thậm chí có loại còn cao hơn. Trong đó vitamin A, B, C có ý nghĩ quan trọng. Những loại vitamin này thường hay thiếu trong thức ăn, cần chú ý bổ sung. Nhu cầu muối natri của trẻ từ 3 tuổi trở lên cao hơn người lớn hai lần.\n" +
                    "\n" +
                    "Nước: Cơ thể của trẻ nhỏ cần nhiều nước hơn người lớn, bạn nên khuyến khích bé uống nhiều nước.\n" +
                    "\n" +
                    "Để biết con bạn có được cung cấp đầy đủ dinh dưỡng không ? Bạn có thể lập 1 Biểu đồ tăng trưởng. Vì biểu đồ tăng trưởng này giúp bạn biết liệu bé có hấp thụ đầy đủ dinh dưỡng cho cơ thể.\n" +
                    "\n" +
                    "Khi con bạn cần năng lượng, bé sẽ tự cảm thấy ngon miệng. Bạn hãy để con ăn theo nhu cầu và ngừng ăn khi bé cảm thấy no. Bé sẽ biết khi nào cơ thể bé cần thức ăn gì và bé cần ăn bao nhiêu. Việc của bạn là cung cấp các thức ăn dinh dưỡng, còn bé ăn gì và ăn bao nhiêu hãy để bé quyết định."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_tre_em);
        imgIcon = (ImageView) findViewById(R.id.imgIcon);
        txtBodydd = (TextView) findViewById(R.id.txtBodydd);
        txtTiledd = (TextView) findViewById(R.id.txtTitledd);
        Intent i = getIntent();
        String item = i.getStringExtra("select_item");


        if(item.equals(Tile[0])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.d1);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[0]);
        }
        if(item.equals(Tile[1])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.d2);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[1]);
        }
        if(item.equals(Tile[2])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.d3);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[2]);
        }
        if(item.equals(Tile[3])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.d4);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[3]);
        }
        if(item.equals(Tile[4])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.d5);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[4]);
        }
        if(item.equals(Tile[5])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.d6);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[5]);
        }
        if(item.equals(Tile[6])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.d7);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[6]);
        }
        if(item.equals(Tile[7])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.d8);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[7]);
        }
        if(item.equals(Tile[8])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.d9);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[8]);
        }
        if(item.equals(Tile[9])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.d10);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[9]);
        }
        if(item.equals(Tile[10])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.d11);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[10]);
        }
        if(item.equals(Tile[11])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.d12);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[11]);
        }
        if(item.equals(Tile[12])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.d13);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[12]);
        }
        if(item.equals(Tile[13])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.d14);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[13]);
        }
        if(item.equals(Tile[14])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.d15);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[14]);
        }
        if(item.equals(Tile[15])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.d16);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[15]);
        }
        if(item.equals(Tile[16])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.d17);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[16]);
        }
        if(item.equals(Tile[17])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.d18);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[17]);
        }
        if(item.equals(Tile[18])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.d19);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[18]);
        }
        if(item.equals(Tile[19])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.d20);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[19]);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_body_tre_em, menu);
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