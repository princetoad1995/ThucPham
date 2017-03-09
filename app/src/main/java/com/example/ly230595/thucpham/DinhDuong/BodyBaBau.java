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

public class BodyBaBau extends Activity {
    private Bitmap anh;
    private ImageView imgIcon;
    private TextView txtTiledd, txtBodydd;

    String[] Tile = {
            "1/ 12 thực phẩm dồi dào sắt cho bà bầu",
            "2/ 7 bước cho thai kỳ khỏe mạnh",
            "3/ 9 thực phẩm tốt cho mẹ bầu",
            "4/ Ăn thực phẩm đắng dễ bị sảy thai ?",
            "5/ An toàn khi mẹ bầu ăn đậu phụ",
            "6/ An toàn vệ sinh thực phẩm khi mang thai",
            "7/ Bà bầu có nên ăn sữa chua thường xuyên ?",
            "8/ Bưởi - Trái cây cực tốt với bà bầu",
            "9/ Cà rốt - 'nhân sâm bình dân' cho mẹ bầu",
            "10/ Cam sành giúp mẹ bầu phòng cảm cúm",
            "11/ Cẩn trọng thực phẩm gây xảy thai",
            "12/ Chế độ ăn theo từng quý thai kỳ",
            "13/ Chọn thực phẩm an thai cho mẹ bầu",
            "14/ Đã mang bầu thì đừng ăn chay",
            "15/ Đậu bắp - Món đại bổ cho mẹ bầu",
            "16/ Đúng sai về chuyện ăn uống khi bầu bí",
            "17/ Lưu ý khi ăn thịt lúc mang thai",
            "18/ Lưu ý khi bà bầu ăn ngao",
            "19/ Mách bà bầu ăn hoa quả đúng cách",
            "20/ Mẹ bầu đừng ăn khoai tây chiên nhé"
    };
    String [] body = {
            "Phụ nữ mang thai dễ đối mặt với tình trạng thiếu máu, điều này tạo nên nhiều nguy cơ cho cả mẹ lẫn thai nhi. Việc bổ sung sắt vào giai đoạn này luôn là ưu tiên hàng đầu trong chế độ dinh dưỡng của mẹ bầu.\n" +
                    "\n" +
                    "Thiếu máu thiếu sắt là tình trạng cơ thể không có đủ lượng sắt cần thiết để tạo hemoglobin – một protein quan trọng của hồng cầu. Thiếu máu là hiện tượng phổ biến khi mang thai. Thống kê cho thấy tỉ lệ phụ nữ mang thai thiếu máu thiếu sắt lên đến 50%. Bị thiếu máu không chỉ ảnh hưởng không tốt đến thai phụ mà còn gây ra nhiều hậu quả xấu cho bé sau này. Thiếu máu trong thai kỳ có thể gây nguy cơ sinh non và trẻ sinh nhẹ cân. Chính vì vậy việc duy trì hemoglobin trong giới hạn bình thường là rất quan trọng vì protein này có nhiệm vụ vận chuyển oxy đến thai nhi.\n" +
                    "\n" +
                    "Trong thai kỳ, các chuyên gia luôn khuyến cáo mẹ bầu cần bổ sung sắt đầy đủ trong chế độ ăn uống hàng ngày. Ngoài ra, chị em cũng cần bổ sung thêm vitamin C để quá trình hấp thụ sắt được tốt hơn. Bạn cũng cần tránh xa những loại thực phẩn có thể làm giảm sự hấp thu của sắt vào cơ thể như trà, cà phê. Canxi trong sữa cũng có thể làm giảm sự hấp thụ sắt.\n" +
                    "Dưới đây là top những thực phẩm dồi dào sắt, mẹ bầu không nên bỏ qua trong thai kỳ:\n" +
                    "1. Chuối\n" +
                    "Chuối là nguồn thực phẩm dồi dào sắt và khoáng chất cần thiết cho mẹ bầu. Ăn chuối vào bữa sáng là sự lựa chọn hoàn hảo để điều trị và ngăn ngừa tình trạng thiếu máu cho phụ nữ mang thai. Ngoài ra, chuối còn giúp chị em giảm triệu chứng táo bón hiệu quả.\n" +
                    "2. Các loại hạt\n" +
                    "\n" +
                    "Các loại hạt sấy khô như hạnh nhân, hướng dương, hạt bí, óc chó, hạt lanh… là nguồn chất sắt dồi dào để ngăn ngừa bệnh thiếu máu. Bạn nên ăn những loại hạt này thay cho đồ ăn vặt hàng ngày.\n" +
                    "Các loại hạt sấy khô như hạnh nhân, hướng dương, hạt bí, óc chó, hạt lanh… là nguồn chất sắt dồi dào để ngăn ngừa bệnh thiếu máu. (ảnh minh họa)\n" +
                    "\n" +
                    "3. Cháo bột yến mạch\n" +
                    "\n" +
                    "Rất nhiều nghiên cứu đã chỉ ra rằng bột yến mạch có công dụng ngăn ngừa thiếu máu trong thai kỳ. Yến mạch là nguồn dự trữ tuyệt vời các chất xơ hòa tan, protein và các vitamin nhóm B, thiamin, riboflavin và B6. Ngoài ra, yến mạch còn cung cấp sắt, canxi, magie, selen và phốt pho. Không chỉ ngăn ngừa thiếu sắt, bột yến mạch còn rất có lợi cho hệ tiêu hóa của mẹ bầu.\n" +
                    "\n" +
                    "4. Quả chà là\n" +
                    "\n" +
                    "Không chỉ dồi dào sắt, chà là còn chứa nhiều potasium, magnesium, canxi, selenium, các sinh tố nhóm B và có nhiều chất xơ như các loại quả khô khác. Chà là được biết đến là loại trái cây có công dụng sản xuất hemoglobin. Chị em có thể ăn như một món ăn ngọt hàng ngày ngắm tăng sản xuất hồng cầu. Quả chà là rất phổ biến trong các món mứt dịp tết nguyên đán ở Việt Nam.\n" +
                    "\n" +
                    "5. Súp lơ xanh\n" +
                    "\n" +
                    "Bông cải xanh (súp lơ xanh) là loại rau lá xanh thẫm được khuyến khích sử dụng nhiều nhất trong thời gian mang thai. Bông cải xanh có giá trị dinh dưỡng rất lớn, là nguồn thực phẩm rất giàu sắt, protein, canxi, crom, carbohydrate, vitamin A và vitamin C.\n" +
                    "6. Thịt bò\n" +
                    "\n" +
                    "Mỗi phần thịt bò chứa 2,5-3mg sắt. Sắt từ động vật được coi là heme-sắt (cơ thể dễ hấp thu hơn). Phần nạc của thịt bò thường giàu sắt hơn phần chứa gân hoặc chất béo. Vì thế, nên loại bỏ gân – mỡ bò trước khi chế biến. Bà bầu nên bổ sung thịt bò vào chế độ ăn hàng ngày để ngăn ngừa tình trạng thiếu máu. Sắt từ nguồn động vật cũng dễ dàng hấp thụ hơn từ thực vật.\n" +
                    "Các mẹ có biết rằng chỉ ½ bát rau bina nấu chín có chứa đến 3,2 mg sắt và nhiều dưỡng chất có lợi khác như beta-carotene, folate, vitamin C và canxi. Rau bina rất dễ chế biến và hầu như phù hợp với khẩu vị ăn của tất cả mọi người. Chị em có thể xào loại rau này với thịt sẽ rất ngon miệng đấy.\n" +
                    "\n" +
                    "7. Mật ong\n" +
                    "\n" +
                    "Nếu bạn bị thiếu máu trong thai kỳ, đừng quên bổ sung mật ong vào chế độ ăn hàng ngày nhé. Mật ong rất có lợi trong việc ngăn ngừa thiếu máu khi mang thai đấy.\n" +
                    "\n" +
                    "8. Bí ngô\n" +
                    "\n" +
                    "Thành phần dinh dưỡng  trong bí ngô khá đầy đủ với nhiều protein, carotene, vitamin, amino axit, canxi, sắt… Nghiên cứu gần đây cho thấy, kẽm trong bí ngô trực tiếp ảnh hưởng tới chức năng thành thục của hồng cầu; chất sắt lại là nguyên tố vi lượng cơ bản tạo ra hemoglobin giúp bổ sung lượng máu cho cơ thể, giúp mẹ bầu tránh được bệnh thiếu máu.\n" +
                    "Thành phần dinh dưỡng  trong bí ngô khá đầy đủ với nhiều protein, carotene,\n" +
                    "vitamin, amino axit, canxi, sắt… (ảnh minh họa)\n" +
                    "\n" +
                    "9. Lòng đỏ trứng gà\n\n" +
                    "Trứng gà là nguồn thực phẩm dồi dào chất dinh dưỡng như protein, canxi, photpho, sắt, chất khoáng, các men, hormone và nhiều vitamin có lợi cho sự phát triển của thai nhi cũng như sức khỏe bà bầu. Đặc biệt hầu như các chất dinh dưỡng trong quả trứng gà đều tập trung ở lòng đỏ. Ngoài ra, lòng đỏ trứng có cả các vitamin tan trong nước (B1, B6) và vitamin tan trong dầu (vitamin A, D, K) rất tốt cho bà bầu. Mỗi tuần mẹ bầu có thể ăn từ 3-4 quả trứng gà.\n" +
                    "\n" +
                    "10. Ngao\n\n" +
                    "Chị em có biết rằng trong 100g ngao có tới 23mg sắt. Do đó, ngao được chế biến chín thành soup ngao, ngao hấp, ngao xào sả ớt… là món an toàn và bổ dưỡng cho bà bầu.\n" +
                    "\n" +
                    "11. Nước cam\n\n" +
                    "Nước cam là nguồn thực phẩm dồi dào vitamin C, giúp cơ thể hấp thụ sắt tối đa. Chính vì vậy, sau khi bổ sung sắt, chị em hãy uống thêm một ly nước cam nhé.",
            "Thời gian mang thai luôn là giai đoạn quan trọng nhất  trong cuộc đời mỗi chị em. Đây cũng là thời điểm rất nhạy cảm bởi bất kỳ hoạt động nào của thai phụ như ăn uống, đi lại, tập thể thao, du lịch v.v… đều ảnh hưởng ít nhiều đến sức khỏe của mẹ và sự phát triển của thai nhi. Để đảm bảo cho bé yêu được trải qua “9 tháng 10 ngày” an toàn và khỏe mạnh trong bụng mẹ, bà bầu nên quan tâm đến những lời khuyên hữu ích sau đây.\n" +
                    "\n" +
                    "1. Lưu ý đến lượng thực phẩm hàng ngày\n" +
                    "\n" +
                    "Bé sẽ hấp thu tất cả chất dinh dưỡng cần thiết từ bạn trong suốt thời gian nằm trong bụng mẹ, vì vậy cần lưu ý đến chế độ ăn sao cho đầy đủ dưỡng chất. Trong 3 tháng đầu thai kỳ, bà bầu có thể nghén nhiều loại thức ăn có vẻ kỳ lạ so với khẩu vị bình thường. Tuy nhiên bạn không cần quá lo lắng về điều này, miễn là đừng ăn một loại thức ăn thường xuyên và quá nhiều.\n" +
                    "\n" +
                    "Đồng thời nên cân đối lượng chất bổ dung nạp, đảm bảo cho bé có đủ chất mà mẹ vẫn không bị béo phì, vì tăng cân quá mức dẫn đến nhiều nguy cơ về sức khỏe cho cả hai mẹ con. Bình thường một phụ nữ mang thai cần tăng khoảng 10 – 15 kg trong suốt 40 tuần lễ bầu bí. Điều này cho phép bé tăng từ 3 - 4 kg và từ 7 – 12 kg đối với “hệ thống nâng đỡ chịu thai” gồm nhau, nước ối, lượng máu gia tăng, mỡ và tuyến sữa ở vú. Các mẹ có thể tham khảo lượng thực phẩm chuẩn cho một ngày của bà bầu như sau: các protein hàng đầu – 3 phần; thức ăn có vitamin C – 2 phần; thức ăn có canxi – 4 phần; rau xanh, rau có màu vàng – 3 phần; ngũ cốc và các loại đường phức hợp – 4 đến 5 phần; rau và trái cây khác – 1 đến 2 phần; thực phẩm giàu chất sắt – 2 phần; tăng cường uống các loại nước với 1 ngày khoảng 8 ly, tránh dùng cà phê, trà, rượu, tốt nhất là uống nước lọc hoặc nước đun sôi để nguội. Các mẹ cũng tránh ăn quá no mà nên chia khẩu phần ăn ra thành nhiều bữa nhỏ.\n" +
                    "2. Bổ sung vitamin hợp lý\n" +
                    "\n" +
                    "Đôi khi đi khám thai, bác sĩ có thể cho bạn nhiều hoặc ít hơn lượng vitamin cần thiết so với nhu cầu của mẹ và bé. Vì vậy, cần trao đổi chi tiết với bác sĩ về chế độ ăn hàng ngày của bạn để có sự điều chỉnh phù hợp nhất. Nên nhớ vitamin và khoáng chất rất quan trọng cho sự phát triển của bé, không chỉ khi bé là thai nhi mà còn ảnh hưởng đến bé lúc chào đời và ngay cả sau này khi bé đã lớn khôn. Thường các mẹ có thể tìm thấy nguồn vitamin và khoáng chất dồi dào trong các loại thịt, trái cây, rau củ quả, như vitamin A, B, C, E, axit folic, sắt hay canxi. Thịt, cá, thịt gia cầm cung cấp nhiều chất đạm nhất. Đặc biệt, vitamin D có thể giúp thai nhi phát triển lành mạnh và hạn chế nguy cơ bé mắc bệnh tiểu đường tuýp 1.\n\n" +
                    "3. Thư giãn và giữ tâm lý thoải mái suốt thai kỳ\n" +
                    "\n" +
                    "Cố gắng tránh xa stress ngay cả khi bạn phải làm việc trong lúc bầu bí. Sự căng thẳng tâm lý ở mẹ có thể ảnh hưởng trực tiếp đến việc hình thành nhân cách tích cực ở bé, chưa kể tác động xấu đến lượng sữa của mẹ sau sinh. Thay vì để những lo toan thường ngày ám ảnh, hãy chú trọng tạo sự thư giãn cho bản thân bằng cách nghe nhạc êm dịu, tâm sự với chồng và người thân, bạn bè, tham gia các lớp học tiền sản, đi dạo, tập Yoga, tranh thủ nghỉ ngơi và ngủ ngắn trong ngày, hòa mình vào thiên nhiên và ánh nắng v.v…\n" +
                    "\n" +
                    "4. Uống nhiều sữa\n" +
                    "\n" +
                    "Dùng nhiều sữa và các chế phẩm từ sữa không chỉ cung cấp cho bà bầu lượng vitamin D dồi dào, mà còn rất hữu ích trong việc hình thành xương và răng ở thai nhi. Trong suốt thời gian mang thai, nhu cầu về canxi của bà bầu sẽ thay đổi từ khoảng 800mg canxi trong 3 tháng đầu, tăng đến 1200mg canxi trong 3 tháng giữa thai kì và 3 tháng cuối là khoảng 450mg can xi mỗi ngày. Vitamin D và canxi có nhiều trong sữa, sữa chua, bơ, phô mai, lòng đỏ trứng, cá và ánh nắng mặt trời. Tuy nhiên khi chọn cá để bổ sung canxi và vitamin, nên tránh các loại cá có chứa nhiều thủy ngân như cá kiếm, cá mập, cá thu, dù các axit béo Omega 3 trong cá rất tốt cho sự phát triển não bé.\n" +
                    "\n" +
                    "5. Chắn chắn dung nạp đủ axit folic\n\n" +
                    "Đây là loại vitamin rất cần thiết để sản xuất các tế bào hồng cầu, đóng vai trò quan trọng trong việc tăng trưởng thai nhi, đặc biệt trong 12 tuần đầu tiên của thai kỳ. Một nghiên cứu đã chứng minh uống bổ sung axit folic kéo dài từ 3 tháng trước lúc mang thai cho đến 12 tuần đầu của thai kì làm giảm sự cố khuyết tật dây thần kinh và tránh tình trạng não úng thủy ở bé. Nếu chưa uống axit folic trước khi thụ thai, chị em cần bổ sung ngay khi mang bầu. Ngoài việc được sản xuất dưới dạng viên, axit folic còn có nhiều trong các loại rau lá xanh như rau bina, đậu Hà Lan, bông cải xanh, đậu xanh, trứng, gan, cam, chuối, bắp, trái dừa v.v … Không chỉ tốt cho bé, axit folic còn giúp móng tay và tóc của bà bầu thêm óng mượt và khỏe mạnh.\n" +
                    "\n" +
                    "6. Tập thể dục, Yoga dành cho bà bầu\n" +
                    "\n" +
                    "Luyện tập đều đặn, vừa sức làm cơ thể tiết ra những hóa chất có tính an thần, giúp bà bầu thư giãn, giải tỏa căng thẳng, lo âu trong cuộc sống và ngủ ngon hơn. Thêm vào đó, máu huyết lưu thông nhanh trong khi tập luyện có nghĩa cơ thể mẹ và bé đang hấp thụ nhiều oxy. Các bắp thịt dẻo dai, linh hoạt do tập thể dục và Yoga, kết hợp thư giãn và kỹ thuật thở còn giúp bà bầu chuyển dạ dễ dàng. Tuy vậy, chắc chắn rằng khi chọn lựa bất kỳ môn thể thao hay các động tác Yoga nào, bà bầu phải tham khảo trước ý kiến chuyên môn của bác sĩ để tránh gây nguy hại cho mẹ và bé do phương pháp tập luyện không phù hợp.\n" +
                    "\n" +
                    "7. Chăm sóc hình ảnh bản thân\n" +
                    "\n" +
                    "Đa số thai phụ thường mặc định bầu bí là giai đoạn xuống sắc nhất, dù cố chăm chút ngoại hình kỹ đến đâu chăng nữa. Đây là một quan niệm sai lầm cần tránh. Vì khi mang thai, việc giữ gìn hình ảnh bên ngoài gọn gàng, tránh tăng cân quá nhiều sẽ giúp mẹ bầu thấy tự tin và vui sống hơn. Chưa kể ngắm mình xinh đẹp cũng là một phương pháp thai giáo hiệu quả cho bé.",
            "Những loại thực phẩm này sẽ giúp bà bầu có thai kỳ khỏe mạnh và thai nhi phát triển tốt nhất.\n" +
                    "Tất cả mẹ bầu đều muốn có một thai kỳ khỏe mạnh và con yêu phát triển tốt nhất. Để có được điều này, chế độ ăn uống là rất cần thiết. Tuy nhiên, không phải bà bầu nào cũng chọn được những loại thực phẩm tốt nhất. Chọn được những loại thực phẩm lành mạnh sẽ giúp bà bầu giảm nguy cơ bị tiểu đường thai kỳ, tránh được nguy cơ bị đau nhức cơ thể, sưng phù… khi mang thai.\n" +
                    "\n" +
                    "Dưới đây là 9 loại thực phẩm bà bầu nên bổ sung vào chế độ ăn hàng ngày:\n" +
                    "\n" +
                    "1. Các loại hạt\n\n" +
                    "Các loại hạt như: hạt dẻ, hạt bí, hạt điều, hạt hướng dương… có rất nhiều lợi ích với sức khỏe bà bầu. Loại thực phẩm này giàu chất béo, protein, chất béo Omega 3… Ngoài ra, dưỡng chất trong các loại hạt còn giúp phát triển các tế bào não của thai nhi. Phụ nữ mang thai nên kết hợp những loại hạt này vào chế độ ăn hàng ngày với các món như mì ống, salad tiệt trùng…\n" +
                    "\n" +
                    "2. Cà rốt\n\n" +
                    "Cà rốt là loại thực phẩm rất tốt cho sự phát triển của mắt, răng và xương của trẻ. Ngoài ra, cà rốt còn dồi dào chất xơ, giúp ngăn ngừa táo bón khi mang thai. Vì vậy, mẹ bầu nên bổ sung loại củ này vào chế độ ăn hàng ngày.\n" +
                    "\n" +
                    "3. Quả bơ\n\n" +
                    "Bạn đang phải chiến đấu với những cơn ốm nghén vật vã? Hãy bổ sung bơ vào chế độ ăn hàng ngày. Bơ sẽ giúp mẹ bầu giảm nôn ói và cảm giác buồn nôn. Các mẹ bầu cần biết thêm rằng trong quả bơ có chứa hơn 14 loại vitamin và khoáng chất bao gồm folate, canxi, sắt, đồng, magiê, phốtpho, kali, natri, kẽm mangan và selen.\n" +
                    "\n" +
                    "Ăn bơ hoặc sinh tố bơ khi mang thai có tác dụng ngăn ngừa dị tật thai nhi, tăng sức đề kháng cho bà bầu và giúp mẹ bầu tránh mắc tiểu đường thai kỳ.\n" +
                    "\n" +
                    "4. Trứng\n\n" +
                    "Trứng là nguồn thực phẩm dồi dào protein, rất có lợi cho mẹ bầu và thai nhi. Ngoài ra, trứng còn chứa nguồn axit béo omega-3 và DHA rất cần thiết cho sự phát triển não bộ và mắt của thai nhi. Tuy nhiên, để tránh rủi ro, mẹ bầu cần chế biến trứng chín trước khi ăn.\n" +
                    "\n" +
                    "5. Sữa chua\n\n" +
                    "Sữa chua là nguồn thực phẩm dồi dào canxi, nhiều hơn sữa bình thường và thêm một số chất dinh dưỡng khác như vitamin B, protein và kẽm.\n" +
                    "\n" +
                    "Canxi rất cần thiết để giữ cho xương và răng của mẹ bầu cũng như em bé khỏe mạnh nhất. Bổ sung đầy đủ canxi trong chế độ ăn hàng ngày của mẹ bầu giúp giảm nguy cơ sinh con nhẹ cân và sinh non. Nếu thiếu canxi trong thời gian mang thai, em bé sau này sẽ rất dễ bị loãng xương.\n" +
                    "\n" +
                    "\n" +
                    "6. Đậu lăng \n\n" +
                    "Nếu bạn là người ăn chay hoặc không thích ăn thịt thì đậu lăng và các sản phầm từ đậu là lựa chọn hoàn hảo. Đậu lăng là nguồn tuyệt vời của protein, sắt cũng như chất xơ, folate và canxi. Đậu lăng rất có lợi cho bà bầu vì nó chứa các thành phần dinh dưỡng được tìm thấy trong các sản phẩm từ động vật. Đậu cũng rất giàu kẽm – một khoáng chất cần thiết giúp giảm nguy cơ sinh non, sinh nhẹ cân hoặc kéo dài việc chuyển dạ. Các thực phẩm chứa nhiều kẽm khác là thịt gà, sữa, ngũ cốc, hạt điều, đậu Hà Lan, cua và sò.\n" +
                    "\n" +
                    "7. Quả xoài\n\n" +
                    "Nếu bạn là ‘fan cuồng’ của trái cây thì đừng bỏ qua xoài nhé. Đây là loại trái cây tuyệt vời để ăn khi mang thai. Xoài rất giàu vitamin A,C và kali. Bạn có thể ăn xoài tươi, sinh tố xoài sẽ rất ngon miệng đấy.\n" +
                    "\n" +
                    "8. Khoai lang \n\n" +
                    "Trong thành phần của khoai lang chứa đầy đủ các chất xơ, vitamin B6, kali, vitamin C, sắt cũng như đồng và beta-carotene. Ngoài ra, khoai lang là nguồn thực phẩm dồi dào beta carotene – một chất chống oxy hóa mà cơ thể chuyển đổi thành vitamin A. Vitamin A đóng vai trò quan trọng trong quá trình phát triển mắt, xương và da của em bé.\n" +
                    "\n" +
                    "Bên cạnh đó, khoai lang cũng giúp bổ sung lượng sắt thiếu hụt trong cơ thể trong thời gian mang thai. Và loại thực phẩm này có chứa đồng – một khoáng chất giúp cơ thể hấp thụ sắt tốt hơn. Nhiều bằng chứng khoa học còn khẳng định, khoai lang giúp bà bầu giảm triệu chứng táo bón – căn bệnh phổ biến khi bầu bí.\n" +
                    "\n" +
                    "9. Yến mạch\n\n" +
                    "Yến mạch là một trong những thực phẩm hàng đầu để ăn khi mang thai, đặc biệt với những mẹ bầu bị táo bón thường xuyên. Yến mạch chứa nhiều chất xơ, vitamin B và nhiều khoáng chất cần thiết khác cho thai kỳ.\n" +
                    "\n" +
                    "Bạn có thể sử dụng yến mạch cho bữa sáng và đừng quên cho thêm vào những món ăn khác hàng ngày nhé.",
            "Hỏi: Tôi đang mang thai tuần thứ 10 và bị ốm nghén trầm trọng, miệng lúc nào cũng có cảm giác nhạt. Có lẽ vì vậy mà từ ngày mang thai tôi thích ăn những đồ cay, có vị đắng như ớt, khổ qua, ngải cứu…. Tuy nhiên, mới đây tôi được một người bạn cho biết ăn những thực phẩm này dễ bị sảy thai? Xin hỏi bác sĩ điều này có đúng không?\n\n" +
                    "Trả lời:\n" +
                    "\n" +
                    "Chào bạn,\n" +
                    "\n" +
                    "Cảm ơn bạn đã gửi câu hỏi đến Eva.vn\n" +
                    "\n" +
                    "Vấn đề bạn thắc mắc là hoàn toàn có cơ sở. Nhiều kết quả nghiêm cứu đã chứng minh phụ nữ mang thai ăn quá nhiều đồ cay, có vị đắng như ớt, khổ qua, ngải cứu… không tốt cho thai nhi. Bởi chất charatin có trong thực phẩm có vị đắng có nguy cơ làm thai phụ dễ bị sẩy thai, xuất huyết và co thắt tử cung. Hay trong đồ cay có chứa chất gây tê có thể làm tăng sự chuyển hoá trong cơ thể, sẽ làm hại đến hệ thần kinh thai nhi, có thể gây liệt, thậm chí làm dị tật khiến cho thần kinh của bé không phát triển được.\n" +
                    "Tuy nhiên, những thực phẩm này chỉ ảnh hưởng đến thai nhi trong trường hợp bạn ăn quá nhiều và thường xuyên. Mẹ bầu vẫn có thể ăn với liều lượng vừa phải như vài lát ớt trong bát nước chấm hay vài ngọn rau ngải cứu... Ngoài ra, bạn nên biết rằng ăn ngải cứu đúng cách với lượng vừa phải còn có tác dụng an thai.\n" +
                    "\n" +
                    "Trong 3 tháng đầu, phụ nữ mang thai thường bị nôn ói do ốm nghén và dễ khiến chị em có cảm giác nhạt miệng, vì vậy bạn nên uống nhiều nước đặc biệt là nước hoa quả, ăn thêm những thực phẩm khô như bánh quy giòn, trà gừng, hoa quả tươi…",
            "Nhiều thai phụ lo ngại ăn nhiều đậu phụ sẽ ảnh hưởng tới sự phát triển giới tính của em bé nhưng thực ra đậu phụ có rất nhiều lợi ích sức khỏe cho bà bầu, miễn là bạn luôn ăn với số lượng vừa phải.\n" +
                    "1. Canxi trong đậu phụ rất có lợi cho phụ nữ mang thai, đặc biệt là thai nhi vì nó giúp xây dựng xương và răng.\n" +
                    "2. Đậu phụ có thể đóng góp một lượng lớn protein cho bà bầu ; do đó, hỗ trợ phát triển các tế bào cho thai nhi.\n" +
                    "3. Chất sắt có trong đậu phụ giúp ngừa sinh non và sinh con nhẹ cân.\n" +
                    "4. Kẽm có trong đậu phụ giúp tái tạo tế bào, thúc đẩy tăng trưởng mô và điều chỉnh các enzyme.\n" +
                    "5. Đậu phụ giúp giảm cholesterol xấu và duy trì hàm lượng lipid khỏe mạnh trong thai kỳ.\n" +
                    "6. Các đặc tính chống oxy hóa của vitamin E trong đậu phụ thúc đẩy miễn dịch cho người mẹ.\n" +
                    "7. Những nghiên cứu gần đây cho thấy, ăn đậu phụ thường xuyên cung cấp cho cơ thể năng lượng, protein, chất béo, chất xơ giúp cơ thể khỏe mạnh.\n" +
                    "8. Chất isoflavones trong đậu phụ làm sạch các gốc tự do, giúp ngăn ngừa nhiễm trùng và các vấn đề liên quan tới thai kỳ. Một nghiên cứu gần đây còn cho thấy, isoflavones còn làm tăng mật độ khoáng xương ở phụ nữ nên rất có lợi khi mang thai .\n" +
                    "9. Chất ức chế trypsin trong đậu phụ và đậu nành ảnh hưởng tới tiêu hóa protein và làm rối loạn tuyến tụy. Do đó, không nên ăn quá nhiều đậu phụ hay uống quá nhiều sữa đậu nành.\n" +
                    "10. Đậu phụ, đậu nành không đảm bảo an toàn vệ sinh thực phẩm có thể chứa hàm lượng nhôm, thạch cao... gây độc cho hệ thần kinh và thận của mẹ, cũng như thai nhi.\n" +
                    "11. Nếu người mẹ bị dị ứng với đậu nành thì cũng có thể bị dị ứng với đậu phụ. Các dấu hiệu có thể gồm khó thở, nổi ban...\n" +
                    "Ăn nhiều đậu phụ còn có thể gây co thắt và rối loạn tiêu hóa như buồn nôn, tiêu chảy hoặc táo bón.\n" +
                    "Lời khuyên & Cảnh báo\n" +
                    "Bà bầu có thể ăn các món với đậu phụ như đậu phụ rán, nấu canh, kho với thịt... và uống sữa đậu nành nhưng chỉ nên sử dụng khoảng 3-4 bữa/tuần. Riêng với đậu nành, mỗi ngày có thể uống một cốc nhỏ (khoảng 200ml) thì được coi là hợp lý.",
            "Vấn đề an toàn vệ sinh thực phẩm lúc nào cũng cần được quan tâm và trong giai đoạn mang thai, bạn lại càng cần chú ý hơn nữa. Bạn hãy nhớ:\n" +
                    "\n" +
                    "- Luôn tuân thủ nguyên tắc “ăn chín, uống sôi”;\n" +
                    "\n" +
                    "- Hạn chế ăn… bốc;\n" +
                    "\n" +
                    "- Rửa hoa quả thật sạch dưới vòi nước chảy và gọt vỏ trước khi ăn;\n" +
                    "\n" +
                    "- Tránh trữ thực phẩm sống và chín gần nhau trong tủ lạnh;\n" +
                    "\n" +
                    "- Dùng hai loại thớt khác nhau cho thức ăn sống và chín;\n" +
                    "\n" +
                    "- Vệ sinh tay, dao thớt và các dụng cụ làm bếp trước và sau mỗi lần chế biến thức ăn;\n" +
                    "\n" +
                    "- Tránh các thực phẩm không rõ nguồn gốc xuất xứ, các loại đồ hộp hết hạn;\n" +
                    "\n" +
                    "- Thực phẩm sơ chế hoặc chế biến sẵn mua ở siêu thị phải được nấu, nướng lại ở nhiệt độ cao để tiêu diệt vi khuẩn;\n" +
                    "\n" +
                    "- Chỉ hâm thức ăn một lần, không hâm đi hâm lại;\n" +
                    "\n" +
                    "- Không nên dùng lò viba để hâm thức ăn mà nên đun nấu kỹ lại trước khi dùng;\n" +
                    "\n" +
                    "- Các loại nước ngọt, sữa, nước trái cây đã mở nắp để trong tủ lạnh có thể bị nhiễm khuẩn nếu để quá 3 ngày;\n" +
                    "\n" +
                    "- Nước đun sôi để nguội chỉ nên uống trong vòng 2 ngày;\n" +
                    "\n" +
                    "“Cẩn tắc vô ưu” nhé bạn, vừa để đảm bảo sức khỏe cho cả hai mẹ con, vừa giúp tránh những điều đáng tiếc xảy ra bởi những nguyên nhân mà bạn hoàn toàn có thể tránh được." ,
            "Sữa chua không chỉ là thức ăn ngon miệng, mà là thức ăn bổ dưỡng, rất tốt cho da dẻ chị em và đặc biệt có thể chữa trị bệnh tốt. Vậy đối với bà bầu thì, ăn sữa chua có tốt không, ảnh hưởng với thai nhi không? Hôm nay, mình sẽ giới thiệu đến các bạn bài viết bà bầu có nên ăn sữa chua không?, cùng theo dõi bài viết nhé!\n"+
                    "Giá trị dinh dưỡng của sữa chua\n" +
                    "Sữa chua là loại thực phẩm được tạo ra từ các loại sữa lên men bởi các vi khuẩn như Lactobacillus acidophilus. Các vi khuẩn này tiêu hóa đường trong sữa và giải phóng ra axit lactic, chất phản ứng với protein trong sữa để biến chất lỏng này thành dạng kem và có vị chua.\n" +
                    "Có thể nhận thấy sữa chua là sản phẩm của sữa nên có giá trị dinh dưỡng khá cao và cân đối: trong 100g sữa chua chứa khoảng 100 Kcal, chất đạm trung bình từ 3,1 – 5,3 g, chất béo khoảng 2,3 – 2,6 g, chất bột khoảng 14-15g. 100 g sữa chua có thể cung cấp xấp xỉ 100 Kcal.\n" +
                    "Và cơ cấu năng lượng trung bình của sữa chua khá cân đối, với tỷ lệ năng lượng của 3 chất P:L:G là khoảng 17:23:60. So với nhu cầu khuyến nghị của Viện Dinh dưỡng quốc gia cho trẻ em đến 9 tuổi là 15:30:55 thì rõ ràng sữa chua là một sản phẩm cân đối về năng lượng đáp ứng tốt cho sự phát triển nhanh của trẻ.\n" +
                    "Hơn nữa, sữa chua còn là một sản phẩm khá giàu canxi cần cho phát triển hệ xương và răng; đa số các loại sữa chua trên bao bì có ghi đủ các thành phần Na, K và phospho; 1 số loại có Vitamin D khoảng 0,1 mcg và Cholesterol khoảng 5,0 mg.\n" +
                    "Tác dụng của sữa chua đối với bà bầu\n" +
                    "1. Tốt cho hệ tiêu hóa\n" +
                    "Theo một số nghiên cứu gần đây, khoảng 11 – 35% số phụ nữ mang thai bị táo bón trong 3 tháng cuối, tuy nhiên chỉ có khoảng 1,5% số trường hợp phải dùng thuốc nhuận tràng. Nguyên nhân là do những thay đổi về nội tiết trong thời kỳ mang thai, ngoài ra còn do việc uống viên sắt để bù sắt, chế độ ăn ít chất xơ, giảm hoạt động thể lực, sự chèn ép của thai nhi và yếu tố tâm lý.\n" +
                    "Sữa chua là loại thức ăn có tác dụng chống và chữa táo bón khá hiệu quả. Tuy nhiên, cũng do tác dụng nhuận tràng của sữa chua mà phụ nữ mang thai không nên ăn quá nhiều, bên cạnh đó cũng cần lựa chọn kỹ càng nguồn gốc sản phẩm, tránh để ăn phải những loại sữa quá hạn sử dụng, sữa được chế biến một cách thủ công. Ngoài ra, người bệnh cần lưu ý uống nhiều nước, ăn tăng chất xơ và có một chế độ vận động phù hợp. Các chất xơ từ ngũ cốc, cam, chanh, và cây họ đậu có tác dụng kích thích hệ vi khuẩn đường ruột và hiệu quả khá tốt trong điều trị táo bón.\n" +
                    "2.  Chữa hôi miệng\n" +
                    "Hôi miệng là tình trạng gây không ít khó khăn đối với mọi người, tình trạng này khiến bà bầu cảm thấy khó chịu bởi mùi hôi thôi thối, điều này còn gây ra khó chịu những người xung quanh. Tình trạng này khiến bà bầu cảm thấy buồn bực, để có thể chữa trị dứt điểm căn bệnh khó chịu này.  Trong sữa chua, có chứa nhiều vi khuẩn có lợi rất tốt cho diệt vi khuẩn gây hôi miệng, chính vì thế, bà bầu có thể ăn sữa chua khoảng 2 tuần cũng có thể đánh bay mùi hôi.\n" +
                    "3. Tăng cường hệ miễn dịch\n" +
                    "Bà bầu ăn sữa chua sống, (không cần đun nóng) có thể giúp ngăn ngừa bệnh viêm mũi dị ứng và viêm đường hô hấp trên do virus như cảm lạnh hoặc cúm. Các nhà khoa học thuộc Đại học Tổng hợp California đã tìm hiểu về ảnh hưởng của sữa chua sống và sữa chua đun nóng đối với một số thanh niên và người già. Kết quả là sau một thời gian tiêu thụ khoảng 200 g sữa chua sống, cả hai nhóm đã có sức đề kháng tốt hơn đối với các bệnh đường hô hấp.\n" +
                    "Không chỉ vậy, sữa chua còn có tác dụng làm đẹp da, nuôi dưỡng da được mịn màng, làm chậm lại quá trình lão hóa. Với bài viết bà bầu có nên ăn sữa chua không hi vọng giúp chị em giải đáp được thắc mắc, đồng thời qua bài viết giúp bạn hiểu rõ hơn tác dụng của sữa chua.",
            "Bưởi – loại trái cây của mùa thu với vị chua, ngọt nhưng lại có tính mát, chứa nhiều chất dinh dưỡng có lợi cho tất cả mọi người đặc biệt với bà bầu.\n" +
                    "Dưỡng chất trong quả bưởi\n" +
                    "Trong một trái bưởi có rất nhiều dưỡng chất có lợi mà có thể chị em bầu chưa biết:\n" +
                    "- Vitamin C: 44,8 mg\n" +
                    "- Vitamin B1: 0,03 mg\n" +
                    "- Vitamin B2: 0,03 mg\n" +
                    "- Beta Carotene: 200 g\n" +
                    "- Calcium: 14,0 mg\n" +
                    "- Sắt: 0,6 mg\n" +
                    "- Protein: 0,7 g\n" +
                    "- Chất béo: 0,3 g\n" +
                    "- Carbohydrate: 10,4 g\n" +
                    "- Năng lượng:  44,0 Kcal\n" +
                    "Công dụng của bưởi với bà bầu\n" +
                    "“Trị” ốm nghén\n" +
                    "Ốm nghén là chứng bệnh phổ biến trong thời gian mang bầu tuy nhiên mỗi phụ nữ lại bị ở mức độ khác nhau. Ốm nghén thường xảy ra trong 3 tháng đầu mang thai nhưng cũng có những người phải chịu đựng trong suốt thai kỳ. Triệu chứng này thường khiến mẹ bầu có cảm giác nôn ói, buồn nôn, mệt mỏi và vô cùng khó chịu đặc biệt vào buổi sáng và sau ăn. Để chữa trị ốm nghén không phải chuyện dễ nhưng có một số cách giúp hạn chế chứng nôn ói và buồn nôn và bài thuốc với bưởi đã được khá nhiều mẹ tín nghiệm.\n" +
                    "Mẹ bầu dùng 15g vỏ bưởi rửa sạch, cho vào nồi, thêm 300ml nước đun sôi kỹ, chắt lấy 150ml nước đặc, chia 3 lần uống trong ngày, trước khi ăn 20 phút. Cần uống khoảng 3 – 5 ngày triệu chứng ốm nghén sẽ thuyên giảm.\n" +
                    "Ngoài ra còn bài thuốc chữa nôn ói từ vỏ bưởi cho phụ nữ mang thai là: Bưởi 3-5 quả, bỏ vỏ hạt, vắt lấy nước đun nhỏ lửa cho sôi, thêm vào 500g mật ong, 100g đường kính, 10ml nước gừng tươi, đun thành dạng sền sệt rồi cho vào lọ dùng dần. Mỗi lần một thìa canh pha với nước sôi, ngày uống 2 lần.\n" +
                    "Bưởi có vị chua, ngọt mát và đặc biệt không độc, ngoài tác dụng làm mát, giải đờm, còn có thể chữa chứng tiết nước bọt và thèm ăn không ngừng của phụ nữ mang thai.\n" +
                    "Bưởi – Trái cây cực tốt với bà bầu - 2\n" +
                    "\n" +
                    "Bưởi giàu vitamin C, giúp giảm ốm nghén hiệu quả. (ảnh minh họa)\n" +
                    "Chữa táo bón hiệu quả\n" +
                    "Do bưởi có chứa nhiều vitamin C, có tính  ngọt mát nên rất tốt cho hệ tiêu hóa. Trong thời gian mang bầu, chị em thường mắc chứng táo bón và lâu ngày sẽ chuyển thành bệnh trĩ. Căn bệnh này thường khiến các mẹ bầu đau đớn và rất khó để chữa khỏi. Cách hữu hiệu nhất để tránh mắc bệnh trĩ khi mang bầu là giảm nguy cơ mắc bệnh táo bón. Vì vậy, mẹ bầu nên bổ sung thêm một vài múi bưởi vào bữa ăn hàng ngày để tránh nguy cơ mắc táo bón.\n" +
                    "Công dụng làm đẹp\n" +
                    "Ngoài việc mang lại lợi ích thiết thực cho sức khỏe, mẹ bầu có thể sử dụng bưởi để làm đẹp tóc nữa đấy. Nếu phụ nữ mang thai hoặc sau sinh bị rụng tóc, chị em có thể lấy vỏ bưởi đun nước để gội đầu hàng tuần. Chị em cũng có thể bôi trực tiếp tinh dầu bưởi lên tóc cũng có công dụng giảm rụng tóc và giúp tóc bóng mượt.\n" +
                    "Bí kíp chọn bưởi ngon\n" +
                    "Để chọn được bưởi ngon ngọt, mọng nước, các mẹ cần chú ý tới phần vỏ bên ngoài: da bóng, gai nở, trái tròn và khi cầm lên phải nặng tay. Nhiều người không để ý đến những nốt gai trên vỏ bưởi, nhưng đó chính là dấu hiệu giúp bạn nhận biết trái bưởi đó già hay non, bưởi càng già thì nốt gai trên vỏ càng lớn và giãn rộng.",
            "“Thổi bay” táo bón sau sinh\n" +
                    "Táo bón khi mang bầu và sau sinh là vấn đề khiến nhiều mẹ bầu cảm thấy khó chịu. Các chuyên gia đã chỉ ra rằng, cà rốt chứa nhiều beta carotin, vitamin B9, carotene và vitamin B1, vitamin B2, vitamin C, protein, chất béo, chất xơ thô, sắt, canxi, phốt pho, có tác dụng giúp điều hòa ruột, nhuận tràng và làm khoan khoái bụng. Hơn nữa, canxi giúp tǎng cường xương, rǎng và thành ruột tốt cho cả mẹ và thai nhi.\n" +
                    "Chất xơ trong loại củ này có thể tăng cao khả năng trao đổi chất, cải thiện chức năng đường ruột dạ dày, tình hình táo bón cũng được cải thiện và giảm đáng kể. Khi mang thai nếu bị táo bón chỉ cần ăn cháo cà rốt 1 lần/ngày, ăn liên tục từ 3-5 ngày hoặc dùng nước ép cà rốt có tác dụng điều trị táo bón khá hiệu quả.\n" +
                    "Đẹp da mùa đông\n" +
                    "Cà rốt không chỉ là một thực phẩm bổ dưỡng mà còn là một loại mỹ phẩm làm đẹp diệu kỳ. Vitamin A, C, kẽm tự nhiên trong cà rốt sẽ bổ sung khoáng chất giúp cho làn da chị em lúc mang bầu luôn giữ được vẻ tươi tắn và mịn màng. Cà rốt có thể sử dụng bằng rất nhiều cách như ép nước, đắp mặt hoặc sử dụng kết hợp với các thực phẩm làm đẹp khác. Mẹ bầu hãy nhớ luôn dự trữ trong nhà mình những củ cà rốt để sẵn sàng cho một làn da khỏe đẹp trong mùa khô này.\n" +
                    "Nhờ nguồn dinh dưỡng quý giá, cà rốt giúp tǎng cường hệ miễn dịch rất có ích cho người mang thai, giúp bảo vệ da dưới tác động ánh nắng mặt trời; giảm mụn trứng cá; làm lành những vết thương nhỏ, ngăn ngừa chứng khô da và mắt cho thai phụ.\n" +
                    "Chống nhiễm khuẩn và đảm bảo năng lượng\n" +
                    "Cà rốt có tác dụng tăng cường đào thải chất độc trong cơ thể. Trong cà rốt có nhiều caroten có tác dụng bảo vệ niêm mạc ruột, chống lại vi khuẩn. Vitamin A giúp  bảo vệ bộ máy tiêu hóa, ngăn ngừa sự nhiễm khuẩn.\n" +
                    "Tinh dầu trong cà rốt cũng có tác dụng diệt khuẩn. Các vitamin, gluxit, protit trong cà rốt đảm bảo nhu cầu về năng lượng khi mẹ cảm thấy mệt mỏi, chán ăn hay ốm nghén.\n" +
                    "Thực phẩm lý tưởng cho mẹ bầu cao huyết áp\n" +
                    "Một củ cà rốt cỡ trung bình có 19mg canxi, 32mg photpho, 233mg kali, 7mg vitamin C, 7gr carbonhydrat, 5gr đường, 2gr chất xơ, 1gr chất đạm, 6000mcg vitamin A, 40 calori, không có chất béo hoặc cholesterol. Trong cà rốt còn có nhiều chất chống oxy hóa quan trọng như: beta carotene, alpha carotene, phenolic acid, glutathione, một lượng insulin, làm giảm 1/3 đường trong máu, là thực phẩm lý tưởng cho người bị bệnh tiểu đường và cũng có tác dụng hạ huyết áp, nên rất tốt với người bị cao huyết áp.\n" +
                    "Chế biến món ngon từ cà rốt\n" +
                    "Vị dịu ngọt của cà rốt thích hợp với các món ăn được nhiều người yêu thích. Mẹ bầu có thể dùng cà rốt làm các món canh thập cẩm, rau xào, dưa góp, salad, nấu các món kho với thịt động vật… rất dễ ăn và màu cam của cà rốt khiến cho món ăn trở nên hấp dẫn hơn bao giờ hết. Eva sẽ giới thiệu 2 món ăn chế biến từ cà rốt cực dễ làm mà bổ dưỡng.\n" +
                    "1. Nước ép cà rốt + dứa + cam\n" +
                    "Chuẩn bị: 2 củ cà rốt gọt vỏ, 1 quả dứa, 2 trái cam bỏ vỏ, hạt, 1 muỗng yaourt ít chất béo, 1 muỗng mật ong, 2 muỗng kem vani, trái tắc, 1 muỗng đá nhỏ.\n" +
                    "Xay hỗn hợp cà rốt, dứa và cam. Thêm yaourt ít béo và lắc cho thật đều. Đổ ra ly, cho vào một ít kem vani. Vắt ít nước tắc vào cho thơm. Như vậy là mẹ bầu đã có ly sinh tố do tự tay mình làm rồi.\n" +
                    "2. Cháo cà rốt\n" +
                    "Chuẩn bị: 200g cà rốt; 100g gạo tẻ, 9g thịt nạc, vài nhánh hành khô, hành lá.\n" +
                    "Gạo vo, rồi ngâm sạch, vớt ra để ráo. Cà rốt rửa sạch, bỏ vỏ, cắt thành hình quân cờ. Thịt lợn nạc rửa sạch, băm nhỏ, ướp gia vị. Tiếp theo đun nóng dầu, cho hành khô vào phi thơm, cho thịt băm và cà rốt vào xào thơm 1 phút, cho một lượng gia vị thích hợp vào rồi trộn đều, lấy ra. Nấu sôi nước, cho gạo, thịt và cà rốt đã xào vào nấu sôi, hạ nhỏ lửa đến khi hạt gạo nở như hoa, cà rốt mềm thì nêm gia vị vào. Cuối cùng cho thịt lợn băm đã xào và hành ăn nóng.\n" +
                    "Ăn cà rốt đúng cách\n" +
                    "Không giống hầu hết các loại rau quả khác, cà rốt đã nấu chín hay xay ép thành nước đem lại nhiều chất dinh dưỡng hơn so với ăn sống. Vì vậy, để lấy được nguồn dinh dưỡng tối đa từ cà rốt thì chỉ nên dùng loại tươi nhất và đã qua đun nấu. Ngoài ra cần phải nhai nhuyễn cà rốt khi ăn. Ðể việc hấp thu vitamin A từ thực phẩm được tốt hơn thì nên chế biến cùng với một ít dầu, mỡ.\n"+
                    "Lựa chọn và bảo quản\n" +
                    "Mẹ bầu nên chọn mua những củ cà rốt có màu tươi sáng, cứng chắc, thẳng và trơn láng. Nếu củ cà rốt còn cành lá thì chọn loại có cành lá còn tươi xanh, không mua loại đã mềm, khô đét, nứt nẻ hay cong quẹo. Cà rốt có màu cam càng đậm thì càng chứa nhiều chất dinh dưỡng.\n" +
                    "Cần cắt bỏ cành lá càng sớm càng tốt vì chúng sẽ rút đi vitamin, muối khoáng và nước từ phần củ. Chỉ nên rửa cà rốt ngay trước khi sử dụng. Thường có thể lưu trữ được cà rốt tươi hơn 1-2 tuần.\n" +
                    "Cà rốt sẽ bị mềm khi để ngoài không khí. Nếu bị mềm, có thể làm cứng lại bằng cách ngâm vào một tô nước đá.\n" +
                    "Cà rốt là thực phẩm bổ dưỡng nhưng không phải ăn quá nhiều là tốt vì vậy bà bầu hãy sử dụng cà rốt một cách hợp lý và khoa học nhé!",
            "Chúng ta đều biết cam sành nói riêng và các loại cam nói chung rất giàu vitamin C, vitamin A, canxi, chất xơ... rất bổ dưỡng cho cơ thể phụ nữ mang thai. Vitamin B9 (axit folic) có trong cam sành vô cùng quan trọng đối với tất cả phụ nữ, đặc biệt đối với bà bầu hoặc những người đang cố gắng thụ thai. Nó giúp ngăn ngừa một số loại khuyết tật bẩm sinh, tăng sức đề kháng và giúp sản xuất các tế bào máu khỏe mạnh. Ngoài ra chất limonoid trong nước cam giúp ngăn ngừa bệnh ung thư và có tác dụng giải độc, lợi tiểu. Phụ nữ mang thai thường ăn cam, hoặc các loại trái có họ hàng với cam như quýt, bưởi,... có tỉ lệ nhiễm các bệnh ung thư (phổi và dạ dày) khá thấp.\n" +
                    "\n" +
                    "Không chỉ giàu chất dinh dưỡng, cam sành còn được cho là loại trái cây an toàn, không chứa thuốc bảo vệ thực vật như những loại trái cây khác. Vì vậy, cam sành luôn được nhiều người lựa chọn đặc biệt là mẹ bầu.\n" +
                    "\n" +
                    "Chúng ta đều biết rằng, tiết trời chuyển mùa từ xuân sang hạ sẽ khiến chị em bầu rất dễ mắc bệnh cảm cúm. Không chỉ có thế, cảm cúm cũng là một trong những chứng bệnh ốm nghén trong 3 tháng đầu thai kỳ. Vấn đề là mẹ bầu bị cảm cúm trong những tháng đầu sẽ gây nguy hiểm cho thai nhi nên việc phòng bệnh cảm cúm với bà bầu là rất quan trọng.\n" +
                    "Lợi ích đặc biệt từ cam sành\n" +
                    "\n" +
                    "Tăng sức đề kháng\n" +
                    "\n" +
                    "Theo các chuyên gia dinh dưỡng, nước cam đặc biệt cam sành chứa nhiều canxi và vitamin hơn cả các sản phẩm từ sữa – có khả năng chống bệnh cảm cúm và tăng cường khả năng miễn dịch. Vào tiết trời chuyển mùa xuân sang hạ, chị em bầu rất dễ có nguy cơ mắc bệnh cảm cúm vì sức đề kháng của mẹ bầu thường yêu. Để tăng khả năng miễn dịch cho cơ thể, chị em nên uống nước cam sành hàng ngày.\n" +
                    "\n" +
                    "Không chỉ có tác dụng chống cảm cúm, nước và vỏ cam còn chữa bệnh ho hiệu quả. Những cơn ho do cảm cúm trong thời kì bầu bí mang lại cảm giác khó chịu. Nếu ho mạnh có thể dẫn đến hiện tượng sinh non. Để giảm bớt những cơn ho các mẹ có thể sử dụng một số bài thuốc dân gian như ăn vỏ cam nướng, mứt cam gừng...\n" +
                    "\n" +
                    "Ngăn ngừa khuyết tật bẩm sinh\n" +
                    "\n" +
                    "Chắc chắn mẹ bầu có thể đã nghe qua về vai trò của các loại khoáng chất axit folate và folic trong thời gian mang thai. Chất dinh dưỡng này rất cần thiết để ngăn ngừa khuyết tật bẩm sinh sớm trong thai kỳ và đảm bảo có một thai kỳ khỏe mạnh sau này.\n" +
                    "\n" +
                    "Điều hòa huyết áp\n" +
                    "\n" +
                    "Do trong nước cam tươi dồi dào canxi, axit folic, kali, rất tốt để điều hòa và ổn định huyết áp nên khá an toàn với nhóm bà bầu cao huyết áp.\n" +
                    "Đẩy nhanh quá trình thụ thai\n" +
                    "\n" +
                    "Axit folic vô cùng quan trọng đối với tất cả phụ nữ, đặc biệt đối với phụ nữ có thai hoặc những người đang cố gắng thụ thai. Chất axit folic này lại có trong rất nhiều trong cam nên nó giúp ngăn ngừa một số loại khuyết tật bẩm sinh, và giúp sản xuất các tế bào máu khỏe mạnh.\n" +
                    "\n" +
                    "Giải độc, lợi tiểu\n" +
                    "\n" +
                    "Chất limonoid trong nước cam giúp ngăn ngừa bệnh ung thư và có tác dụng giải độc, lợi tiểu. Phụ nữ mang thai thường ăn cam có tỉ lệ nhiễm các bệnh ung thư (phổi và dạ dày) khá thấp. Chất xơ có trong cam cũng giúp mẹ bầu nhuận tràng tốt hơn. Tuy nhiên bà bầu nào bị rối loạn tiêu hóa không nên ăn nhiều cam và nếu uống nước cam thì nên pha loãng với nước.\n" +
                    "\n" +
                    "Cách chọn cam sành ngon\n" +
                    "\n" +
                    "Lựa chọn được cam sành ngon không phải dễ dàng. Các mẹ có thể tham khảo cách chọn cam như sau nhé: Cam sành ngon sẽ có da xù xì nhưng bóng, cầm nặng tay. Phần vỏ cam, phía xung quanh cuống, dày và cao trong khi chính giữa núm lõm hơn so với xung quanh. Cam chín tự nhiên hơi vàng ở phần đáy, còn nếu chín đều ở các phần là cam chín do giấm.\n" +
                    "\n" +
                    "Khi cầm quả trên tay, thấy nhẹ là cam ít nước, xốp, khô. Không nên chọn cam đã rụng cuống vì rất có thể đây là cam bị chín ép, sâu hại, ong chích... Không nên chọn cam sành quá to, da sần sùi, vàng chóe một bên vì đây là những quả bị rám nắng, nên vỏ dày, sượng khô, ít nước, không ngọt.\n" +
                    "Sử dụng cam sành thế nào?\n" +
                    "\n" +
                    "Bà bầu nên sử dụng cam sành tươi, vắt lấy nước uống và có thể pha đường tùy theo sở thích của mỗi người. Tuy nhiên, chứng bệnh tiểu đường thai kỳ rất dễ gặp nên tốt hơn hết các mẹ nên uống nước cam sành nguyên chất, không pha đường. Tốt nhất nên uống nước cam vào lúc không no, không đói, tức sau khi ăn từ 1 - 2 tiếng. Nếu uống nước cam khi vừa ăn sáng xong sẽ rất dễ bị tức bụng, còn nếu mẹ bầu uống vào buổi tối muộn thì lại dễ bị đi tiểu đêm.\n" +
                    "\n" +
                    "Để chữa ho bằng vỏ cam, các mẹ lưu ý là cam sau khi đã rửa sạch dùng đũa khoét một lỗ nhỏ ở chính giữa quả cam và bỏ vào đó chút muối, sau đó bỏ quả cam vào lò nướng trong vòng 15 phút. Khi lấy cam ra, lúc cam còn nóng, bạn bóc vỏ ra rồi ăn rất tốt. Cũng có thể cắt nhỏ vỏ cam và bỏ vào ấm trà dùng hãm để uống.\n" +
                    "\n" +
                    "Nếu mẹ bầu đang bị viêm loét dạ dày, tá tràng thì không nên uống nước cam, vì nó chứa rất nhiều chất hữu cơ làm tăng a-xít trong dạ dày, gây ra chứng ợ nóng và làm chứng viêm loét nặng thêm. Ngoài ra nước cam có tác dụng nhuận tràng nên nếu bạn bị tiêu chảy thì nên pha loãng chúng với nước và uống từng chút một thôi.\n" +
                    "\n" +
                    "Lưu ý: Các mẹ nên tránh uống các loại nước cam đóng hộp vì chúng dễ pha chế đường hóa học. Hơn nữa, trong quá trình vận chuyển, bảo quản, một số hộp nước hoa quả có thể bị nhiễm khuẩn khiến sử dụng sẽ không tốt cho cả mẹ bầu và thai nhi.",
            "Trong suốt thời kỳ mang thai, người mẹ cần bổ sung rất nhiều chất dinh dưỡng. Tuy nhiên, ngoài việc ăn uống lành mạnh, phụ nữ cần tránh một số loại thực phẩm nhất định làm ảnh hưởng sức khỏe thai nhi, thậm chí có thể dẫn đến sẩy thai.\n" +
                    "Đồ biển\n" +
                    "\n" +
                    "Tuy đồ biển chứa nhiều a-xít béo omega-3 có lợi cho sự phát triển của trẻ nhưng bạn cần tránh các loại thực phẩm chứa nhiều thủy ngân. Những đồ biển thường chứa thủy ngân như cá hồi, cua hoặc thịt cá mập… có thể gây hại cho não trẻ.\n" +
                    "\n" +
                    "Thực phẩm ăn sống\n" +
                    "\n" +
                    "Kiêng đồ sống trong thời kỳ mang thai là điều vô cùng quan trọng. Những thực phẩm này chứa nhiều vi khuẩn và virus, có thể đe dọa sự an toàn cho thai nhi và mẹ. Chuyên gia khuyên các bà bầu nên ăn thực phẩm nấu chín và đã được chọn lọc kỹ lưỡng, tránh đồ ăn chứa nhiều vi khuẩn hay có khả năng nhiễm virus.\n" +
                    "Đồ uống không tiệt trùng\n" +
                    "\n" +
                    "Các bà bầu nên tránh dùng các sản phẩm sữa, phô mai, sữa chua không nhãn mác, không nguồn gốc, chưa qua quá trình tiệt trùng. Thai phụ có thể ăn pho mát hoặc uống các loại sữa không béo nhưng nên tránh các loại phô mai không tiệt trùng như feta hoặc brie.\n" +
                    "\n" +
                    "Trái cây, rau quả chưa rửa sạch\n" +
                    "\n" +
                    "Nấu chín thức ăn là việc làm vô cùng quan trọng đối với các bà bầu. Ngoài việc không nên ăn thịt, cá sống, chưa chín tới, các bà mẹ tương lai đừng quên rửa trái cây, rau quả và các thực phẩm khác thật sạch trước khi ăn.\n" +
                    "\n" +
                    "Cà phê, trà, rượu\n" +
                    "\n" +
                    "Tránh sử dụng cà phê, trà và rượu trong suốt thai kỳ giúp phụ nữ ngăn ngừa các biến chứng trong thời gian sinh nở và tránh dị tật ở trẻ sơ sinh. Ngoài ra, bà bầu uống quá nhiều 3 chất kích thích trên sẽ làm tăng nguy cơ sẩy thai. ",
            "Tăng cân có lẽ là 1 trong những nỗi ám ảnh thường trực của chị em phụ nữ. Tuy vậy, khi bầu bí, tăng cân lại là điều bắt buộc để đảm bảo sự phát triển thể chất và trí tuệ cho thai nhi. Theo các chuyên gia sản khoa, trong suốt thai kỳ, mẹ bầu có cân nặng bình thường cần tăng từ 10 – 15kg, điều này cho phép trọng lượng bé được tăng đúng chuẩn từ 3 - 4kg. Đồng thời, giúp tăng “hệ thống nâng đỡ chịu thai” ở mức từ 7 – 12kg gồm nhau, nước ối, lượng máu gia tăng, mỡ và tuyến sữa ở vú. \n" +
                    "\n" +
                    "Số lượng cân nặng này phân bổ khác nhau vào từng quý thai kỳ. Nếu như quý 1 thai phụ được khuyến cáo chỉ tăng khoảng 1kg, thì trong 3 tháng giữa trọng lượng cần tăng lên đến 5kg, và 3 tháng cuối là 6kg. Sở dĩ các chuyên gia đều khuyên mẹ bầu nên tăng cân theo chuẩn này là nhằm để cơ thể nhanh thích ứng với kích thước tăng lên của chính mình, đồng nghĩa với việc đảm bảo bé được cung cấp 1 nguồn dưỡng chất liên tục và hợp lý.\n" +
                    "Tuy vậy, tăng cân lành mạnh lại không dễ thực hiện. Và dù tham khảo thật nhiều hướng dẫn về ăn uống, tập luyện giúp quản lý số cân nặng theo đúng chuẩn, mẹ bầu vẫn có lúc băn khoăn không biết lượng thực phẩm mình dùng có đủ chất cho thai nhi phát triển hay không. Khi đó, hãy tìm hiểu và áp dụng những lời khuyên chọn thực phẩm khá hiệu quả cho từng quý thai kỳ sau đây để giúp mẹ “minhon” mà con đủ chất.\n" +
                    "\n" +
                    "Ăn uống chuẩn cho quý 1 thai kỳ\n" +
                    "\n" +
                    "Trong 3 tháng đầu mang thai, có thể mẹ bầu sẽ nhận ra rằng thật khó để giữ cân nặng không bị giảm xuống chứ đừng nói đến việc tăng đến 1 kg. Nguyên nhân do đây là giai đoạn chị em thường bị ốm nghén, mệt mỏi, khó thở v.v…, kể cả buồn nôn và nôn. Điều này hạn chế việc dung nạp các chất dinh dưỡng và làm nảy sinh mối lo ngại thường trực liệu mẹ không ăn được nhiều thì thai nhi có đủ chất để phát triển không? Nếu rơi vào tình huống này, mẹ bầu đừng nên lo lắng quá, bởi trong quý đầu tiên của thai kỳ, việc dung nạp thêm năng lượng không thật sự cần thiết bằng việc đảm bảo cơ thể mẹ có đủ vitamin và khoáng chất để tránh các khuyết tật cho bé yêu.\n" +
                    "\n" +
                    "Vì vậy, vào thời điểm này, mẹ chỉ cần nhớ bổ sung đầy đủ các loại vitamin sau:\n" +
                    "\n" +
                    "- Axit folic (Folate). Đây là 1 loại vitamin nhóm B đặc biệt cần thiết trong vòng 12 tuần đầu mang thai để giúp bé phòng tránh các dị tật bẩm sinh như nứt đốt sống, não úng thủy, v.v… Trong điều kiện bình thường, axit folic trong máu sẽ bị lấy đi rất nhanh. Mức độ này sẽ còn tăng đến 4 lần khi người phụ nữ mang thai. Như vậy có nghĩa là nếu người mẹ không ăn nhiều thức ăn giàu axit folic hoặc không uống bổ sung axit folic đều đặn dễ dẫn đến nguy cơ lượng axit folic trong cơ thể bị suy giảm đến mức làm hại bé. \n" +
                    "\n" +
                    "Vì vậy, ngoài việc uống bổ sung 400 mcg axit folic/ ngày, mẹ bầu nên tăng mức dung nạp axit folic cho cơ thể bằng việc ăn nhiều loại thức ăn là nguồn cung phong phú dưỡng chất này:\n" +
                    "\n" +
                    "Thực phẩm giàu axit folic (50mcg hoặc hơn cho mỗi phần ăn): cải Bruxel, thịt bò, thận, cải bó xôi, cơm gạo lức, bông cải xanh, đậu nành, bí ngô, mè hạt …\n" +
                    "\n" +
                    "Thực phẩm chứa hàm lượng axit folic vừa (15 – 50mcg/phần ăn): bông cải, xà lách, khoai tây, nước cam vắt, bắp cải, sữa chua, bánh mì, trứng…\n" +
                    "\n" +
                    "Thực phẩm bổ trợ thêm axit folic: bánh mì, ngũ cốc v.v…\n" +
                    "- Sắt. Là chất có tầm quan trọng sống còn vì làm gia tăng lượng máu trong cơ thể mẹ lên rất nhiều, đồng thời hỗ trợ sự tăng trưởng của thai nhi. Do cơ thể mẹ khó hấp thu sắt qua thực phẩm, mà lượng sắt lại không tồn tại trong cơ thể bé chỉ sau vài giây đồng hồ, nên việc bổ sung sắt trong quý đầu và liên tục suốt thai kỳ là rất cần thiết. Bên cạnh uống bổ sung khoảng 27mg sắt mỗi ngày theo khuyến cáo của Hội Sản phụ khoa Hoa Kỳ, mẹ bầu nên ăn các loại thực phẩm nhiều sắt như măng tây, quả bơ, mơ, bông cải xanh, trái cây họ cam, chanh, bánh mì, cật (heo, bò), cá, lòng đỏ trứng, thịt bò, đậu (xanh, đen) và các loại bột ngũ cốc.\n" +
                    "\n" +
                    "Ăn nhiều hơn vào quý 2 thai kỳ\n" +
                    "\n" +
                    "Đây là thời điểm các cơn ốm nghén đã thôi không còn hành hạ mẹ bầu, và bạn cần ăn nhiều hơn để đảm bảo sự phát triển thể chất, trí tuệ cho thai nhi. Tuy nhiên, lượng calo dung nạp thêm mỗi ngày lại không nhiều, chỉ cần tăng 300 calo so với bình thường.  Do đó mẹ bầu nên biết cách chọn lựa thực phẩm sao cho đủ chất mà lại không chứa quá nhiều năng lượng. Ngoài việc bỏ các loại bánh kẹo, thực phẩm chiên rán, chứa nhiều đường ra khỏi thực đơn, bạn nên ăn 3 bữa chính và 3 bữa phụ trong ngày. Có thể tham khảo thực đơn chuẩn cho những bữa nhỏ xen kẽ trong ngày như sau:\n" +
                    "\n" +
                    "- Nửa chén sữa ít béo và 4 cái bánh quy lạt\n" +
                    "\n" +
                    "- 2 lát bánh mì nguyên hạt và 1/2 muỗng canh bơ đậu phộng\n" +
                    "\n" +
                    "- 1 hộp sữa chua không hoặc ít đường, 1/2 tách các loại hạt, hoa quả xắt nhỏ\n" +
                    "\n" +
                    "- 1/3 chén hạt hạnh nhân trộn khoảng 500g nho khô\n" +
                    "\n" +
                    "- 1 củ khoai tây nướng hoặc luộc, 1 miếng phô mai ít béo, 1 chén bông cải xanh hấp hoặc luộc\n" +
                    "\n" +
                    "Tam cá nguyệt thứ 2 là thời điểm cơ thể mẹ bầu rất cần canxi để đáp ứng nhu cầu phát triển hệ xương, răng của bé, duy trì xương mẹ chắc khỏe, vì vậy bạn nên dung nạp khoảng 1000mg canxi mỗi ngày, tương đương 3 phần sữa. \n" +
                    "\n" +
                    "Các loại axit béo như omega 3 cũng rất quan trọng để giúp bé phát triển não bộ và hệ thần kinh. Nguồn cung tốt nhất của loại dưỡng chất này là cá, nhưng mẹ không nên dùng quá nhiều vì có thể dẫn đến tình trạng ngộ độc thủy ngân ở thai nhi. Mức độ an toàn là dùng khoảng 300g/ tuần các loại cá ngừ trắng đóng hộp, cá hồi, cá minh thái, cá da trơn… Ngoài ra, omega 3 cũng có nhiều trong quả óc chó, dầu óc chó, dầu hạt cải, dầu hạt lanh, đậu phụ và các chế phẩm từ đậu nành…\n" +
                    "Quý 3 thai kỳ: Quan trọng là ăn đủ chất\n" +
                    "\n" +
                    "Vào những tháng cuối thai kỳ, tốc độ tăng trọng của mẹ sẽ dần chậm lại trong khi hầu hết chất dinh dưỡng mẹ ăn vào đều chuyển đến cho cơ thể bé. Dù vậy, mẹ bầu chỉ cần dung nạp hơn 450 calo/ngày so với thời điểm chưa mang thai. Ăn uống vào giai đoạn này, vì thế, cũng rất quan trọng để vừa đủ chất cho bé vừa giúp mẹ không tăng cân quá mức. Để cắt giảm năng lượng dư thừa, mẹ bầu nên chú ý các mẹo nhỏ trong lúc chế biến món ăn hàng ngày như lóc bớt mỡ trước khi nấu, hớt bỏ lớp màng mỡ trên bề mặt thức ăn, nướng, hấp thay vì chiên, xào, chọn thực phẩm từ sữa ít chất béo thay vì nhiều chất béo v.v…\n" +
                    "\n" +
                    "Ngoài ra, càng về sau, khi bé phát triển nhanh, mẹ bầu sẽ cảm thấy khó chịu ở dạ dày, chứng ợ nóng của 3 tháng đầu thai kỳ cũng  có nguy cơ khởi phát trở lại. Để tránh tình trạng này, bạn nên tiếp tục ăn 3 bữa chính xen kẽ 3 bữa phụ trong ngày. Đồng thời, ăn thức ăn có nhiều chất xơ để hạn chế tình trạng táo bón, vốn rất phổ biến vào tam cá nguyệt thứ 3, như các loại đậu, rau xanh, ngũ cốc, uống hơn 8 ly nước mỗi ngày v.v….",
            "Thực phẩm và dinh dưỡng là điều cực kỳ quan trọng trong suốt quá trình mang thai, điều này quyết định khá nhiều đến sức khỏe của cả mẹ và bé.  Bài viết dưới đây sẽ giúp bạn tìm hiểu kỹ hơn về những loại thực phẩm cực tốt cho bà bầu và thai nhỉ.\n" +
                    "Bạn biết rằng khi mang thai bạn cần chế độ dinh dưỡng đặc biệt với những chỉ dẫn nghiêm ngặt về những loại thực phẩm an toàn và không an toàn. Dưới đây là những loại thực phẩm mà bạn không chỉ nên ăn mà còn nên cố gắng ăn thường xuyên trong thai kỳ, vì chúng cung cấp dinh dưỡng tuyệt vời cho cả bạn và em bé trong bụng.\n" +
                    "\n" +
                    "1. Bông cải xanh\n\n" +
                    "Không chỉ chứa các chất dinh dưỡng thiết yếu cho một thai kỳ khỏe mạnh – như canxi và folate, bông cải xanh còn rất giàu chất xơ, vitamin C và các chất chống oxy hoá giúp bạn chống lại bệnh tật. Loại rau xanh phổ biến này giúp cơ thể bạn hấp thụ chất sắt khi ăn các thực phẩm giàu sắt như gạo lức hoặc mỳ ống từ bột mỳ nguyên cám.\n" +
                    "\n" +
                    "2. Ngũ cốc dinh dưỡng ăn sáng\n" +
                    "\n" +
                    "Bạn biết rằng folate (vitamin B9) rất quan trọng trước thời điểm thụ thai và trong vài tuần thai đầu tiên, và nhu cầu về loại vitamin thuộc nhóm B này của bạn sẽ ở mức cao trong suốt thai kỳ. Các chuyên gia khuyên bạn nên nạp đủ 400mcg mỗi ngày qua viên uống bổ sung hoặc thực phẩm bổ sung (ngũ cốc dinh dưỡng là một lựa chọn tốt và dễ dàng với 400mcg / tô), và thêm 200mcg từ thực phẩm giàu folate tự nhiên như măng tây và đậu bi.\n" +
                    "\n" +
                    "3. Các loại đậu hạt\n" +
                    "\n" +
                    "Khi mang thai, mọi phụ nữ đều cần thêm 10g đạm (protein) mỗi ngày so với chế độ dinh dưỡng bình thường – đạt tối thiểu 60g protein / ngày. Các loại đậu, đặc biệt là đậu lăng là nguồn đạm rất tốt, chứa 15g protein / chén. Chúng cũng chứa hàm lượng chất xơ cao, giúp chống táo bón cho bà mẹ mang thai. 1 chén đậu lăng nấu có thể giúp bạn hấp thụ được 1/2 nhu cầu folate hàng ngày, hãy cho thêm đậu lăng vào nấu cùng cơm và trộn với salad nhé!\n" +
                    "\n" +
                    "4. Sữa không béo\n\n" +
                    "Cơ thể bạn khi mang thai sẽ hấp thụ gần gấp đôi lượng canxi từ thực phẩm, nên theo lý thuyết, bạn chỉ cần duy trì chế độ ăn hàng ngày là đã được cung cấp đủ nhu cầu canxi (1000mg/ ngày). Tuy nhiên, đa số chúng ta tiêu thụ khá ít canxi so với nhu cầu nên việc uống thêm sữa không béo là cần thiết. Một ly sữa 240ml cung cấp 30% lượng canxi khuyến cáo.\n" +
                    "\n" +
                    "5. Chuối\n" +
                    "\n" +
                    "Chuối giàu potassium và cung cấp năng lượng nhanh để xua tan những cơn mệt lả của thai kỳ, chúng cũng lấp đầy dạ dày khi bạn cảm thấy buồn nôn. Bạn có thể dùng kèm chuối với ngũ cốc dinh dưỡng vào bữa sáng cùng với sữa chua.\n" +
                    "\n" +
                    "6. Thịt nạc\n" +
                    "\n" +
                    "Nếu không đủ sắt, bạn sẽ thường xuyên thấy mệt mỏi. Nhu cầu sắt của bạn tăng gấp đôi trong thai kỳ, nên lúc này bạn cần nạp thêm các loại thực phẩm giàu chất sắt. Thịt nạc chứa nhiều chất sắt và dễ hấp thu cho cơ thể bạn.\n" +
                    "\n" +
                    "7. Phô-mai\n" +
                    "\n" +
                    "Phô-mai là loại thực phẩm cần cân nhắc trong thai kỳ, cũng là thực phẩm rất giàu protein. Nhiều loại phô-mai như cheddar và mozzaella sẽ giúp bạn dễ dàng dung nạp đủ lượng canxi trong ngày.\n" +
                    "\n" +
                    "8. Trứng\n" +
                    "\n" +
                    "Nhiều phụ nữ ghét ăn thịt trong khi mang thai, vì thế trứng là nguồn protein thay thế xuất sắc vì chúng chứa tất cả các amino axit thiết yếu mà cơ thể bạn cần. Bữa tối lý tưởng dành cho bà bầu chính là một phần trứng cuộn nhân rau củ và một chút phô-mai. Nếu mùi thức ăn khiến bạn nôn nao, hãy luộc vài quả trứng và mang theo đi làm cùng với thức ăn vặt của bạn, hoặc trộn cùng với salad dầu giấm.\n" +
                    "\n" +
                    "9. Bột yến mạch\n" +
                    "\n" +
                    "Hãy bắt đầu một ngày mới với một chén cháo yến mạch vài ngày trong tuần! Vì sao ư? Loại carbonhydrate phức tạp này giúp bạn no lâu hơn, và cám yến mạch giúp làm giảm nồng độ cholesterone trong máu. Thay vì mua các loại bột yến mạch uống liền với hương liệu và hàm lượng đường cao, hãy dùng loại bột yến mạch thô để giảm lượng đường không cần thiết.\n" +
                    "\n" +
                    "10. Rau lá xanh\n" +
                    "\n" +
                    "Rau bó xôi đã nấu chín chứa nhiều folate và sắt, còn cải xoăn và củ cải đều là nguồn canxi tốt. Hãy tăng giá trị dinh dưỡng cho món salad với các loại rau có lá màu xanh đậm (màu đậm thể hiện hàm lượng vitamin cao hơn). Bạn cũng có thể kẹp thêm rau xanh vào bánh mì hoặc tích cực ăn cả món rau xào và canh rau hơn.\n" +
                    "\n" +
                    "\n" +
                    "11. Bánh mì nguyên cám\n" +
                    "\n" +
                    "Hãy thay loại bánh mì trắng thông thường bằng những lát bánh mì nguyên cám, bạn có thể yên tâm là đã nạp đủ lượng chất xơ khuyến cáo 20-35g. Bánh mì nguyên cám cũng cung cấp cho bạn một lượng chất sắt và kẽm khá tốt.\n" +
                    "\n" +
                    "12. Cam\n" +
                    "\n" +
                    "Cam là loại trái cây giàu vitamin C, folate, và chất xơ; ngoài ra chúng chứa đến 90% nước, giúp bạn uống đủ nhu cầu nước trong ngày. Nước cam rất tốt để giúp bạn xua tan mệt mỏi do thai kỳ mang lại.\n" +
                    "\n" +
                    "13. Các loại hạt và bơ hạt\n" +
                    "\n" +
                    "Chất béo rất cần thiết cho sự phát triển não bộ của em bé trong bụng bạn và giữ cho bạn no lâu. Các chuyên gia khuyến cáo nên thay thế chất béo no (trong thịt mỡ và bơ động vật) bằng chất béo không no – loại chất béo tốt cho tim mạch có trong các loại hạt. Nhưng vì hạt chứa nhiều chất béo và cả calorie, bạn không nên ăn quá 30g hạt và 2 muỗng canh bơ hạt mỗi ngày. Tuy nhiên, có một ngoại lệ! Nếu bạn thuộc cơ địa dị ứng thực phẩm, các chuyên gia khuyên bạn nên tránh các thực phẩm có nguy cơ gây dị ứng như đậu phộng trong suốt thai kỳ. Một số dữ kiện khoa học cho thấy các em bé có thể nhạy cảm với một loại thức ăn nào đó ngay từ trong tử cung của người mẹ, và có thể phát triển thành dị ứng thực phẩm sau này khi bé bắt đầu tập ăn.\n" +
                    "\n" +
                    "14. Thực phẩm từ đậu nành\n" +
                    "\n" +
                    "Ăn chay trong thai kỳ là việc hoàn toàn an toàn, miễn là bạn thu nhận đủ lượng dưỡng chất cần thiết, đặc biệt là protein (bác sĩ dinh dưỡng có thể gợi ý cho bạn thực đơn dinh dưỡng tốt). Và đừng quên đậu phụ trong các bữa ăn của mình nhé, vì mỗi chén đậu phụ chứa đến 10g protein cơ đấy.\n" +
                    "\n" +
                    "15. Trái cây khô\n" +
                    "\n" +
                    "Đó là loại đồ ăn vặt ngon lành và đặc biệt hữu dụng khi bạn thèm đồ ngọt. Hãy chọn các loại trái cây khô như mơ, nho, dâu nhưng hãy tránh xa chuối sấy vì chúng chứa nhiều dầu và chất béo.\n" +
                    "\n" +
                    "Hy vọng qua bài viết Những loại thực phẩm cực tốt cho bà bầu và thai nhi mà mẹ mang thai nên ăn trên đây sẽ giúp bạn và bé có được nhiều sức khỏe hơn nhé.",
            "Với một bà bầu bình thường thì ăn để đảm bảo con sinh ra đủ chất khó một, thì với bà bầu ăn chay trường còn khó mười. Nhưng đừng lo! Mọi thứ sẽ ổn nếu bạn sắp xếp chế độ dinh dưỡng thật linh hoạt cho cả bé và mẹ.\n" +
                    "\n" +
                    "Đã mang bầu thì đừng ăn chay?\n" +
                    "\n" +
                    "Theo các nhà dinh dưỡng: “Thai kỳ không phải lúc để các bà mẹ ăn chay trường kỳ khi đã là người trường chay trước đó”. Bởi vì chế độ ăn chay sẽ thiếu hụt dinh dưỡng hơn bình thường, trong khi thai phụ luôn cần được cung cấp vitamin và chất khoáng.\n" +
                    "\n" +
                    "Nhưng điều đó không có nghĩa là những người ăn chay trường không thể mang thai. Thực tế, việc ăn chay trường, cả ăn chay thường (tức không ăn thịt) hay ăn chay thuần (không ăn tất cả các sản phẩm từ động vật như trứng, sữa…) đều có lợi thế rất lớn so với ăn thịt. Chế độ ăn sẽ giảm tỉ lệ béo phì cũng như các căn bệnh như bệnh tim, ung thư…\n" +
                    "\n" +
                    "Chị Diệu Hoa (32 tuổi, Long An) cho hay: “Mình theo chế độ ăn chay được 8 năm rồi và giờ đang mang bầu bé thứ hai. Con gái đầu của mình giờ đã 2 tuổi mà vẫn khỏe mạnh. Theo mình, chỉ cần tìm hiểu và cân nhắc về từng loại thực phẩm thì đồ chay có khi còn tốt hơn thức ăn thuờng!”.\n" +
                    "\n" +
                    "Bé ăn chay cùng mẹ\n" +
                    "\n" +
                    "Chìa khóa duy nhất để giải quyết ổn thỏa vấn đề chính là hãy để bé cùng ăn chay với mẹ. Để bù đắp lượng dưỡng chất bạn thiếu, hãy thay thế bằng những nguyên liệu chay khác:\n" +
                    "Protein: Trong thai kỳ bạn cần nạp khoảng 70 gram protein/ ngày.\n" +
                    "\n" +
                    "Các loại đậu và sản phẩm từ đậu là nguồn protein, kẽm, sắt dồi dào. Tuy nhiên, các bác sĩ khuyên bạn chỉ nên dùng một hoặc hai bữa đậu trong thai kỳ để ngăn ngừa tác dụng phụ. Theo ước tính, nửa chén đậu có khả năng cung cấp năng lượng tương đương 84 gram thịt.\n" +
                    "\n" +
                    "Cũng đừng quên quả hạch là sự thay thế các chế phẩm từ sữa rất tốt. Chúng chứa hàm lượng lớn protein cũng như chất béo cần thiết cho cơ thể.\n" +
                    "\n" +
                    "Lưu ý, bạn đừng phụ thuộc quá nhiều vào phô mai, bánh mù chay. Thịt chay chứa rất nhiều natri và phô mai chay đầy mỡ bão hòa. Vì vậy, nếu không dùng đúng thực phẩm, thì đồ chay có nguy cơ gây hại cho cơ thể nhiều hơn đấy.\n" +
                    "Chất sắt: Là nhân tố giúp các tế bào máu đưa ôxy đến thai nhi, đồng thời ngăn chặn bệnh thiếu máu rất thường gặp ở các bà bầu ăn thịt. Một ngày, các bà bầu cần nạp khoảng 50 mg sắt – có rất nhiều trong các loại ngũ cốc tăng cường chất sắt, trái cây, rau dền, nho khô…\n" +
                    "\n" +
                    "Và để hấp thụ tốt lượng chất sắt chứa trong thức ăn, bạn đồng thời phải dùng thêm thực phẩm chứa nhiều vitamin C như ớt đỏ, dâu, cam, quýt…\n" +
                    "\n" +
                    "Vitamin B12: Là nhân tố cơ bản để hình thành tế bào máu và các cơ quan chức năng. Nhưng vitamin B12 hầu như chỉ có trong các sản phẩm từ thịt. Đây là một điều khá nan giải cho các tín đồ ăn chay. Mặc dù vẫn có đồ chay chứa B12 (ví dụ ngũ cốc) nhưng các bác sĩ khuyến khích cả bà bầu ăn chay thường hay chay trường đều nên uống viên bổ sung vitamin B12 để có thể nạp đủ 2,6 microgram vitamin cần thiết trong thai kỳ.\n" +
                    "\n" +
                    "Canxi và vitamin D: Đương nhiên ai cũng biết đây là nguồn dinh dưỡng giúp tái tạo xương, có rất nhiều trong các chế phẩm từ sữa. Nhưng giờ đây, bạn lại phải tìm đến nguồn cung cấp khác thôi.\n" +
                    "\n" +
                    "Để tiếp nạp đủ 1.000 mg canxi và 400 I.U vitamin D mỗi ngày, đừng quên đậu nành, đậu hũ, nước ép cam, rong biển, quả sung, mù tạt… Chúng là những lựa chọn vô cùng phù hợp cho cơ thể mẹ và bé.\n" +
                    "\n" +
                    "Omega 3 và các axit béo: Có nhiều trong cá, giúp tăng cường phát triển não bộ và hệ thống thần kinh của thai nhi. Khẩu phần ăn hàng ngày của thai phụ nên chứa 1,4 gram omega 3, nhưng để an tâm hơn nên cần tới 3 gram mỡ cá. Bên cạnh việc dùng thuốc bổ, bạn có thể dùng thức ăn thực vật như tảo dầu hạt cải, rau xanh…\n" +
                    "\n" +
                    "Ăn chay thế nào?\n" +
                    "\n" +
                    "Đối với thai phụ, bữa ăn hàng ngày luôn cần đảm bảo đúng chất, đúng bữa, đúng khẩu vị. Nếu mệt, bạn chỉ cần dùng một tô ngũ cốc đầy với trái cây và sữa đậu nành, bơ đậu phộng cùng một đĩa salad hoặc rau đông lạnh, đậu đóng hộp…\n" +
                    "\n" +
                    "Một vài món ăn vặt chay:\n" +
                    "\n" +
                    "- Xúp đậu: 1chén nhỏ có thể cung cấp 9 gram protein và 4 mg sắt.\n" +
                    "\n" +
                    "- Sữa chua không đường: Khoảng 200 gram sữa chua chứa 12 gram protein và 45% lượng canxi cần thiết cho cơ thể.",
            "Đậu bắp là thực phẩm đa công dụng, chứa nhiều chất dinh dưỡng có lợi cho mẹ và bé.\n" +
                    "\n" +
                    "\n" +
                    "Đậu bắp là thực phẩm đa công dụng, chứa nhiều chất dinh dưỡng có lợi cho mẹ và bé.\n" +
                    " \n" +
                    "Tránh dị tật thai nhi\n" +
                    "\n" +
                    "Đậu bắp cũng chứa nhiều axit folic. 1/2 chén đậu bắp nấu chín tương đương với 36,5 mg axit folic. Một chén đậu bắp sống chứa đến 87,8 mg axit folic. Đây là chất dinh dưỡng cần thiết cho nhiều chức năng của cơ thể, đặc biệt đối với những phụ nữ mang thai, axit folic cực kỳ quan trọng vì giúp phòng ngừa khuyết tật ống thần kinh và các dị tật bẩm sinh khác ở thai nhi.\n" +
                    "\n" +
                    "“Vệ sĩ” của hệ tiêu hóa\n" +
                    "\n" +
                    "Đậu bắp còn có tác dụng nuôi dưỡng những vi sinh vật có lợi trong đường ruột, có tác dụng nhuận tràng, hỗ trợ bệnh nhân bị hội chứng ruột kích ứng và các rối loạn hệ tiêu hóa. Vì vậy, khẩu phần ăn hằng ngày có kèm đậu bắp sẽ rất tốt cho cơ thể nói chung và hệ tiêu hóa nói riêng.\n\n" +
                    "Chất nhầy và chất xơ có trong đậu bắp giúp điều chỉnh lượng đường huyết bằng cách điều hòa sự hấp thu của chúng từ ruột non. Chất xơ của đậu bắp cũng là một “vệ sĩ” của hệ tiêu hóa. Khi vào hệ tiêu hóa đậu bắp sẽ là mảnh đất màu mỡ cho những vi khuẩn có lợi, có thể sánh ngang tầm với sữa chua, giúp tổng hợp các vitamin nhóm B.\n" +
                    "\n" +
                    "Chất xơ có tác dụng hấp thu nước làm thành khối lớn trong phân, nhờ đó có tác dụng ngăn ngừa táo bón. Đặc biệt chất nhầy có tác dụng bôi trơn hệ thống ruột, ngăn ngừa táo bón và bệnh trĩ, cải thiện tiêu hóa cho mẹ bầu.\n" +
                    "\n" +
                    "Làm đẹp tóc, da cho bà bầu\n" +
                    "\n" +
                    "Trong quá trình mang thai cũng như sau sinh, nhiều bà bầu gặp phải tình trạng bị rụng tóc, da nổi mụn, kém mịn màng, hồng hào, vậy tại sao không đưa món đậu bắp vào khẩu phần dinh dưỡng của mình.\n" +
                    " \n" +
                    "Đậu bắp được xem như mỹ phẩm giúp đẹp da, mượt tóc, giữ vẻ trẻ trung cho đôi mắt, tăng cường sức khỏe nhờ bên trong thân hình “nhỏ con” chứa nhiều vitamin A, vitamin C, calci, kali, magne. Để đạt được công dụng làm đẹp, các mẹ chỉ cần ăn các món hơi “mầu mỡ” một chút như: đậu bắp hấp mỡ hành, đậu bắp xào, đậu bắp hấp chấm kho quẹt\n" +
                    "\n" +
                    "Trợ thủ đắc lực giảm cân sau sinh\n" +
                    "\n" +
                    "Đậu bắp rất dồi dào chất xơ, cả chất xơ hòa tan và chất xơ không hòa tan. Chất xơ mang đến nhiều lợi ích cho sức khỏe, bao gồm cả việc thúc đẩy giảm cân sau sinh; kiểm soát lượng đường trong máu.\n\n" +
                    "Đậu bắp chứa calories thấp nên là thức ăn lý tưởng cho những người đang muốn giảm cân. Để hưởng được lợi ích sức khỏe tối đa của đậu bắp nên nấu nướng ở ngọn lửa thấp để chất nhầy ít bị thất thoát.\n" +
                    "\n" +
                    "Giúp bà bầu ngủ ngon\n" +
                    "\n" +
                    "Protein và dầu có trong hạt đậu bắp được xem là protein hạng nhất đồng thời rất nhiều amino acid thiết yếu cho cơ thể như tryptophan sẽ giúp tinh thần thoải mái, ngủ ngon giấc… Các mẹ mua đậu bắp về xào tỏi, nấu canh...để thử nghiệm tác dụng thần kỳ của đậu bắp đối với giấc ngủ.\n" +
                    "\n" +
                    "Loại bỏ độc tố khỏi cơ thể\n" +
                    "\n" +
                    "Đậu bắp là một thực phẩm rất có lợi trong việc loại bỏ độc tố trong cơ thể. Các chất nhầy, chất xơ trong đậu bắp có tác dụng ổn định đường huyết, đẩy các độc tố ra ngoài cơ thể.\n" +
                    "\n" +
                    "Để “dọn dẹp” cơ thể, chỉ cần 2 trái đậu bắp, mỗi trái cắt làm 3 khúc rồi bỏ vào tô sạch và nghiền nát, đổ vào một ly nước và ngâm qua đêm. Sáng hôm sau, trước bữa điểm tâm, khuấy đều và uống. Mỗi tuần uống 3 lần như vậy sẽ giúp cơ thể loại bỏ độc tố, điều hòa cholesterol, giải độc tố trong thận...\n" +
                    "\n" +
                    "Lưu ý: Bên cạnh những công dụng có lợi nêu trên, “khuyết điểm” của đậu bắp là làm “lạnh” bụng. Nếu mẹ bầu đang bị đau bụng, rối loạn tiêu hóa, tiêu chảy, không nên dùng loại rau này.",
            "Ăn uống trong thời gian mang thai có ảnh hưởng trực tiếp đến sức khỏe mẹ bầu và sự phát triển của thai nhi.\n" +
                    "Tuy nhiên ăn thế nào để có một chế độ cân bằng, đầy đủ dưỡng chất mà không quá nhiều thì không phải ai cũng biết. Trong suốt thời gian mang thai, chắc chắn bạn sẽ được nghe nhiều lời khuyên nên ăn cái này cái kia, ăn thế này thế khác. Vậy đâu là những lời khuyên đúng? Hãy tham khảo những gợi ý dưới đây nhé!\n\n" +
                    "1. Khi mang thai mẹ ăn nhiều trứng sau này bé sẽ dị ứng với trứng?\n" +
                    "\n" +
                    "Sai\n" +
                    "\n" +
                    "Các bác sĩ cho rằng nguyên nhân dẫn đến việc đa số các bé dị ứng trứng là do protein trong các thực phẩm có chứa trứng sau khi đi vào cơ thể sẽ phân giải thành các axit amin. Những axit amin này sẽ nâng cao nồng độ histamine. Từ đó gây nên hiện tượng dị ứng. Điều này hầu như không liên quan gì đến việc người mẹ ăn trứng trong thời gian mang thai. Ngoài ra các nghiên cứu cũng chỉ ra nguyên nhân dẫn đến việc bé bị dị ứng với thức ăn có liên quan nhiều đến yếu tố di truyền. Nhân tố di truyền này sẵn có trong cơ thể người mẹ và không hề có liên quan đến việc mẹ ăn những thực phẩm khác lạ gây ra.\n" +
                    "\n" +
                    "2. Bà bầu có thể uống những loại đồ uống có ga như coca hoặc café?\n" +
                    "\n" +
                    "Đúng\n" +
                    "\n" +
                    "Thông thường sự lo lắng của mọi người về café và đồ uống có ga là bởi chất cafein có trong chúng. Về vấn đề này các nhà nghiên cứu đã chỉ ra chất cafein đúng là có thể thông qua nhau thai gây ảnh hưởng tiêu cực đến thai nhi. Với những biểu hiện như bé sinh ra dễ bồn chồn hay quấy khóc. Nhưng điều này chỉ xảy ra khi người mẹ sử dụng quá nhiều những loại đồ uống này.\n" +
                    "Ngoài ra hàm lượng cafein quá cao cũng có thể thúc đẩy thận của người mẹ đào thải ra chất catecholamine làm tăng co mạch dẫn đến bất lợi cho tuần hoàn máu ở tử cung và nhau thai, gây thiếu oxy cho thai nhi. Do đó các bà mẹ nên đặc biệt chú ý điều này. Cũng cần lưu ý ngoài hàm lượng cafein quá cao có thể làm tăng nguy cơ sảy thai thì phần lớn những loại nước có ga đều có chứa hàm lượng đường khá lớn có thể khiến thai phụ tăng cân quá nhiều gây nên nhiều bệnh như tiểu đường hoặc tiền sản giật.\n" +
                    "\n" +
                    "3. Có thể ăn lẩu cay khi mang bầu?\n" +
                    "\n" +
                    "Đúng\n" +
                    "\n" +
                    "Với thai nhi cơ thể người mẹ có vai trò sàng lọc tuyển chọn những thực phẩm lạ. Chỉ khi người mẹ lạm dụng ăn quá nhiều thực phẩm cay, nếu không, rất khó có thể gây ảnh hưởng đến thai nhi. Nhưng do thực phẩm cay trong lẩu có thể gây kích thích cho nhu động ruột dạ dày dẫn đến đau bụng đi ngoài khiến tử cung co thắt gây sinh non. Do đó thai phụ khi ăn cay nên ăn vừa phải để đảm bảo an toàn cho bé.\n" +
                    "\n" +
                    "4. Mẹ ăn nhiều đu đủ bé sinh ra có thể bị vàng da?\n" +
                    "\n" +
                    "Sai\n" +
                    "\n" +
                    "Do hàm lượng carotene beta trong quả đu đủ khá phong phú nên bất luận là thai phụ hay em bé nếu ăn quá nhiều đều dẫn đến hiện tượng vàng da. Nhưng điều này không liên quan đến bệnh vàng da sinh lí ở trẻ sơ sinh. Nguyên nhân dẫn đến bệnh vàng da sinh lí ở bé là do sự tích lũy bilirubin trong cơ thể gây nên. Khi hồng cầu trong máu lão hóa bilirubin sản sinh ra một số chất thải. Khi lượng chất thải này quá nhiều hoặc không có cách nào để đào thải ra ngoài nó sẽ tích lũy trong cơ thể gây nên bệnh vàng da.\n" +
                    "\n" +
                    "5. Ăn thức ăn sống, lạnh khi mang bầu thì em bé sinh ra khí quản sẽ không tốt?\n" +
                    "\n" +
                    "Sai\n" +
                    "\n" +
                    "Khí quản của bé có tốt hay không hoàn toàn không liên quan đến việc ăn uống của người mẹ khi mang bầu. Hơn nữa thực phẩm sống lạnh cũng không trực tiếp làm giảm nhiệt độ ở tử cung gây ảnh hưởng đến thai nhi.\n" +
                    "\n" +
                    "Tuy nhiên, ăn nhiều thực phẩm sống lạnh chưa qua xử lí ở nhiệt độ cao người mẹ dễ bị nhiễm khuẩn gây đau bụng đi ngoài. Nếu nghiêm trọng có thể gián tiếp ảnh hưởng đến tử cung, dẫn đến sinh non. \n" +
                    "6. Mẹ ăn dấm chua sẽ dẫn đến sảy thai hoặc dị dạng thai nhi?\n" +
                    "\n" +
                    "Sai\n" +
                    "\n" +
                    "Có thông tin cho rằng người mẹ khi mang thai ăn dấm sẽ làm thay đổi thể chất, làm tăng nguy cơ sảy thai hoặc dị dạng thai nhi. Do khả năng điều chỉnh của cơ thể đối với thực phẩm ngoại lai khá lớn nên muốn cơ thể hoàn toàn bị axit hóa hoặc kiềm hóa là việc không đơn giản. Vì vậy, hoàn toàn không có cơ sở nếu cho rằng do người mẹ ăn dấm mà gây sảy thai hoặc dị dạng thai nhi.\n" +
                    "\n" +
                    "7. Hút thuốc, uống rượu khi mang thai bé có thể bị dị dạng?\n" +
                    "\n" +
                    "Đúng\n" +
                    "\n" +
                    "Thực tế đã chứng minh hút thuốc có thể gây ảnh hưởng tiêu cực đến sự phát triển của thai nhi. Đặc biệt trong khói thuốc lá có chứa nhiều chất gây dị dạng thai nhi như: nicotine, chì. Nếu hút thuốc khi mang thai có thể làm tăng tỉ lệ sứt môi ở thai nhi. Do đó những thai phụ nghiện thuốc nhất định cần phải cai thuốc hoàn toàn khi mang thai. Ngoài ra, khi thai phụ uống rượu rất nhiều chất truyền dẫn thần kinh cũng sẽ bị ảnh hưởng bởi nồng độ rượu, cồn, đặc biệt là sự phát triển của não bộ. Vì vậy hãy nói không với rượu và thuốc lá khi bạn quyết định mang thai.",
            "Thịt là một nguồn cung cấp protein cao trong các loại thực phẩm hàng ngày cho bà bầu. Nhưng ăn thịt như thế nào cho đúng cách và an toàn trong tình trạng thịt chất lượng và thịt không đạt chất lượng như hiện nay. Vài cách sau đây sẽ mách các mẹ hạn chế tốt đa những ảnh hưởng xấu khi ăn thịt lúc mang thai.\n" +
                    " \n" +
                    "Có rất nhiều mẹ bầu biết rằng trong thịt rất giàu protein rất cần thiết trong hành trình mang thai, nên cố gắng ăn thật nhiều để cung cấp cho thai nhi. Nhưng quan niệm trên không hẳn là đúng hoàn toàn vì ăn quá nhiều thịt có thể gây ra những bệnh nghiêm trọng như táo bón, béo phì gây khó sinh,… Lại cũng có những mẹ không ăn thịt chỉ ăn rau củ quả và uống sữa mà quên rằng thịt cũng là một nguồn thực phẩm rất giàu protein.\n" +
                    " \n" +
                    "Các chuyên gia dinh dưỡng khuyên rằng bà bầu nên ăn thịt trong chế độ ăn hàng ngày nhưng cần lưu ý một số điểm sau:\n" +
                    " \n" +
                    "- Nên ăn thịt đã nấu chín kỹ không ăn thịt tái chưa chín vì trong các loại thịt này còn tồn tại các loại vi khuẩn khá nhiều sẽ gây ảnh hưởng không tốt cho đường ruột của bà bầu.\n" +
                    "- Nội tạng của động vật cũng là một nguồn thực phẩm mà bà bầu không nên ăn thường xuyên vì trong nội tạng của động vật có chứa một nguồn vitamin A rất lớn mà khi cơ thể mẹ hấp thụ nhiều quá sẽ gây dị tật thai nhi. Nên bổ sung vitamin A từ các loại rau, củ, quả sẽ tốt hơn rất nhiều so với dùng gan động vật. Ăn một củ cà rốt là đủ lượng vitamin A cần thiết cho mỗi ngày. Nếu các mẹ thích ăn gan động vật thì chỉ nên ăn mỗi tuần một lần.\n" +
                    " \n" +
                    "- Ngoài ra, các loại thịt hun khói, thịt đóng hộp, đồ ăn nhanh cũng là một nguồn thực phẩm mà bà bầu tuyệt đối tránh xa. Chỉ nên sử dụng các loại thịt tươi sống và chế biến hàng ngày.\n" +
                    " \n" +
                    "- Thịt là một loại thực phẩm không thể thiếu nhưng cần chọn lựa thịt tươi sống, chế biến sạch sẽ, nấu chín kỹ, thức ăn sau khi chế biến không nên để qua đêm để đảm bảo sức khoẻ cho mẹ và thai nhi.",
            "- Ngao không những an toàn mà còn rất giàu dinh dưỡng cho phụ nữ mang thai.\n" +
                    "\n" +
                    "Ngao là thực phẩm không còn xa lạ trong bữa ăn của mỗi gia đình. Có nhiều cách chế biến ngao như ngao nấu canh, ngao hấp, ngao xào... Tuy nhiên, có người lo ngại ngao không an toàn cho bà bầu. Nghiên cứu đã chứng minh, ngao không những an toàn mà còn rất giàu dinh dưỡng cần thiết cho phụ nữ mang thai.\n" +
                    "\n" +
                    "- Ngao rất nhiều phôtpho, chất cần cho sự hình thành xương, răng của bào thai. Ngoài ra, phôtpho cũng cần thiết cho cơ thể mẹ sử dụng hiệu quả các nguồn vitamin.\n" +
                    "\n" +
                    "- Hàm lượng protein trong ngao cao hơn nhiều so với thịt. Nó giúp xây dựng các mô bào thai, ngăn ngừa béo phì ở phụ nữ mang thai vì đây là loại protein ít kalo.\n" +
                    "\n" +
                    "- Ngao còn là nguồn phong phú của chất sắt, rất tốt cho phụ nữ mang thai vì họ dễ bị thiếu máu.\n"+
                    "- Lượng kali trong ngao giúp người mẹ duy trì huyết áp và ổn định chức năng của tim.\n" +
                    "\n" +
                    "- Ngao còn giàu vitamin A, giúp người mẹ có làn da khỏe mạnh, cũng như hỗ trợ phát triển thị giác, xương ở bào thai.\n" +
                    "\n" +
                    "- Ngao cũng giúp duy trì cholesterol khỏe mạnh trong cơ thể bà bầu. Không những thế, ngao còn giàu axit béo omega 3, rất cần thiết trong thời kỳ mang thai.\n" +
                    "\n" +
                    "Những lưu ý khi ăn ngao\n" +
                    "\n" +
                    "Tuyệt đối không ăn ngao chưa nấu chín. Không chỉ ngao mà bất kỳ đồ ăn nào chưa được nấu chín cũng phải hoàn toàn tránh xa trong thời kỳ mang thai.\n" +
                    "\n" +
                    "Ngao thường được người dân lấy từ ven biển nên dễ bị ô nhiễm bởi các chất có trong nước biển. Do đó, có thể gây hại cho phụ nữ mang thai. Ngao dễ bị nhiễm vi khuẩn Vibrio vulnificus, có thể gây dị ứng cho bà bầu.",
            "Với những phụ nữ mang thai, hoa quả có tác dụng rất tốt đối với quá trình hình thành đại não ở thai nhi.\n" +
                    "Hoa quả giống như rau tươi, là nguồn thực phẩm không thể thiếu đối với sức khỏe con người. Đặc biệt đối với những phụ nữ mang thai, hoa quả có tác dụng rất tốt đối với quá trình hình thành đại não ở thai nhi. Tuy nhiên, ăn bao nhiêu là đủ lại là một vấn đề khiến không ít phụ nữ băn khoăn.\n" +
                    "\n" +
                    "Một trong những suy nghĩ sai lầm của nhiều phụ nữ mang thai là tâm lý phải ăn nhiều \"vì cả hai mẹ con\", thậm chí không ít ngưòi lầm tưởng rằng khi mang thai có thể tăng cân thoải mái. Nhất là việc ăn hoa quả. Họ luôn cho rằng hoa quả rất lành, ăn càng nhiều thì càng tốt, nên ăn vô tội vạ, mà không biết rằng ăn quá nhiều sẽ gây hại cho cơ thể và thậm chí là cả thai nhi.\n" +
                    "\n" +
                    "Việc ăn quá nhiều các loại hoa quả có hàm lượng đường cao sau bữa cơm chính sẽ rất dễ khiến phụ nữ tăng cân, vận động khó khăn, lượng đường trong máu tăng cao, có thể sẽ dẫn đến bệnh đái tháo đường. Điều này gây ảnh hưởng nghiêm trọng đến sức khỏe của cả mẹ lẫn thai nhi. Ví dụ như xuất hiện hiện tượng viêm nhiễm đường hô hấp, da, hệ thống tiết niệu…đối với người mẹ; khiến bị dị hình, thậm chí còn bị chết lưu trong tử cung…đối với thai nhi.\n" +
                    "Với phụ nữ mang thai, hoa quả có tác dụng rất tốt đối với quá trình\n" +
                    "hình thành đại não ở thai nhi. Hơn nữa, có không ít phụ nữ còn mù quáng dùng hoa quả thay thế bữa ăn chính. Đây là một phương pháp vô cùng phản khoa học. Mặc dù nguồn dưỡng chất có trong hoa quả là rất lớn nhưng nó không thể thay thế hoàn toàn cho thịt, cá. Vì lượng chất dinh dưỡng protein cần cung cấp cho cơ thể trong thời gian mang thai để nuôi dưỡng thai nhi là rất lớn. Nếu chỉ ăn hoa quả thôi thì không đủ chút nào. Đồng thời, hàm lượng vitamin có trong hoa quả cũng không thể phong phú bằng hàm lượng vitamin có trong rau xanh.\n" +
                    "\n" +
                    "Vậy bà bầu nên ăn hoa quả như thế nào?\n" +
                    "\n" +
                    "- Mỗi ngày, lượng hoa quả bổ sung không quá 200g, cố gắng chọn những loại hoa quả có hàm lượng đường thấp.\n" +
                    "\n" +
                    "- Nên ăn vào khoảng thời gian giữa bữa chính và bữa phụ.\n" +
                    "\n" +
                    "- Chú ý vệ sinh khi ăn uống.\n" +
                    "\n" +
                    "Chọn loại hoa quả nào để ăn?\n" +
                    "\n" +
                    "1. Chọn trái cây hữu cơ\n" +
                    "\n" +
                    "Điều này sẽ đảm bảo rằng loại trái cây bạn ăn hàng ngày không bị nhiễm các loại hóa chất từ thuốc trừ sâu hay thuốc bảo vệ thực vật. Bạn nên ăn trực tiếp từ những loại trái cây mua tại vườn hoặc những loại đã qua kiểm định an toàn thực phẩm.\n" +
                    "\n" +
                    "2. Trái cây nhiều vitamin C\n" +
                    "\n" +
                    "Vitamin C rất cần thiết trong thai kỳ vì nó sẽ giúp bạn và em bé hấp thụ đầy đủ chất sắt. Vitamin C còn có tác dụng làm giảm nguy cơ mắc bệnh thiếu máu khi mang thai, và làm cho răng lợi được khỏe mạnh.\n" +
                    "Vitamin C rất cần thiết trong thai kỳ vì nó sẽ giúp bạn và em bé \n" +
                    "hấp thụ đầy đủ chất sắt. (ảnh minh họa)\n" +
                    "\n" +
                    "Những loại trái cây giàu vitamin C là bưởi, cam, chanh, đào, táo… Uống một ly nước bưởi, cam, chanh sau khi ăn sáng mỗi ngày rất tốt cho cơ thể. Bên cạnh đó, cà chua, cũng chứa lượng vitamin C cao, nên ăn thường xuyên như một loại rau. Các loại rau lá xanh cũng là một lựa chọn lý tưởng trong việc hấp thụ Vitamin C.\n" +
                    "\n" +
                    "3. Trái cây giàu axit folic\n" +
                    "\n" +
                    "Axit folic rất cần thiết trong thai kỳ để phòng ngừa các khuyết tật ống thần kinh, ngăn ngừa sinh non cũng như hạn chế các khuyết tật về tim. Vì vậy, bà bầu không thể thiếu loại dưỡng chất đặc biệt quan trọng này.\n" +
                    "\n" +
                    "Axit folic có nhiều trong một số loại trái cây màu vàng sẫm như quả mơ, quả đào… Ăn mơ khô vào buổi sáng là cách rất tốt để hấp thụ axit folic và là điều cần thiết cho sự hình thành của protein vì nó có tác dụng hỗ trợ các enzyme tiêu hóa thức ăn. Đậu Hà Lan và các loại đậu khác cũng rất giàu axit folic.\n" +
                    "\n" +
                    "4. Nên ăn nhiều táo và chuối\n" +
                    "\n" +
                    "Chúng ta đều biết rằng, trái cây rất tốt cho sức khỏe và sự phát triển của thai nhi nhưng theo lời khuyên của các nhà khoa học, chị em bầu nên ăn nhiều táo và chuối hơn cả. Trong hai loại trái cây này rất giàu carbohydrate, kali, sắt, chất xơ và canxi – rất cần thiết cho sự phát triển của xương và các chức năng ở ruột thai nhi.\n" +
                    "\n" +
                    "Lưu ý: đối với những phụ nữ thích ăn hoa quả, thì tốt nhất khi thai nhi từ 24-28 tuần nên đến bệnh viện để kiểm tra lượng đường trong máu định kỳ, để tránh xảy ra những điều đáng tiếc.",
            "Các mẹ có thể thay thế bằng các món khoai tây bổ dưỡng hơn.\n" +
                    "Khoai tây là món ăn khoái khẩu của rất nhiều bà bầu. Khoai tây giàu dinh dưỡng và cung cấp năng lượng cần thiết cho thai kì. Ngoài ra, nó cũng có công dụng chữa một số bệnh cũng như giúp chị em làm đẹp da mặt hữu hiệu. Tuy nhiên, nếu ăn khoai tây không đúng cách, nó có thể gây hại cho thai nhi.\n" +
                    "\n" +
                    "Tác hại của khoai tây chiên\n" +
                    "\n" +
                    "Khoai tây giàu tinh bột, vì thế khi nấu ở nhiệt độ cao (chiên, nướng) sẽ hình thành acrylamide – một loại chất hóa học độc hại. Nếu thai phụ hấp thụ một lượng lớn Acrylamide thì em bé sinh ra sẽ nhẹ cân hơn tiêu chuẩn trung bình và có chu vi đầu nhỏ hơn.\n" +
                    "\n" +
                    "Kích thước đầu của trẻ sơ sinh có liên quan mật thiết đến sự phát triển thần kinh của bé, do đó, nếu trẻ sinh ra với chu vi đầu nhỏ sẽ dẫn đến các hiện tượng chậm phát triển. Các thai nhi hấp thu hóa chất acrylamide trong chế độ ăn uống của người mẹ thường có chu vi đầu nhỏ hơn kích thước trung bình 0,33cm.\n" +
                    "Trong khoai tây chiên còn chứa nhiều chất béo và muối, dễ gây béo phì và \n" +
                    "cao huyết áp cho mẹ và tăng nguy cơ cho thai. (ảnh minh họa)\n" +
                    "\n" +
                    "Nghiên cứu cũng cho thấy những bà mẹ có chế độ ăn uống chứa hàm lượng acrylamide cao sẽ sinh ra con nhẹ cân hơn 132g so với con của những mẹ bầu hấp thu một lượng thấp hóa chất này.\n" +
                    "\n" +
                    "Trẻ sơ sinh nhẹ cân hơn so với tiêu chuẩn trung bình dễ dàng phát triển các triệu chứng có hại cho sức khỏe trong giai đoạn tuổi thơ và cả trong tương lai về sau. Một số dấu hiệu và nguy cơ điển hình là trẻ có tầm vóc nhỏ hơn, tăng khả năng mắc bệnh tim, tiểu đường và loãng xương.\n" +
                    "\n" +
                    "Ngoài ra, trong khoai tây chiên còn chứa nhiều chất béo và muối, dễ gây béo phì và cao huyết áp cho mẹ và tăng nguy cơ cho thai. Do đó, tốt nhất là các bà bầu không nên ăn món này. Với những bà bầu nghiện khoai tây chiên thì hãy ăn một cách hạn chế sao cho không ảnh hưởng tới thai nhi.\n" +
                    "\n" +
                    "Đừng nên ăn quá nhiều\n" +
                    "\n" +
                    "Cấu trúc solanin trong khoai tây khá giống hormone steroid, nội tiết tố estrogen và progestrogen trong cơ thể. Nếu phụ nữ mang thai ngày nào cũng ăn khoai tây thì cơ thể sẽ hấp thu một lượng lớn alcaloid, có thể gây ra bất thường cho thai nhi.\n" +
                    "\n" +
                    "Một số chuyên gia cảnh báo, nếu phụ nữ mang thai nhạy cảm với alcaloid thì chỉ cần ăn 44 - 250g khoai tây/ngày, liên tục trong nhiều ngày, các bất thường ở thai nhi có thể xảy ra. Cần nhớ rằng, alcaloid trong khoai tây không giảm qua các bước nấu nướng thông thường như hấp hay đun sôi. Vì thế, tốt hơn phụ nữ mang thai nên ăn khoai tây điều độ.\n" +
                    "\n" +
                    "Tránh xa khoai tây đã mọc mầm xanh\n" +
                    "\n" +
                    "Những củ khoai tây bị xanh vỏ do không nằm dưới đất, hoặc khoai tây sau khi thu hoạch đã mọc mầm xanh có chứa một độc tố gọi là solaninne (còn gọi là chất kiềm sinh vật). Phụ nữ mang thai nếu ăn nhiều khoai tây có chứa kiềm sinh vật khá cao, chất kiềm này sẽ tích lũy trong cơ thể và gây hiệu ứng dị tật, ăn 44,2 - 252g khoai tây có thể làm cho thai nhi dị dạng.\n" +
                    "\n" +
                    "Lưu ý khi chế biến khoai tây\n" +
                    "\n" +
                    "- Gọt vỏ và ngâm nước trước khi chế biến món ăn: Vỏ khoai tây chứa nhiều dinh dưỡng hơn thịt, tuy nhiên cũng có hàm lượng acrilamit cao hơn. Vậy nên cách tốt nhất là gọt vỏ khoai tây khi trước khi chế biến, điều đó sẽ giúp giảm 23% chất acrilamit. Ngâm khoai từ 30 - 120 phút sẽ giảm được từ 38 - 48% chất độc hại này.\n" +
                    "Hãy lưu ý khi mua và chế biến món ăn từ khoai tây. (ảnh minh họa)\n" +
                    "\n" +
                    "- Không dùng chung với cà chua: Không nên xào nấu cà chua (nhất là cà chua xanh) với khoai tây, lý do là chúng sẽ hình thành những cục vón khó tiêu, có hại cho dạ dày.\n" +
                    "\n" +
                    "- Sau khi đã ăn khoai tây thì không nên tráng miệng bằng chuối: vì chúng sẽ tạo ra nhiều chất carbonhydrate khiến người ăn có nguy cơ mắc bệnh béo phì.\n" +
                    "\n" +
                    "- Nên kết hợp với thịt bò: Chất xơ trong thịt bò ăn nhiều sẽ không có lợi cho niêm mạc dạ dày, nhưng khi xào thịt bò với khoai tây thì chất xơ của thịt bò sẽ tác dụng với axit folic trong khai tây để hình thành nên nên chất dinh dưỡng khác tốt cho cơ thể.\n" +
                    "\n" +
                    "Món ngon từ khoai tây\n" +
                    "\n" +
                    "Với các bà bầu nghiện khoai tây, hãy tạm chia tay những món không tốt cho em bé như khoai tây chiên, nướng... Bù lại, bạn có thể thay thế bằng nhiều món khác cũng khá ngon, như khoai tây xào thịt bò, khoai tây hầm xương, súp khoai tây rau củ ... Bạn cũng có thể làm món khoai tây hầm thịt bò khá hấp dẫn để đãi cả nhà theo hướng dẫn dưới đây:\n" +
                    "\n" +
                    "* Chuẩn bị\n" +
                    "\n" +
                    "- Thịt bò, khoai tây, cà rốt lượng vừa ăn\n" +
                    "\n" +
                    "- Hạt tiêu, hành khô, tỏi khô, nước mắm, muối, mì chính.\n" +
                    "\n" +
                    "- Rau thơm\n" +
                    "\n" +
                    "Cách làm\n" +
                    "\n" +
                    "Bước 1: Thịt bò rửa sạch, thái miếng to bằng bao diêm.\n" +
                    "\n" +
                    "- Khoai tây, cà rốt gọt bỏ vỏ, rửa sạch, thái miếng (Lưu ý ngâm nước khoai tây ít nhất nửa giờ).\n" +
                    "\n" +
                    "- Hành, tỏi bóc bỏ vỏ, đập giập, băm nhỏ.\n" +
                    "\n" +
                    "Bước 2: Phi thơm hành, tỏi, trút thịt vào đảo săn rồi nêm mắm muối vừa ăn, để cho ngấm.\n" +
                    "\n" +
                    "- Đổ nước sôi ngập thịt rồi đậy vung, đun âm ỉ cho thịt mềm.- Cho tiếp khoai tây, cà rốt, đun cho khoai chín bở, cho mì chính. Múc ra bát, rắc hạt tiêu và rau thơm vào."

    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_ba_bau);
        imgIcon = (ImageView) findViewById(R.id.imgIcon);
        txtBodydd = (TextView) findViewById(R.id.txtBodydd);
        txtTiledd = (TextView) findViewById(R.id.txtTitledd);
        Intent i = getIntent();
        String item = i.getStringExtra("select_item");


