package com.example.apptonghop;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    Button listTinTucBTAX;
    List<Item> itemList;
    GridView gridViewAX;
    ItemAdapter itemAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);
        listTinTucBTAX = view.findViewById(R.id.listTinTucBT);
        listTinTucBTAX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), ListViewActivity.class);
                startActivity(intent);
            }
        });
        gridViewAX = view.findViewById(R.id.newsGV);
        itemList = new ArrayList<>();
        itemList.add(new Item(R.drawable.tongbithu,"Bộ Chính trị giới thiệu nhân sự mới làm Bộ trưởng GTVT thay ông Nguyễn Văn Thể ","20/03/2022","Phát biểu bế mạc Hội nghị T.Ư 6 khóa XIII, Tổng bí thư Nguyễn Phú Trọng cho biết, liên quan công tác nhân sự, tại hội nghị, Bộ Chính trị đã có tờ trình xin ý kiến T.Ư đối với 3 nhân sự Tổng kiểm toán Nhà nước, Bộ trưởng Y tế và Bộ trưởng GTVT trước khi giới thiệu để Quốc hội bầu, phê chuẩn tại kỳ họp thứ 4 sắp tới.\n" +
                "\n" + "Theo Tổng bí thư, việc này được thực hiện theo chủ trương của Bộ Chính trị tại Quy định số 41 ngày 3.11.2021 về việc miễn nhiệm, từ chức đối với cán bộ và Thông báo số 20 ngày 8.9.2022 về bố trí công tác đối với cán bộ sau khi bị kỷ luật.\n" +
                "\n" +
                "Cạnh đó, TƯ cũng đã xem xét và quyết định thi hành kỷ luật ông Phạm Xuân Thăng, Ủy viên T.Ư Đảng; Bí thư Tỉnh uỷ, Chủ tịch HDND tỉnh Hải Dương bằng hình thức khai trừ ra khỏi Đảng do các vi phạm nghiêm trọng về nguyên tắc tập trung dân chủ, về những điều đảng viên không được làm và trách nhiệm nêu gương của người đứng đầu cấp uỷ, gây hậu quả rất nghiêm trọng, làm thiệt hại lớn đến tài sản, ngân sách nhà nước, gây dư luận xấu, làm giảm uy tín của Đảng, chính quyền địa phương và cá nhân ông Thăng."));
        itemList.add(new Item(R.drawable.tanvietngunggiaodich,"Công ty Chứng khoán Tân Việt tạm dừng dịch vụ ứng tiền bán chứng khoán ","14/03/2022","Trước diễn biến không thuận lợi trên thị trường chứng khoán, TVSI cho biết vẫn đảm bảo sự diễn ra liên tục, bình thường và ổn định của một số hoạt động. Bao gồm, các nghiệp vụ liên quan tới giao dịch chứng khoán cơ sở tại các quầy giao dịch như mở tài khoản, lưu ký chứng khoán, giao dịch cổ phiếu/chứng chỉ quỹ, quản lý cổ đông, đấu giá, nộp/rút tiền trên tài khoản chứng khoán, giao dịch ký quỹ… Hệ thống giao dịch qua Website và App của TVSI và các nghiệp vụ được thực hiện trên các tiện ích/nền tảng này với các tính năng hiện có. Trong 6 tháng đầu năm 2022, TVSI ghi nhận 275 tỉ đồng lợi nhuận sau thuế, tăng trưởng 23% so với cùng kỳ năm trước. Theo báo cáo thường niên năm 2021, số lượng cổ phần của công ty là 263,9 triệu cổ phần, trong đó có 10 cổ đông lớn (sở hữu từ 5% trở lên) chiếm tỷ lệ 91,54%; 82 cổ đông còn lại chiếm tỷ lệ 8,46%/năm. Xét theo loại cổ đông có 4 cổ đông chiếm 38,15%, 88 cổ đông chiếm 61,85%"));
        itemList.add(new Item(R.drawable.xerollroyceghost,"Đấu giá xe Roll-Royce Ghost của ông Trịnh Văn Quyết khởi điểm 10 tỉ đồng ","14/03/2022","Bác sĩ Huỳnh Lê Thái Bão (28 tuổi, làm tại một bệnh viện công tại TP.Đà Nẵng) cho biết: \"Hiện tại một sinh viên ngành y đi học, ngoài học phí cũng chi tiền ăn ở 2-4 triệu đồng/tháng tùy vùng. Ngoài ra phải mua rất nhiều sách vở hoặc khóa học thêm trên mạng, hoặc sách điện tử bản quyền. Còn các chi phí khác khi đi bệnh viện như quần áo, vật tư, xăng xe trung bình mỗi tháng cũng phải 3-5 triệu đồng nữa. Tiền học phí thì tùy trường, có trường 70-80 triệu đồng/năm, có trường lên tới 150 đến hơn 200 triệu đồng/năm\". Tất cả những điều đó, theo bác sĩ Hoài Bão, đã gây ra tâm lý chán nản đối với nhân viên trong ngành và cái nhìn của phụ huynh, học sinh với ngành cũng không còn được tươi sáng như trước đây.\n" +
                "\n" +
                "\"Chính vì thế mới sinh ra làn sóng bác sĩ ở bệnh viện công chuyển qua bệnh viện tư làm hoặc nhân viên y tế nghỉ việc để chuyển sang ngành khác. \"Nhất y, nhì dược\" hiện tại không còn đúng nữa. Những người học ngành y giờ đây cần một mức lương ổn định, cần môi trường làm việc an toàn, không bị bạo hành và cần được tôn trọng\", bác sĩ Bão nhìn nhận."));

        itemList.add(new Item(R.drawable.sinhviennganhy,"Sinh viên ngành y học tốn tiền tỉ, ra trường lãnh lương vài triệu đồng/tháng ","20/10/2022","Theo giấy chứng nhận đăng ký xe ô tô số 474115 do Phòng cảnh sát giao thông - Công an TP.Hà Nội cấp ngày 26.5.2018 đứng tên Công ty CP Đầu tư Du thuyền và Sân Golf FLC Biscom (nay là Công ty CP Đầu tư kinh doanh phát triển bất động sản FLCHomes). Xe màu đỏ, số loại Ghost, dung tích 6592 cm3 , 5 chỗ ngồi. Đăng ký lần đầu ngày 24.5.2018, sản xuất tại Anh năm 2011. Tài sản đang thế chấp tại Ngân hàng TMCP Đầu tư và phát triển Việt Nam - chi nhánh Quy Nhơn. Xe đã qua sử dụng được đưa ra đấu giá để xử lý thu hồi nợ. Tài sản được đấu giá theo nguyên trạng, bao gồm tài sản, tình trạng pháp lý và các rủi ro tiềm ẩn và theo phương thức có sao bán vậy. Người tham gia đấu giá tài sản có trách nhiệm xem xét, tìm hiểu hồ sơ tài sản đấu giá và tự xác định tình trạng của tài sản theo hiện trạng thực tế và các hồ sơ pháp lý được Ngân hàng TMCP Đầu tư và phát triển Việt Nam - chi nhánh Quy Nhơn cung cấp."));
        itemAdapter = new ItemAdapter(getContext(),R.layout.activity_item_gridview,itemList);
        gridViewAX.setAdapter(itemAdapter);
        gridViewAX.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getContext(), DetailActivity.class);
                intent.putExtra("Item", itemList.get(i));
                startActivity(intent);
            }
        });
        return view;
    }
}
