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

public class BodyCongDung extends Activity {
    private Bitmap anh;
    private ImageView imgIcon;
    private TextView txtTiledd, txtBodydd;

    String Tile[] = {
            "1. 10 loại quả có công dụng phòng chữa bệnh rất hữu ích",
            "2. 14 thực phẩm giúp ổn định đường huyết và giảm cân hiệu quả",
            "3. 19 thực phẩm có màu sắc đẹp bắt mắt bạn nên ăn nhiều",
            "4. 3 loại trái cây nên chọn sau mỗi bữa ăn",
            "5. 5 loại quả màu đỏ giúp giảm béo siêu hạng",
            "6. 5 lợi ích tuyệt vời cho sức khỏe từ rau diếp",
            "7. 5 thực phẩm ăn, uống sống sẽ rất nguy hiểm",
            "8. 5 thực phẩm giàu chất béo nhưng không làm bạn tăng cân",
            "9. 6 loại rau củ quả giúp hạ lipid máu, bảo vệ tim mạch",
            "10. 6 thực phẩm giúp làm sạch độc tố trong đường ruột",
            "11. 7 loại thực phẩm giúp giảm bớt chứng viêm họng",
            "12. 7 loại thực phẩm giúp xua tan mệt mỏi",
            "13. 7 lý do tại sao bạn nên ăn quả ôliu",
            "14. 7 thực phẩm phòng bệnh hiệu quả",
            "15. 7 'vệ sĩ' giúp bạn chống dị ứng hiệu quả",
            "16. 8 loại thực phẩm tốt nhất cho xương chắc khỏe",
            "17. 8 lời khuyên cho những người thích ăn đồ ăn nhanh",
            "18. 8 thực phẩm 'đánh bay' những khó chịu do rượu",
            "19. Bông cải giúp trị viêm khớp",
            "20. Cà rốt, lê và táo giúp trắng răng"
    };