        if(item.equals(Tile[0])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.b1);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[0]);
        }
        if(item.equals(Tile[1])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.b2);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[1]);
        }
        if(item.equals(Tile[2])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.b3);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[2]);
        }
        if(item.equals(Tile[3])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.b4);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[3]);
        }
        if(item.equals(Tile[4])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.b5);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[4]);
        }
        if(item.equals(Tile[5])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.b6);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[5]);
        }
        if(item.equals(Tile[6])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.b7);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[6]);
        }
        if(item.equals(Tile[7])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.b8);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[7]);
        }
        if(item.equals(Tile[8])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.b9);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[8]);
        }
        if(item.equals(Tile[9])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.b10);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[9]);
        }
        if(item.equals(Tile[10])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.b11);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[10]);
        }
        if(item.equals(Tile[11])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.b12);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[11]);
        }
        if(item.equals(Tile[12])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.b13);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[12]);
        }
        if(item.equals(Tile[13])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.b14);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[13]);
        }
        if(item.equals(Tile[14])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.b15);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[14]);
        }
        if(item.equals(Tile[15])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.b16);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[15]);
        }
        if(item.equals(Tile[16])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.b17);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[16]);
        }
        if(item.equals(Tile[17])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.b18);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[17]);
        }
        if(item.equals(Tile[18])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.b19);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[18]);
        }
        if(item.equals(Tile[19])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.b20);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[19]);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_body_ba_bau, menu);
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