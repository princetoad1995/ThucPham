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

public class BodyNgBenh extends Activity {
    private Bitmap anh;
    private ImageView imgIcon;
    private TextView txtTiledd, txtBodydd;

    String Tile[] = {
            "1. 10 lời khuyên về cách chọn thức ăn cho người bị viêm đại tràng mạn tính",
            "2. 10 món bài thuốc trị đái tháo đường",
            "3. 10 món ăn tốt cho tim",
            "4. 16 thực phẩm tốt cho người bị tiểu đường",
            "5. 20 thực phẩm tốt cho tim mạch",
            "6. 5 Loại thức ăn tốt nhất cho tim",
            "7. 7 món ăn - bài thuốc trị bất lực",
            "8. 8 thực phẩm vàng trị trĩ",
            "9. 9 lời khuyên dinh dưỡng cho huyết áp cao",
            "10. Bí quyết ngăn ngừa bệnh sỏi thận",
            "11. Canh hến: cường dương bổ tim mạch",
            "12. Chế độ dinh dưỡng cho bệnh nhân Gout",
            "13. Chế độ dinh dưỡng cho người bệnh tăng huyết áp",
            "14. Chế độ dinh dưỡng cho người bị bệnh thận",
            "15. Dinh dưỡng cho người bị lao phổi",
            "16. Dinh dưỡng cho người mắc bệnh lao",
            "17. Giảm cholesterol xấu nhờ bệnh đậu nành",
            "18. Khổ qua rừng chữa bênh tiểu đường",
            "19. Món ăn - Bài thuốc cho người bị bệnh gút",
            "20. Món ăn - Bài thuốc cho người ngủ mơ"
    };