    String body[] = {
            "Hoa quả là món ăn được nhiều người yêu thích, nhưng công dụng phòng chữa bệnh của chúng thì không phải ai cũng biết.\n\n" +
                    "Vậy những loại quả nào vừa có có công dụng phòng chữa bệnh và phòng bệnh? Dưới đây là 10 loại quả có lợi cho sức khỏe của bạn.\n" +
                    "\n" +
                    "1. Ăn bơ để tránh tóc bị hư tổn\n" +
                    "\n" +
                    "Quá trình hấp, uốn hay tóc sẽ lấy đi độ ẩm và độ dầu của tóc, tóc trở nên khô ráp. Trong trái bơ chín có chứa tới 30% dầu thực vật quý giá – axit oleic, chất này có tác dụng đặc biệt đối với mái tóc khô và xơ. Vì vậy, hãy bổ sung thực phẩm này để giúp tóc khỏe hơn.\n" +
                    "\n" +
                    "2. Ăn chuối tốt cho não bộ\n" +
                    "\n" +
                    "Khi não phải hoạt động quá nhiều sẽ gây thiếu hụt vitamin, khoáng chất và calo. Ngoài việc não bộ mệt mỏi, nó còn tạo ra cảm giác khiến bạn thường xuyên có tâm lý chán nản. Lúc này hãy ăn chuối, vì trong chuối có chứa rất nhiều kali, có thể giúp xoa dịu tâm lý tiêu cực và bổ sung các dinh dưỡng khác cho não bộ như vitamin A, vitamin C, vitamin K...\n\n" +
                    "3. Ăn đu đủ tăng cường vitamin A cho mắt\n" +
                    "\n" +
                    "Dán mắt vào màn hình máy tính hoặc tivi quá lâu, mắt tập trung quá mức, làm tiêu hao một lượng lớn vitamin A – chất quan trọng cho cơ quan thụ cảm thị giác, khiến mắt cảm thấy khô, đau, sợ ánh sáng, thậm chí còn khiến thị lực giảm sút. Lúc này bạn cần phải ăn nhiều đu đủ mới có thể cung cấp một lượng lớn vitamin A bị tiêu hao.\n" +
                    "\n" +
                    "4. Ăn kiwi phòng chảy máu nướu răng\n" +
                    "\n" +
                    "Sức khỏe nướu răng có liên quan chặt chẽ với vitamin C. Nướu của những người thiểu vitamin C trở nên rất yếu, thường xuất huyết, sưng, thậm chí còn làm lung lay răng. Hàm lượng vitamin C trong kiwi là phong phú nhất trong các loại hoa quả, do đó là loại quả có lợi nhất cho sức khỏe răng nướu.\n\n" +
                    "5. Người có tiền sử bệnh tim mạch nên ăn bưởi\n" +
                    "\n" +
                    "Cholesterol cao ảnh hưởng nghiêm trọng tới sức khỏe tim mạch, đặc biệt những người có tiền sử bệnh tim mạch, càng phải chú ý kiểm soát chỉ số cholesterol trong cơ thể. Bưởi là loại quả có tác dụng trị bệnh được y khoa công nhận, chất pectin tự nhiên trong bưởi có thể hạ thấp cholesterol, phòng ngừa bệnh tim mạch.\n" +
                    "\n" +
                    "6. Ăn nho để giảm sự suy giảm chức năng của phổi\n" +
                    "\n" +
                    "Phổi của những người hút thuốc trong thời gian dài tích tụ rất nhiều độc tố, chức năng bị suy giảm. Các thành phần hiệu quả trong nho có thể cải thiện tỷ lệ chuyển hóa tế bào, giúp thải độc cho các tế bào phổi. Ngoài ra, nho còn có tác dụng long đờm và có thể giảm bớt các triệu chứng xấu như viêm đường hô hấp do hút thuốc gây ra.\n\n" +
                    "7. Ăn dứa phòng chống đau cơ\n" +
                    "\n" +
                    "Căng cơ, đau cơ, viêm mô cơ, lưu thông máu kém, vùng bị thường sưng đau. Thành phần bromelain trong quả dứa có tác dụng tiêu viêm, thúc đẩy tái tạo mô, còn có thể đẩy nhanh tốc độ trao đổi chất, cải thiện tuần hoàn máu, nhanh chóng tiêu sưng, là loại quả cần thiết cho cơ thể lúc này.\n" +
                    "\n" +
                    "8. Ngăn ngừa nếp nhăn trên da bằng cách ăn xoài\n" +
                    "\n" +
                    "Nếu sự đàn hồi của collagen không đủ rất dễ làm da xuất hiện nếp nhăn. Xoài là loại quả tốt nhất để phòng ngừa nếp nhăn, bởi vì chất beta-carotene và enzyme độc nhất vô nhị phong phú trong xoài có thể kích thích sức sống tế bào, thúc đẩy sự bài tiết chất thải, giúp duy trì sự đàn hồi của collagen, có tác dụng làm chậm lại sự xuất hiện của nếp nhăn.\n\n" +
                    "9. Đề phòng máu thiếu oxy bằng cách ăn quả cherry\n" +
                    "\n" +
                    "Thường xuyên mệt mỏi có liên quan tới việc hàm lượng sắt trong máu thấp, thiếu oxy và lưu thông máu kém. Ăn cherry có thể bổ sung chất sắt, trong đó hàm lượng vitamin C cũng khá phong phú có thể thúc đẩy cơ thể hấp thụ sắt, ngăn chặn cơ thể mất sắt và cải thiện tuần hoàn máu, giúp chống lại mệt mỏi.\n" +
                    "\n" +
                    "10. Phòng bệnh tê phù chân tay nhờ ăn cam\n" +
                    "\n" +
                    "Những người thiếu vitamin B1 dễ gặp bệnh tê phù. Trong trường hợp này cam là lựa chọn thích hợp, bởi nó giàu vitamin B1, đồng thời giúp chuyển hóa glucose, phòng ngừa và điều trị hiệu quả các bệnh tê phù chân tay.\n\n" ,
            "Những thực phẩm có chỉ số đường huyết thấp không những giúp bạn ổn định mức độ đường trong máu mà còn có thể đánh tan mỡ thừa, tránh tăng cân, giữ được vóc dáng gọn gàng.\n\n" +
                    "Bạn muốn giảm cân để có vóc dáng thon thả mơ ước? Nhưng ngoài 3 bữa ăn chính, lúc nào bạn cũng thèm nhấm nháp một chút gì đó cho vui miệng? Tình trạng ăn vặt sẽ không giúp gì cho bạn trong nỗ lực có được thân hình như ý. \n" +
                    "\n" +
                    "Sẽ tuyệt vời hơn khi bạn khởi đầu một ngày mới bằng một bữa sáng có chỉ số Glycemic thấp, chế độ này sẽ giúp bạn tránh được cảm giác đói cồn cào vào bữa trưa và thèm ăn vặt. Trong cuộc hội thảo khoa học diễn ra tại Chicago, các nhà nghiên cứu thuộc Đại học Prudue đã chứng minh rằng những người ăn sáng bằng quả hạnh nhân sẽ cảm thấy no lâu hơn những người ăn bữa sáng có chỉ số Glycemic cao. \n" +
                    "\n" +
                    "Vậy chỉ số Glycemic là gì?\n" +
                    "\n" +
                    "Chỉ số Glycemic (GI – chỉ số đường huyết) ban đầu được áp dụng nghiêm ngặt cho những người tiểu đường để giúp họ kiểm soát lượng đường trong máu hiệu quả. Dần dần, không chỉ có bệnh nhân tiểu đường mà rất nhiều người áp dụng chế độ này để nhằm mục đích giảm cân hiệu quả. Những thực phẩm có chỉ số đường huyết thấp không những giúp bạn ổn định mức độ đường trong máu mà từ đó còn có thể đánh tan mỡ thừa, tốt cho tiêu hóa, trao đổi chất, duy trì cơ thể khỏe mạnh vừa tránh tăng cân, giữ được vóc dáng gọn gàng. \n" +
                    "\n" +
                    "Dưới đây là một số loại thực phẩm nằm ở nhóm chỉ số Glycemic thấp (1-100) mà bạn có thể bổ sung vào khẩu phần ăn hàng ngày, giúp loại bỏ cảm giác thèm ăn trong cả ngày, từ đó nhanh chóng có được vóc dáng mơ ước:\n\n" +
                    "1. Sữa chua tách béo (GI - 35): Sữa chua tách béo luôn được đánh giá là một trong những thực phẩm lành mạnh với chỉ số GI thấp. Hàm lượng canxi cao trong sữa chua tách béo cũng giúp cải thiện hệ tiêu hóa, làm giảm đầy hơi và chứng khó tiêu, tiêu tan mỡ thừa. \n" +
                    "\n" +
                    "2.  Bưởi (GI – 25): Là loại quả dẫn đầu về lượng vitamin C, các enzym trong múi bưởi giúp cơ thể hấp thu đường, từ đó giảm lượng đường chuyển hóa thành mỡ dự trữ - nguyên nhân chính gây nên chứng béo phì. Do đó, ăn bưởi có thể giúp bạn tránh béo phì.\n" +
                    "\n" +
                    "3. Sữa tươi (GI – 40): Uống 1 cốc sữa vào mỗi sáng sau là phương pháp giảm cân hiệu quả bởi sữa tươi có thể ngăn ngừa cholestrol bám trên thành động mạch. Sữa tươi đồng thời còn khống chế hoạt tính của các enzyme hợp thành cholestrol trong cơ thể, làm giảm lượng cholestrol sản sinh ra. Đó chính là lý do tại sao sữa tươi có tác dụng giảm cân cho bạn.\n\n" +
                    "và giảm cân hiệu quả\n" +
                    "18-07-201300:01:06 Những thực phẩm có chỉ số đường huyết thấp không những giúp bạn ổn định mức độ đường trong máu mà còn có thể đánh tan mỡ thừa, tránh tăng cân, giữ được vóc dáng gọn gàng.Người bị cao huyết áp có “kém” đường tình dục? Bí quyết chống hạ đường huyết Phòng ngừa hạ đường huyết và bệnh đái tháo đường Bạn muốn giảm cân để có vóc dáng thon thả mơ ước? Nhưng ngoài 3 bữa ăn chính, lúc nào bạn cũng thèm nhấm nháp một chút gì đó cho vui miệng? Tình trạng ăn vặt sẽ không giúp gì cho bạn trong nỗ lực có được thân hình như ý. \n" +
                    "\n" +
                    "Sẽ tuyệt vời hơn khi bạn khởi đầu một ngày mới bằng một bữa sáng có chỉ số Glycemic thấp, chế độ này sẽ giúp bạn tránh được cảm giác đói cồn cào vào bữa trưa và thèm ăn vặt. Trong cuộc hội thảo khoa học diễn ra tại Chicago, các nhà nghiên cứu thuộc Đại học Prudue đã chứng minh rằng những người ăn sáng bằng quả hạnh nhân sẽ cảm thấy no lâu hơn những người ăn bữa sáng có chỉ số Glycemic cao. \n" +
                    "\n" +
                    "Vậy chỉ số Glycemic là gì?\n" +
                    "\n" +
                    "Chỉ số Glycemic (GI – chỉ số đường huyết) ban đầu được áp dụng nghiêm ngặt cho những người tiểu đường để giúp họ kiểm soát lượng đường trong máu hiệu quả. Dần dần, không chỉ có bệnh nhân tiểu đường mà rất nhiều người áp dụng chế độ này để nhằm mục đích giảm cân hiệu quả. Những thực phẩm có chỉ số đường huyết thấp không những giúp bạn ổn định mức độ đường trong máu mà từ đó còn có thể đánh tan mỡ thừa, tốt cho tiêu hóa, trao đổi chất, duy trì cơ thể khỏe mạnh vừa tránh tăng cân, giữ được vóc dáng gọn gàng. \n" +
                    "\n" +
                    "Dưới đây là một số loại thực phẩm nằm ở nhóm chỉ số Glycemic thấp (1-100) mà bạn có thể bổ sung vào khẩu phần ăn hàng ngày, giúp loại bỏ cảm giác thèm ăn trong cả ngày, từ đó nhanh chóng có được vóc dáng mơ ước:  \n" +
                    "\n" +
                    "14 thực phẩm giúp ổn định đường huyết và giảm cân hiệu quả 1\n" +
                    "Ảnh minh họa\n" +
                    "\n" +
                    "1. Sữa chua tách béo (GI - 35): Sữa chua tách béo luôn được đánh giá là một trong những thực phẩm lành mạnh với chỉ số GI thấp. Hàm lượng canxi cao trong sữa chua tách béo cũng giúp cải thiện hệ tiêu hóa, làm giảm đầy hơi và chứng khó tiêu, tiêu tan mỡ thừa. \n" +
                    "\n" +
                    "2.  Bưởi (GI – 25): Là loại quả dẫn đầu về lượng vitamin C, các enzym trong múi bưởi giúp cơ thể hấp thu đường, từ đó giảm lượng đường chuyển hóa thành mỡ dự trữ - nguyên nhân chính gây nên chứng béo phì. Do đó, ăn bưởi có thể giúp bạn tránh béo phì.\n" +
                    "\n" +
                    "3. Sữa tươi (GI – 40): Uống 1 cốc sữa vào mỗi sáng sau là phương pháp giảm cân hiệu quả bởi sữa tươi có thể ngăn ngừa cholestrol bám trên thành động mạch. Sữa tươi đồng thời còn khống chế hoạt tính của các enzyme hợp thành cholestrol trong cơ thể, làm giảm lượng cholestrol sản sinh ra. Đó chính là lý do tại sao sữa tươi có tác dụng giảm cân cho bạn.\n" +
                    "\n" +
                    "14 thực phẩm giúp ổn định đường huyết và giảm cân hiệu quả 2\n" +
                    "Ảnh minh họa\n" +
                    "\n" +
                    "4. Sữa đậu nành (GI - 43): Đậu nành có chứa nhiều acid amin loại glutamine và argine, đây là những acid amin giúp duy trì và củng cố hệ miễn nhiễm cho cơ thể. Uống một cốc sữa đậu nành vào buổi sáng sẽ giúp bạn giảm cảm giác đói, tăng cảm giác no, giảm chỉ số đường huyết và hàm lượng cholestrol.\n" +
                    "\n" +
                    "5. Nước mơ (GI – 57): Thành phần của quả mơ bao gồm axit, carotene, vitamin C, vitamin B1, tanin, lycopen, pectin, giúp kích thích quá trình chuyển hóa oxy trong tế bào, làm tế bào chóng hồi phục, chậm lão hóa. Mơ ngâm đường, ngâm muối vừa là loại nước giải khát tốt trong những ngày hè, vừa có lợi cho hệ tiêu hóa. \n" +
                    "\n" +
                    "6. Cà chua (GI – 30): Trong một quả cà chua 200g chứa khoảng 30 calo, bữa sáng chỉ cần ăn 1 quả cà chua với các loại thực phẩm khác, bữa chính vẫn ăn như bình thường nhưng ăn đồ nhạt và các thực vật có nhiệt lượng thấp thì chỉ cần trong 1 tuần, 1 tháng 1 lần thì không bao lâu bạn sẽ thấy hiệu quả rõ rệt.\n" +
                    "\n" +
                    "7. Nước ép táo (GI – 15): Trong táo có chứa Pectin – một loại chất xơ không hòa tan có vai trò quan trọng trong ruột, giúp giữ nước và làm sạch ruột để quá trình tiêu hóa diễn ra thuận lợi, hỗ trợ duy trì trạng thái cân bằng giữa vi khuẩn tốt và vi khuẩn có hại trong ruột, giảm mức cholesterol trong cơ thể.\n\n" +
                    "8.  Cam tươi (GI – 43): Cam tươi với lớp vỏ mỏng, giàu vitamin C, canxi, phốt pho, kali, axit citric caroten, hesperidin, chất xơ... rất tốt cho cho chuyển hoá đường ruột, giảm sự tích lũy độc tố có tác dụng hiệu quả trong việc giảm cân. \n" +
                    "\n" +
                    "9. Đào (GI – 50): Hàm lượng chất xơ cao trong đào giúp cải thiện tiêu hóa và phát huy các chứ năng của dạ dày, đồng thời ức chế quá trình hấp thu chất béo, tránh tăng cân. Quả đào còn giúp tăng cường hệ thống miễn dịch, giúp giữ cho vi khuẩn tốt, chống lại vi khuẩn có hại trong đường ruột. \n" +
                    "\n" +
                    "10. Cháo yến mạch (GI – 50): Nằm trong nhóm những thực phẩm có chỉ số GI thấp, cháo yến mạch là hình thức được ưa chuộng nhất để giảm cân. Không gây cảm giác mệt mỏi, trái lại, cháo yến mạch còn cung cấp một lượng lớn protein và chất xơ, thúc đẩy tiêu hóa, bài trừ độc tố trong cơ thể. Đồng thời làm da trơn mịn và sáng bóng. \n" +
                    "\n" +
                    "11. Nước cam ép (GI – 65): Nước cam không chỉ giúp tăng sức đề kháng, chống lại những vi khuẩn gây hại cho cơ thể mà nó còn có khả năng thay nước giải khát cực kỳ hữu hiệu nhờ lượng đường tự nhiên và ít hơn hẳn so với các loại nước khác. Ngoài ra, chất poliphenol có trong cam còn có thể duy trì độ ẩm hoặc lượng nước trong cơ thể giúp làm dạ dày của bạn no lâu hơn.\n\n" +
                    "12. Kiwi (GI – 50): Trong một quả Kiwi xanh có 4g chất xơ, bằng lượng chất xơ có trong khẩu phần ngũ cốc của một bữa ăn sáng. Kiwi chứa đầy vitamin và khoáng chất có lợi đối với cơ thể và lượng dinh dưỡng cao hơn hàm lượng dinh dưỡng cơ bản.\n" +
                    "\n" +
                    "13. Chuối (GI – 55): Chuối rất giàu tinh bột kháng, là loại chất xơ nuôi dưỡng no và góp phần đốt cháy chất béo, ngăn ngừa sự hấp thụ carbohydrate vào hệ thống cơ thể, giúp cho quá trình trao đổi chất diễn ra nhanh hơn, tạo một lớp màng bảo vệ trong ruột giúp tiêu diệt độc tố trong cơ thể, kích thích tiêu hóa tốt. \n" +
                    "\n" +
                    "14. Bánh mỳ 100% lúa mạch (GI – 70): Bánh mỳ hoàn toàn làm từ lúa mạch có chất xơ cao hơn so với những loại bánh mỳ thông thường được làm từ bột tinh chế. Mỗi lát bánh mỳ lúa mạch chứa 2gr chất xơ rất tốt cho hệ tiêu hóa. ",
            "Có thể bạn không tin nhưng rất nhiều thực phẩm có màu sắc đẹp mắt lại rất tốt cho sức khỏe, vừa kích thích bạn ngon miệng lại giúp bạn tránh tăng cân, lão hóa sớm.\n\n" +
                    "Dưới đây là 19 thực phẩm không những vừa có màu sắc đẹp mắt mà còn rất tốt cho sức khỏe của bạn. Bạn không nên bỏ qua chúng nhé.\n" +
                    "\n" +
                    "1. Quả chanh\n" +
                    "\n" +
                    "Loại thực phẩm này chứa khoảng 100% lượng vitamin C mà cơ thể bạn cần mỗi ngày. Đây là thực phẩm tốt nhất vì nó vừa dễ kiếm lại giúp làm tăng mức độ cholesterol tốt và đồng thời tăng cường sức khỏe của xương và răng.\n" +
                    "\n" +
                    "Ngoài ra, cũng giống như cam quýt, canh còn chứa hợp chất flavonoid giúp làm chậm sự tăng trưởng của tế bào ung thư và có đặc tính chống viêm.\n" +
                    "\n" +
                    "2. Đậu Hà Lan\n" +
                    "\n" +
                    "Thực phẩm màu xanh lá cây không phải là một siêu thực phẩm với hàm lượng chất chống oxy hóa cao nhưng nó lại rất tốt cho cơ thể. Trong đậu Hà Lan có sự cân bằng giữa các khoáng chất và vitamin, bao gồm cả kẽm, sắt.\n\n" +
                    "3. Lòng đỏ trứng \n" +
                    "\n" +
                    "Lòng đỏ trứng bao gồm nhiều chất dinh dưỡng cần thiết nhất cho cơ thể, đặc biệt là choline. Choline giúp giảm nguy cơ ung thư vú. Ngoài ra, các chất chống oxy hóa khác nhau trong lòng đỏ trứng cũng giúp ngăn ngừa thoái hóa cơ bắp và đục thủy tinh thể.\n" +
                    "\n" +
                    "Mặc dù hầu hết chúng ta đều biết ăn nhiều lòng đỏ trứng sẽ không có lợi cho sức khỏe vì nó liên quan đến bệnh tim, nhưng ăn với mức độ vừa phải thì lại có lợi rất nhiều.\n" +
                    "\n" +
                    "4. Đậu đen\n" +
                    "\n" +
                    "Đậu đen có nhiều chất đạm, chất xơ và một lượng nhỏ các axit béo omega-3. Tất cả những yếu tố trên giúp bạn cảm thấy no lâu hơn và đồng thời tăng cường sức khỏe tim mạch. Hạt đậu đen còn chứa nhiều chất chống oxy hóa nên có tác dụng chống lão hóa rất tốt.\n" +
                    "\n" +
                    "5. Táo đỏ\n" +
                    "\n" +
                    "Táo đỏ là một nguồn vô cùng phong phú của chất chống oxy hóa. Những chất chống oxy hóa ngăn chặn sự sản xuất các chất gây hại chính trong cơ thể, từ đó giúp cơ thể phòng được lão hóa và nhiều bệnh khác. Polyphenol là một loại chất chống oxy hóa được tìm thấy trong táo cũng giúp tăng tuổi thọ của bạn. Bên cạnh đó, nó cũng làm giảm nguy cơ phát triển bệnh tim mạch khác nhau.\n\n" +
                    "6. Cà chua\n" +
                    "\n" +
                    "Thực phẩm màu đỏ này chứa nhiều lycopene nhất. Lycopene là một chất chống oxy hóa, nó giúp ngăn chặn các nguy cơ xuất hiện bệnh ở bàng quang, dạ dày và ung thư ruột kết.\n" +
                    "\n" +
                    "7. Quả bơ\n" +
                    "\n" +
                    "Thực phẩm màu xanh đen này chứa một hàm lượng axit amin dồi dào được gọi là glutathione. Axit này giúp tăng cường hệ thống miễn dịch của bạn, chống lại bệnh tim mạch và các bệnh ung thư. Bên cạnh đó, quả bơ cũng rất giàu vitamin E - đây là một chất chống oxy hóa rất tốt cho làn da của bạn. Bơ cũng chứa chất béo không bão hòa đơn nên không làm bạn tăng cân.\n" +
                    "\n" +
                    "8. Quả mơ\n" +
                    "\n" +
                    "Thực phẩm màu vàng cam này được nạp với kali, chất xơ, vitamin A, vitamin C, beta-carotene và lycopene. Thực phẩm này giúp làm giảm nguy cơ các bệnh liên quan đến gan như ung thư gan.\n\n" +
                    "9. Hạnh nhân\n" +
                    "\n" +
                    "Bạn có thể ăn loại thực phẩm màu nâu nhạt này như một món ăn nhẹ hoặc bổ sung vào salad. Hạnh nhân là một nguồn tốt của chất béo không bão hòa đơn, protein, vitamin và khoáng chất thiết yếu nên giúp tăng cường sức khỏe. Thêm vào đó, hạnh nhân còn tốt cho tim vì nó làm giảm cholesterol xấu.\n" +
                    "\n" +
                    "10. Quả mâm xôi\n" +
                    "\n" +
                    "Trái cây màu hồng đậm này chứa một chất gọi là axit ellagic, giúp ngăn chặn sự phát triển của ung thư tế bào. Nó cũng chứa nhiều chất xơ, giúp ngăn ngừa cholesterol cao và các loại bệnh về tim mạch.\n" +
                    "\n" +
                    "11. Quả lựu\n" +
                    "\n" +
                    "Quả lựu có màu đỏ thẫm, nó chứa lượng chất xơ và chất chống oxy hóa phong phú có thể giúp giữ cho bộ não của bạn khỏe mạnh và thông minh. Một bộ não khỏe mạnh có nghĩa là bạn khỏe mạnh và tránh được căng thẳng.\n" +
                    "\n" +
                    "12. Ngô\n" +
                    "\n" +
                    "Loại thực phẩm màu vàng này được rất nhiều người ưa thích. Ngô có một sự kết hợp tốt giữa chất chống oxy hóa, các chất dinh dưỡng và chất xơ nên nó giúp bạn no lâu, khỏe mạnh. Hơn nữa, ngô chứa ít calo nên rất thân thiện với trọng lượng của bạn.\n" +
                    "\n" +
                    "13. Bông cải xanh\n" +
                    "\n" +
                    "Thực phẩm màu xanh lá cây này nổi tiếng với hàm lượng vitamin K và vitamin C cao. Cả hai chất dinh dưỡng thiết yếu này giúp tăng cường sức khỏe xương và răng của bạn. Chúng cũng có tác dụng giúp bạn phòng được các bệnh ung thư.\n\n" +
                    "14. Hạt lanh\n" +
                    "\n" +
                    "Hạt lanh là một trong những nguồn tốt nhất của axit béo omega-3. Chúng giúp giảm nguy cơ gặp các vấn đề tim bằng cách ngăn chặn các tế bào gây ra máu cục máu đông hoặc tắc nghẽn trong động mạch. Nó cũng đồng thời làm giảm nguy cơ ung thư vú vì trong nó có chứa các chất chống oxy hóa rất tốt cho việc loại bỏ các tế bào gốc.\n" +
                    "\n" +
                    "15. Bí ngô\n" +
                    "\n" +
                    "Màu cam của bí ngô cho thấy rõ ràng nó có chứa hàm lượng cao beta carotene giúp ngăn ngừa bệnh tim. Bí ngô chứa ít calo, nhiều chất xơ và vitamin A nên cũng có thể giúp bạn không tăng cân.\n" +
                    "\n" +
                    "16. Quả việt quất\n" +
                    "\n" +
                    "Trái cây tím này rất giàu chất chống oxy hóa và chất xơ. Thường xuyên ăn quả việt quất sẽ giúp bạn giữ cho bộ não khỏe mạnh và minh mẫn, ngăn chặn sự suy giảm nhận thức. Nó cũng giúp ngăn ngừa bệnh béo phì và giảm nguy cơ tăng huyết áp, ngăn ngừa xơ cứng động mạch.\n" +
                    "\n" +
                    "17. Khoai lang\n" +
                    "\n" +
                    "Khoai lang có thể có màu trắng, vàng, đỏ và nâu. Nhưng tất cả các loại khoai lang đều chứa nhiều beta-carotene, sắt, vitamin C và vitamin E nên có thể giúp bảo vệ cơ thể khỏi tác hại của tế bào gốc. Khoai lang cũng là một thực phẩm rất tốt cho việc phục hồi cơ bắp.\n" +
                    "\n" +
                    "18. Cà rốt\n" +
                    "\n" +
                    "Thực phẩm màu cam này là một trong những nguồn tốt nhất của carotenes. Cà rốt có thể ngăn chặn bệnh ung thư, bảo vệ chống lại sự thoái hóa điểm vàng, giảm thiểu bệnh quáng gà và làm giảm cholesterol xấu. Cà rốt còn bảo vệ da bạn khỏi tác hại của ánh mặt trời.\n" +
                    "\n" +
                    "19. Kiwi\n" +
                    "\n" +
                    "Thực phẩm màu xanh lá cây này chứa nhiều các chất dinh dưỡng tốt khác nhau như vitamin C, vitamin E, kali và chất chống oxy hóa. Vì vậy, nó có tác dụng ngăn chặn thoái hóa điểm vàng và hạn chế những ảnh hưởng xấu đến các tế bào trong cơ thể.",
            "Trái cây có thể dùng làm bữa ăn phụ hoặc thức ăn tráng miệng sau bữa ăn vì sau khi ăn ta thường có cảm giác răng rất sạch. Đó là do khi ăn trái cây, chất axít trong trái cây làm chúng ta tiết nhiều nước bọt hơn và làm sạch các bợn răng. Tuy nhiên, hãy nhớ là đừng ăn hoa quả ngay sau khi bữa ăn kết thúc nhé, hãy chờ khoảng 1 giờ sau đó mới nên ăn.\n" +
                    " \n" +
                    "1. Đu đủ\n" +
                    "Đu đủ được biết đến với tác dụng làm trắng da, giảm kalo. Bởi vì chất papain trong đu đủ có tác dụng làm trắng da hiệu quả. Nghiên cứu mới nhất của các nhà khoa học còn phát hiện, chất enzym trong nước ép đủ đủ có thể giúp cơ thể phân giải protein trong các loại thịt. Ăn một ít đu đủ sau bữa ăn có công hiệu nhất định trong việc phòng ngừa các bệnh như viêm loét dạ dày, viêm ruột, khó tiêu…\n" +
                    "\n" +
                    "Lưu ý: Đối với những người bị đau dạ dày thì không nên ăn đu đủ, đặc biệt là đu đủ xanh. Bởi vì trong nhựa đu đủ có nhiều chất papain. Chất này sẽ làm mòn niêm mạc dạ dày.\n" +
                    "\n" +
                    "2. Dâu tây\n" +
                    "\n" +
                    "Theo nghiên cứu mới nhất, dâu tây có tác dụng làm chắc nướu, giúp hơi thở thơm tho, mát họng. Ngoài ra, dâu tây là một nguồn vitamin C tuyệt vời, một nguồn mangan dồi dào, nguồn chất xơ, iốt rất tốt cho cơ thể và có lợi cho hệ tiêu hóa, giúp giảm cholesterol.\n" +
                    "\n" +
                    "Đồng thời, các chất xơ trong dâu tây sẽ giúp kích thích tiêu hóa, làm giảm huyết áp và kiềm chế cơn thèm ăn vô độ. Sự kết hợp giữa chất chống ôxy hóa và các tác nhân chống viêm trong dâu tây có tác dụng chống ung thư hữu hiệu.\n" +
                    "\n" +
                    "3. Táo\n" +
                    "\n" +
                    "Ngạn ngữ phương Tây cho rằng, \"ăn táo mỗi ngày thì bệnh tật sẽ tránh xa bạn\". Hàm lượng chất xơ trong táo khá cao, có thể giúp chức năng của dạ dày phát huy vai trò tiêu hóa thức ăn rất tốt. Khi bị tiêu chảy hay táo bón ăn táo đều có tác dụng chữa trị hiệu quả.\n" +
                    "\n" +
                    "Vậy ăn táo vào lúc nào là tốt nhất? Trong các bữa sáng, chúng ta hầu như đều nạp thiếu vitamin C và chất xơ, do đó nên ăn một ít hoa quả và rau xanh vào mỗi sáng. Lượng đường trong cơ thể thường thiếu vào buổi chiều, cho nên trước khi tan sở hãy ăn hoa quả bởi vì nó không chỉ bổ sung năng lượng mà còn tránh ăn quá no trong bữa tối dẫn tới béo phì.\n" +
                    "\n" +
                    "Lưu ý: Người bị bệnh tiểu đường hoặc bất kỳ vấn đề tiêu hóa khác như nồng độ axit thì càng nên tránh ăn hoa quả gần với thời điểm sau bữa ăn. Tốt nhất, những người này nên ăn hoa quả sau khi ăn là 2 giờ đồng hồ.",
            "Màu đỏ tượng trưng cho sự thịnh vượng, sung túc, các loại rau quả không chỉ mang lại cảm giác đẹp mắt cho bữa cơm ngày Tết mà còn rất tốt cho sức khoẻ và cân nặng của bạn.\n\n" +
                    "1. Cà rốt\n\n" +
                    "Cà rốt chứa rất nhiều caroten và vitamin A, tốt cho thị lực và đặc biệt hữu ích khi giảm béo. Ngoài ra, cà rốt còn giúp nhuận tràng, trị táo bón, làm sạch ruột.\n" +
                    "\n" +
                    "2. Táo đỏ\n\n" +
                    "Chắc chắn bạn biết táo có tác dụng với sắc đẹp như thế nào rồi, táo đỏ chứa rất nhiều vitamin C nhưng chứa ít calo, ăn nhiều táo sẽ giúp giảm béo, đồng thời thúc đẩy sự trao đổi chất, hạn chế sự sản sinh của cholesterol.\n" +
                    "\n" +
                    "3. Cà chua\n\n" +
                    "Màu sắc tươi sáng của cà chua không thể thiếu trong các bữa ăn mùa xuân, caroten và vitamin C trong cà chua bạn không nên bỏ qua, nó sẽ giúp da của bạn đẹp đến bất ngờ.\n" +
                    "\n" +
                    "4. Táo tàu\n\n" +
                    "Táo tàu vốn nằm trong rất nhiều bài thuốc bổ của Đông Y, bạn có thể dùng để ngâm trà, ăn với lẩu hay ngâm rượu, táo tàu giúp làm dịu thần kinh, nuôi dưỡng các tế bào thần kinh, tăng thêm năng lượng, giúp tâm trạng phấn chấn.\n" +
                    "\n" +
                    "5. Ớt\n\n" +
                    "Một chút ớt trong gia vị ngày xuân sẽ không ảnh hưởng đến vẻ đẹp của da bạn, nó sẽ giúp đốt cháy calo và chất béo, mở rộng mạch máu, làm tăng nhịp tim.",
            "Rau diếp có lá màu xanh sáng là loại rau rất giàu chất dinh dưỡng và đặc biệt có lợi cho sức khỏe của bạn.\n\n" +
                    "1. Nguồn cung cấp vitamin A tuyệt vời cho cơ thể\n" +
                    "\n" +
                    "Rau diếp, rau xà lách là một nguồn thực phẩm rất giàu vitamin. Rau diếp tươi sống có chứa một lượng lớn vitamin A và beta-carotene (beta-caroten chuyển đổi thành vitamin A trong cơ thể). Khi bạn tiêu thụ loại thực phẩm này, vitamin A trong rau diếp sẽ giúp duy trì làn da khỏe mạnh bằng cách thúc đẩy các màng nhầy. Bên cạnh đó rau diếp cũng giúp duy trì tốt thị lực cho đôi mắt của bạn.\n" +
                    "\n" +
                    "2. Giúp ngăn ngừa thoái hóa điểm vàng liên quan đến tuổi tác\n" +
                    "\n" +
                    "Zeaxanthin là chất có đặc tính chống oxy hóa cao và cũng là trợ thủ đắc lực trong việc ngăn ngừa bệnh thoái hóa điểm vàng liên quan đến tuổi tác. Đây cũng là loại chất không do cơ thể tạo ra mà phải do thức ăn và nguồn dinh dưỡng mang lại. \n" +
                    "\n" +
                    "Trong rau diếp, rau xà lách chứa một lượng lớn chất zeaxanthin rất tốt cho việc cải thiện thị lực do bị thoái hóa ở điểm vàng võng mạc. Nó có tác dụng rất tốt trong việc ngăn ngừa bệnh đục thủy tinh thể. Ngoài ra, chất flavonoid có trong rau diếp giúp ngăn ngừa ung thư phổi và miệng.\n\n" +
                    "3. Tăng cường độ vững chắc cho hệ xương\n" +
                    "\n" +
                    "Các nhà khoa học đã phát hiện ra rằng vitamin K cũng hỗ trợ rất lớn và đóng vai trò đặc biệt cần thiết trong việc tích lũy canxi để tối đa hóa sự chắc khỏe của xương, giúp cơ thể ngăn ngừa bệnh loãng xương. \n" +
                    "\n" +
                    "Bằng cách bổ sung lượng vitamin K thông qua rau diếp, bạn sẽ giúp hệ xương của mình chắc khỏe và phòng ngừa bệnh loãng xương. Vitamin K có trong rau diếp cũng làm giảm các tế bào thần kinh ở não bị tổn thương. Do đó nó cũng giúp ích trong việc ngăn ngừa bệnh Alzheimer.\n" +
                    "\n" +
                    "4. Cải thiện khả năng sinh sản\n" +
                    "\n" +
                    "Trong rau diếp tươi có chứa folate và lượng vitamin C dồi dào. Folate có tác dụng rất tốt trong việc duy trì sức khỏe của thai nhi trong quá trình bạn mang thai bằng cách giảm các nguy cơ biến chứng. \n" +
                    "\n" +
                    "Cũng nhờ có lượng folate mà rau diếp cũng giúp cải thiện sức khỏe sinh sản ở cả nam giới và phụ nữ - là trợ thủ trong việc cải thiện khả năng sinh sản. Vitamin C có trong rau diếp giúp cải thiện hệ thống miễn dịch và giúp chống lại bệnh nhiễm trùng.\n" +
                    "\n" +
                    "5. Cung cấp nguồn khoáng chất dồi dào cho cơ thể\n" +
                    "\n" +
                    "Rau diếp, rau xà lách có chứa một nguồn phong phú các loại khoáng chất như sắt, đồng, mangan, canxi, magiê và kali - giúp nâng cao tỷ lệ trao đổi chất trong cơ thể. Kali là một khoáng chất cần thiết giúp ổn định huyết áp và cải thiện sức khỏe tim mạch bằng cách điều chỉnh sự cân bằng của các chất dịch cơ thể. \n" +
                    "\n" +
                    "Canxi trong rau diếp giúp tăng cường độ chắc khỏe của răng và xương. Đồng và sắt hỗ trợ rất nhiều trong việc sản sinh ra các tế bào hồng cầu trong cơ thể. Vậy nên rau diếp là một loại thực phẩm rất có lợi cho sức khỏe của bạn. \n" +
                    "\n" +
                    "Tuy nhiên để duy trì cơ thể dẻo dai và khỏe mạnh thì bạn cần phải biết kết hợp với các biện pháp phòng ngừa, chăm sóc và tập thể dục trước khi tiêu thụ loại rau này. Bên cạnh đó, rau diếp, xà lách cũng là một trong những loại rau dễ bị tiếp xúc với thuốc trừ sâu. Vì vậy, hãy chắc chắn rằng bạn rửa rau diếp thật sạch trước khi ăn.",
            "Không phải là cứ ăn thực phẩm tươi sống thì sẽ nhiều dinh dưỡng hơn. Bởi có những loại thực phẩm được khuyến cáo nếu ăn tươi, sống sẽ nguy hại cho sức khỏe.\n\n" +
                    "Đối với hầu hết các loại thực phẩm thì trạng thái tươi có giá trị dinh dưỡng cao hơn hẳn, hương vị, màu sắc cũng hấp dẫn hơn. Hơn nữa, quá trình chế biến món ăn có thể làm cho chất dinh dưỡng trong thực phẩm cũng mất đi ít nhiều.\n" +
                    " \n" +
                    "Tuy nhiên, nói như vậy không phải là cứ ăn thực phẩm tươi sống thì sẽ tốt hơn. Bởi có những loại thực phẩm được khuyến cáo nếu ăn tươi, sống sẽ nguy hại cho sức khỏe của bạn.\n" +
                    " \n" +
                    "1. Sữa\n" +
                    " \n" +
                    "Một số người thích uống sữa bò tươi vì giá trị dinh dưỡng cao. Tuy nhiên, khả năng sữa bị ô nhiễm trong thực tế dễ xảy ra. Ô nhiễm có thể đến từ các nguyên nhân sau: tình trạng sức khỏe của bò (đã bị nhiễm bệnh, kể cả bệnh lở mồm long móng hay bệnh do các vi sinh vật gây ra), quá trình làm sạch, điều kiện khử trùng…\n" +
                    " \n" +
                    "2. Sứa tươi\n" +
                    " \n" +
                    "Sứa tươi có chứa chất độc nên cần hết sức cẩn thận khi chế biến. Bạn nên ngâm sứa với muối i-ốt hoặc rửa với nước phèn chua nhiều lần để cho các độc tố bài thải ra ngoài, sau đó mới chế biến.\n" +
                    " \n" +
                    "3. Các loại mộc nhĩ tươi \n\n" +
                    "Mộc nhĩ tươi có chứa một lớp chất morpholine nhạy cảm ánh sáng, nếu sau khi ăn mộc nhĩ tươi mà cơ thể tiếp xúc với ánh sáng có thể làm cho da bị ngứa, phù nề, trường hợp trầm trọng còn dẫn đến hoại tử da nghiêm trọng. Nếu phù nề xảy ra trong màng nhầy cổ họng sẽ gây khó thở.\n" +
                    " \n" +
                    "Mộc nhĩ khô là các sản phẩm đã qua phơi nắng nên có thể phân hủy hầu hết các morpholines nên giảm sự nguy hại. Hơn nữa, trước khi chế biến, bạn nên ngâm mộc nhĩ với nước để cho các chất độc bị hòa tan trong nước. \n\n" +
                    "4. Nước đóng chai\n" +
                    " \n" +
                    "Nước đóng chai thường được sử dụng ozone để khử trùng. Trước khi đóng chai, nồng độ ozone vẫn còn rất cao, vì thế khi đến với người sử dụng nó vẫn tiềm ẩn những mối nguy hiểm cho cơ thể con người. Sau vài ngày, nồng độ ozone mới giảm dần đi.\n" +
                    " \n" +
                    "Vì vậy, bạn đừng nên uống nước vừa đóng chai, bình và để tốt nhất thì bạn nên uống nước đun sôi để nguội.\n" +
                    " \n" +
                    "5. Dưa muối\n" +
                    " \n" +
                    "Dưa bắp cải hay bất kì loại dưa muối nào cũng đều có chứa một lượng đáng kể nitrit, nhất là khi dưa muối chưa chín kĩ. Sau khi muối vài giờ lượng nitrite trong dưa tăng lên đáng kể. Chất nitrit có thể gây ra các triệu chứng của tình trạng thiếu oxy (tím tái mặt mũi, chân tay...) và nếu ăn nhiều thì có thể gây ung thư.",
            "Cơ thể bạn cần thực phẩm lành mạnh chứa nhiều chất béo để hoạt động, giữ cho tâm trạng thoải mái và ổn định lượng đường trong máu, thậm chí là để giảm cân.\n\n" +
                    "Bạn không muốn mình tăng cân và tránh tuyệt đối các thực phẩm chứa chất béo. Nhưng bạn có biết rằng, chế độ ăn ít chất béo cũng có nghĩa là bạn ăn nhiều carbohydrate hơn, dẫn đến mức đường huyết cao lên, cơ thể lưu trữ nhiều chất béo hơn. Không những thế, nó còn gây rối loạn sự trao đổi chất trong cơ thể và khiến bạn dễ thay đổi tâm tính, hay cáu gắt, mệt mỏi, kiệt sức...\n" +
                    "Cơ thể bạn cần thực phẩm lành mạnh có nhiều chất béo để hoạt động, giữ cho tâm trạng thoải mái và ổn định lượng đường trong máu, thậm chí là để giảm cân. Dưới đây là 5 thực phẩm lành mạnh chứa nhiều chất béo nhưng rất tốt cho cơ thể. Vì vậy, bạn không cần tránh ăn chúng một cách triệt để.\n" +
                    "1. Quả bơ\n" +
                    "Có lẽ một trong những thực phẩm lành mạnh có nhiều chất béo nhất là quả bơ. Quả bơ chứa nhiều vitamin E, vitamin B, một lượng vừa phải protein, folate, magie, chất xơ và chất béo lành mạnh... Do đó, nó thực sự có thể ngăn chặn các chất béo có hại trong cơ thể.\n" +
                    "Quả bơ còn là một thực phẩm tuyệt vời cho gan vì nó giúp gan loại bỏ các tác nhân có hại ra khỏi cơ thể. Các chất béo trong quả bơ đều là chất béo không bão hòa đơn nên có thể hỗ trợ một chế độ ăn uống lành mạnh, tốt cho da, trái tim và tâm trạng của bạn.\n" +
                    "2. Dầu dừa và cùi dừa\n" +
                    "Các chất béo trong dầu dừa khác với tất cả các chất béo khác. Đầu tiên, nó không được lưu trữ trong cơ thể như các chất béo khác. Khi vào cơ thể, chất béo của dầu dừa được sử dụng ngay lập tức để chuyển hóa thành năng lượng.\n" +
                    "Thứ hai, dầu dừa cũng chứa axit lauric, được coi như một tác nhân kháng khuẩn, loại bỏ các vi khuẩn có hại trong cơ thể. Dầu dừa cũng giúp tiêu hóa thức ăn, nuôi dưỡng tuyến giáp và kiểm soát lượng đường trong máu.\n" +
                    "Cũng giống như dầu dừa, thịt dừa có hàm lượng chất béo cao, nhưng lại rất có lợi cho giảm cân và duy trì trọng lượng. Những chất béo này chứa nhiều các chất dinh dưỡng nuôi dưỡng tuyến giáp, hỗ trợ quá trình trao đổi chất của toàn bộ cơ thể.\n" +
                    "Cùi dừa cũng rất tốt cho hệ thống nội tiết cũng như giúp cân bằng mức độ estrogen trong cơ thể.\n" +
                    "3. Dầu hạt lanh\n" +
                    "Một trong những loại dầu chống viêm tốt nhất là dầu lanh. Dầu hạt lanh được chiết xuất từ hạt lanh, là một trong những loại dầu chứa nhiều chất béo lành mạnh hơn tất cả các loại dầu khác.\n" +
                    "Điều quan trọng là các chất dinh dưỡng trong hạt lanh không bị phá hủy và gây hại khi đun nóng. Dầu hạt lanh có hàm lượng axit béo omega-3 cao, giúp đốt cháy chất béo trong cơ thể và giữ cho các khớp xương được bôi trơn, lượng đường trong máu thấp. Nhờ có hàm lượng omega-3 cao mà dầu lanh cũng có thể được coi là một phương thuốc tuyệt vời chữa bệnh trầm cảm.\n" +
                    "4. Cá và dầu cá\n" +
                    "Cá là một trong những loại thực phẩm tốt nhất cho những người bị bệnh viêm dạ dày, viêm khớp và giảm cân. Nó là một món ăn giúp giảm béo rất tốt. Các chất béo trong cá có thể chống lại chất béo \"xấu\" trong cơ thể và đẩy lùi tâm trạng trầm cảm. Nhờ đó, nó cũng gián tiếp có hiệu quả trong việc giảm cân.\n" +
                    "Tương tự như cá, dầu cá không chỉ chứa nhiều axit béo thiết yếu giúp tim khỏe mạnh  mà còn cải thiện các rối loạn tâm thần như trầm cảm, rối loạn lưỡng cực và tâm thần phân liệt. Các axit EPA và DPA trong phần lớn chế phẩm dầu cá chất lượng cao có tác dụng giúp cân bằng cholesterol.\n" +
                    "5. Trứng\n" +
                    "Nhiều người tránh ăn trứng vì nghĩ rằng chúng chứa nhiều cholestẻol. Điều này là hoàn toàn không cần thiết. Lòng đỏ trứng là một trong các loại thực phẩm bổ dưỡng nhất vì nó chứa nhiều chất dinh dưỡng bao gồm vitamin nhóm B cần thiết cho năng lượng, vitamin E cho làn da khỏe mạnh, choline cho hoạt động não bộ khỏe mạnh và thậm chí cả axit béo Omega 3...\n" +
                    "Trứng là loại thực phẩm tuyệt vời vì chất béo của nó có thể giúp ngăn ngừa trầm cảm, axit amin thiết yếu tryptophan có thể ngăn chặn căng thẳng và lo lắng, làm tăng serotonin trong cơ thể.\n" +
                    "Khi lựa chọn thực phẩm lành mạnh có nhiều chất béo, bạn hãy cân nhắc để chọn những loại có chất lượng và tốt cho sức khỏe nhé.\n" ,
            "Tăng lipid máu là tình trạng các chất béo có trong máu như cholesterol, triglycerid vượt quá giới hạn bình thường. Hạ lipid tức là bảo vệ sức khỏe tim mạch của bạn.\n\n" +
                    "Khi tăng lipid máu, chất béo thừa trong máu có thể sẽ đóng cặn trên thành động mạch, khiến lòng động mạch ngày càng hẹp đi. Điều này dẫn đến hiện tượng xơ vữa động mạch hoặc huyết khối tắc mạch. Từ đó sẽ gây bệnh lý ở tim, gọi là bệnh tim - mạch vành (thiếu máu cơ tim, nhồi máu cơ tim). Nếu xảy ra ở não thì gọi là tai biến mạch máu não (đột quỵ, nhũn não, xuất huyết não).\n" +
                    "\n" +
                    "Cùng với việc cuộc sống không ngừng được cải thiện, chế độ ăn uống toàn cá thịt cũng theo đó mà phát triển. Tuy nhiên cách ăn uống không hợp lý này khiến nhóm người mắc chứng tăng lipid cũng liên tục gia tăng. \n" +
                    "\n" +
                    "Dưới đây là 6 loại rau củ có tác dụng giúp hạ lipid.\n" +
                    "\n" +
                    "1. Hạt tiêu\n" +
                    "\n" +
                    "Tỷ lệ vitamin C trong hạt tiêu đạt mức cao nhất trong tất cả các loại thực phẩm. Vitamin C có thể cải thiện vi tuần hoàn trong cơ thể, hạn chế làm mỏng mao mạch, đồng thời vitamin C còn có thể giảm bớt hàm lượng cholesterol, là thực phẩm hạ lipid thiên nhiên. Các học giả Nhật Bản phát hiện, vị cay của hạt tiêu có thể thúc đẩy quá trình trao đổi chất, ngăn chặn sự tích tụ chất béo trong cơ thể, do đó có tác dụng hạ mỡ máu và giảm béo.\n" +
                    "\n" +
                    "Lưu ý: Ăn quá nhiều hạt tiêu có thể kích thích niêm mạc đường tiêu hóa, dễ dẫn tới các bệnh đau dạ dày, loét dạ dày. Ngoài ra, hạt tiêu thuộc thực phẩm nóng, Đông y cho rằng, người bệnh nên thận trọng khi ăn hạt tiêu.\n\n" +
                    "2. Hoa lơ\n" +
                    "\n" +
                    "Hoa lơ có hai loại trắng và xanh, hoa lơ xanh còn gọi là bông cải xanh. Giá trị dinh dưỡng của hai loại này đều như nhau, lượng calo của hoa lơ rất thấp, nhưng hàm lượng chất xơ lại rất cao, còn giàu vitamin và khoáng chất, do đó nó còn được gọi là “dược liệu trời cho”.\n" +
                    "\n" +
                    "Hoa lơ còn chứa khá nhiều flavonoid. Và flavonoid là chất làm sạch huyết quản rất tốt, có thể loại bỏ hiệu quả sự lắng đọng cholesterol trong máu (hạ lipid máu), còn có thể ngăn chặn sự tập kết tiểu cầu, giảm tỷ lệ mắc bệnh tim mạch.\n" +
                    "\n" +
                    "Lưu ý: Hấp là cách nấu hoa lơ tốt nhất. Ngâm hoa lơ trong nước muối khoảng vài phút, sâu trong hoa lơ sẽ rơi ra ngoài, hơn nữa còn có thể loại bỏ dư lượng thuốc trừ sâu.\n\n" +
                    "3. Cà tím\n" +
                    "\n" +
                    "Phần thịt cà tím rất giàu vitamin P, có chức năng là giảm đáng kể nồng độ lipid và cholesterol trong máu. Vitamin P còn có thể làm tăng sự linh hoạt của các mao mạch, cải thiện vi tuần hoàn, có tác dụng hoạt huyết, thông mạch rõ rệt. Ngoài ra, cà tím còn chứa một lượng lớn glycosides, cũng có thể giảm cholesterol trong máu. Do đó, cà tím là thực phẩm lý tưởng đối với những người xơ vữa động mạch.\n" +
                    "\n" +
                    "Lưu ý: Cà tím chiên có thể khiến vitamin P mất đi đáng kể, vì thế nên hạn chế chiên.\n\n" +
                    "4. Tỏi\n" +
                    "\n" +
                    "Tỏi có tác dụng hạ lipid đáng kể và phòng ngừa xơ vữa động mạch, đồng thời có thể ngăn chặn hiệu quả sự hình thành huyết khối. Thương xuyên ăn tỏi có thể có tác dụng bảo vệ mạch máu. Tỏi còn được mệnh danh là “cây thuốc vàng”.\n" +
                    "\n" +
                    "Lưu ý: Thời gian ngâm tỏi không nên quá lâu, tránh để những thành phần hiệu quả bị phá hỏng. Những người mắc bệnh về đường tiêu hóa, bệnh gan và bệnh về mắt không nên ăn quá nhiều.\n\n" +
                    "5. Mướp đắng\n" +
                    "\n" +
                    "Mướp đắng vị đắng tính mát, giàu saponin, có thể kích thích sự tiết insulin, có tác dụng giảm đáng kể lượng đường và cholesterol trong máu. Hàm lượng vitamin B1, vitamin C và nhiều loại khoáng chất trong mướp đắng đều rất phong phú, có thể điều tiết mỡ máu, nâng cao hệ miễn dịch cho cơ thể, còn có tên gọi khác là “insulin thực vật”.\n" +
                    "\n" +
                    "Lưu ý: Những người mắc bệnh viêm ruột mãn tính không nên ăn nhiều mướp đắng, khi ăn nên chiên qua lửa nhanh, đừng hầm quá lâu.\n\n" +
                    "6. Cần tây\n" +
                    "\n" +
                    "Theo Đông y, cần tây tính mát, giàu vitamin và khoáng chất, có thể tăng cường nhu động dạ dày, có tác dụng nhuận tràng. Ngoài ra, còn có thể loại trừ chất béo dư thừa trong đường ruột. Nghiên cứu nước ngoài đã chứng minh, những người thường ăn cần tây, hàm lượng cholesterol trong cơ thể giảm đáng kể, hơn nữa còn có thể hạ huyết áp rõ rệt.\n" +
                    "\n" +
                    "Lưu ý: Cần tây chứa khá nhiều chất xơ thô, đồng thời có thể tăng tốc độ nhu động ruột, người già hay người bị đau dạ dày lâu không khỏi nên hạn chế ăn cần tây.",
            "Cơ thể tích tụ độc tố dễ dẫn đến nhiều chứng bệnh nguy hiểm đối với sức khỏe, vì thế bạn nên làm sạch độc tố trong đường ruột cho cơ thể định kỳ.\n\n" +
                    "Trong những năm gần đây, khoa học trong nước và nước ngoài đã có nhiều bằng chứng cho thấy cao huyết áp, gan, xơ gan, đột quỵ, ung thư, viêm gan, bệnh tiểu đường và các bệnh khác ở các cơ quan nội tạng là do nhiễm độc gây nên. Ăn các loại thực phẩm sau đây có thể có hiệu quả rõ ràng trong việc làm sạch chất nhờn trong đường ruột, bài thải các chất độc hại ra khỏi cơ thể.\n" +
                    "\n" +
                    "Những thực phẩm sau đây có hiệu quả rõ ràng trong việc bài thải các chất độc tố trong đường ruột.\n" +
                    "\n" +
                    "1. Nấm\n" +
                    "\n" +
                    "Nấm có hiệu quả giải độc rõ ràng. Chẳng hạn như nấm mèo (mộc nhĩ), nấm trắng, nấm đông cô... Nấm rất giàu selen, vì vậy thường xuyên ăn có thể giảm huyết áp, giảm cholesterol, ngăn ngừa xơ cứng động mạch, cải thiện chức năng miễn dịch, kích thích tủy xương tạo máu, lọc máu, giải độc trong đường ruột...\n\n" +
                    "2. Rong biển\n" +
                    "\n" +
                    "Rong biển giúp điều trị xơ vữa động mạch, ngăn chặn cơ thể hấp thu các kim loại nặng như cadmium, chì, và loại trừ các nguyên tố phóng xạ ra khỏi cơ thể. Do độ ẩm cao trong ruột cao nên rong biển sau khi vào cơ thể có thể tạo thành một chất keo, giúp loại trừ các chất độc tố trong đường ruột ra ngoài cơ thể.\n" +
                    "\n" +
                    "3. Tiết lợn\n" +
                    "\n" +
                    "Chất protein lỏng trong tiết lợn khi vào dạ dày sẽ được phân giải và tạo thành một chất có tác dụng nhuận tràng và giải độc. Chất này bám dính vào thành ruột, phản ứng với các độc tố kim loại và bài tiết ra ngoài.\n\n" +
                    "4. Nước trái cây và nước rau tươi\n" +
                    "\n" +
                    "Nước hoa quả tươi hoặc nước ép rau tươi khi vào cơ thể sẽ làm tăng độ kiềm trong máu. Nhờ đó mà máu có thể hòa tan các độc tố trong các tế bào và thải ra ngoài cơ thể theo đường bài tiết.\n" +
                    "\n" +
                    "Để cơ thể thải bỏ các độc tố, bạn có thể ép 3 củ cà rốt với một củ cải đường với ngọn củ cải và dưa chuột. Vị ngọt từ cà rốt và củ cải đường làm cho ngon và làm mới và sẽ giúp đỡ loại bỏ độc tố ra khỏi hệ thống.\n" +
                    "\n" +
                    "5. Đậu xanh\n" +
                    "\n" +
                    "Đậu xanh vị ngọt, tính mát nên được coi là thực phẩm có tác dụng thanh nhiệt, giải độc, đẩy nóng. Trong đậu xanh còn có thành phần hạ mỡ trong máu hữu hiệu, chứa nhiều kali, ít natri giúp cho cơ thể phòng chống chứng xơ cứng động mạch và bệnh cao huyết áp.\n" +
                    "\n" +
                    "Nó đồng thời giúp quá trình trao đổi chất diễn ra thuận lợi, nhờ đó có thể dễ dàng đào thải độc tố trong ruột ra ngoài cơ thể, bảo vệ gan và giải độc.\n" +
                    "\n" +
                    "6. Khoai lang\n" +
                    "\n" +
                    "Khoai lang là một loại thực phẩm rất giàu vitamin E, vitamin B, carotene, cellulose nên nó có thể loại bỏ các cholesterol cũng như khắc phục tình trạng táo bón, phòng ngừa ung thư.\n" +
                    "\n" +
                    "Chất xơ trong khoai lang sau khi vào ruột có thể làm sạch các chất thải trong ruột, tích hợp độc tố và chất độc bài tiết ra ngoài một cách thuận lợi.",
            "Bị viêm họng thường đi kèm triệu chứng như họng sưng đau, khô và ngứa... tình trạng do nhiễm trùng nhẹ hoặc kích ứng tại chỗ gây ra. Bạn có thể xoa dịu triệu chứng viêm họng bằng các thực phẩm sau.\n\n" +
                    "1. Quả chanh\n" +
                    "\n" +
                    "Chanh là một trong những loại quả có giá trị dược liệu nhất trên thế giới, nó giàu vitamin C, carbohydrate, canxi, phốt pho, sắt, vitamin B1, vitamin B2, nên rất hữu ích cho con người. Nó được gọi là “quả tiêu viêm”, vai trò của nó đối với cơ thể như là một chất kháng sinh tự nhiên, bởi vì nó có nhiều công dụng như kháng khuẩn tiêu viêm, tăng cường hệ miễn dịch.\n" +
                    "\n" +
                    "Nước chanh mật ong không chỉ là một phương thuốc giảm béo được nhiều chị em tin dùng, mà còn có tác dụng xoa dịu cảm giác viêm họng.\n\n" +
                    "2. Quả lê\n" +
                    "\n" +
                    "Lê có chứa protein, giàu chất béo, đường, chất xơ thô, các khoáng chất như canxi, phốt pho, sắt… và nhiều vitamin, nên nó có tác dụng hạ huyết áp, dưỡng âm thanh phế, tiêu đờm, thanh nhiệt giải độc, có thể kích thích sự thèm ăn, giúp tiêu hóa, lợi tiểu và giải nhiệt. \n" +
                    "\n" +
                    "Vì thế, thường xuyên ăn lê sẽ có thể chống nhiệt miệng, đau họng. Lê có thể dùng để bổ sung nước và dinh dưỡng khi bị sốt cao. Ngoài ra do lê có vị ngọt ngon, nhiều nước nên còn được gọi là “nước khoáng thiên nhiên”. \n\n" +
                    "3. Mật ong\n" +
                    "\n" +
                    "Mật ong là một loại thực phẩm bổ dưỡng tự nhiên giàu dinh dưỡng, cũng là một trong những loại thuốc bổ phổ biến nhất. Mật ong có chứa loại muối vô cơ có nồng độ gần với huyết thanh trong cơ thể, các axit hữu cơ như vitamin, sắt, canxi, đồng, mangan, kali, phốt pho… Ngoài ra, các nguyên tố vi lượng có ích cho sức khỏe và các chất fructose, glucose, amylase, oxy hóa enzyme, reductase cũng có mặt trong mật ong nên nó có tác dụng nuôi dưỡng, làm ẩm, giải độc, tiêu viêm, nhuận tràng… \n" +
                    "\n" +
                    "Trà và mật ong được xem như những loại “thảo dược” thần kỳ giúp bạn nhanh chóng trị dứt cảm giác đau họng. Bạn hãy cho 1 thìa mật ong khuấy đều trong chén trà và thêm nửa quả chanh vắt.\n" +
                    "\n" +
                    "4. Cà chua\n" +
                    "\n" +
                    "Cà chua giàu carotene, vitamin C và vitamin nhóm B. Chất “lycopene” trong cà chua có tác dụng ức chế vi khuẩn nên giảm được tình trạng viêm trong cơ thể, bao gồm cả viêm họng. Chất axit malic, axit citric và đường trong loại quả này hỗ trợ chức năng tiêu hóa, tăng cảm giác thèm ăn. \n" +
                    "\n" +
                    "Theo Đông y, cà chua tính bình, vị chua, hơi ngọt, có tác dụng thanh nhiệt, giải độc, lương huyết, tăng tân dịch, chống khát nước, giúp thông tiểu tiện. \n\n" +
                    "5. Cà rốt\n" +
                    "\n" +
                    "Cà rốt là một loại củ ngon, giàu dinh dưỡng, nên được gọi là “tiểu nhân sâm”. Cà rốt rất giàu các thành phần dinh dưỡng như carbohydrate, chất béo, dầu dễ bay hơi, carotene, vitamin A, vitamin B1, vitamin B2, anthocyanin, canxi, sắt. \n" +
                    "\n" +
                    "Ngoài ra, cà rốt là một loại thực phẩm có tác dụng chữa bệnh đau họng tuyệt vời vì nó làm giảm tình trạng xung huyết ở họng. Nhưng để tác dụng chữa bệnh phát huy, cà rốt cần được luộc chín hoặc hấp trước khi ăn, bởi vì ăn cà rốt sống có thể là tăng tình trạng đau họng của bạn và có thể làm cho bệnh trầm trọng hơn. \n" +
                    "\n" +
                    "6. Táo\n" +
                    "\n" +
                    "Trong 100gr táo chứa 6,5-11,2 gr đường hoa quả, 2,5- 3,5gr đường glucose, 1,0- 5,2gr đường mía, còn chứa cả một lượng lớn các nguyên tố vi lượng như kẽm, canxi, phốt pho, sắt, kali, vitamin B1, vitamin B2, vitamin C và carotene….\n" +
                    "\n" +
                    "Táo có vị ngọt, chua, tính bình, hơi mặn, không độc, Đông ty cho rằng, táo có tác dụng giải khát, mát phổi, kiện tỳ ích vị, dưỡng tâm ích khí, nhuận tràng, tiêu viêm trị tiêu chảy, chống say nắng… Do đó, nó rất có lợi cho những người bị đau họng.\n\n" +
                    "7. Vỏ cam\n" +
                    "\n" +
                    "Trong vỏ cam có chứa một lượng lớn vitamin C và tinh dầu thơm, vỏ cam có tác dụng tiêu đờm, giảm viêm, hạ huyết áp, là một loại dược thảo rất tốt. Sau khi rửa sạch phơi khô, ngâm trong rượu trắng, có thể ăn được sau 2-3 tuần, có thể làm mát phổi.",
            "Để tránh các hội chứng mệt mỏi xuất hiện thường xuyên, bạn nên nghỉ ngơi điều độ kết hợp với lựa chọn các loại thực phẩm giúp tăng năng lượng và dinh dưỡng cho cơ thể.\n\n" +
                    "Hội chứng mệt mỏi mạn tính là tên gọi đối với những rối loạn đặc trưng bởi sự mệt mỏi, yếu sức và những khó chịu khác trong cơ thể.\n" +
                    "Hội chứng này thường gặp ở nữ giới nhiều hơn nam giới. Để phòng ngừa hội chứng này, bạn không chỉ phải chú ý làm việc và nghỉ ngơi điều độ, tập thể dục thích hợp, mà còn phải ngủ đủ giấc, giảm áp lực tâm lý, quan trọng hơn là phải ăn nhiều những thực phẩm có tính kiềm và giàu vitamin C, vitamin B như táo, tảo bẹ, rau xanh nhằm trung hòa môi trường axit trong cơ thể, giúp xua tan mệt mỏi.\n" +
                    "1. Thực phẩm cung cấp năng lượng: Bánh quy, sôcôla\n" +
                    "\n" +
                    "Thành phần chủ yếu của bánh quy là bột mỳ, năng lượng mà chúng cung cấp chủ yếu là từ hàm lượng carbonhydrate. Trong bữa sáng, bánh quy, bánh quy bơ hoặc bánh quy dành riêng cho bữa sáng có thể bảo đảm nguồn năng lượng cho chúng ta cho đến tận bữa trưa.\n" +
                    "Bánh quy, hoa quả, 1 quả trứng và một cốc sữa tươi chính là là một bữa sáng hoàn hảo và tràn đầy năng lượng. Vào buổi chiều, bánh quy hay sôcôla kèm thêm một loại thức uống có thể khơi dậy cho bạn lòng nhiệt tình công việc cho đến khi tan sở.\n" +
                    "2. Thực phẩm bổ sung năng lượng tuyệt vời: Hạt khô\n" +
                    "\n" +
                    "Sau một khoảng thời gian hoạt động trí não và thể lực, chúng ta thường cảm thấy vô cùng mệt mỏi, lúc này bạn có thể nhai đậu phộng, hạnh nhân, hạt điều, quả óc chó và các loại hạt khác... vì nó có tác dụng thần kỳ trong việc phục hồi thể chất, do chúng chứa một lượng lớn protein, vitami B, vitamin E, canxi, sắt và chất béo thực vật, lại không chứa cholesterol. Cho nên các chị em nên dự phòng một số đồ ăn vặt như hạnh nhân, mơ khô...\n" +
                    "3. Thực phẩm thiết yếu cho cơ thể: Các loại sữa\n" +
                    "\n" +
                    "Các sản phẩm sữa là thứ thường gặp nhất và dễ mua nhất, nó có thể cung cấp protein, vitamin và canxi cho cơ thể, hơn nữa không chứa quá nhiều chất béo. Ngoài ra, khi mất ngủ, uống một cốc sữa nóng trước khi ngủ 30 phút mỗi tối có thể giúp cơ thể thoải mái hơn, ngủ ngon hơn.\n" +
                    "4. Thực phẩm lựa chọn để sử dụng: Đồ uống\n" +
                    "\n" +
                    "Nước khoáng rất có lợi cho việc bổ sung khoáng chất cho cơ thể. Trong nước khoáng dù ít hay nhiều đều chứa muối khoáng (hàm lượng canxi, natri, magie khác nhau), do đó có thể đáp ứng nhu cầu dinh dưỡng hàng ngày cho chúng ta. Magie giúp chuyển hóa vật chất trong cơ thể, canxi có thể bổ sung sự thiếu hụt sữa, natri có thể giúp cơ thể tránh mất nước.\n" +
                    "Những loại đồ uống chứa cafeine như trà, cà phê... có thể ổn định và tăng cường hô hấp của cơ thể, kích thích sự bài tiết tuyến thượng thận, giúp hưng phấn hệ thần kinh, từ đó có thể tăng hệ miễn dịch.\n" +
                    "5. Thực phẩm cung cấp nhiều vitamin: Hoa quả, rau xanh\n\n" +
                    "Mệt mỏi do môi trường quá nhiều axit gây ra, ăn nhiều những thực phẩm có tình kiềm như hoa quả, rau xanh có thể trung hòa môi trường axit, giảm nồng độ axit trong máu, tăng độ bền, giảm mệt mỏi. Nếu thường xuyên lao động trí óc cần phải bổ sung nhiều vitamin hơn.\n" +
                    "Để duy trì sự phát triển của cơ thể và hệ thần kinh hoạt động bình thường, không thể thiếu vitamin, nó giúp nâng cao khả năng học hỏi và trí nhớ. Hàm lượng folate trong rau xanh (như rau diếp, rau bina...) dưa ngọt và dâu tây là cao nhất.\n" +
                    "Vitamin C giúp bảo vệ hoạt động nhận thức, những loại rau quả giàu vitamin C nhất gồm có lựu, mùi tây, ớt, kiwi, dâu tây, cam. Cho nên bảm đảm ăn 1-2 loại quả và khoảng 500gr rau xanh/ngày.\n" +
                    "6. Thực phẩm bổ sung protein chất lượng cao: Các loại đậu, các loại thịt\n" +
                    "\n" +
                    "Ăn vừa đủ những thực phẩm có protein chất lượng cao như đậu hũ, thịt lợn, thịt bò, thịt dê, thịt gia cầm, các loại cá, có thể kịp thời bổ sung lượng calo đã mất trong cơ thể. Bởi vì tiêu hao calo quá nhiều cũng gây mệt mỏi, cho nên bổ sung kịp thời calo có thể nhanh chóng xua tan cảm giác mỏi mệt.\n" +
                    "Ăn những thực phẩm bổ dưỡng: Nhân sâm\n" +
                    "\n" +
                    "Nếu mệt mỏi đã tới mức độ nhất định, có thể cần phải bổ sung một vài sản phẩm dinh dưỡng có tác dụng bổ dưỡng nhất định như nhâm sâm, ngân nhĩ... giúp bổ khí hoạt huyết, cải thiện hệ thần kinh, giảm mệt mỏi.\n" ,
            "Không chỉ có tác dụng làm cho các món ăn thơm ngon, quả ôliu còn có rất nhiều tác dụng với sức khỏe.\n\n" +
                    "Dưới đây là 7 lý do tuyệt vời tại sao bạn nên ăn quả ôliu thường xuyên.\n" +
                    "\n" +
                    "1. Lợi ích tim mạch\n" +
                    "\n" +
                    "Các gốc tự do khi tồn tại trong cơ thể sẽ làm oxy hóa các bộ phận, gây hư hại cho mạch máu khiến chất béo tích tụ trong động mạch, có thể dẫn tới một cơn đau tim. Các chất dinh dưỡng chống oxy hóa trong ô-liu đen cản trở quá trình oxy hóa này, qua đó giúp ngăn ngừa bệnh tim. Quả ôliu có chứa chất béo, nhưng đó là loại chất béo không bão hòa đơn lành mạnh, nên có hiệu quả giảm nguy cơ xơ vữa động mạch và tăng cholesterol tốt.\n" +
                    "\n" +
                    "2. Phòng chống ung thư\n" +
                    "\n" +
                    "Quả ôliu là một nguồn tuyệt vời của vitamin E, có thể giúp trung hòa các gốc tự do trong cơ thể. Nếu ADN của một tế bào bị hư hại, nó cũng có thể biến đổi và trở thành ung thư. Nhưng vitamin E kết hợp với các chất béo không bão hòa đơn trong quả ôliu có thể đảm nhiệm \"nhiệm vụ\" bảo vệ các tế bào trong cơ thể, tránh sự oxy hóa và phòng chống ung thư. \n" +
                    "\n" +
                    "Một chế độ ăn uống bổ sung dầu ôliu sẽ có tác dụng giảm nguy cơ ung thư ruột kết tương đương với chế độ ăn giàu dầu cá.\n" +
                    "\n" +
                    "3. Bảo vệ da và mái tóc khỏe\n" +
                    "\n" +
                    "Quả ôliu rất giàu axit béo và chất chống oxy hóa nên có hiệu quả trong việc nuôi dưỡng, giữ ẩm và bảo vệ da của bạn. Vitamin E đứng đầu trong nhóm các dưỡng chất tốt cho tóc và da, mà vitamin E lại có rất nhiều trong quả ôliu. Đó chính là lý do tại sao quả ôliu lại giữ cho tóc và da của bạn khỏe mạnh.\n" +
                    "\n" +
                    "Cho dù bôi tại chỗ hoặc bổ sung qua ăn uống, vitamin E vẫn được coi là có thể bảo vệ da khỏi tia cực tím, chống lại ung thư da và lão hóa sớm.\n\n" +
                    "4. Có lợi cho mô xương và mô liên kết\n" +
                    "\n" +
                    "Khả năng kháng viêm của các chất béo không bão hòa đơn, vitamin E và polyphenol trong quả ôliu chính là tác nhân giúp giảm nguy cơ bị bệnh hen suyễn, viêm xương khớp và viêm khớp dạng thấp. \n" +
                    "\n" +
                    "Hầu hết những cơn đau liên quan đến xương đều do ảnh hưởng của các gốc tự do gây ra. Trong dầu ôliu có chứa một hóa chất gọi là oleocanthal có thể có tác dụng như một thuốc giảm đau vì nó ức chế sự viêm nhiễm...  Do vậy, dầu ôliu hay quả ôliu được coi là có lợi cho mô xương và mô liên kết.\n" +
                    "\n" +
                    "5. Tốt cho đường tiêu hóa\n" +
                    "\n" +
                    "Tiêu thụ thường xuyên của cả vitamin E và các chất béo không bão hòa đơn trong quả ôliu sẽ làm giảm nguy cơ ung thư ruột kết. Các dưỡng chất này giúp ngăn ngừa ung thư ruột kết bằng cách trung hòa các gốc tự do. Quả ôliu cũng có chức năng tương tự trong việc phòng ngừa loét và viêm dạ dày. \n" +
                    "\n" +
                    "Dầu ô liu kích hoạt sự tiết mật và tụy, do đó làm giảm tỷ lệ hình thành sỏi mật. Quả ôliu còn chứa nhiều chất xơ nên nó cũng thúc đẩy sức khỏe đường tiêu hóa bằng cách giúp thức ăn tiêu hóa được dễ dàng và lành mạnh, góp phần bảo vệ một hệ tiêu hóa khỏe mạnh.\n" +
                    "\n" +
                    "6. Phòng chống thiếu máu\n" +
                    "\n" +
                    "Hàm lượng sắt phong phú trong quả ôliu sẽ giúp cơ thể phòng chống nguy cơ thiếu máu rất hiệu quả. Nhờ có chất sắt mà các tế bào hồng cầu vận chuyển oxy đi khắp cơ thể. Nếu bị thiếu sắt, các mô trong cơ thể không nhận được đủ oxy thì sẽ khiến cơ thể bị yếu đi. \n" +
                    "\n" +
                    "Sắt cũng đóng một vai trò quan trọng trong sản xuất năng lượng. Nó cũng giúp sản xuất carnitine, một acid amin thiết yếu quan trọng đối với việc sử dụng các chất béo, giảm mức chất béo tích tụ lại trong cơ thể gây tăng cân. Ngoài ra, hệ thống miễn dịch của cơ thể phụ thuộc rất nhiều vào hàm lượng sắt. Do vậy, bổ sung đủ sắt cho cơ thể là điều rất cần thiết. Đó chính là một lý do nữa khiến bạn nên chọn ăn quả ôliu mỗi ngày.\n" +
                    "\n" +
                    "7. Có lợi cho mắt\n" +
                    "\n" +
                    "Ngoài vitamin E, sắt, quả ôliu còn chứa nhiều vitamin A - một chất rất quan trọng trong việc bảo vệ đôi mắt khỏe mạnh.\n" +
                    "\n" +
                    "Bổ sung đủ vitamin A cho phép mắt có thể phân biệt tốt hơn giữa ánh sáng và bóng tối, qua đó cải thiện thị giác của bạn vào ban đêm. Hơn nữa, vitamin A được cho là có hiệu quả chống đục thủy tinh thể, thoái hóa điểm vàng, bệnh tăng nhãn áp và các bệnh mắt khác liên quan đến tuổi tác. Vì vậy, nếu muốn có đôi mắt khỏe mạnh, đừng bỏ qua quả ôliu nhé.",
            "Hấp thụ những thực phẩm này hàng ngày, bạn sẽ có cơ thể khỏe khoắn hơn mà vẫn duy trì được cân nặng như ý.\n\n" +
                    "Củ cải đường\n" +
                    "\n" +
                    "Củ cải đường là một trong những nguồn cung cấp betaine và folate tốt nhất cho cơ thể bạn. Đây là hai chất dinh dưỡng có tác dụng làm giảm nguy cơ bệnh tim.\n" +
                    "\n" +
                    "Cải bắp\n" +
                    "\n" +
                    "Bắp cải có chứa nhiều sulforaphane, một hóa chất làm tăng việc sản xuất các enzym trong cơ thể, giúp giải độc cho các tế bào bị hư hại và ngăn chặn gốc ung thư tự do.\n\n" +
                    "Mận khô\n" +
                    "\n" +
                    "Mận là trái cây chứa nhiều acid neochlorogenic và chlorogenic. Đây là chất chống oxy hóa giúp chống lại sự phát triển ung thư một cách hiệu quả.\n" +
                    "\n" +
                    "Những loại quả mọng\n" +
                    "\n" +
                    "Các loại quả mọng có chứa nhiều loại đường tự nhiên giúp tăng cường hệ miễn dịch và  giảm kháng insulin (có thể giúp điều trị bệnh tiểu đường).\n" +
                    "\n" +
                    "Ổi\n" +
                    "\n" +
                    "Những trái ổi ngon ngọt màu vàng và màu hồng có nồng độ chất chống oxy hóa cao. Được biết, lycopene chống ung thư ở trái ổi cao hơn nhiều so với ở quả cà chua và dưa hấu.\n\n" +
                    "Rau sam\n" +
                    "\n" +
                    "Loại cây nhỏ xinh thường có trong vườn cỏ dại này rất tốt cho sức khỏe của tim vì có chứa nhiều chất béo omega-3. Chỉ cần nhấm nháp thân và lá rau sam bạn vừa nhận được một lượng nước dồi dào lại vừa sở hữu một hương vị chanh thơm dịu nhẹ.\n" +
                    "\n" +
                    "Củ cải Thụy Sĩ\n" +
                    "\n" +
                    "Giống như rau bina, củ cải Thụy Sỹ khi nấu chín sẽ cung cấp 10 mg lutein và zeaxanthin, carotenoids, giúp bảo vệ chống lại thiệt hại võng mạc gây ra do lão hóa. Bạn có thể xào củ cải với một ít dầu ăn và tỏi. ",
            "Dưới đây là một số loại thực phẩm có đặc tính chống dị ứng rất tốt và bạn nên khéo léo kết hợp chúng trong chế độ ăn uống hàng ngày của mình.\n\n" +
                    "Bạn thường e ngại khi bước chân ra khỏi nhà vì sợ bị dị ứng? Đừng lo, bạn có thể uống thuốc kháng histamin, chống dị ứng, hoặc đơn giản nhất là bổ sung các loại thực phẩm có khả năng giúp bạn chống lại dị ứng như dưới đây.\n" +
                    "\n" +
                    "1. Sữa chua\n" +
                    "\n" +
                    "Bình thường, sữa chua vẫn được tiêu thụ mỗi ngày, tuy nhiên rất ít người biết về lợi ích sức khỏe tuyệt vời của nó. Ngoài việc giàu chất đạm và nhiều vitamin, sữa chua chủ yếu được tạo nên bởi quá trình lên men sữa còn cung cấp cho cơ thể lượng lớn các vi khuẩn có lợi, giúp bạn bảo vệ hệ tiêu hóa. \n" +
                    "\n" +
                    "Ngoài ra các vi khuẩn có lợi này cũng giúp cơ thể tăng cường hệ miễn dịch – sức đề kháng, góp phần trang bị cho cơ thể sức khỏe để chống lại các yếu tố gây dị ứng như phấn hoa. \n\n" +
                    "2. Cá hồi\n" +
                    "\n" +
                    "Trong cá hồi có chứa hàm lượng cao các axit béo omega-3. Loại axit béo này được biết đến với đặc tính kháng viêm rất hiệu quả. Điều này cũng góp phần giúp giảm ảnh hưởng của những chứng viêm liên quan đến dị ứng. \n" +
                    "\n" +
                    "Ngoài ra bản thân cá hồi cũng là một loại thực phẩm giàu protein, vitamin D và các khoáng chất khác nên rất tốt cho sức khỏe.\n\n" +
                    "3. Táo\n" +
                    "\n" +
                    "Táo là một trong những thực phẩm chống dị ứng rất tốt vì có chứa các hợp chất như quercetin, flavonoid – hai loại hợp chất có đặc tính kháng viêm và chống virus hữu hiệu. Vì thế, táo được cho là loại thực phẩm có thể giúp làm dịu đi triệu chứng của dị ứng liên quan đến phấn hoa cũng như giúp chống lại các triệu chứng dị ứng khác với đặc tính kháng viêm của mình. \n" +
                    "\n" +
                    "Nhiều nghiên cứu cũng đã chứng minh rằng những người thường xuyên ăn táo sẽ hạn chế được rủi ro mắc bệnh viêm phổi. \n\n" +
                    "4. Gai lông (Butterbur)\n" +
                    "\n" +
                    "Gai lông hay còn gọi là Butterbur - một loại thảo dược cùng họ hoa cúc, thường được thổ dân châu Mỹ dùng để trị viêm, đanh tan chứng nhức đầu và các triệu chứng dị ứng như ho và hen. \n" +
                    "\n" +
                    "Lá, rễ và các chế phẩm chiết xuất từ cây gai lông (như tinh dầu) có thể giúp ngăn ngừa được các triệu chứng dị ứng theo mùa (ngứa và hắt hơi). Bạn cũng hoàn toàn có thể dùng loại cây này để làm trà. \n\n" +
                    "5. Nghệ\n" +
                    "\n" +
                    "Nghệ là loại cây được dùng làm gia vị rất phổ biến, đặc biệt là dưới dạng bột khô. Bản thân nghệ được biết đến là một loại thảo dược có đặc tính chống vi trùng và chống nấm. Một thành phần hoạt chất được biết đến rộng rãi trong củ nghệ là curcumin có tác dụng chống viêm trên cơ thể. \n" +
                    "\n" +
                    "Do đó nó cũng có khả năng giúp cơ thể bạn chống lại các triệu chứng dị ứng. Bạn có thể sử dụng nghệ như một loại gia vị trong thức ăn của mình để tăng cường sức khỏe cho cơ thể. \n\n" +
                    "6. Trà xanh hoặc trà đen\n" +
                    "\n" +
                    "Trà cũng được biết đến là loại thảo dược có chứa hợp chất quercetin. Sử dụng trà xanh hoặc đen có thể có tác dụng chống viêm và giảm các triệu chứng của dị ứng bao gồm chảy nước mắt, chảy nước mũi, viêm xoang. Hàng ngày, bạn có thể thay thế uống cafe bằng trà để bảo vệ mình trước bệnh dị ứng.\n\n" +
                    "7. Hành tây, tỏi\n" +
                    "\n" +
                    "Hành tây có thể khiến bạn chảy nước mắt, nhưng đó cũng là một nguồn cung cấp quercetin rất tốt, giúp cơ thể bạn chống viêm và chống dị ứng. Bạn có thể sử dụng chúng trong món xa-lát, xào… tùy theo khẩu vị và sở thích. \n" +
                    "\n" +
                    "Tỏi cũng được biết đến với đặc tính kháng viêm như hành tây. Nếu bạn không ăn được hành tây thì có thể sử dụng tỏi để giảm các triệu trứng và chống lại bệnh dị ứng. Với tỏi, bạn có thể sử dụng tỏi băm để ướp thịt, xào rau…",
            "Cách đơn giản nhất để giúp xương chắc khỏe là bổ sung dưỡng chất cần thiết cho xương có sẵn trong các loại thực phẩm phổ biến trong cuộc sống.\n\n" +
                    "Khi bị loãng xương, chất lượng cuộc sống của người bệnh giảm và nếu ở tình trạng nặng, người bệnh có thể bị gãy xương dẫn tới tàn phế suốt đời hoặc tử vong.\n" +
                    " \n" +
                    "Vì vậy, việc giữ gìn cho xương chắc khỏe là một trong những nhiệm vụ hàng đầu của chúng ta ngay từ khi còn trẻ.\n" +
                    " \n" +
                    "Cách đơn giản nhất để giúp xương chắc khỏe là bổ sung dưỡng chất cần thiết cho xương có sẵn trong các loại thực phẩm phổ biến trong cuộc sống.\n" +
                    " \n" +
                    "1. Sản phẩm từ sữa\n" +
                    " \n" +
                    "Sữa vẫn là nguồn thực phẩm ưu tiên hàng đầu trong thực đơn những thực phẩm giúp phòng chống loãng xương, giúp xương chắc khỏe vì trong sữa có nhiều canxi - thành phần chính cấu thành nên xương.\n" +
                    " \n" +
                    "Nếu không uống được sữa tươi thì có thể thay thế bằng sữa chua, phô mai, sữa bò. Một hộp sữa chua có hàm lượng canxi tương đương với một cốc sữa 250ml. Một miếng pho mát 30g cũng chứa lượng canxi tương ứng. Còn 1 ly sữa bò chứa khoảng 270mg canxi.\n" +
                    " \n" +
                    "Nếu lo ngại về lượng đường trong sữa và các chế phẩm từ sữa, bạn hãy chọn các sản phẩm ít đường hoặc không đường.\n\n" +
                    "2. Ngũ cốc\n" +
                    " \n" +
                    "Ngũ cốc có khả năng phòng chống loãng xương bởi trong nó có hàm lượng protein từ 8-14% và đạm thực vật giúp tăng cường mật độ xương.\n" +
                    " \n" +
                    "Hãy xen kẽ vào thói quen ăn uống hàng ngày (bánh mì, bột mì, gạo…) bằng mầm lúa mì, rau quả sấy khô. Lưu ý: 100g mầm lúa mì mang đến 26g đạm, còn một nắm lúa mạch mang đến 14g đạm.\n" +
                    " \n" +
                    "3. Cá hồi\n" +
                    " \n" +
                    "Đây là loại cá có hàm lượng vitamin D dồi dào (khoảng 12-20mg trong 100g cá) nên rất có lợi cho sự tái tạo mật độ xương. Cá hồi là 1 trong 6 thực phẩm giúp bạn phòng tránh bệnh loãng xương tốt nhất. \n" +
                    " \n" +
                    "Hãy ăn cá hồi 2 lần/tuần để đảm bảo nhu cầu vitamin D cho cơ thể. Ngoài ra, phơi nắng cũng giúp cơ thể hấp thụ được một lượng nhỏ vitamin D qua da.\n" +
                    " \n" +
                    "4. Giá đỗ\n" +
                    " \n" +
                    "Trong giá đỗ có chứa phyto-oestrogen (hormone oestrogen thực vật), đặc biệt là isoflavon giúp chị em giảm hẳn lo lắng về quá trình loãng xương, nhất là ở giai đoạn mãn kinh, khi xương mỏng đi nhanh chóng và gia tăng nguy cơ gãy xương. \n\n" +
                    "5. Thịt bò\n" +
                    " \n" +
                    "50% thành phần cấu tạo của xương trong cơ thể là protein, nên xương rất cần protein. Chị em có thể bổ sung protein cho xương từ thịt bò vì thịt bò chứa rất nhiều protein. Theo các chuyên gia xương khớp, người trưởng thành nên bổ sung 0,88gr protein/kg trọng lượng cơ thể.\n" +
                    " \n" +
                    "6. Chuối\n" +
                    " \n" +
                    "Chuối có tập trung lượng trytophan và serotonin cao, đặc biệt là kali - chất điện phân ngăn ngừa mất canxi của cơ thể. Mỗi ngày bạn ăn một trái chuối là đủ.\n" +
                    " \n" +
                    "7. Bắp cải\n" +
                    " \n" +
                    "Bắp cải chứa vitamin K giúp tăng mật độ xương và ngăn ngừa sự rạn xương hông. 100g bắp cải mang tới 0,2mg vitamin K trong khi lượng vitamin K hàng ngày cần nạp vào cơ thể là 0,03-1mg.\n" +
                    " \n" +
                    "Nếu không muốn ăn bắp cải, chị em có thể thay thế bằng cải thìa, cải xanh, cải xoăn... vì các loại cải này cũng hàm chứa rất nhiều vitamin K.\n" +
                    " \n" +
                    "8. Trà xanh\n" +
                    "\n" +
                    "Với hàm lượng flavonoid (chất chống ôxy hóa) phong phú trong lá trà, trà xanh góp phần giảm nguy cơ loãng xương. \n" +
                    " \n" +
                    "Tuy nhiên, tránh uống quá 3 cốc nước trà/ngày vì trong chè có nhiều théine – một chất gây kích thích. Ở một số người, uống quá nhiều nước trà còn có thể gây đau đầu, thở gấp cũng như rối loạn tầm nhìn hay khó khăn về tiêu hóa. Nên tránh uống trà ít nhất 30 phút trước và sau bữa ăn.",
            "Bạn sợ béo và đang muốn giảm cân, nhưng bạn thường xuyên gắn liền với đồ ăn nhanh. Vậy phải làm sao để tránh tăng cân do ăn nhiều đồ ăn nhanh?\n\n" +
                    "Bạn có thể tham khảo 8 lời khuyên hữu ích dưới đây để giúp bạn có được những bữa ăn nhanh khỏe mạnh.\n" +
                    "\n" +
                    "1. Lựa chọn trước các món ăn \n" +
                    "\n" +
                    "Trước khi có kế hoạch đi ăn thức ăn nhanh, bạn nên dự định trước một số món mình muốn ăn trong đầu, điều này sẽ giúp cho bạn có thể thưởng thức những món ăn yêu thích mà không phải lo lắng đến vấn đề sức khỏe, cân nặng. \n" +
                    "\n" +
                    "Và hãy nhớ là luôn luôn kiểm soát khẩu phần ăn của bạn để loại bỏ những món không cần thiết nhé.\n" +
                    "\n" +
                    "2. Tránh ăn các món chiên, xào\n" +
                    "\n" +
                    "Bạn cần tránh các món ăn chiên, xào, kem hoặc nước sốt kem vì chúng chứa nhiều calo, muối và chất béo ảnh hưởng không tốt cho sức khỏe. Thay vì lựa chọn các món ăn đó , bạn hãy chọn những món ăn kèm với rau và nếu muốn ăn kèm thịt, hãy chọn thịt nạc thôi nhé để giảm lượng mỡ vào cơ thể.\n\n" +
                    "3. Uống nước khi ăn\n" +
                    "\n" +
                    "Trong khi ăn bánh hamburger  hoặc bánh sandwich, bạn hãy nhớ uống cùng với một ly nước vì điều này sẽ giúp bạn tránh ăn quá nhiều. \n" +
                    "\n" +
                    "Tốt nhất, bạn nên uống nước lọc chứ không phải các loại nước ngọt hoặc nước có ga. Nước lọc giúp bạn ăn ít hơn, còn nước ngọt và nước có ga đều chứa calo khiến bạn dễ tăng cân nhanh hơn.\n" +
                    "\n" +
                    "4. Ăn từ từ \n" +
                    "\n" +
                    "Ăn chậm, nhai kĩ thức ăn khiến bạn cảm thấy thoải mái, đồng thời cũng giúp  hỗ trợ tiêu hóa tốt hơn, đặc biệt khi ăn đồ ăn nhanh. Nếu ăn quá nhanh, não không kịp phát tín hiệu “no” đến dạ dày. Điều này khiến bạn mất kiểm soát trong ăn uống, dẫn đến ăn quá nhiều mà không biết. và lượng chất béo vào cơ thể bạn càng tăng lên.\n" +
                    "\n" +
                    "Vì vậy, sau khi bạn chọn và mua một số thức ăn nhanh, hãy dành ra thời gian để thưởng thức món ăn của bạn. \n" +
                    "\n" +
                    "5. Ăn vừa đủ\n" +
                    "\n" +
                    "Đôi khi bạn mua quá nhiều thức ăn, vượt quá sức tiêu thụ của bạn trong một bữa, bạn không nhất thiết là phải ăn hết chúng ngay một lúc, mà nên chia nhỏ chúng ra, cất bớt đi và ăn nó vào các bữa sau trong ngày. \n" +
                    "\n" +
                    "Việc này sẽ giúp bạn tránh được tình trạng ăn quá nhiều, dẫn đến dư thừa calo không cần thiết.\n\n" +
                    "6. Kiểm tra lượng muối\n" +
                    "\n" +
                    "Ăn quá nhiều muối (nhiều hơn 4-5g mỗi ngày) có thể gây hại cho sức khỏe. Nó sẽ phá hủy bao tử bạn, tăng khả năng mất canxi trong thận và làm tăng nguy cơ mắc các bệnh tim mạch. \n" +
                    "\n" +
                    "Đặc biệt, các món ăn nhanh thường chứa hàm lượng muối cao. Vì vậy, bạn rất cần chú ý khi lựa chọn thực phẩm ăn nhanh. Nên hạn chế ăn các loại thực phẩm chứa nhiều muối như khoai tây chiên, xúc xích và gà rán.\n" +
                    "\n" +
                    "7. Lựa chọn nước xốt \n" +
                    "\n" +
                    "Hầu hết các món ăn ở của hàng thức ăn nhanh thường ăn kèm với nước xốt hoặc xốt mayonnaise. Vì thế, bạn nên thay chúng bằng cách lựa chọn các loại nước chấm khác ít chất béo và calo hơn như nước sốt mù tạt thay vì mayonnaise. \n" +
                    "\n" +
                    "8. Ăn kèm rau xanh\n" +
                    "\n" +
                    " Khi muốn gọi bất kì một món ăn nào, bạn nên gọi món ăn có nhiều rau xanh. Việc này sẽ giúp cơ thể của bạn hấp thụ được nhiều vitamin, chất xơ mà không phải lo nạp quá nhiều calo vào cơ thể. ",
            "Những thực phẩm quen thuộc dưới đây sẽ giúp bạn giảm bớt sự khó chịu và \"đi qua\" cơn say một cách nhanh chóng.\n\n" +
                    "1. Mật ong - nước uống giảm bớt đau đầu\n" +
                    "\n" +
                    "Uống nước mật ong có hiệu quả trong việc giảm triệu chứng đau đầu. Các nhà nghiên cứu Hoa Kỳ chỉ ra rằng đó là bởi vì mật ong có chứa một loại đường đặc biệt của fructose, có thể thúc đẩy sự phân hủy của rượu, giảm đau đầu, đặc biệt là đau đầu do rượu vang đỏ gây ra. Ngoài ra, mật ong còn có tác dụng \"thôi miên\", có thể làm cho bạn rơi vào giấc ngủ một cách nhanh chóng và không phải thức dậy với cơn đau đầu khó chịu ngày hôm sau.\n\n" +
                    "2. Nước ép cà chua - giảm bớt chóng mặt\n" +
                    "\n" +
                    "Nước ép cà chua cũng giàu fructose, có thể giúp thúc đẩy sự phân hủy của các loại đồ uống có cồn. Nếu bạn uống khoảng 300ml nước ép cà chua hoặc nhiều hơn thì cơn chóng mặt do uống rượu có thể dần dần biến mất. Ngoài ra, thêm một lượng nhỏ muối trước khi uống còn giúp ổn định tinh thần.\n" +
                    "\n" +
                    "3. Nước nho tươi - giảm buồn nôn\n" +
                    "\n" +
                    "Nho tươi giàu axit tartaric, tương tác với ethanol trong rượu tạo thành este, nhờ đó làm giảm nồng độ ethanol trong cơ thể, giúp giảm bớt cảm giác nôn nao. Trong khi đó, vị chua của thức uống này còn có hiệu quả làm giảm triệu chứng buồn nôn sau khi uống quá nhiều rượu. Nếu bạn ăn nho trước khi uống rượu thì bạn cũng có thể \"ngăn chặn\" say rượu.\n" +
                    "\n" +
                    "4. Nước ép dưa hấu - giảm bớt nhiệt độ cơ thể\n" +
                    "\n" +
                    "Dưa hấu giúp bổ sung chất điện giải, giúp cơ thể giảm nhiệt độ nhanh chóng. Đồng thời, uống nhiều nước ép dưa hấu còn làm cho rượu nhanh chóng bài tiết theo nước tiểu, nhờ đó giảm bớt lượng rượu hấp thu vào cơ thể. Ngoài ra, pha một lượng nhỏ muối vào nước ép dưa hấu để uống còn giúp ổn định tinh thần.\n\n" +
                    "5. Bưởi - đánh bay mùi rượu\n" +
                    "\n" +
                    "Uống nước ép bưởi có pha chút đường hoặc ăn bưởi chấm đường không chỉ có tác dụng tốt trong việc loại bỏ chất cồn ra khỏi cơ thể mà còn giúp đánh bay mùi rượu trong khoang miệng.\n" +
                    "\n" +
                    "6. Cần tây - giảm bớt sự khó chịu trong đường tiêu hóa, giảm đỏ mặt\n" +
                    "\n" +
                    "Uống nước ép cần tây có thể làm giảm bớt sự khó chịu trong đường tiêu hóa. Nguyên do là vì cần tây rất giàu vitamin B có thể giúp phá vỡ những phân tử rượu nhanh chóng. Nếu bạn có hệ tiêu hóa yếu thì trước khi uống rượu, bạn nên uống một cốc nước ép trái cây để làm công tác phòng chống say rượu và hủy hoại đường tiêu hóa.\n" +
                    "\n" +
                    "7. Sữa chua - giảm bớt sự khó chịu\n" +
                    "\n" +
                    "Sữa chua có thể bảo vệ niêm mạc dạ dày, làm chậm quá trình hấp thu rượu. Ngoài ra sữa chua vốn là thức uống giàu canxi còn đặc biệt hiệu quả trong việc giảm bớt khó chịu gây ra bởi rượu.\n\n" +
                    "8. Chuối - giảm bớt tim đập nhanh, tức ngực\n" +
                    "\n" +
                    "Sau khi uống rượu, nếu cảm thấy có cảm giác hồi hộp, đau tức ngực thì bạn hãy ngay lập tức ăn 1-3 trái chuối. Vì chuối có thể làm tăng lượng đường đồng thời giảm tỷ lệ cồn trong máu. Mặt khác, nó cũng có thể loại bỏ các cơn đánh trống ngực, đau thắt ngực, và các triệu chứng khác.",
            "Các nhà nghiên cứu tại Đại học East Anglia (Anh) cho biết, ăn nhiều bông cải xanh có thể giúp làm chậm lại và thậm chí phòng tránh bệnh viêm khớp .\n" +
                    "\n" +
                    "Loại cải xanh mang tên Beneforte đã được lai giống giữa cải xanh bình thường và một giống cải dại ở vùng Sicily, nhờ vậy nó chứa nhiều chất dinh dưỡng hơn các loại cải xanh khác.\n\n" +
                    "Sử dụng bông cải xanh trong 2 tuần là khoảng thời gian quá ngắn để có thể tạo ra bất cứ sự thay đổi lớn nào, song bà Davidson ở Đại học East Anglia hy vọng có thể tìm ra bằng chứng cho thấy loại cải đặc biệt này có lợi cho con người. Bà cho biết: “Mặc dù loại cải này chưa thể chữa trị và làm đảo ngược quá trình viêm khớp… song đây có thể là một cách để phòng tránh căn bệnh này”.\n" +
                    "\n" +
                    "Thử nghiệm trên các tế bào và chuột cho thấy, hợp chất có trong bông cải xanh có thể ngăn chặn một enzym nguy hiểm hủy hoại sụn. Cơ thể chúng ta hấp thụ hợp chất glucoraphanin này và biến đổi nó thành một chất gọi là sulforaphane có vẻ như có ",
            "Ngạn ngữ nói rằng, mỗi ngày ăn một quả táo sẽ giúp cho chúng ta khỏi đi khám bác sĩ. Ngày nay, bác sĩ khẳng định, táo, cà rốt và lê còn giúp nụ cười được tươi sáng.\n" +
                    "Bác sĩ Jonh Heimke, ở thành phố Rockey River, bang Ohio (Mỹ) cho biết: táo, cà rốt và lê là những loại trái cây làm tăng độ trắng cho răng, \"Ăn những loại thực phẩm có nguồn gốc từ thực vật như quả hạnh (almond) hoặc cần tây sẽ làm các vết ố hoặc vôi răng biến mất, giúp răng trắng hơn\". Táo, cà rốt và lê giúp nụ cười tươi sáng hơn. (ảnh: Ksat) Theo bác sĩ Heimke, một số loại thực phẩm cũng giúp làm tăng sức khỏe răng miệng bằng cách làm tăng sự cân bằng giữa vi khuẩn và các loại vi sinh vật khác có trong răng miệng. Cây việt quất (blueberries) và cá giàu chất chống oxy hóa. Trà xanh có chứa chất catechin giúp diệt khuẩn, chuyển hóa đường thành axit. Kiwi giàu vitamin C. Nấm chứa chất lentinan giúp ngăn ngừa những vi khuẩn có hại cho răng. Sai lầm lớn nhất trong chăm sóc răng miệng hàng ngày là sử dụng bàn chải có lông cứng, đánh răng mạnh tay và sử dụng bàn chải lâu ngày, theo bác sĩ Rayant. Bí quyết là phải giữ bàn chải như cọ sơn, chải răng nhẹ nhàng, hướng thẳng vào nướu răng. Dùng lưỡi để kiểm tra việc đánh răng."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_cong_dung);