    String body[] = {
            "Viêm loét đại tràng(IBD) là một bệnh viêm ruột gây ra bởi đường tiêu hóa khi bị kích thích và viêm. Xây dựng một chế độ ăn uống phù hợp có thể giúp cho người bệnh giảm bớt các triệu chứng khó chịu của bệnh. Dưới đây là 10 lời khuyên về cách chọn thức ăn cho người bị bệnh viêm đại tràng mạn tính(IBD).\n\n" +
                    "Lời khuyên số 1 . Uống nhiều chất lỏng (1,5- 2 lít/ ngày) để đủ lượng nước cho cơ thể hoạt động và ngăn ngừa táo bón,đồng thời tránh khả năng mất nước do đi lỏng.\n" +
                    "\n" +
                    "Lời khuyên số 2 . Bổ sung đa sinh tố khoáng chất hàng ngày để thay thế các chất dinh dưỡng bị mất,đồng thời đảm bảo chắc chắn rằng chế độ ăn của bạn luôn bổ sung đủ Canxi và Vitamin D để chống loãng xương vì IBD làm hạn chế sự hấp thu các chất này.\n" +
                    "\n" +
                    "Lời khuyên số 3. Ăn nhiều chất xơ: các loại rau xanh:rau cải,cần tây,rau ngót,rau muống..đậu,lạc,cà rốt. Các loại   trái cây: táo,cam,chuối,nho,đậu.\n\n" +
                    "Tuy nhiên, trong giai đoạn cấp tính , cần hạn chế các loại thực phẩm có nhiều chất xơ và tuân theo một chế độ ăn uống chất xơ thấp cho ruột nghỉ ngơi và giảm thiểu các triệu chứng gây khó chịu vì chất xơ kích thích đại tràng của bạn.\n" +
                    "\n" +
                    "Lời khuyên số 4. Tìm cách thay thế sữa: tránh các loại thực phẩm có chứa lactose như sữa nếu bạn không dung nạp lactose,sữa sẽ làm tồi tệ hơn tình trạng IBD,một số loại thức ăn có hàm lượng lactose thấp như: phomat cứng,sữa chua,hoặc đậu nành khi bạn không muốn uống sữa hoàn toàn .\n" +
                    "\n" +
                    "Lời khuyên số 5 . Hạn chế mỡ : Tránh những thức ăn có hàm lượng dầu mỡ quá cao như các món rán, xào, sốt.\n" +
                    "\n" +
                    "Lời khuyên số 6 . Hạn chế cà phê,các sản phẩm có chứa cafein, rượu và sorbitol (một loại chất làm ngọt) là đây có thể làm trầm trọng thêm triệu chứng của viêm đại tràng mạn tính\n" +
                    "\n" +
                    "Lời khuyên số 7 . Hạn chế những thực phẩm như rau bắp cải (bông cải xanh, cải bắp, súp lơ và cải bruxen), đậu khô và đậu lăng, hành tây và hẹ,đồ uống có ga là những thức ăn sinh hơi gây nên tình trạng chướng hơi và khó tiêu hóa.Tuy nhiên ta có thể cải thiện tình hình này với việc nấu chín các thức ăn có thể chế biến được.\n" +
                    "\n" +
                    "Lời khuyên số 8 . Ăn nhiều bữa nhỏ trong ngày sẽ làm giảm áp lực làm việc của hệ thống tiêu hóa vốn đã làm việc với công suất kém của bạn.Một số nghiên cứu cho thấy việc chuyển từ ăn 2-3 bữa sang ăn 5-6 bữa sẽ làm giảm các triệu chứng do IBD gây nên. Ăn một chế độ ăn protein cao với thịt nạc, cá và trứng, có thể giúp làm giảm các triệu chứng của viêm đại tràng mạn tính- IBD(inflammatory bowel disease).\n" +
                    "\n" +
                    "Lời khuyên số 9 . Chống mệt mỏi do thiếu máu trong Viêm đại tràng mãn do ruột không hấp thu được chất dinh dưỡng và thiếu sắt.Do vậy ăn nhiều các thức ăn chứa nhiều sắt và folat như: nho, cải xoăn, ngũ cốc,vừng, lạc, rau bina, lòng đỏ trứng..\n" +
                    "\n" +
                    "Lời khuyên số 10 . Việc sử dụng thêm các chế phẩm sinh học giúp bổ sung các vi sinh vật ruột(probiotic) sẽ giúp điều hòa việc tiêu hóa thức ăn.Các dạng chế phẩm này đã được phát triển nhiều,ngoài ra sữa chua và các thức ăn lên men như dưa muối,cà muối cũng chứa các vi sinh vật có lợi cho tiêu hóa.Các thức ăn hay chế phẩm này sẽ bổ sung các vi khuẩn có ích bị mất đi khi ta dùng kháng sinh và tiêu chảy trong các đợt cấp của IBD.\n" +
                    "\n" +
                    "Và cuối cùng,trên tất cả các lời khuyên chỉ mang tính chất định hướng trên nghiên cứu của đa số những trường hợp IBD nhưng không phải ai cũng phù hợp,do vậy mà mỗi người cần được khám và tư vấn về dinh dưỡng riêng bởi bác sĩ, chuyên gia dinh dưỡng để xây dựng một chế độ ăn khoa học và phù hợp, kết hợp với tập   luyện thể dục, tập dưỡng sinh (thở bằng bụng, vận dụng cơ hoành, ngồi thiền, tập yoga).",
            "Để giúp bạn có thể tham khảo và áp dụng được hiệu nghiệm, xin giới thiệu những món ăn bài thuốc có công hiệu phụ trợ chữa bệnh đái tháo đường, nếu thấy thích hợp bạn có thể chọn lựa sử dụng.\n" +
                    "\n" +
                    "- Canh khổ qua: Khổ qua 100 g. Rửa sạch khổ qua, xắt lát, cho vào nồi, đổ nước vừa phải nấu thành canh. Chia canh ra 2 lần ăn trong ngày. Công hiệu của món này làm giảm đường huyết, phù hợp trong chứng đái tháo đường bị nhẹ.\n" +
                    "\n" +
                    "- Cháo ý dĩ (bo bo), củ mài:  Bột hoài sơn 50 g, ý dĩ 25 g. Cho 2 vị này vào nồi, đổ đủ nước hầm nhừ thành cháo loãng. Chia ra làm 2 buổi, ăn khi cháo đang còn nóng trong ngày. Công hiệu của món này là ích thận, kiện tì nên thích hợp với người bị bệnh đái tháo đường do bị thận hư.\n" +
                    "\n" +
                    "- Canh đậu đỏ, bí đao: Đậu đỏ và bí đao lượng đủ ăn trong một bữa. Cho đậu đỏ vào cùng nước nấu gần chín, sau mới cho bí đao vào nấu nhừ, uống nước và ăn hết cái, ngày ăn 2 lần, có thể dùng thường xuyên. Công hiệu của món này là lợi tiểu, giải độc nên thích hợp trong chứng đái tháo đường sinh sưng phù, da ghẻ lở, mụn nhọt khó lành.\n\n" +
                    "- Nấm xào thịt nạc: Nấm tươi 250 g, thịt lợn nạc 50 g, dầu mè 25 g, rượu gạo một chút, muối vừa đủ. Rửa sạch nấm, thịt lợn nạc xắt lát, cho vào xào chung với dầu mè, nêm gia vị vừa ăn. Dùng làm thức ăn trong bữa cơm. Công hiệu của món này là dưỡng khí, bổ huyết, tăng sức đề kháng cho cơ thể. Thích hợp với bệnh chứng đái tháo đường có gan nhiễm mỡ mãn tính, khí huyết hư nhược.\n" +
                    "\n" +
                    "- Cháo cà rốt:  Cà rốt tươi 100 g, gạo dẻo 150 g. Rửa sạch cà rốt, xắt miếng, nấu chung với gạo dẻo thành cháo nhừ. Ăn cháo vào buổi sáng và chiều. Cần ăn vài ngày liền. Công hiệu của món này là kiện tì, lý khí, giáng trọc, giảm mỡ. Thích hợp với bệnh đái tháo đường có kèm theo mỡ máu cao, tì vị không điều hòa, bụng trướng khó chịu.\n\n" +
                    "- Cháo sâm, thiên môn đông: Nhân sâm 6 g, thiên môn đông 30 g, gạo lứt 100 g. Cho gạo lứt vào nồi đổ nước vừa nấu thành cháo. Khi cháo gần nhừ thì cho nhân sâm cùng thiên môn đông đã xắt lát mỏng vào và tiếp tục nấu nhừ thành cháo. Chia ra 2 lần, ăn vào buổi sáng và chiều. Cần phải ăn liền trong 7 - 10 ngày. Công hiệu của món này là ích khí, dưỡng tâm nên thích hợp với chứng đái tháo đường bị kèm theo bệnh mạch vành tim, tâm khí bất túc.\n" +
                    "\n" +
                    "- Cháo đào nhân: Đào nhân 10 đến 15 g, gạo dẻo 100 g. Giã nát đào nhân ép lấy nước, bỏ bã, cho vào nồi đổ cùng gạo, nước vừa đủ, nấu nhỏ lửa đến nhừ thành cháo là được. Chia ra ăn vào buổi sáng và chiều. Cần ăn vài ngày liền. Công hiệu của món ăn này là hoạt huyết hóa ứ, thích hợp với người mắc chứng đái tháo đường bị kèm thêm bệnh vành tim, khí trệ, huyết ứ.\n" +
                    "\n" +
                    "- Cháo hà thủ ô: Hà thủ ô 30 - 60 g, sơn dược (khoai mài) 40 g, táo đỏ 3 - 5 quả, gạo tẻ thơm 100 g. Nấu kỹ nhỏ lửa hà thủ ô và sơn dược, gạn lấy nước cho gạo  và táo đỏ vào nấu nhừ thành cháo, chia ra ăn 2 lần vào buổi sáng và chiều. Công hiệu của món này là tư bổ can, thận, ích khí, dưỡng âm. Thích hợp cho người mắc chứng đái tháo đường kèm theo bệnh vành tim và can, thận đều hư.\n" +
                    "\n" +
                    "- Gà ác hoàng kỳ: Hoàng kỳ sống 30  - 50 g, gà ác 1 con. Gà thịt làm sạch lông, bỏ lòng, cho gà cùng hoàng kỳ nấu sôi nhỏ lửa, sau đó vớt bỏ hết váng, để thêm một lúc thì vớt nốt xác hoàng kỳ ra, cho mắm, muối vừa miệng. Dùng mỗi ngày 1 thang này, cần ăn từ 3 đến 10 ngày liền. Công hiệu của món này là ích khí dưỡng tâm, rất có công hiệu với người mắc chứng đái tháo đường mà tâm hư, thận hư, ra mồ hôi trộm.\n" +
                    "\n" +
                    "- Cháo hải sâm: Hải sâm 15 g, gạo trắng 30 g. Làm sạch hải sâm, xắt miếng nhỏ, sau cho vào cùng gạo đổ nước nấu nhừ thành cháo. Ăn vào buổi sáng, ngày 1 thang. Cần ăn 3 - 5 ngày liền. Công hiệu của món này là hoạt huyết, hóa ứ, lý khí, dứt đau. Thích hợp với chứng đái tháo đường kèm theo viêm tuyến tiền liệt, huyết ứ.\n" +
                    "\n" +
                    "Đái tháo đường là bệnh có thể chữa trị được bằng tây y. Ngoài ra chế độ ăn uống cũng rất quan trọng đối với bệnh nhân đái tháo đường, giúp việc điều trị hiệu quả.",
            "Tim là bộ phận vô cùng quan trọng trong cơ thể chúng ta. Tim không khoẻ là một trong những nguyên nhân gây nhiều bệnh cho cơ thể. Hãy ưu tiên những thực phẩm dưới đây trong những bữa ăn hàng ngày để có trái tim khoẻ mạnh. >> Ăn gì để trái tim luôn khoẻ?\n" +
                    "\n" +
                    "1. Hạnh đào\n" +
                    "Đối với người lớn, ăn khoảng 300g hạnh đào mỗi ngày có thể giúp giảm tới 13 - 20% mỡ máu.\n" +
                    "Theo các nhà nghiên cứu tại ĐH Toronto (Canada), tác dụng của loại quả này tốt hơn cả một số loại thuốc. Hạnh đào là một loại quả khô giàu năng lượng. Nó đặc biệt tốt cho tim vì trong thành phần của nó có rất nhiều vitamin E - một chất chống oxy hoá giúp phòng bệnh xơ vữa động mạch. Ngoài ra hạnh đào còn chứa nhiều canxi rất tốt cho xương và răng.\n" +
                    "Bạn có thể ăn sôcôla chứa hạnh đào, cho hạnh đào khô vào sữa chua…\n" +
                    "2. Dầu ô lưu\n" +
                    "Loại dầu này rất giàu mỡ chưa bão hoà, đặc biệt tốt cho các thành mạch. Thay thế các loại mỡ bão hòa (bơ, phô mai, mỡ động vật…) bằng dầu ôliu sẽ giúp giảm cholesterol xấu trong máu.\n" +
                    "Loại mỡ chưa bão hoà này còn có trong quả bơ và hạt dẻ. Nhưng chỉ với dầu ô lưu cơ thể chúng ta còn được cung cấp chất polyphenol - chất giúp ngăn cản cholesterol thâm nhập vào thành mạch máu.\n" +
                    "3. Sữa chua tự nhiên\n" +
                    "Theo một vài nghiên cứu của Mỹ, những người có chế độ dinh dưỡng cân bằng canxi và kali sẽ phòng được bệnh huyết áp cao. Những chất này có rất nhiều trong sữa chua tự nhiên.\n" +
                    "Hãy ăn sữa chua hằng ngày vào các bữa ăn sáng hoặc tráng miệng. Ăn sữa chua thay vì bánh ga tô, mứt… sau bữa ăn chính còn giúp bạn giảm cân hiệu quả.\n" +
                    "4. Cam\n" +
                    "Cam rất ngon và mát. Hơn thế nữa mỗi quả cam trung bình chỉ cung cấp cho bạn 65 calo. Vậy bạn có thể ăn nhiều cam mà không sợ tăng cân.\n" +
                    "Cam chứa nhiều chất xơ, đặc biệt là chất pectin do đó nó có tác dụng làm giảm cơn đói và kiểm soát tỷ lệ cholesterol trong máu.\n" +
                    "Bạn có thể bổ cam thành 6 hoặc 8 miếng để ăn tráng miệng sau bữa ăn. Ngoài ra, vào mùa hè, bạn có thể uống nước cam cả ngày để giải nhiệt.\n" +
                    "5. Quả seri\n" +
                    "Quả seri rất giàu các chất antôxian - chất chống ô xy hoá cho phép trung hoà các enzym được tạo nên bởi những những mảng bám gây nên bệnh xơ vữa động mạch.\n" +
                    "Seri tươi hay được sấy khô đều có tác dụng như nhau do đó bạn có thể ăn seri quanh năm mà không cần phải đợi tới mùa.\n" +
                    "Bạn có thể làm sữa chua, bánh, kem… với loại quả tuyệt vời này.\n" +
                    "6. Tỏi\n" +
                    "Tỏi có tác dụng giảm lượng cholesterol xấu trong máu và phòng chống bệnh xơ vữa động mạch. Để tận dụng hết được tác dụng của loại gia vị này, các nhà khoa học khuyên chúng ta hãy ăn nhiều tỏi mỗi ngày (ăn cả nhánh hoặc nước ép tỏi).\n" +
                    "Người Việt Nam ta chế biến nhiều món ăn với tỏi vì tỏi có mùi thơm và được coi như một vị thuốc. Hãy ướp thịt xào rau… với tỏi để thêm hương vị cho món ăn và cũng là để bảo vệ sức khoẻ của bạn.\n" +
                    "7. Cà rốt\n" +
                    "Theo một nghiên cứu của trường đại học Harvard - Mỹ, mỗi ngày uống 1/2 chén nước của một loại rau hoặc củ có mầu sẫm hoặc mầu da cam như cà rốt sẽ giảm được 27% nguy cơ mắc bệnh tiểu đường.\n" +
                    "Theo họ, trong thành phần của cà rốt tập trung rất nhiều các chất chống oxy hoá của thực vật do đó nó mang lại cho chúng ta hiệu quả trên.\n" +
                    "Sử dụng nhiều cà rốt trong chế biến món ăn không những tốt cho sức khoẻ mà còn giúp món ăn của bạn có mầu sắc bắt mắt.\n" +
                    "8. Thịt thăn lợn\n" +
                    "Những người thường xuyên ăn loại thịt rất giầu protein này có cơ hội đốt cháy được gấp 2 lần năng lượng dự trữ trong cơ thể. Do đó, có thể nói loại thịt này giúp chúng ta giảm cân và đặc biệt tốt cho tim. Chỉ với 122 calo/30g thịt, đây là một nguồn protein thực vật không béo tuyệt vời cho cơ thể chúng ta.\n" +
                    "Thịt thăn dùng chế biến được rất nhiều món ăn hàng ngày, còn do dự gì nữa, bạn hãy sử dụng nhiều loại thịt này trong khẩu phần ăn.\n" +
                    "9. Cá hồi\n" +
                    "Cá hồi là nguồn Omêga-3 tuyệt vời cho sức khoẻ chúng ta. Ngoài tác dụng chống viêm, omêga-3 còn có tác dụng trong phòng chống bệnh tim mạch và giảm lượng cholesterol xấu trong máu.\n" +
                    "Với cá hồi, bạn có thể thưởng thức món gỏi cá tuyệt diệu. Ngoài ra bạn cũng có thể chế biết cá hồi với các loại thực phẩm khác.\n" +
                    "10. Đậu đen\n" +
                    "Rất ít loại rau giàu chất magiê như đậu đen. Người lớn không được cung cấp đủ khoáng chất này hàng ngày có nguy cơ mắc bệnh tim mạch cao hơn 2 lần.\n" +
                    "Theo một nghiên cứu của Mỹ, 1 chén nước đậu đen cung cấp 120mg magiê (nhu cầu hàng ngày của người trưởng thành là 320mg).\n" +
                    " Món chè đậu đen đặc biệt được ưa thích vào mùa hè. Bạn hãy nấu món ăn bổ dưỡng này cho cả nhà ăn vào mùa hè nhé.",
            "1. Rau xanh \n" +
                    "Rau bổ dưỡng và rất có lợi cho sức khỏe, rau không chứa nhiều calo mà lại giàu chất xơ. Ăn rau nhiều hơn những thực phẩm khác đồng nghĩa với việc giảm được lượng carb (tinh bột và đường, một trong những nguyên nhân làm tăng đường huyết) và giảm được lượng chất béo bão hòa (thủ phạm gây ra tình trạng đề kháng insulin).\n" +
                    "2. Hoa quả\n" +
                    "\n" +
                    "Hoa quả cũng có lợi cho sức khỏe như rau, giàu dinh dưỡng, ít chất béo, giàu chất xơ, và chứa ít calo hơn hầu hết các loại thực phẩm khác. Hơn cả, hoa quả còn có chất chống oxy hóa giúp bảo vệ thần kinh, bảo vệ mắt và tốt cho tim mạch. Tuy nhiên trong hoa quả có nhiều đường và calo hơn trong rau, do đó cũng không nên ăn vô điều độ.\n" +
                    "\n" +
                    "Nên ăn hoa quả tươi hơn là uống các loại nước ép. Nhiều dưỡng chất và chất xơ có trong da, thịt và hạt của hoa quả, do đó chúng sẽ dễ mất đi khi bị xay thành nước uống, trong khi lượng calo và đường lại vẫn giữ nguyên.\n" +
                    "\n" +
                    "3. Quả mâm xôi\n" +
                    "\n" +
                    "Quả mâm xôi giàu chất xơ và polyphenol, một chất chống oxy hóa. Một nghiên cứu trên tạp chí Dinh dưỡng Hoa Kỳ cho thấy những người có nguy cơ mắc bệnh tim mạch ăn loại quả này trong 8 tuần có những biểu hiện giảm huyết áp và tăng lượng cholesterol HDL có lợi.\n" +
                    "\n" +
                    "4. Quả chà là\n" +
                    "\n" +
                    "Quả chà là có màu nâu, vị ngọt và hơi dính. Loại quả này tốt cho người bệnh tiểu đường, chứa nhiều chất chống oxy hóa hơn các loại quả như nho, cam, bông cải xanh hay hạt tiêu.\n" +
                    "\n" +
                    "5. Đậu (hạt)\n" +
                    "\n" +
                    "Đậu là một nguồn chất xơ dồi dào, không chỉ tạo cảm giác no lâu mà còn giúp làm chậm quá trình tiêu hóa, tránh cho lượng đường trong máu tăng sau bữa ăn. Nó còn hiệu quả tới mức có thể giúp giảm tổng lượng đường trong máu. Các loại đậu đóng hộp, đậu tách hạt, súp đậu lăng hay đỗ đen là những lựa chọn tuyệt vời.\n" +
                    "\n" +
                    "6. Ngũ cốc\n" +
                    "\n" +
                    "Ăn ngũ cốc cho bữa sáng sẽ giúp bạn hấp thu được nhiều chất xơ hơn. Nghiên cứu cho thấy những người ăn ngũ cốc giàu chất xơ vào buổi sáng sẽ ăn ít hơn trong ngày. Hãy chọn những loại ngũ cốc có chứa ít nhất khoảng 5 grams chất xơ cho mỗi phần ăn.\n" +
                    "\n" +
                    "7. Lúa mạch\n" +
                    "\n" +
                    "Lúa mạch giàu beta-glucan, một loại chất xơ hòa tan. Nghiên cứu cho thấy beta-glucan có thể giảm lượng cholesterol LDL bằng cách ngăn không cho cơ thể hấp thụ chúng. Do giàu chất xơ, lúa mạch có thể giúp giảm lượng đường huyết đồng thời bổ sung canxi cho cơ thể.\n" +
                    "\n" +
                    "8. Yến mạch\n" +
                    "\n" +
                    "Cũng như lúa mạch và các loại đậu, yến mạch giàu chất xơ và có lợi cho bệnh nhân tiểu đường. Chất xơ hòa toan được trong yến mạch giúp ổn định đường huyết.\n" +
                    "\n" +
                    "9. Cá (cá hồi, cá thu, cá ngừ)\n" +
                    "\n" +
                    "Cá là nguồn protein dồi dào và là thực phẩm thay thế tuyệt vời cho thịt, vốn nhiều chất béo hơn cá. Hơn nữa, một số loại cá giàu các axit béo omega-3 giúp ngăn ngừa tắc nghẽn động mạch. Những người mắc bệnh tiểu đường thường có chỉ số triglycerides cao và nồng độ HDL thấp (một loại cholesterol có lợi). Axit béo omega-3 sẽ giúp cải thiện tình trạng này.\n" +
                    "Nên ăn cá ít nhất 2 lần một tuần. Những loại cá giàu omega-3 có thể kể đến như cá hồi, cá thu, cá ngừ.\n" +
                    "\n" +
                    "10. Ức gà\n" +
                    "\n" +
                    "Nhiều nạc và ít calo, không như thịt bò, ức gà có lượng chất béo bão hòa thấp, hạn chế được tác động xấu tới việc kiểm soát đường huyết.\n" +
                    "\n" +
                    "11. Các loại hạt\n" +
                    "\n" +
                    "Các loại hạt như quả hạch, hạnh nhân, hạt hồ đào, đậu phộng v.v. giàu chất béo có lợi giúp chống lại bệnh tim mạch. Những loại chất béo này đã được chứng minh là giúp giảm tình trạng đề kháng insulin và giúp kiểm soát đường huyết dễ dàng hơn. Đồng thời loại thực phẩm này cũng giàu vitamin E, một chất chống oxy hóa giúp bảo vệ các tế bào, tránh các tổn thương về mắt và thần kinh. Chúng còn giàu chất xơ và magie, đều tốt cho việc kiểm soát đường huyết. Các nghiên cứu cho thấy bổ sung các loại hạt này vào chế độ dinh dưỡng còn giúp giảm cân nếu ăn đúng cách. Nên lưu ý là loại thực phẩm này chứa nhiều calo.\n" +
                    "\n" +
                    "12. Hạt lanh\n" +
                    "\n" +
                    "Hạt lanh là một loại hạt rất bổ dưỡng, chúng giàu chất xơ và axit alpha-linolenic (ALA), khi ăn cơ thể sẽ chuyển hóa thành omega-3 EPA và DHA. Trong một vài nghiên cứu lớn, các nhà nghiên cứu phát hiện ra rằng tăng lượng ALA nạp vào cơ thể sẽ giúp giảm nguy cơ mắc các bệnh tim mạch. Loại hạt này còn giúp giảm lượng cholesterol và đường trong máu.\n" +
                    "\n" +
                    "13. Quả óc chó \n" +
                    "\n" +
                    "Khoảng 28 gram quả óc chó cung cấp 2g chất xơ và 2.6g ALA. Nhưng đồng thời sẽ cung cấp tới 185 calo, do đó hãy chú ý không nên ăn quá nhiều.\n" +
                    "\n" +
                    "14. Dầu oliu\n" +
                    "\n" +
                    "Dầu oliu tốt cho việc ổn định đường huyết bằng cách giảm tình trạng đề kháng insulin. Nhưng cũng cần lưu ý đến lượng dầu tiêu thụ trong khẩu phần ăn nếu không muốn bị tăng cân.\n" +
                    "\n" +
                    "15. Sữa chua và các thực phẩm từ sữa\n" +
                    "\n" +
                    "Sữa chua giàu protein và canxi. Các nghiên cứu cho thấy những người ăn nhiều thực phẩm giàu canxi sẽ dễ dàng giảm cân hơn và giảm nguy cơ bị đề kháng insulin. Hãy chọn các loại sữa chua tách béo kết hợp với trái cây tươi cho bữa sáng bổ dưỡng và tốt cho người bệnh tiểu đường.\n" +
                    "\n" +
                    "16. Quế\n" +
                    "\n" +
                    "Thành phần của quế khiến insulin hoạt động hiệu quả hơn, giúp tăng thu nhận đường vào các tế bào và giảm lượng đường trong máu. Rắc quế vào những món ăn ưa thích hoặc uống trà quế theo chế độ hợp lý sẽ rất có lợi cho người bệnh tiểu đường. Một nghiên cứu cho thấy những người bị tiểu đường tiêu thụ khoảng ½ thìa cà phê quế mỗi ngày sẽ giúp giảm lượng đường huyết một cách rõ rệt.",
            "Dưới đây là top 20 loại thực phẩm có thể loại bỏ tắc nghẽn trong động mạch và duy trì một trái tim khỏe mạnh.\n" +
                    "1. Nghệ\n" +
                    "Xơ vữa động mạch là khi các động mạch cứng lại do bị viêm. Nghệ có đặc tính kháng viêm. Gia vị có lợi ích trong việc giảm bệnh tim mạch. Chất curcumin được tìm thấy trong củ nghệ làm giảm viêm trong các động mạch ngoại biên.\n" +
                    "2. Cam\n" +
                    "Cam rất giàu vitamin C có thể chống lại cảm lạnh thông thường. Nhưng loại quả này cũng có thể chống lại các bệnh tim. Cam chứa chất xơ pectin làm giảm cholesterol, vitamin C tăng cường các bức tường của động mạch giảm tắc nghẽn trong động mạch. Nước cam có thể cải thiện chức năng của các mạch máu.\n" +
                    "3. Lựu\n" +
                    "Đây là loại trái cây giàu chất chống oxy hóa cải thiện các bức tường của động mạch. Lựu đặc biệt tốt cho tim nhờ sự hiện hữu của chất chống oxy hóa. Lựu đốt cháy và sản xuất nitric oxide để cải thiện mức độ máu chảy vào động mạch.\n" +
                    "4. Ngũ cốc nguyên hạt\n" +
                    "Kết hợp ngũ cốc nguyên hạt trong của chế độ ăn uống để giảm cholesterol. Ngũ cốc nguyên hạt chứa các sợi chất xơ giúp động mạch không bị tắc nghẽn.\n" +
                    "5. Cá\n" +
                    "Hải sản có lợi cho con người với nhiều mức độ khác nhau như: sức khỏe tâm thần, não, thị lực, xây dựng cơ bắp và phụ nữ khi mang thai. Omega-3 bảo vệ trái tim của bạn và làm giảm nồng độ triglyceride máu. Để làm sạch động mạch bạn hãy chọn cho mình các loại cá giàu Omega 3.\n" +
                    "6. Bông cải xanh\n" +
                    "Bông cải xanh có nhiều protein tốt cho người ăn chay. Bông cải xanh có chứa vitamin K có lợi cho sự hình thành xương. Vitamin K cũng bảo vệ các động mạch khỏi bị hư hại. Ngoài ra vitamin K, bông cải xanh rất giàu chất xơ có thể làm giảm cholesterol và cao huyết áp.\n" +
                    "7. Các loại hạt\n" +
                    "Hạnh nhân, đậu phộng, quả óc chó, hạt dẻ là loại hạt thân thiện với trái tim. Các loại hạt chứa vitamin E là bức tường bảo vệ động mạch. Các loại hạt cũng chứa các sợi giúp làm giảm cholesterol trong máu.\n" +
                    "8. Dầu ô liu\n" +
                    "Dầu ô liu được biết có lợi ích sức khỏe, nó là loại dầu tốt nhất để ngăn chặn một gia tăng của cholesterol trong máu. Bên cạnh cholesterol, dầu ô liu cũng có thể làm giảm nguy cơ huyết áp cao.\n" +
                    "9. Quế\n" +
                    "Gia vị này mang lại cho con người rất nhiều lợi ích sức khỏe. Quế được sử dụng như một loại gia vị cũng như cho các món tráng miệng. Gia vị đa năng này làm giảm chất béo trong máu ngăn chặn tắc nghẽn trong các mạch máu.\n" +
                    "10. Cà phê\n" +
                    "Mặc dù uống cà phê có thể có ảnh hưởng tới sức khỏe nhưng nó cũng có thể cải thiện sức khỏe của bạn nếu bạn uống cà phê điều độ. Nếu bạn uống 4 tách cà phê mỗi ngày có thể cải thiện sức khỏe tim mạch của bạn.\n" +
                    "11. Pho mát\n" +
                    "Điều quan trọng của pho mát là làm giảm cao huyết áp để tránh các bệnh đột quỵ liên quan đến tim. Pho mát giàu canxi để làm giảm huyết áp.\n" +
                    "12. Trà\n" +
                    "Trà có thể làm tăng sự trao đổi chất, nó cũng có thể cải thiện sức khỏe tim mạch. Trà có chứa một chất chống oxy hóa gọi là catechin, nó giống như một lá chắn cho thành động mạch. Chất chống oxy hóa này cũng ngăn ngừa cục máu đông có thể gây tử vong.\n" +
                    "13. Dưa hấu\n" +
                    "Dưa hấu tuyệt vời cho chăm sóc da và trong việc giảm cân. Acid amin được tìm thấy trong dưa hấu giúp giảm cao huyết áp . Nhưng dưa hấu cũng có chứa oxit nitric có thể mở ra các mạch máu cải thiện dòng chảy của máu.\n" +
                    "14. Rau bina\n" +
                    "Đây là một thực phẩm giúp bạn chống lại bệnh tim. Rau bina chứa carotene có thể ngăn chặn cholesterol khỏi bị vón cục trong các động mạch. Rau bina có thể làm giảm cao huyết áp.\n" +
                    "15. Cà chua\n" +
                    "Cũng như trái lựu, chè, cà chua cũng chứa chất chống oxy hóa bảo vệ các thành động mạch. Trong cà chua, lycopene giữ cholesterol ở mức độ thấp.\n" +
                    "16. Đậu\n" +
                    "Đậu có chứa axit folic và chất xơ có thể ngăn chặn các động mạch khỏi bị bít. Đậu cũng là một nguồn tốt của carbohydrate.\n" +
                    "17. Táo\n" +
                    "Như cam, táo quá chứa chất xơ có tên pectin hấp thụ cholesterol trong máu. Ăn táo là một cách tuyệt vời để giảm cholesterol trong máu.\n" +
                    "18. Bưởi\n" +
                    "Các bưởi lòng đỏ rất giàu chất chống oxy hóa, chất lycopene trong đó cũng có trong cà chua. Bưởi đỏ giúp ngăn ngừa tác hại cho động mạch của bạn. Bưởi cũng là loại trái cây rất tốt cho bệnh nhân tiểu đường.\n" +
                    "19. Ngô\n" +
                    "Bảo vệ động mạch của bạn bằng cách tiêu thụ ngô. Ngô có chứa chất xơ giúp bảo vệ động mạch của bạn bằng cách đưa cholesterol ra ngoài.\n" +
                    "20. Tỏi\n" +
                    "Tỏi giúp ngăn ngừa tích tụ của cholesterol quá nhiều trong máu. Các thioallyls hợp chất có trong tỏi chiến đấu chống lại các cục máu đông.",
            "Trong các loại thực phẩm mà chúng ta sử dụng hằng ngày, có một số loại có khả năng giúp cơ thể phòng chống được một số bệnh tật như: tim mạch, ung thư… sau đây xin giới thiệu 5 loại thức ăn đã được các trung tâm nghiên cứu đánh giá cao về khả năng hỗ trợ phòng chống tim mạch, nhờ vào một số hoạt chất có trong nó.\n" +
                    "\n" +
                    "1. Cây việt quất (blueberry)\n" +
                    "\n" +
                    "Loại cây này không những ngon mà còn giàu chất chống oxy hóa. Các chuyên gia tin rằng: chất chống oxy hóa trong cây việt quất có tác dụng giảm lượng cholesterol xấu (LDL cholesterol) lắng đọng ở thành mạch máu. Đây là nguyên nhân gây ra bệnh tim mạch và tai biến mạch máu não. Những nghiên cứu của Trung tâm dinh dưỡng Hoa Kỳ, đã đưa đến việc xếp cây việt quất vào hàng số 1 về hoạt tính chống oxy hóa khi so sánh với 40 loại trái cây và rau tươi khác. Chất chống oxy hóa giúp trung hòa các chất độc hại của quá trình chuyển hóa (các gốc tự do). Các gốc tự do có thể dẫn đến bệnh ung thư hoặc những bệnh liên quan đến tuổi già. Anthocyamin, một chất oxy hóa được tìm thấy trong cây việt quất là một chất có tác dụng tốt nhất đối với sức khỏe. Anthocyamin còn tìm thấy trong cây mâm xôi (raspberry), nho đen (black currant), nho đỏ. Người ta khuyến cáo chỉ cần mỗi ngày ăn một cốc trái cây việt quất tươi là đủ.\n" +
                    "\n" +
                    "2. Cá hồi\n" +
                    "\n" +
                    "Cá hồi là một thực phẩm có nhiều tác dụng tốt cho sức khỏe, nó là một nguồn cung cấp tốt nhất “mỡ tốt” cho cơ thể. Mỡ tốt đó chính là acid béo omega-3. Ngoài cá hồi thì cá thu, cá trích, cá mòi cũng giàu acid béo omega-3. Mỡ này giúp làm giảm nguy cơ phát triển bệnh tim mạch, do nó làm giảm lượng triglyceride trong cơ thể, triglyceride là loại mỡ máu có liên quan đến bệnh tim mạch và đái tháo đường. Các nghiên cứu cho thấy, acide béo omega-3 ngăn sự tạo thành cục máu đông do sự kết dính tiểu cầu, tiểu cầu không kết dính và đóng lên thành động mạch được. Mạch máu cũng ít bị co thắt hơn và cũng ngăn chặn loạn nhịp tim gây đe dọa tính mạng. Hội tim mạch Hoa Kỳ khuyến cáo ăn cá ít nhất là 2 lần mỗi tuần (các loại cá như cá hồi).\n" +
                    "\n" +
                    "3. Protein đậu nành\n" +
                    "\n" +
                    "Ngoài việc dùng thức ăn giàu acid béo omega-3, protein, vitamin, khoáng chất thì cũng cần đến protein đậu nành, vì nó là một lựa chọn tốt hơn so với thịt đỏ (thịt động vật).\n" +
                    "\n" +
                    "Nó cũng ít chất béo có hại và giàu chất xơ hơn bất kỳ loại thịt nào. Ở người có cholesterol máu cao, các nghiên cứu cho thấy protein đậu nành khi dùng với chế độ ăn ít mỡ sẽ làm giảm cholesterol. Có những nghiên cứu cho thấy, ăn một vài loại thức ăn giảm cholesterol sẽ làm hạ mức cholesterol máu nhiều hơn so với dùng thuốc. Cả Hội tim mạch Hoa Kỳ lẫn Cơ quan quản lý thuốc & thực phẩm Hoa Kỳ đều khuyến cáo dùng khoảng 30g protein đậu nành mỗi ngày. Có thể lấy protein đậu nành từ đậu nành, sữa đậu nành, đậu hủ, bột đậu nành…\n" +
                    "\n" +
                    "4. Bột yến mạch (oatmeal)\n" +
                    "\n" +
                    "Từ lâu, ở phương Tây người ta hay dùng bột yến mạch pha nóng mỗi sáng cho những người cần giữ giọng tốt. Chỉ cần nửa cốc yến mạch mỗi ngày thì không những được cung cấp năng lượng 130Kcal mà còn nhận được 5g chất xơ có lợi cho tim (giúp làm giảm cholesterol và giữ cho cân nặng cơ thể ở mức khỏe mạnh). Một tác dụng tốt khác là bột yến mạch dùng buổi sáng sẽ tạo cảm giác no đến buổi ăn trưa nên bạn sẽ giảm ăn vặt giữa buổi (ăn vặt là một trong những lý do tạo ra béo phì). Bột yến mạch và các loại hạt khác như: lúa mạch, lúa mì, gạo lức… giúp giảm nguy cơ bệnh đái tháo đường cũng như nguy cơ bệnh tim mạch. Có thể dùng gạo lức để thay thế bột yến mạch. Hội đái tháo đường Hoa Kỳ khuyến cáo lượng chất xơ hàng ngày là 21-38g tùy thuộc vào giới và tuổi.\n" +
                    "\n" +
                    "5. Rau xanh\n" +
                    "\n" +
                    "Các loại rau có màu xanh sậm cùng với cải xoăn, cải lá, bông cải… chứa một lượng cao vitamin, khoáng chất và chất chống oxy hóa mà nó có khả năng bảo vệ cơ thể chống lại bệnh lý tim mạch. Nó cũng cung cấp lượng acid béo omega-3. Rau xanh cũng giàu acid folic, là một chất giúp giảm homocysteine (một acid amin). Nguy cơ bệnh tim mạch tăng cao theo nồng độ homocysteine trong máu.\n" +
                    "\n" +
                    "Người ta khuyến cáo nên ăn rau xanh mỗi ngày để phòng ngừa bệnh tim mạch.",
            "Bất lực hay là tình trạng suy giảm khả năng tình dục ở nam giới. Đây là vấn đề tế nhị và nhạy cảm nên đàn ông thường giấu kín và âm thầm chịu đựng. Chứng bất lực ở nam giới có nhiều biểu hiện: hoặc dương vật không cương cứng do không ham muốn, hoặc có ham muốn nhưng không “lên” được, hay có thể cương khi được kích thích nhiều, nhưng sau đó nhanh chóng trở lại như cũ. Bạn hãy sử dụng các món ăn bài thuốc dưới đây chắc chắn sẽ rất hiệu quả:\n\n" +
                    "Bài 1: Nhục thung dung 20g, thận dê 1 quả. Thận dê làm sạch sau đó thái mỏng ướp mắm muối rồi cho nhục thung dung vào, đổ nước vừa phải, hầm cách thủy 1 tiếng. Món ăn bổ thận khí, ích tinh huyết, tráng dương. Ai bị “yếu khoản ấy”, mỏi gối, đau lưng, tiểu tiện ban đêm nhiều lần do thận hư nên ăn món này. Cần ăn từ 7-14 ngày.\n" +
                    "Bài 2: Tôm he 250g rửa sạch ngâm vào rượu gạo 30 phút rồi lấy ra xào với dầu gừng trên ngọn lửa mạnh, thêm gia vị phù hợp ăn với cơm, món ăn này bổ thận tráng dương, cần ăn 7-14 ngày.\n" +
                    "Bài 3: Gan dê 200g, rau hẹ 200g. Gan dê thái mỏng, cho dầu vừng vào xào với rau hẹ. Khi xào dùng ngọn lửa mạnh, lúc chín cho gia vị vừa đủ, ăn với cơm, ăn liền 7 ngày. Tác dụng ôn thận, cố tinh, ích huyết, dưỡng gan cơ thể cường tráng, sinh lực dồi dào.\n" +
                    "Bài 4: Khởi tử 50g, dương vật bò 1 bộ. Dương vật bò rửa sạch, thái nhỏ cho vào nồi đất, đổ ít rượu trắng và khởi tử vào rồi hầm cách thủy. Tác dụng: bổ thận tráng dương, chữa di tinh, tiểu đêm nhiều lần, người già suy nhược. Cần ăn liên tục 7 ngày.\n" +
                    "Bài 5: Thận dê 1 đôi, cà dê 1 cái, nhục thung dung 15g, khởi tử 15g, ba kích 15g, sơn dược 15g, thục địa 15g, táo tàu 15g. Cho vào nồi đất hầm cách thủy 1 tiếng. Tác dụng: ích tinh, bổ huyết, tráng dương, bổ thận khí, cơ thể cường tráng, tăng cường trí nhớ.\n" +
                    "Bài 6: Hải mã 10g, tơ hồng 15g, sơn dược 15g, thục địa 15g, dâm hương hoắc 15g. Sắc đặc uống 7 ngày, mỗi ngày 1 thang. Tác dụng: bồi bổ thận khí, chữa bệnh cương kém, tiểu đêm nhiều lần.\n" +
                    "Bài 7: Cá chép một con 1kg, vừng đen 1,5kg, gạo nếp 0,5kg. Nấu cháo, ngày ăn 1 lần, ăn liên tục 7 ngày. Tác dụng bổ thận tráng dương, mạnh khỏe, trẻ trung lâu dài.",
            "Hãy bổ sung 8 thực phẩm dưới đây vào thực đơn của mình để ngăn ngừa bệnh trĩ.\n\n" +
                    "1. Việt quất\n\n" +
                    "Việt quất luôn là một trong những thức ăn tốt, đặc biệt là những người mắc trĩ. Vì giàu chất sắc, việt quất có thể giúp phục hồi những tổn hại trong thành mạch máu và tăng cường sức khoẻ tổng thể của hệ thống mạch.\n" +
                    "\n" +
                    "2. Quả sung\n" +
                    "\n" +
                    "Sung vốn là liệu pháp chống táo bón hữu hiệu. Sung giúp nhuận tràng tốt hơn nếu bạn ăn sung cả vỏ. Khi chọn sung, hãy chọn quả sẫm màu, có mùi thơm. Sung là một trong những loài quả dễ thối nên chỉ nên trữ khoảng 1,2 ngày. Nếu không có sung tươi, bạn có thể thay thế bằng sung khô.\n" +
                    "\n" +
                    "3. Rau chân vịt\n\n" +
                    "Loài rau giàu dưỡng chất này là một thức ăn quý hoá cho những ai phập phồng vì mắc trĩ. Rau chân vịt tốt cho toàn bộ máy tiêu hóa, và được xem là hiệu quả trong việc làm sạch và  phục hồi ruột. Thành phần magie trong rau rất hữu ích cho hoạt động của ruột.\n" +
                    "\n" +
                    "4. Mướp\n" +
                    "\n" +
                    "Xơ mướp thấm hút nước giúp ngăn ngừa táo bón hiệu quả. Chất nhầy trong mướp cũng làm mềm đường ruột, trơn nhu động ruột, tránh đau đớn.\n" +
                    "\n" +
                    "5. Củ cải đỏ\n\n" +
                    "Củ cải đỏ là loài chống táo bón và trĩ cực tốt. Lượng chất xơ giàu có trong củ cải giúp cho các chất thải tống ra khỏi ruột dễ dàng hơn. Ngoài việc giúp cho chuyển động của ruột tốt, củ cải còn chứa một số dưỡng chất rất tốt cho ruột kết. Betacyanin, thành phần làm nên màu đỏ tía của củ cải được chứng minh là có khả năng chống ung thư, đặc biệt là ung thư ruột kết.\n" +
                    "\n" +
                    "6. Đu đủ\n" +
                    "\n" +
                    "Nếu bạn đang có nguy cơ mắc trĩ hay đã mắc trĩ thì hãy bổ sung ngay loài quả này vào thực đơn hàng ngày vì đu đủ có khả năng hỗ trợ tiêu hóa và ngăn ngừa táo bón. Đu đủ chứa papain, một enzyme tiêu hóa chất đạm, cũng như một số các thành phần có khả năng chống táo bón. Đu đủ xanh tốt hơn đu đủ chín.\n" +
                    "\n" +
                    "7. Gừng, tỏi, củ hành\n\n" +
                    "Cả ba loại củ này đều giúp khắc phục thương tổn ở mô, nội tạng và động mạch. Tuy nhiên, cần lưu ý là dư thừa chất này có thể gây viêm ở động và tĩnh mạch.\n" +
                    "\n" +
                    "8. Mận khô\n" +
                    "\n" +
                    "Rất giàu chất xơ, mận khô có thể giúp làm mềm chất thải bởi vậy sẽ ngăn ngừa táo bón. Ngoài ra, mận khô còn chứa các chất kích thích giúp ruột hoạt động dễ dàng hơn, có lợi cho người mắc trĩ.",
            "Thạc sĩ, bác sĩ Nguyễn Thị Thanh Nga, Phó trưởng phòng kế hoạch tổng hợp Bệnh viện Nguyễn Trãi, TP HCM, cho biết chế độ ăn uống không hợp lý với quá nhiều chất béo, ăn quá mặn, sử dụng nhiều thực phẩm chế biến sẵn, hút thuốc lá… là nguyên nhân dẫn đến sự gia tăng nhanh chóng của bệnh tăng huyết áp hiện nay.\n" +
                    "\n" +
                    "Sự chú trọng chế độ dinh dưỡng của người bị tăng huyết áp sẽ tác động rất lớn đến việc phòng tránh bệnh cũng như những biến chứng nguy hiểm của bệnh.\n" +
                    "\n" +
                    "1. Hạn chế uống rượu\n" +
                    "\n" +
                    "Người mắc bệnh huyết áp cao nhất thiết phải biết hạn chế rượu, không uống nhiều hơn 3 ly rượu nhỏ mỗi ngày đối với đàn ông và 2 ly đối với phụ nữ.\n" +
                    "\n" +
                    "2. Tăng cường sử dụng với bơ thực vật\n" +
                    "\n" +
                    "Nhất thiết phải tránh xa chất béo bão hòa trong thực đơn ăn uống và thay thế tối đa mỡ động vật bằng dầu thực vật. Người cao huyết áp cũng cần thay bơ động vật bằng bơ thực vật.\n\n" +
                    "3. Không để cân nặng 'vượt chuẩn'\n" +
                    "\n" +
                    "Thừa cân là nguyên nhân gây ảnh hưởng không tốt đến tim và hệ huyết mạch. Khi cân nặng vượt quá trọng lượng cho phép, chứng cao huyết áp sẽ dễ xuất hiện. Vì thế khi có dấu hiệu tăng cân đột ngột và dễ thừa cân, béo phì, bạn cần nhanh chóng cân bằng lại chế độ ăn uống của bản thân và tập luyện thể dục thể thao hợp lý.\n" +
                    "\n" +
                    "4. Cảnh giác với muối ăn\n" +
                    "\n" +
                    "Một người mắc bệnh huyết áp cao chỉ nên sử dụng  nhiều nhất 6g muối mỗi ngày. Vì thế, cần tránh để lọ muối ăn và gia vị trên bàn ăn. Ngoài chuyện nấu nướng các món ăn cho nhạt hơn, người cao huyết áp cũng nên tránh các đồ ăn được chế biến sẵn như thịt xông khói, đồ ăn nhanh, một số đồ hộp... vì chúng rất nhiều natri. Bên cạnh đó cũng nên dè chừng muối ăn có trong ngũ cốc của bữa sáng hay trong bánh quy.\n" +
                    "\n" +
                    "5. Hạn chế ăn thịt\n" +
                    "\n" +
                    "Khi bị huyết áp cao, do phải hạn chế chất béo bão hòa nên tốt nhất là chọn những loại thịt càng nạc càng tốt. Hạn chế thịt bò, thịt lợn và thịt cừu, nên chọn cá và thịt gia cầm (nhớ bỏ da).\n" +
                    "\n" +
                    "6. Chọn những phương thức nấu ăn toàn\n" +
                    "\n" +
                    "Cần chọn những cách nấu ít chất béo nhất mà vẫn đảm bảo hàm lượng dinh dưỡng của đồ ăn. Tốt nhất nên làm chín thức ăn bằng phương thức luộc, hấp hoặc nướng. Hạn chế và tránh ăn chiên, xào đồ ăn.\n" +
                    "\n" +
                    "7. Ưu tiên các đồ ăn ít chất béo\n" +
                    "\n" +
                    "Nên chọn sữa đã gạn kem, sữa chua không đường để sử dụng. Tốt nhất trong trường hợp có thể lựa chọn, nên nghiêng về những sản phẩm càng ít chất béo càng tốt.\n" +
                    "\n" +
                    "8. Sử dụng nhiều với ngũ cốc nguyên vỏ lụa\n" +
                    "\n" +
                    "Để đảm bảo nhu cầu tinh bột của cơ thể, người bị huyết áp cao nên tận dụng các loại ngũ cốc toàn phần. Bên cạnh hàm lượng tinh bột, ngũ cốc còn cung cấp một hàm lượng chất xơ đáng kể.\n\n" +
                    "9. Bổ sung nhiều rau quả chứa kali\n" +
                    "\n" +
                    "Nên nạp đủ lượng rau xanh và hoa quả mỗi ngày cho cơ thể để có được một sức khỏe tốt nhất. Đối với những người có huyết áp cao, bên bổ sung nhiều hoa quả chứa kali như hoa quả khô, chuối...",
            "Những người làm việc trong môi trường nóng hoặc có một thói quen không uống đủ nước sẽ dễ bị sỏi thận. Để phòng ngừa nguy cơ này, bạn hãy áp dụng 7 bí quyết sau đây.\n\n"+
                    "Chúng ta thường không nghĩ rằng bệnh sỏi thận có liên quan đến sự tăng lên của nhiệt độ thời tiết và độ ẩm không khí. Trên thực tế thì “tỉ lệ các trường hợp bị sỏi thận tăng lên 40% trong mùa hè do sự gia tăng nhiệt độ. Khí hậu, nhiệt độ và độ ẩm là những yếu tố quan trọng góp phần hình thành sỏi thận”, theo quan điểm của Tiến sĩ Abhinandan Sadlalge, Trưởng khoa Tiết niệu, bệnh viện RG Stone Urology and Laparoscopy (Ấn Độ).\n" +
                    " \n" +
                    "Những người làm việc trong môi trường nóng hoặc có một thói quen không uống đủ nước sẽ dễ bị sỏi thận. Đặc biệt, nhiệt độ tăng lên 5-7 độ sẽ làm tăng 30% các vấn đề liên quan đến bệnh sỏi thận. Khi một người di chuyển từ các vùng có nhiệt độ trung bình đến sinh sống tại khu vực có khí hậu ấm áp hơn thì sự hình thành sỏi thận càng rõ hơn. Chính vì vậy, tỉ lệ mắc bệnh sỏi thận đặc biệt cao ở những vùng có khí hậu khô, nóng.\n" +
                    " \n" +
                    "Sỏi thận hình thành do cơ thể bị mất nước, mà sự gia tăng nhiệt độ là một nguyên nhân dẫn đến mất nước. Mất nước cuối cùng dẫn đến nước tiểu đặc hơn, do đó làm tăng nguy cơ hình thành sỏi thận.\n" +
                    " \n" +
                    "1. Uống nhiều nước trong ngày và vào ban đêm trước khi đi ngủ để cơ thể của bạn vẫn giữ đủ nước trong cả 24 giờ:\n" +
                    " \n" +
                    "Uống nước là cách đơn giản nhất để bù lại lượng nước bị hao hụt khỏi cơ thể (thông qua nước tiểu, mồ hôi…). Cơ thể đủ nước cũng giúp thận, gan lọc các chất độc tốt hơn, giảm thiểu tình trạng tích tụ chất độc trong gan, thận dẫn đến sỏi.\n" +
                    " \n" +
                    "Tuy nhiên, uống quá nhiều nước cũng không tốt vì nó có thể gây ra tình trạng thừa nước và phù các tế bào trong cơ thể.\n" +
                    " \n" +
                    "2. Uống nước chanh:\n" +
                    " \n" +
                    "Sỏi thận hình thành khi các thành phần của nước tiểu là khoáng sản, chất lỏng và axit bị mất cân bằng. Tức là lúc này hàm lượng các chất như canxi, oxalat và axit uric trong nước tiểu rất nhiều. Bình thường, các chất này có thể được hòa tan bởi các chất lỏng hoặc chất citrate. Khi không được hòa tan, chúng sẽ kết hợp với nhau tạo thành sỏi ở thận.\n" +
                    " \n" +
                    "Nước chanh giúp nâng cao mức citrate trong nước tiểu nên có thể giúp phòng ngừa sỏi oxalat canxi, cũng như sỏi axit uric.\n" +
                    " \n" +
                    "3. Cắt giảm các sản phẩm chứa nhiều oxalate:\n" +
                    " \n" +
                    "Oxalat là một loại axit có thể dẫn đến sự hình thành sỏi thận oxalat canxi. Các loại thực phẩm chứa nhiều oxalat bao gồm các sản phẩm đồ uống như soda, trà đá, sô cô la; cây đại hoàng, dâu tây và các loại hạt. Cắt giảm các loại thực phẩm này chính là cách đơn giản để phòng bệnh sỏi thận.\n\n" +
                    "4. Cắt giảm lượng caffeine:\n" +
                    " \n" +
                    "Bạn nên tránh tiêu thụ quá nhiều các loại đồ ăn, uống chứa caffeine như cà phê, trà, thuốc lá… vì chúng chính là nguyên nhân khiến cơ thể bạn bị mất nước ngay cả khi bạn nghĩ rằng bạn vẫn bổ sung nước đầy đủ. Mất nước chính là nguyên nhân chủ chốt dẫn đến bệnh sỏi thận.\n" +
                    " \n" +
                    "5. Giảm lượng muối ăn hàng ngày\n" +
                    " \n" +
                    "Việc giảm lượng muối trong chế độ ăn cũng có thể cắt giảm lượng oxalate trong nước tiểu, nhờ đó cũng có thể giảm nguy cơ bị sỏi thận.\n" +
                    " \n" +
                    "6. Kiểm soát việc tiêu thụ các chất đạm động vật, bao gồm thịt, trứng và cá:\n" +
                    " \n" +
                    "Những thực phẩm này chứa nhiều purin, đó là những chất tự nhiên chuyển hóa hoặc phân hủy thành axit uric trong nước tiểu và góp phần hình thành sỏi thận. Hạn chế ăn các thực phẩm này sẽ giảm nguy cơ hàm lượng axit uric trong nước tiểu nên cũng phòng được bệnh sỏi thận.\n" +
                    " \n" +
                    "7. Giảm cân để giữ sức khỏe:\n" +
                    " \n" +
                    "Theo phân tích của các chuyên gia thuộc Đại học Y Johns Hopkins (Mỹ) thì béo phì làm tăng gấp đôi nguy cơ sỏi thận. Vì vậy, việc tập thể dục để giảm cân và duy trì sức khỏe là hết sức cần thiết. Nó không những giúp bạn tránh được tình trạng béo phì mà nó còn giảm các nguy cơ bệnh tật khác như: bệnh sỏi thận, tiểu đường, huyết áp cao…",
            "Đông y cho rằng, thịt hến vị ngọt mặn, tính hàn, không độc, có tác dụng dưỡng âm, lợi tiểu, hoạt tràng, thông khí, mát gan, thanh nhiệt, giải độc, lợi tiểu.\n\n" +
                    "Con hến có tên khoa học là Cyrena sumatrensis. Hến thuộc loại nhuyễn thể có vỏ hai mảnh, sống ở vùng nước lợ gần cửa sông.\n" +
                    "Hến được rửa sạch bùn và ngâm trong nước để nó nhả bớt chất bẩn. Cho vào nồi luộc tới khi đa số hến mở miệng. Con nào không mở miệng là đã chết từ trước. Tách riêng thịt, bỏ vỏ. Nước luộc hến để lắng gạn cát. Nước luộc hến đục lờ đờ như nước vo gạo, mùi vị ngang ngang.\n" +
                    "Thịt hến có một số chất quan trọng như lysine, tryptophane, histidine, cystein, taurine, lecithin và các sterol. Ngoài ra còn khá nhiều chất khoáng với hàm lượng cao.\n" +
                    "Đông y cho rằng, thịt hến vị ngọt mặn, tính hàn, không độc, có tác dụng dưỡng âm, lợi tiểu, hoạt tràng, thông khí, mát gan, thanh nhiệt, giải độc, lợi tiểu. Vỏ hến (nghiễn xác) có vị mặn, tính ấm, không độc; có tác dụng cố tinh, làm long đờm, chống nôn, tiêu đờm, tan hạch.\n" +
                    "Hến hỗ trợ cường dương: các phân tích khoa học cho thấy các cơ quan sinh dục yếu là do thiếu chất kẽm. Hến có nhiều kẽm làm mạnh tình dục. Khá nhiều tài liệu quan niệm rằng nên dùng thức ăn chứa nhiều kẽm với mục đích làm mạnh tình dục. Riêng với chất kẽm, không nên uống thuốc mà chỉ bổ sung bằng thức ăn như thịt, nghêu, sò, ốc, hến.\n" +
                    "Tuy nhiên cần lưu ý: với hàm lượng iod cao, người bướu cổ do suy tuyến giáp nên dùng, nhưng bướu cổ cường giáp phải kiêng.\n" +
                    "Do thịt hến non mềm, lượng iod lại dễ bị phân hủy nên không nên luộc lâu.\n" +
                    "Bồi dưỡng cơ thể: hến có vị rất ngon, nó chứa protein, mỡ, đường, muối vô cơ, vitamin A, vitamin B2, nó còn chứa 1 1ượng iod tương đối cao, vì vậy những người đang ở độ tuổi thanh xuân, phụ nữ ở thời kỳ thai nghén, người lao động khỏe mạnh đều nên ăn.\n\n" +
                    "Canh hến bổ thận, cường dương:  hến 100g, cà chua 1 -2 quả, khế 1 quả, thì là 6g, rau răm 8g. Thêm nước và gia vị vừa đủ, nấu thành canh ăn.\n" +
                    "Món canh này: hến làm mạnh gân, cường dương, ích tinh; cà chua và khế có vị chua, dẫn thuốc vào can kinh; thì là khử mùi tanh, tiêu thực, làm ấm thận; rau răm khử mùi tanh, tiêu thực, kìm hãm tác dụng bộc phát cường dương của hến. Đúng là món ăn - bài thuốc!",
            "Có thể nói nguyên nhân trực tiếp gây bệnh gút (thống phong) là sự kết tủa vi tinh thể muối urate natri. Một trong những biện pháp phòng chống bệnh gút là có một chế độ dinh dưỡng hợp lý, dùng các thực phẩm không hoặc ít có nhân purine.\n" +
                    "Những thức ăn không có lợi cho người bị bệnh Gout :\n" +
                    "\n" +
                    "Trong cơ thể, acid uric được tạo thành từ ba nguồn: thoái giáng từ các chất có nhân purin do thức ăn đưa vào, thoái giáng các chất có nhân purin từ trong cơ thể và tổng hợp các purin từ con đường nội sinh.\n" +
                    "\n" +
                    "Do đó, người có acid uric máu cao nên kiêng hoặc hạn chế các thực phẩm chứa nhiều nhân purin như phủ tạng động vật (gan, thận, não, tụy...), các loại thịt có màu đỏ, các loại hải sản, nấm, đậu... Không dùng các đồ ăn thức uống có tính kích thích như trà đặc, cà phê, rượu trắng, hạt tiêu, hồi, quế, ớt... \n" +
                    "\n" +
                    "Bảng thực phẩm chứa nhiều đạm\n" +
                    "\n" +
                    " \n" +
                    "Một số thực phẩm có lợi cho bệnh nhân Gout: \n" +
                    "Người bị gút nặng, acid uric máu tăng quá cao nên ăn chay theo chu kỳ như ngày ăn táo, ngày ăn dưa chuột, ngày ăn rau xanh để hỗ trợ điều trị bệnh. Nếu ăn táo hoặc dưa chuột mỗi ngày dùng 1,5kg, chia thành 3-4 bữa. Nếu ăn rau xanh mỗi ngày 1,5kg chia thành nhiều bữa dưới các dạng nấu, xào hoặc làm nộm. \n" +
                    "Thuốc điều trị bênh gút và các bệnh mạn tính\n" +
                    "Rau cần: cần trồng dưới nước tính mát, vị ngọt, có công dụng thanh nhiệt lợi thủy. Cần trồng trên cạn tính mát, vị đắng ngọt, có công dụng thanh nhiệt, khu phong và lợi thấp. Có thể dùng cả hai loại, đặc biệt tốt trong giai đoạn gút cấp tính. Rau cần giàu các sinh tố, khoáng chất và hầu như không chứa nhân purin. Có thể ăn sống, ép lấy nước uống hoặc nấu canh ăn hằng ngày.\n" +
                    "\n" +
                    "Súp lơ: là một trong những loại rau chứa ít nhân purin (mỗi 100g chỉ có dưới 75mg). Theo dinh dưỡng học cổ truyền, súp lơ tính mát, vị ngọt, công dụng thanh nhiệt, lợi tiểu, thông tiện nên là thực phẩm thích hợp cho người có acid uric máu cao. \n" +
                    "\n" +
                    "Dưa chuột (Dưa leo): là loại rau kiềm tính. Theo dinh dưỡng học cổ truyền, dưa chuột tính mát, vị ngọt, công dụng thanh nhiệt, giải độc nên có khả năng bài tiết tích  acid uric qua đường tiết niệu.\n" +
                    "\n" +
                    "Cải xanh: cũng là loại rau kiềm tính, và hầu như không chứa nhân purin. Cải xanh có tác dụng giải nhiệt trừ phiền, thông lợi tràng vị. Sách Trấn nam bản thảo cho rằng cải xanh còn có tác dụng lợi tiểu, rất thích hợp với người bị bệnh gút. \n" +
                    "\n" +
                    "Cà: cà pháo, cà bát, cà tím... đều có tác dụng hoạt huyết tiêu thũng, khứ phong thông lạc, thanh nhiệt chỉ thống. Đây cũng là loại thực phẩm kiềm tính và hầu như không chứa nhân purin. Nghiên cứu hiện đại cho thấy cà còn có tác dụng lợi niệu ở một mức độ nhất định. \n" +
                    "\n" +
                    "Cải bắp: là loại rau hầu như không có nhân purin,  Sách Bản thảo cương mục thập di cho rằng cải bắp có công dụng \"bổ tinh tủy, lợi ngũ tạng lục phủ, lợi quan tiết (có ích cho khớp), thông kinh hoạt lạc\" nên là thực phẩm rất tốt cho người có acid uric trong máu cao. \n" +
                    "\n" +
                    "Củ cải: tính mát, vị ngọt, có công dụng lợi quan tiết, hành phong khí, trừ tà nhiệt (Thực tính bản thảo), trừ phong thấp (Tùy tức cư ẩm thực phổ), rất thích hợp với người bị phong thấp nói chung và thống phong nói riêng. Đây cũng là loại rau kiềm tính, giàu sinh tố, nhiều nước và hầu như không có nhân purin. \n" +
                    "Khoai tây: là một thực phẩm kiềm tính, giàu muối kali. Trong thành phần hóa học hầu như không có nhân purin.\n" +
                    "Bí đỏ: tính ấm, vị ngọt, công dụng bổ trung ích khí, giảm mỡ máu và hạ đường huyết, là loại thực phẩm kiềm tính và hầu như không chứa nhân purin, lý tưởng cho người bị cao huyết áp, rối loạn lipid máu, béo phì và tăng acid uric trong máu. \n" +
                    "\n" +
                    "Bí xanh: tính mát, vị ngọt đạm, có tác dụng thanh nhiệt tiêu đàm, lợi tiểu tiện, giải độc, giảm béo. Là loại thực phẩm kiềm tính, nhiều nước và chứa rất ít nhân purin, có khả năng thanh thải acid uric qua đường tiết niệu khá tốt. \n" +
                    "\n" +
                    "Dưa hấu: tính lạnh, vị ngọt, có công dụng thanh nhiệt giải thử, trừ phiền chỉ khát và lợi tiểu tiện. Trong thành phần có chứa nhiều muối kali, nước và hầu như không có nhân purin. Đây là loại quả đặc biệt tốt cho những người bị gút giai đoạn cấp tính. \n" +
                    "Đậu đỏ: còn gọi là xích tiểu đậu, tính bình, vị ngọt chua, có công dụng kiện tỳ chỉ tả, lợi niệu tiêu thũng. Trong thành phần hóa học của đậu đỏ hầu như không có nhân purin, là thực phẩm rất tốt cho bệnh nhân bị bệnh gút. \n" +
                    "Lê và táo: hai loại quả tính mát, vị ngọt, công dụng thanh nhiệt sinh tân, chỉ khát trừ phiền. Trong thành phần có chứa nhiều nước, sinh tố, muối kali và hầu như không có nhân purin. Là loại quả kiềm tính, dùng rất tốt cho bệnh nhân bị bệnh gút cấp tính và mãn tính. \n" +
                    "Nho: tính bình, vị ngọt, công dụng bổ khí huyết, cường gân cốt và lợi tiểu tiện. Đây cũng là loại quả kiềm tính, nhiều nước, giàu sinh tố và hầu như không có nhân purin. \n" +
                    " \n" +
                    "Sữa bò: là loại thực phẩm bổ dưỡng giàu chất đạm, nhiều nước và chứa rất ít nhân purin. Là thứ nước uống lý tưởng cho bệnh nhân bị bệnh gút cả cấp tính và mãn tính.\n" ,
            "Chế độ dinh dưỡng cho người cao huyết áp\n" +
                    "Khi bịcao huyết áp (HA), ngoài thuốc, việc lựa chọn và duy trì một chế độ ăn khônngoan và thích hợp có ý nghĩa đặc biệt quan trọng. Tuy nhiên, bên cạnh vấn đềtuân thủ những nguyên tắc chung như: ăn nhạt, hạn chế mỡ động vật, kiêng cácchất kích thích... người bệnh nhiều khi tỏ ra lúng túng khi chọn dùng các đồ ănthức uống hàng ngày để được một chế độ dinh dưỡng có lợi cho sức khỏe.\n" +
                    "\n" +
                    "1. Cần tây: dùng loại càng tươi càng ốt, rửa thật sạch, giãnát rồi ép lấy nước (nếu có máy ép thì càng tốt). Chế thêm một chút mật ong,mỗi ngày uống 3 lần, mỗi lần 40ml. Nghiên cứu hiện đại cho thấy, nước ép cầntây có tác dụng làm giãn mạch, lợi niệu và hạ HA.\n" +
                    "\n" +
                    "2. Cải cúc: là loại rau thông dụng, có hương thơm đặc biệt,chứa nhiều acid amin và tinh dầu, có tác dụng làm thanh sáng đầu óc và hạ HA.Bạn nên dùng làm rau ăn hàng ngày hoặc ép lấy nước cốt uống, mỗi ngày chừng50ml, chia 2 lần sáng, chiều. Đặc biệt, cải cúc thích hợp với những người bịcao HA có kèm theo đau và nặng đầu.\n" +
                    "\n" +
                    "3. Rau muống: chứa nhiều canxi, rất cólợi cho việc duy trì áp lực thẩm thấu của thành mạch và HA trong giới hạn bìnhthường, là thứ rau đặc biệt thích hợp cho những người bị cao HA có kèm theotriệu chứng đau đầu.\n" +
                    "\n" +
                    "4. Cà chua: có công dụng thanh nhiệt giải độc, lương huyếtbình can và hạ HA. Nó là thực phẩm rất giàu vitamin C và P, nếu ăn thường xuyênmỗi ngày 1- 2 quả cà chua sống sẽ có khả năng phòng chống cao HA rất tốt, đặcbiệt là khi có biến chứng xuất huyết đáy mắt.\n" +
                    "\n" +
                    "5. Cà tím: là thực phẩm rất giàu vitamin P, giúp cho thànhmạch máu được mềm mại, dự phòng tích cực tình trạng rối loạn vi tuần hoàn haygặp ở những người bị cao HA và các bệnh lý tim mạch khác.\n" +
                    "\n" +
                    "6. Cà rốt: có tác dụng làm mềm thành mạch, điều chỉnh rốiloạn lipid máu và ổn định HA. Nên dùng dạng tươi, rửa sạch, ép lấy nước uốngmỗi ngày 2 lần, mỗi lần chừng 50ml. Đây là thứ nước giải khát đặc biệt tốt chonhững người bị cao HA có kèm theo tình trạng đau đầu, chóng mặt.\n" +
                    "\n" +
                    "7. Hành tây: trong thành phần không chứachất béo, có khả năng làm giảm sức cản ngoại vi, đối kháng với tác dụng làmtăng HA của catecholamine, duy trì sự ổn định của quá trình bài tiết muối natritrong cơ thể nên làm giảm HA. Ngoài ra, vỏ hành tây còn chứa nhiều rutin rất cólợi cho việc làm vững bền thành mạch, dự phòng tai biến xuất huyết não.",
            "Bệnh nhân có bệnh thận mạn, thận không thể lọc và loại bỏ nước dư thừa, vitamin khoáng chất cùng các độc chất thải ra từ cơ thể cần lưu ý về chế độ dinh dưỡng. \n" +
                    "\n" +
                    "\n" +
                    "Hạn chế đạm\n" +
                    "Các tiết chế chặt chẽ thường áp dụng cho bệnh thận mạn giai đoạn 3-4 hoặc chức năng thận giảm chỉ còn dưới 50%. Tùy theo mức độ suy thận, các bệnh phối hợp, hoàn cảnh kinh tế mà các nguyên tắc sau có thể được thay đổi cho phù hợp với từng bệnh nhân dưới sự hướng dẫn của bác sĩ và chuyên gia dinh dưỡng.\n" +
                    "Tiết chế giúp tránh ứ đọng các chất dư thừa có hại cho cơ thể và làm bệnh thận chậm tiến triển đến suy thận mạn giai đoạn cuối. Tiết chế protein (đạm) nhằm tránh ứ đọng các sản phẩm thoái biến từ protein làm tăng gánh nặng cho thận. \n" +
                    "Khi bệnh thận mạn giai đoạn 3-4, cần tiết chế protein còn 0,6 - 0,8g/kg cân nặng/ngày, tương đương ăn 150 - 200g thịt nạc (hoặc cá không xương, tôm đã bóc vỏ, thịt gà không xương...) mỗi ngày đối với bệnh nhân nặng 50kg. Nên ăn các loại đạm, trong đó ưu tiên protein chất lượng cao (thịt, cá, tôm, trứng, sữa), và protein thực vật (đậu hũ, giá, các lọai ngũ cốc).\n" +
                    "Nên ăn các loại axit béo không no có nhiều trong cá biển vùng nước lạnh, dầu ô liu, dầu cải, dầu đậu nành.\n" +
                    "\n" +
                    "Tôm có protein chất lượng cao. \n" +
                    "Cần có chế độ ăn lạt, giảm muối \n" +
                    "Muối làm tăng giữ nước trong cơ thể, gây phù, tăng huyết áp và còn làm tăng gánh nặng cho thận tiết chế muối ăn dưới 6g được áp dụng trong mọi giai đoạn của bệnh thận mạn. Chế độ này có nghĩa là không nêm, không chấm.\n" +
                    "Nếu đang bị phù hoặc suy thận nên tham khảo ý kiến bác sĩ, không tự ý uống nhiều nước. Lượng nước uống vào bằng lượng nước tiểu mỗi ngày công thêm 500ml.\n" +
                    "Cần có chế độ ăn giảm kali một khi thận suy\n" +
                    "Cần tham khảo ý kiến của bác sĩ về chế độ ăn giảm kali sau khi xét nghiệm về kali máu. Tiết chế kali dành cho các người bệnh thận bị tăng kali máu (kali máu tăng trên 5,5mMol/L), suy thận nặng hoặc phải dùng những thuốc giữ kali. Các loại thức ăn có chứa nhiều kali như chuối, dưa hấu, dưa tây, cam, quýt, xoài, nhãn, khoai tây, cà chua, trái bơ, kiwi, trái đào, các loại trái cây khô, hạt rang, các loại rau có màu xanh đậm và các loại nước ép trái cây.\n" +
                    "Các loại thức ăn có chứa ít kali gồm: Táo, dâu tây, lê, mận, khóm, dưa leo, bắp cải, bông cải, cơm, bánh mỳ, ngũ cốc. Khi có tăng kali, cần kiêng mọi loại trái cây cho đến khi có chỉ định của bác sĩ cho dùng lại.\n" +
                    "Cách chế biến thức ăn cũng làm giảm kali như luộc rau và bỏ nước, rửa kỹ hoặc ngâm rau quả nhiều giờ trong nước.\n" +
                    "Tăng phốt pho gặp ở những người bệnh thận có suy thận, làm xương yếu, dễ gãy. Lắng đọng ở da gây ngứa và lắng đọng ở hệ tim mạch. Phốt pho có nhiều trong sữa, các sản phẩm chế biến từ sữa như ya-ourt, phô mai, các loại đậu.",
            "Sức đề kháng và khả năng miễn dịch của người bị bệnh lao thường rất yếu, do đó cải thiện tình trạng dinh dưỡng của bệnh nhân sẽ làm tăng hiệu quả điều trị bệnh lao, giúp bệnh nhân nhanh chóng hồi phục. \n\n" +
                    "Người bị bệnh lao dễ bị chán ăn, giảm hấp thu chất dinh dưỡng (kể cả các vi chất). Quá trình chuyển hóa cũng bị thay đổi theo chiều hướng tăng tiêu hao năng lượng và các chất dinh dưỡng dẫn đến sụt cân và thiếu dưỡng chất. Cải thiện tình trạng dinh dưỡng của bệnh nhân sẽ làm tăng hiệu quả điều trị bệnh lao, giúp bệnh nhân nhanh chóng hồi phục. \n" +
                    " \n" +
                    "Đối với người bị bệnh lao thì năng lượng nạp vào tùy theo thể trạng. Nếu gầy phải ăn nhiều để đạt chỉ số BMI (chỉ số khối cơ thể) trên 18,5. Nếu thể trạng bình thường thì năng lượng nạp vào không thay đổi. Cần đa dạng thực phẩm và thường xuyên thay đổi thực đơn để kích thích người bệnh ăn nhiều hơn. Điều quan trọng trong chế độ dinh dưỡng của bệnh là phải cung cấp đủ các chất cần thiết sau: \n" +
                    "\n" +
                    "Kẽm: \n" +
                    "Do cơ chế hoạt động của các loại thuốc điều trị lao đã gây nên tình trạng thiếu hụt kẽm ở người bệnh, dẫn đến chán ăn, suy giảm hệ miễn dịch. Người bệnh nên bổ sung kẽm từ thịt bò, gan và hạt bí ngô, ngũ cốc, hạt hướng dương…\n" +
                    "\n" +
                    "Vitamin A, E, C: \n" +
                    "Đây là những chất quan trọng giúp tăng cường hệ miễn dịch, bảo vệ niêm mạc, giúp da khỏe mạnh, tránh nguy cơ bị nhiễm khuẩn, chống ô-xy hóa nhưng những người bị bệnh lao lại dễ bị thiếu hụt. Có thể uống thuốc bổ sung hoặc ăn nhiều rau, quả, gan, thịt, cá biển…. \n" +
                    " \n" +
                    "Sắt: \n" +
                    "Nguy cơ thiếu máu do thiếu sắt ở người bệnh lao rất cao làm giảm sức đề kháng, dẫn đến dễ mắc các bệnh nhiễm trùng, tim mạch. Cần ăn nhiều mộc nhĩ, nấm hương, đậu nành, lòng đỏ trứng…  \n" +
                    "\n" +
                    "Vitamin K, B6: Do người bệnh hấp thu kém, dễ gặp rối loạn tiêu hóa nên khả năng tổng hợp vitamin K giảm, gây trở ngại quá trình đông máu. Gan, rau xanh… nên được bổ sung vào thực đơn hằng ngày. \n" +
                    "Dùng thuốc điều trị lâu dài cũng làm giảm khả năng hấp thụ vitamin B6 dễ gây viêm dây thần kinh ngoại biên, giảm miễn dịch. Ngoài uống vitamin B6 bổ sung, người bệnh nên ăn nhiều thịt lợn, đậu, đỗ, khoai tây, chuối, súp lơ, ngũ cốc nguyên hạt…  \n\n"+
                    "Cần đa dạng món ăn  \n" +
                    "Do thể trạng yếu và tác dụng phụ của thuốc nên người bệnh dễ chán ăn, đòi hỏi phải đa dạng món ăn. Chọn những món người bệnh thích nhưng phải thường xuyên thay đổi để tạo sự kích thích. Nên chia nhỏ bữa ăn hằng ngày để người bệnh hấp thu tốt và đầy đủ hơn các chất dinh dưỡng cần thiết. \n" +
                    "\n" +
                    "Cần lưu ý: \n" +
                    "Nhiều người vẫn nghĩ chỉ cần uống thuốc đúng chỉ định sẽ phục hồi bệnh, thực tế thuốc chỉ giúp tiêu diệt vi khuẩn. Muốn nhanh hồi phục phải kết hợp với chế độ ăn uống điều độ, đủ dinh dưỡng.người bệnh tuyệt đối không dùng các loại chất kích thích như rượu, bia, thuốc lá vì những chất này làm giảm tác dụng điều trị và tăng tác dụng phụ của thuốc." +
                    "Rau quả là một trong những thực phẩm tốt cho bệnh nhân lao Thuốc điều trị lao thường gây rối loạn tiêu hóa. Nên ăn nhiều rau quả, khoai lang, sữa chua để giảm những triệu chứng này. Tình trạng rối loạn tiêu hóa cũng gây thiếu hụt vitamin K và B12, cần bổ sung bằng thuốc hoặc thực phẩm. Tình trạng thiếu dinh dưỡng làm tổn hại cho bệnh nhân lao nhiều hơn những người khác. Khi thiếu dinh dưỡng, cơ hô hấp giảm nên bệnh nhân sẽ cảm thấy khó thở hơn. Khả năng giãn nở, đàn hồi và sức căng của phế nang giảm, dẫn tới thông khí phổi kém, phế nang dễ bị xẹp hơn, làm tăng nguy cơ bội nhiễm và bệnh chậm hồi phục. Khả năng miễn dịch của cơ thể cũng bị suy giảm: các tế bào niêm mạc đường hô hấp thiếu về số lượng, dễ bị tổn thương, giảm các kháng thể và giảm khả năng hoạt động của các tế bào miễn dịch. Chế độ dinh dưỡng hợp lý giúp người bệnh tăng cường sức khỏe và sức đề kháng với bệnh tật, do đó làm tăng hiệu quả điều trị, giảm tác dụng phụ của thuốc và dự phòng tái nhiễm lao. Ở bệnh nhân lao, nhu cầu dinh dưỡng tăng hơn bình thường nhằm bù đắp cho quá trình chống đỡ bệnh tật và tái tạo tổ chức bị tổn thương. Mỗi ngày, người bệnh cần có thêm khoảng 150-300 Kcal, tương đương một bát cơm có thức ăn. Bữa ăn của người bệnh cần đa dạng và có đủ các nhóm thực phẩm tinh bột, protein, lipid, vitamin và muối khoáng. Vi chất dinh dưỡng là một yếu tố không thể thiếu trong khẩu phần. Vitamin A, E, C, selen, kẽm... tham gia vào quá trình tái tạo tổ chức và bảo vệ niêm mạc, tăng cường miễn dịch, chống ôxy hóa. Có thể bổ sung các vi chất này bằng thuốc hoặc rau, hoa quả, giá đỗ, gan gia cầm, gia súc, thịt, cá biển. Thuốc điều trị lao thường gây loạn khuẩn ruột, rối loạn tiêu hóa (như táo bón, tiêu chảy, buồn nôn, nôn). Việc ăn nhiều rau, hoa quả, khoai lang, rau lang có thể làm giảm những triệu chứng này. Sữa chua cũng có thể giúp hệ vi khuẩn trong đường tiêu hóa được ổn định, do đó sẽ giải quyết được vấn đề táo bón và tiêu chảy. Do rối loạn vi khuẩn ruột nên vitamin K và B12 không được tổng hợp. Thiếu vitamin K làm tăng nguy cơ xuất huyết, đặc biệt ở bệnh nhân lao vì những thuốc điều trị lao có thể ảnh hưởng tới chức năng sản xuất các chất đông máu của gan. Trong trường hợp này, cần tăng cường vitamin K qua thực phẩm như gan, rau xanh, dầu thực vật, cũng có thể uống hoặc tiêm vitamin K theo chỉ định của thầy thuốc, Vitamin B12 và axit folic là những nguyên liệu cần cho quá trình tạo hồng cầu và tái tạo tổ chức cũng thường bị thiếu ở bệnh nhân lao. Những thực phẩm có nhiều vitamin K thường cũng giàu vitamin B12 và acid folic. Thuốc chống lao INH làm giảm khả năng hấp thụ và sử dụng vitamin B6 và niacin (vitamin PP). Thiếu vitamin B6 có thể dẫn tới viêm dây thần kinh ngoại biên. Ngoài việc uống vitamin B6, người bệnh còn nên ăn nhiều thực phẩm có nhiều vitamin B6 như: thịt lợn, gan, đậu, đỗ, khoai tây, chuối... Thiếu niacin có thể gây bệnh pellagra với những biểu hiện như viêm da nặng, tiêu chảy, rối loạn tri giác và thường dẫn tới tử vong nếu không được điều trị kịp thời. Gan, sữa, thịt nạc, ngũ cốc xay xát không kỹ là những thực phẩm có nhiều niacin. Người bệnh cần uống đủ nước để bảo đảm bù đắp lượng nước mất đi do sốt, thở nhanh và làm giảm tác dụng phụ của thuốc, đặc biệt là thuốc pyrazinamid. Tuyệt đối không dùng các loại chất kích thích như rượu, bia, thuốc lá vì những chất này làm giảm tác dụng điều trị và tăng tác dụng phụ của thuốc.\n" ,
            "Ở bệnh nhân lao phổi, tình trạng thiếu dinh dưỡng gây tổn hại cho họ rất nhiều hơn những người khác.Khi thiếu dinh dưỡng sẽ dẫn đến cơ hô hấp giảm gây ra nhiều hệ lụy như suy giảm khả năng miễn dịch của cơ thể, làm tăng nguy cơ bội nhiễm và bệnh chậm phục hồi. Vì vậy chế độ dinh dưỡng khi chăm sóc người bệnh lao phổi quyết định khả năng hồi phục bệnh rất cao.\n\n" +
                    "Loại thực phẩm nào cần thiết khi chăm sóc người bệnh lao phổi?\n" +
                    " \n" +
                    "\n" +
                    "Khẩu phần ăn đa dạng\n" +
                    "\n" +
                    "Khi chăm sóc người bệnh lao phổi bạn cần biết nhu cầu dinh dưỡng ở bệnh nhân lao cao hơn bình thường nhằm bù bắp cho quá trình chống đỡ bện tật và tái tạo tổ chức bị thương tổn. Vì vậy cần cung cấp cho người bệnh thêm khoảng  300 Kcal mỗi ngày, tương tương một chén cơm đủ thức ăn. Khẩu phần ăn của người bệnh cần đa dạng và có đủ các nhóm thực phẩm chính như tinh bột , protein, lipid, vitamin và muối khoáng.\n" +
                    "\n" +
                    "Rau quả và chữa chua\n" +
                    "\n" +
                    "Cho bệnh nhân ăn nhiều rau quả, sữa chua là rất hữu ích khi chăm sóc người bệnh lao phổi .Phải dùng thuốc điều trị hằng ngày nên đa số các bệnh nhân lao phổi đều bị rối loạn ruột khuẩn, rối loạn tiêu hóa như tiêu chảy, táo bón, buồn nôn. Ăn nhiều rau, trái cây, khoai lang, rau lang có thể làm giảm triệu chứng này. Sữa chua giúp ổn định hệ vi khuẩn trong đường tiêu hóa, do đó sẽ giải quyết được vấn đề táo bón và tiêu chảy.\n\n" +
                    "Vi chất dinh dưỡng\n" +
                    "\n" +
                    "Vi chất dinh dưỡng là một yếu tố không thể thiếu trong khẩu phần ăn khi chăm sóc người bệnh lao phổi. Các loại Vitamin A, E, C, selen, kẽmcó khả làm tăng cường hệ miễn dịch của cơ thể và chống oxy hóa. Các vi chất trên có nhiều trong thuốc hoặc rau, hoa quả, giá đỗ, gan gia cầm, gia súc, thịt, cá biển.\n" +
                    "\n" +
                    "Vitamin K\n" +
                    "\n" +
                    "Vitamin K vitamin rất cần được bổ sung khi chăm sóc người bệnh lao phổi.\n" +
                    "\n" +
                    " Ở bênh nhân lao phổi, thiếu vitamin K làm tăng nguy cơ xuất huyết. Khi chăm sóc người bệnh lao phổi cần tăng cường vitamin K qua thực phẩm như, rau xanh, dầu thực vật, gan cũng có thể uống hoặc tiêm vitamin K theo chỉ định của bác sĩ.\n" +
                    "\n" +
                    "Một chế độ dinh dưỡng hợp lý là cách tốt nhất khi chăm sóc người bệnh lao phổi, giúp người bệnh tăng cường sức khỏe và sức đề kháng với bệnh tật, do đó làm tăng hiệu quả điều trị, giảm tác dụng phụ của thuốc và dự phòng tái nhiễm lao phổi.",
            "Các nhà khoa học thuộc Đại học Mississippi (Mỹ) phát hiện ra rằng, bổ sung protein từ đậu nành có tác dụng cải thiện cholesterol HDL trong máu tốt hơn protein từ sữa, qua đó giúp cải thiện hàm lượng lipid trong máu. Nhiều nghiên cứu cho thấy, protein từ đậu nành giúp giảm cholesterol xấu LDL và tăng cholesterol tốt HDL. “Bệnh tim mạch (CHD) là sát thủ số một toàn cầu. Nghiên cứu cho thấy, giảm lipid trong máu giúp giảm nguy cơ mắc bệnh tim mạch và đột quỵ. Nghiên cứu cho kết quả, bổ sung protein trong đậu nành có thể giúp giảm lipid trong máu và như vậy, giúp giảm nguy cơ mắc bệnh tim mạch ở người khỏe mạnh”, chuyên gia dinh dưỡng, tiến sĩ Elaine Krul, nói.",
            "Tác dụng chữa bệnh tiểu đường của khổ qua rừng\n" +
                    "\n" +
                    " Khổ qua rừng, còn gọi là mướp đắng rừng, có rất nhiều lợi ích cho sức khỏe. Theo đông y, mướp đắng rừng tính hàn, vị đắng, không độc, nếu được dùng thường xuyên sẽ giúp giảm các bệnh ngoài da, làm cho da dẻ mịn màng.\n" +
                    "\n" +
                    " Theo y học hiện đại, khổ qua rừng, mướp đắng rừng có tác dụng diệt vi khuẩn và virus, chống lại các tế bào ung thư, hỗ trợ đắc lực cho bệnh nhân ung thư đang chữa bằng tia xạ. Ngoài ra, mướp đắng còn có các tác dụng dược lý sau:\n" +
                    "\n" +
                    " - Khổ qua rừng giúp chống các gốc tự do, là nguyên nhân gây lão hóa và phát sinh các bệnh tim mạch, tăng huyết áp, rối loạn lipid máu, tổn thương thần kinh, viêm đường tiết niệu, bệnh tiểu đường…\n" +
                    "\n" +
                    " - Khổ qua rừng tăng ôxy hóa glucose, ngăn chặn sự hấp thu glucose vào tế bào, ức chế hoạt tính các men tổng hợp glucose trong dạ dày.\n" +
                    "\n" +
                    " - Khổ qua rừng không chỉ có thể ảnh hưởng đến các kênh vận chuyển glucose, mà còn làm giảm vận chuyển glucose vào máu. Hiệu ứng này là quan trọng để điều trị cả hai loại bệnh nhân tiểu đường tuyp I – II và giúp ngăn ngừa lượng đường trong máu cao sau bữa ăn. Đó là lý do tại sao chúng ta được khuyên dùng trà khổ qua rừng ngay sau ăn.\n" +
                    "\n" +
                    "Khổ qua rừng mọc tự nhiên ở nhiều vùng rừng núi nước ta. Theo y học cổ truyền, khổ qua rừng có vị đắng, tính hàn, không độc, có tác dụng thanh nhiệt, tiêu độc, trừ phiền, trừ đờm, cắt cơn ho trong bệnh phổi…\n\n" +
                    "Khổ qua rừng có thể dùng cả dây, rễ, lá, quả rửa sạch, phơi khô, sắc uống. Có thể uống lâu dài, hoàn toàn không kỵ thuốc tây.  Riêng quả khổ qua rừng được dùng để chế biến nhiều món ăn ngon, bổ và giúp ổn định đường huyết rất tốt.\n\n" +
                    "Khổ qua – mướp đắng ảnh hưởng đến bệnh tiểu đường như thế nào?\n" +
                    "\n" +
                    "Ngoài việc là một thành phần thực phẩm, mướp đắng cũng từ lâu đã được sử dụng như một phương thuốc thảo dược cho một loạt các bệnh trong đó có bệnh tiểu đường tuýp 2.\n" +
                    "\n" +
                    "Loại trái cây có chứa ít nhất ba hoạt chất với những đặc tính chống bệnh tiểu đường, trong đó có charantin, đã được xác nhận là có tác dụng hạ đường huyết trong máu, vicine và một hợp chất tương tự insulin được gọi là polypeptide-p.\n" +
                    "\n" +
                    "Những chất này có thể làm việc độc lập hoặc cùng nhau để giúp làm giảm lượng đường trong máu.\n" +
                    "\n" +
                    "Ngoài ra, khổ qua – mướp đắng có chứa một lectin làm giảm nồng độ đường trong máu bằng cách tác động vào các mô ngoại vi và ức chế sự thèm ăn – tương tự như tác dụng của insulin trong não.\n" +
                    "\n" +
                    "Lectin này được cho là một yếu tố chính đằng sau tác dụng hạ đường huyết mà phát triển sau khi ăn mướp đắng.\n" +
                    "\n" +
                    "Tháng Giêng 2011, kết quả của một thử nghiệm lâm sàng trong bốn tuần đã được công bố trên Tạp chí Ethnopharmacology, trong đó cho thấy một liều 2.000 chiết xuất của mướp đắng dùng hàng ngày làm giảm đáng kể lượng đường trong máu ở những bệnh nhân tiểu đường type 2, mặc dù ảnh hưởng hạ đường huyết ít hơn một liều 1.000 mg / ngày của metformin.\n" +
                    "\n" +
                    "Một nghiên cứu trước đó khác cũng đã cho thấy một mối liên hệ giữa mướp đắng và khả năng cải thiện kiểm soát đường huyết, trong khi một báo cáo được công bố trên Tạp chí “Hóa học và Sinh học” số ra tháng 3 2008, phát hiện ra rằng mướp đắng tăng sự hấp thu glucose của tế bào và cải thiện dung nạp glucose.\n" +
                    "\n" +
                    " Bệnh tiểu đường rất phức tạp, người bệnh phải sống chung với nó suốt đời, kéo theo nhiều biến chứng nguy hiểm. Bệnh này có thể dùng thử thuốc nam (như khổ qua rừng, dứa, nụ vối hay vài loại thuốc khác) nhưng phải có bác sĩ chuyên khoa về tiểu đường theo dõi định kỳ, kiểm tra đường huyết. Nếu dùng thuốc nam không hiệu quả, phải sử dụng thuốc tây để kéo giảm đường huyết, sau đó dùng thuốc nam điều trị hỗ trợ.",
            "Theo y học cổ truyền, bệnh gút gọi là thống phong, thuộc phạm trù chứng tý trong Ðông y. Nguyên nhân bên ngoài là do khí phong, hàn, thử , thấp xâm nhập vào cơ thể làm khí trệ, huyết ứ, đàm kết tụ thành cục quanh khớp từ các khớp ngón tay chân rồi chuyển lên khớp gối. Nguyên nhân bên trong là do ăn uống nhiều thịt, chất béo bổ, lao động không điều độ, ít rèn luyện thể lực.\n" +
                    "\n" +
                    "Phép trị chủ yếu là khu phong tán hàn trừ thấp. Sau đây là một số món ăn - bài thuốc có tác dụng  bổ dưỡng, giảm đau, người bệnh gút nên dùng.\n" +
                    "Lòng gà hầm ba kích: lòng gà 1 bộ, ba kích nhục 30g, gừng, muối, tiêu bột, hành lá, mỗi thứ một ít. Ba kích rửa sạch cắt mỏng để ráo. Hành rửa sạch, cọng hành trắng giã nhuyễn, lá hành cắt khúc để sẵn. Gừng cạo vỏ sạch, cắt từng đoạn vừa ăn, để ráo. Đem bộ lòng đã làm sạch ướp với cọng hành trắng đã giã nhuyễn, thêm muối, tiêu rồi trộn với nhau cho thấm, cho vào nồi cùng ba kích và ít nước lạnh để hầm. Nấu nước thật sôi rồi vặn nhỏ lửa hầm riu riu độ 1 giờ, nêm tí muối cho vừa ăn rồi thả gừng cắt sợi và rắc tiêu cho thơm là dùng được. Ăn liên tục 7-10 ngày. Tác dụng: ích khí, bổ thận, bổ dưỡng cơ thể, trị thận dương hư, khí huyết kém, gối đau rát, lưng nhức mỏi.\n" +
                    "\n" +
                    "Giò lợn hầm rễ tỳ bà: giò (móng) lợn 2 cái, rễ tỳ bà 250g, đường, muối, gừng, hành lá, tiêu bột, dầu ăn, rượu mỗi thứ một ít. Rửa rễ tì bà rửa sạch, cho vào nồi đất, đổ 700ml nước sắc thuốc còn 150ml nước để riêng. Cho dầu vào nồi, thả cọng hành trắng phi thơm, bỏ gừng cắt sợi vào xào chung sau cho tiếp giò lợn xào cho đều đến khi giò lợn săn lại thì cho một ít nước và muối, đường, xào tiếp cho thấm, đổ nước thuốc đã sắc vào nấu chung, thêm ít rượu, đun sôi thì hạ nhỏ lửa, đậy nắp kín, hầm riu riu khoảng 1 giờ, thả hành lá cắt khúc, rắc tiêu bột là được. Tác dụng: bồi bổ cơ thể, khử phong trừ thấp, ích khí, bổ huyết, trị đau nhức xương các khớp, thống phong.\n" +
                    "Canh ba ba, đỗ trọng:\n" +
                    "\n" +
                    "thịt ba ba 100g, đỗ trọng 15g, muối hột một ít. Đỗ trọng rửa sạch cho vào nồi với 800ml nước, đun còn 300ml nước thuốc. Ba ba mổ bỏ ruột, rửa sạch cho vào nước đỗ trọng, nấu đến chín thịt, cho gia vị là ăn được. Ăn kèm trong bữa ăn. Tác dụng: bổ can thận, cường tráng lưng, gối. Trị bệnh đầu gối đau mỏi do gan thận đều hư.\n" +
                    "\n" +
                    "Canh thịt lợn, rong biển: thịt lợn nạc, rong biển 50g, giá 100g, hành 10g, gừng 3g, muối một ít. Cho 1 lít nước vào nồi, đun sôi, cho thịt đã băm nhuyễn vào, khuấy cho thịt rã đều rồi cho các thứ kia vào, đun nước sôi 30 phút, nêm mắm muối vừa ăn. Mỗi ngày ăn 1 lần. Tác dụng: khử phong, trừ thấp, bổ thận hư, đau đầu gối, xương khớp.\n" +
                    "Chè hoạt huyết bổ máu:\n" +
                    "\n" +
                    "xích tiểu đậu 250g, táo tàu 200g, đường đỏ 150g. Đậu rửa sạch cho vào nồi, nước vừa đủ, nấu gần chín thì cho đường, táo tàu vào đun tiếp tới chín là được. Tác dụng: trị lưng gối đau mỏi, thống phong ở người già.\n" +
                    "Ngoài ra người bệnh nên sử dụng một số loại rau củ làm thức ăn hằng ngày:\n" +
                    "\n" +
                    "-  Rán khoai tây với dầu thực vật, trộn xì dầu, muối, gia vị ăn thay cơm.\n" +
                    "\n" +
                    "- Rau cải trắng xào dầu thực vật ăn.\n" +
                    "\n" +
                    "- Rau cần (cả rễ) 100g thái nhỏ, gạo tẻ 30g, nước 700ml nấu thành cháo.\n" +
                    "\n" +
                    "-  Trứng chim cút 5 quả, hạt sen 30g nấu ăn.\n" +
                    "\n" +
                    "-  Xa tiền thảo tươi 100g sắc uống.\n" +
                    "\n" +
                    "Người bệnh nên uống ngày 2 lít nước, ăn trứng, sữa, ngũ cốc, rau quả. Kiêng ăn thịt, cá, tôm, cua, ốc, ớt, rượu, bia, cà phê.",
            "Những người ngủ hay mơ, theo Đông y đó là “tâm tàng thần, chủ thần chí” nên xảy ra hiện tượng ngủ mê nói sảng. Như vậy là bệnh chứng có quan hệ tới tạng tâm thuộc phạm trù chính xung do rối loạn nhịp tim, hoặc do tâm thận bất giao (thủy hỏa vị tế), cần chú ý bồi bổ huyết, an thần." +
                    "\n" +
                    "Những người ngủ hay mơ, theo Đông y đó là “tâm tàng thần, chủ thần chí” nên xảy ra hiện tượng ngủ mê nói sảng. Như vậy là bệnh chứng có quan hệ tới tạng tâm thuộc phạm trù chính xung do rối loạn nhịp tim, hoặc do tâm thận bất giao (thủy hỏa vị tế), cần chú ý bồi bổ huyết, an thần.\n" +
                    "Về ăn uống, phải bảo đảm đủ dinh dưỡng, vì vậy thức ăn cần phong phú. Thường xuyên ăn các loại rau tươi, hoa quả như rau cải trắng, rau chân vịt, rau cần, bí đao, táo, quýt... Nên ăn các thức ăn có tác dụng trị mất ngủ như hạt sen, nhãn, bách hợp, táo nhân, hồ đào, vừng... Tuy nhiên, chú ý các thức ăn cần phải mềm nhừ, dễ tiêu và không nên ăn gần giờ đi ngủ. Tránh ăn các thực phẩm gây kích thích như ớt, hành, hẹ, tỏi, rượu, các thức ăn chứa nhiều chất béo, xào, rán, nướng, thức ăn nhanh.\n\n" +
                    "Một số món ăn, bài thuốc theo kinh nghiệm dân gian:\n" +
                    "Bài 1: Hạt sen 15g, khiếm thực 15g, thịt lợn nạc 100g cho vào nồi nấu chín, nêm nếm gia vị vừa miệng. Có thể dùng món ăn này thường xuyên.\n" +
                    "Bài 2: Hạnh đào nhân 10g, vừng đen 10g, bầu dục lợn 60g đem nấu cháo cho chín nhừ, nêm nếm gia vị vừa dùng, ăn lúc chuẩn bị đi ngủ, liên tục từ 3 - 5 ngày.\n" +
                    "Bài 3: Ngọc trúc sâm 20g, tim lợn 100 - 200g. Tim lợn thái miếng vừa ăn, nấu chin nhừ, nêm nếm gia vị vừa miệng, ngày dùng một lần. 7 ngày là một liệu trình.\n" +
                    "Bài 4: Ngũ vị tử 9g, bá tử nhân 9g, phục thần 12g đem nấu lấy nước bỏ bã, rồi cho vào 30g mật ong, chia 2 lần dùng trong ngày. Dùng trong 5 ngày.\n" +
                    "Bài 5: Nhân sâm 4g, đương quy 16g, bạch thược 16g, ngũ vị tử 4g, táo nhân 20g, mạch môn đông 20g, bạch truật 16g, bối mẫu 6g, liên tâm 8g, lạc tiên 20g. Sắc uống trong ngày. Cách sắc như sau: Nước đầu cho các vị thuốc vào nồi đất cùng với 3 bát nước, nấu còn lại 1 bát (chắt nước ra). Nước hai tiếp tục cho 3 bát nước vào nồi, nấu còn lại ½ bát. Hòa hai nước lại, chia làm 3 lần dùng trong ngày. 10 ngày là một liệu trình.\n" +
                    "Bài 6: Thục địa 20g, sơn thù 12g, nhân sâm 6g, đương quy 16g, táo nhân 12g, bạch giới tử 12g, mạch môn đông 16g, nhục quế 2g, hoàng liên 8g. Sắc uống trong ngày. Cách sắc như bài thuốc trên. 10 ngày là một liệu trình.\n" +
                    "Bài 7: Cùi nhãn 15g, táo nhân chua 6g, đem sắc uống ngày 1 lần.\n" +
                    "Lưu ý: Khi có biểu hiện của chứng bệnh mơ khi ngủ, cần đến khám và bắt mạch kê đơn ở những cơ sở y tế chuyên khoa y học cổ truyền hoặc những lương y có kinh nghiệm để được kê đơn phù hợp với thể trạng của người bệnh."

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_ng_benh);

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
        getMenuInflater().inflate(R.menu.menu_body_ng_benh, menu);
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