        imgIcon = (ImageView) findViewById(R.id.imgIcon);
        txtBodydd = (TextView) findViewById(R.id.txtBodydd);
        txtTiledd = (TextView) findViewById(R.id.txtTitledd);
        Intent i = getIntent();
        String item = i.getStringExtra("select_item");


        if(item.equals(Tile[0])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.a1);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[0]);
        }
        if(item.equals(Tile[1])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.a2);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[1]);
        }
        if(item.equals(Tile[2])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.a3);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[2]);
        }
        if(item.equals(Tile[3])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.a4);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[3]);
        }
        if(item.equals(Tile[4])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.a5);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[4]);
        }
        if(item.equals(Tile[5])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.a6);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[5]);
        }
        if(item.equals(Tile[6])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.a7);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[6]);
        }
        if(item.equals(Tile[7])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.a8);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[7]);
        }
        if(item.equals(Tile[8])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.a9);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[8]);
        }
        if(item.equals(Tile[9])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.a10);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[9]);
        }
        if(item.equals(Tile[10])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.a11);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[10]);
        }
        if(item.equals(Tile[11])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.a12);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[11]);
        }
        if(item.equals(Tile[12])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.a13);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[12]);
        }
        if(item.equals(Tile[13])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.a14);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[13]);
        }
        if(item.equals(Tile[14])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.a15);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[14]);
        }
        if(item.equals(Tile[15])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.a16);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[15]);
        }
        if(item.equals(Tile[16])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.a17);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[16]);
        }
        if(item.equals(Tile[17])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.a18);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[17]);
        }
        if(item.equals(Tile[18])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.a19);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[18]);
        }
        if(item.equals(Tile[19])){
            txtTiledd.setText(item);
            anh = BitmapFactory.decodeResource(this.getResources(), R.drawable.a20);
            imgIcon.setImageBitmap(anh);
            txtBodydd.setText(body[19]);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_body_cong_dung, menu);
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
