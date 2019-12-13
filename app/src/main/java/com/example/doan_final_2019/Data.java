package com.example.doan_final_2019;

import android.widget.Toast;

import com.example.doan_final_2019.models.DanhMuc;
import com.example.doan_final_2019.models.NhanVien;
import com.example.doan_final_2019.models.SanPham;

import java.util.ArrayList;
import java.util.Date;

public class Data {

    public void DataSanPham(ArrayList<SanPham> sp) {
//     month start 0>11
        sp.add(new SanPham(1, "Nước tăng lực Coca Cola cà phê", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2443/156095/bhx/nuoc-tang-luc-coca-cola-vi-ca-phe-chai-390ml-10112018212359.jpg", "Thức Uống"), 100, 6500,
                "Nước ngọt Coca Cola cà phê là sự kết hợp độc đáo giữa hương vị coca cola truyền thống với vị cà phê đậm đặc tạo nên hương thơm độc đáo, mới lạ cho người thưởng thức.\nSản phẩm phù hợp cho giới văn phòng, giúp đánh thức khả năng tập trung lúc giữa giờ sáng hay sau giờ nghỉ trưa, khơi dậy tinh thần học tập, làm việc hứng khởi\nSản phẩm giúp cung cấp năng lượng trong một ngày dài hoạt động.", "https://cdn.tgdd.vn/Products/Images/2443/156095/bhx/nuoc-tang-luc-coca-cola-vi-ca-phe-chai-390ml-10112018212359.jpg", 3.0f, new Date(2019, 12, 13, 8, 0)));
        sp.add(new SanPham(2, "6 chai nước ngọt Coca Cola", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2443/200548/bhx/6-lon-nuoc-ngot-coca-cola-zero-330ml-201909101542269737_300x300.jpg", "Thức Uống"), 100, 31000,
                "Thành phần: Nước bão hòa CO2, đường HFCS, đường mía, màu thực phẩm, chất điều chỉnh độ acid, hương cola tự nhiên, caffeine.\nHướng dẫn sử dụng: Uống trực tiếp, ngon hơn khi uống lạnh.\nBảo quản: Bảo quản nơi khô ráo, thoáng mát, tránh ánh nắng trực tiếp.", "https://cdn.tgdd.vn/Products/Images/2443/88651/bhx/6-chai-nuoc-ngot-coca-cola-390ml-201912091415520255_300x300.jpg", 5.0f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(3, "Nước ngọt Coca Cola Plus", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2443/200548/bhx/6-lon-nuoc-ngot-coca-cola-zero-330ml-201909101542269737_300x300.jpg", "Thức Uống"), 50, 12000,
                "Sản xuất: tại Việt Nam\nĐặc tính nổi bật: Không đường, thêm chất xơ, hạn chế hấp thu chất béo\nThể tích: 330ml\nLượng đường: Không đường\nThành phần: Nước bão hoà CO2, chất xơ (11.3g/L), màu tự nhiên (caramen nhóm IV), chất điều chỉnh độ acid (E338, E331iii), chất tạo ngọt tổng hợp, chất bảo quản E211, hỗ hợp hương tự nhiên, Caffeine (95.8mg/L)", "https://cdn.tgdd.vn/Products/Images/2443/203041/bhx/nuoc-ngot-coca-cola-plus-330ml-201905291337036766_300x300.jpg", 1.0f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(4, "Nước ngọt Coca Cola", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2443/200548/bhx/6-lon-nuoc-ngot-coca-cola-zero-330ml-201909101542269737_300x300.jpg", "Thức Uống"), 10, 8000,
                "Đắt hàng", "https://cdn.tgdd.vn/Products/Images/2443/83757/bhx/nuoc-ngot-coca-cola-250ml-201912021100377731.jpg", 1.0f, new Date(2019, 4, 1, 22, 0)));
        sp.add(new SanPham(5, "6 lon bia Beck's", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2443/200548/bhx/6-lon-nuoc-ngot-coca-cola-zero-330ml-201909101542269737_300x300.jpg", "Thức Uống"), 3, 85000,
                "Thành phần: Nước bão hòa CO2, siro bắp với fluctose cao, màu thực phẩm, chất điều chỉnh độ acid, hương tự nhiên, caffeine.\nHướng dẫn sử dụng: Dùng uống trực tiếp, ngon hơn khi uống lạnh.\nBảo quản: Để nơi khô ráo, thoáng mát, tránh ánh nắng trực tiếp.", "https://cdn.tgdd.vn/Products/Images/2282/197864/bhx/6-lon-bia-becks-500ml-201903250941469532.jpg", 1.0f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(4, "Thùng 24 lon nước ngọt Coca Cola Plus", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2443/200548/bhx/6-lon-nuoc-ngot-coca-cola-zero-330ml-201909101542269737_300x300.jpg", "Thức Uống"), 0, 260000, "Coca Cola Plus được chứng nhận FOSHU với tác dụng hạn chế hấp thu chất béo từ bữa ăn nhờ bổ sung chất xơ dinh dưỡng, giúp người dùng tận hưởng niềm vui ăn uống mà không lo bị tăng cân.", "https://cdn.tgdd.vn/Products/Images/2443/204223/bhx/thung-24-lon-nuoc-ngot-coca-cola-plus-330ml-201906241238263991.jpg", 1.0f, new Date(2019, 13, 12, 22, 0)));


        //bánh kẹo
        sp.add(new SanPham(6, "Snack rong biển vị truyền thống Seleco Nori", new DanhMuc("https://cdn.tgdd.vn/Products/Images/3364/79812/bhx/snack-khoai-tay-vi-tao-bien-ostar-goi-48g-201905071310201458_300x300.jpg", "Bánh kẹo"), 10, 10000,
                "Khối lượng: 12g\nNăng lượng: 643kcal/100g\nThành phần: Dầu cọ, rong biển, gia vị truyền thống (muối, đường, dầu đậu nành, dextrose monohydrate, maltodextrin, E341, E551, tiêu đen, bột ớt, bột đậu nành, protein đậu nành thuỷ phân, tiêu trắng, kem béo thực vật, bột xì dầu)\nBảo quản: Bảo quản nơi khô mát, tránh ánh nắng trực tiếp và nhiệt độ cao", "https://cdn.tgdd.vn/Products/Images/3364/210355/bhx/snack-rong-bien-vi-truyen-thong-seleco-nori-goi-12g-201909071354091617.JPG", 4.5f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(7, "Snack khoai tây vị tảo biển O'Star", new DanhMuc("https://cdn.tgdd.vn/Products/Images/3364/79812/bhx/snack-khoai-tay-vi-tao-bien-ostar-goi-48g-201905071310201458_300x300.jpg", "Bánh kẹo"), 10, 10500,
                "Khối lượng: 48g\nNăng lượng: 570kcal/100g\nThành phần: Khoai tây tươi, dầu thực vật, bột gia vị tảo biển 5% (đường, maltodextrin, muối, bột sữa, chất điều vị mononatri glutamat (E621), bột hành, bột tỏi, tảo biển), dầu chiết xuất từ cây hương thảo\nBảo quản: Bảo quản nơi khô mát, tránh ánh nắng trực tiếp và nhiệt độ cao", "https://cdn.tgdd.vn/Products/Images/3364/79812/bhx/snack-khoai-tay-vi-tao-bien-ostar-goi-48g-201905071313572535.jpg", 5.0f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(8, "Snack khoai tây vị tự nhiên Slide", new DanhMuc("https://cdn.tgdd.vn/Products/Images/3364/79812/bhx/snack-khoai-tay-vi-tao-bien-ostar-goi-48g-201905071310201458_300x300.jpg", "Bánh kẹo"), 0, 43500,
                "Khối lượng: 160g\nNăng lượng: 257kcal/50g\nThành phần: Khoai tây (70%), dầu thực vật (dầu cọ), tinh bột khoai tây, glucose, muối, đường, chất điều vị (monosodium glutamate (E621))\nBảo quản: Bảo quản nơi khô ráo, thoáng mát, tránh ánh nắng trực tiếp\n", "https://cdn.tgdd.vn/Products/Images/3364/79566/bhx/snack-khoai-tay-vi-tu-nhien-slide-lon-160g-201912050043319427.jpg", 2.0f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(9, "Snack khoai tây vị thơm cay Slide", new DanhMuc("https://cdn.tgdd.vn/Products/Images/3364/79812/bhx/snack-khoai-tay-vi-tao-bien-ostar-goi-48g-201905071310201458_300x300.jpg", "Bánh kẹo"), 43, 43500,
                "Khối lượng: 160g\nNăng lượng: 248kcal/50g\nThành phần: Khoai tây (65%), dầu thực vật (dầu cọ), tinh bột khoai tây, glucose, muối, đường, chất điều vị (monosodium glutamate (E621)), bột gia vị thơm cay\nBảo quản: Bảo quản nơi khô ráo, thoáng mát, tránh ánh nắng trực tiếp", "https://cdn.tgdd.vn/Products/Images/3364/79571/bhx/snack-khoai-tay-vi-thom-cay-slide-goi-160g-201912050036302069.jpg", 4.0f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(10, "Snack khoai tây vị kem chua và hành Slide", new DanhMuc("https://cdn.tgdd.vn/Products/Images/3364/79812/bhx/snack-khoai-tay-vi-tao-bien-ostar-goi-48g-201905071310201458_300x300.jpg", "Bánh kẹo"), 9, 43500,
                "Khối lượng: 160g\nNăng lượng: 499kcal/100g\nThành phần: Vẩy khoai tây (71%), bột gia vị hành chua, tinh bột khoai tây, tinh bột khoai mì, đường, chất nhũ hóa (471), tinh bột bắp, chất điều vị (621), muối, mùi tây\nBảo quản Bảo quản nơi khô ráo, thoáng mát, tránh ánh nắng trực tiếp", "https://cdn.tgdd.vn/Products/Images/3364/77414/bhx/snack-khoai-tay-vi-kem-chua-va-hanh-slide-lon-160g-201912051038104328.jpg", 4.2f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(11, "Snack Doritos vị Smokin' BBQ", new DanhMuc("https://cdn.tgdd.vn/Products/Images/3364/79812/bhx/snack-khoai-tay-vi-tao-bien-ostar-goi-48g-201905071310201458_300x300.jpg", "Bánh kẹo"), 34, 30000,
                "Khối lượng: 65g\nNăng lượng: 165 kcal/32.5g\nThành phần: Bắp, dầu thực vật, bột gia vị Smokin BBQ, mật đường, bột cà chua, bột tỏi, bột hành, gia vị, hương liệu, chất chống đông vón, chất điều chỉnh vị chua, màu tự nhiên\nBảo quản Bảo quản nơi khô ráo, thoáng mát, tránh ánh nắng trực tiếp", "https://cdn.tgdd.vn/Products/Images/3364/193777/bhx/snack-doritos-vi-smokin-bbq-goi-65g-201912031529204733.jpg", 5.0f, new Date(2019, 12, 13, 22, 0)));

        //mì tôm
        sp.add(new SanPham(12, "Mì 3 Miền tôm chua cay gói", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2565/77627/bhx/mi-tron-khoai-tay-omachi-xot-spaghetti-goi-91g-201904231421479591_300x300.jpg", "Mì tôm"), 100, 2000,
                "Loại mì: Mì nước\nVị mì: Tôm chua cay\nSợi mì: Sợi tròn, nhỏ\nKhối lượng: 65g\nThành phần VẮT MÌ - Bột mì (75,0%), shortening, phẩm màu (curcumin (E100(i)).\n" + "GÓI GIA VỊ - Bột tôm (30 g/kg), dầu cọ, muối, đường, bột tỏi, bột ớt, hành lá sấy, chất điều chỉnh độ acid (citric acid (E330)), chất điều vị (monosodium L-glutamate (E621), disodium 5'-inosinate (E631), disodium 5'-guanylate (E627)).", "https://cdn.tgdd.vn/Products/Images/2565/77669/bhx/mi-3-mien-tom-chua-cay-goi-65g-201912091503351328.jpg", 3.0f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(13, "Mì khoai tây Cung Đình thịt hầm nấm gói", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2565/77627/bhx/mi-tron-khoai-tay-omachi-xot-spaghetti-goi-91g-201904231421479591_300x300.jpg", "Mì tôm"), 100, 5700,
                "Loại mì: Mì khoai tây\nVị mì: Thịt hầm nấm\nSợi mì: Sợi mì khoai tây, tròn và nhỏ\nKhối lượng 80g", "https://cdn.tgdd.vn/Products/Images/2565/88873/bhx/mi-khoai-tay-cung-dinh-thit-ham-nam-goi-80g-201912081041270053.JPG", 3.5f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(14, "Mì Cung Đình Kool xốt Spaghetti thịt bò bằm tô", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2565/77627/bhx/mi-tron-khoai-tay-omachi-xot-spaghetti-goi-91g-201904231421479591_300x300.jpg", "Mì tôm"), 12, 10900,
                "Loại mì: Mì trộn\nVị mì: Xốt spaghetti\nSợi mì: Sợi tròn, nhỏ\nKhối lượng: 105g\n", "https://cdn.tgdd.vn/Products/Images/2565/86100/bhx/mi-cung-dinh-kool-spaghetti-xot-bo-bam-105g-12hop-2-org.jpg", 2.1f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(15, "Mì khoai tây Cung Đình cua bể rau răm ly", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2565/77627/bhx/mi-tron-khoai-tay-omachi-xot-spaghetti-goi-91g-201904231421479591_300x300.jpg", "Mì tôm"), 422, 6700,
                "Loại mì: Mì khoai tây\nVị mì: Cua bể rau răm\nSợi mì: Sợi mì khoai tây, tròn và nhỏ\nKhối lượng 65g\nKhối lượng 65g\nThành phần: MÌ - Bột mì, dầu shortening, nước, tinh bột khoai mì, tinh bột khoai tây (10 g/kg), muối I-ốt, chất điều vị (621, 631, 627), chiết xuất nấm men, bột trứng gà (1 g/kg), chất làm dầy (412, 466), chất tạo xốp (500ii, 451i, 452i), phẩm màu tự nhiên (100i), chất chống oxy hoá (320).\n" + "XỐT - Nước, dầu cọ tinh luyện, muối I-ốt, đường, chất điều vị (621, 631, 627), củ quả (cà chua, cà rốt, hành tây, su hào, củ cải) (20 g/kg), hành tươi, tỏi tươi, nước tương, nước mắm, chất điều chỉnh độ acid (296), hỗn hợp gia vị (bột hành, bột tỏi, bột tiêu, bột ớt), chiết xuất nấm men, nước cốt xương hầm (0.25 g/kg), bột thịt cua (0,1 g/kg), hương cua tổng hợp dùng cho thực phẩm, chất bảo quản (202), chất chống oxy hoá (320).\n" + "RAU - Hành sấy, cà rốt sấy, hành tây sấy, rau răm sấy (0.05 g/kg).", "https://cdn.tgdd.vn/Products/Images/2565/80180/bhx/mi-khoai-tay-cung-dinh-cua-be-rau-ram-ly-65g-201912101012047855.jpg", 2.0f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(16, "Thùng 40 gói mì xào khô Indomie Mi Goreng", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2565/77627/bhx/mi-tron-khoai-tay-omachi-xot-spaghetti-goi-91g-201904231421479591_300x300.jpg", "Mì tôm"), 321, 180000,
                "Loại mì: Mì xào khô\nVị mì: Cay nồng\nSợi mì: Sợi tròn, nhỏ\nKhối lượng: 85g / gói\nThành phần: VẮT MÌ - Bột mì, dầu thực vật tinh luyện, tinh bột sắn, muối, chất điều vị (E621), chất tạo vị chua (E500, E501), khoáng chất sắt, chất chống oxy hoá (TBHQ - E319), màu thực phẩm (CI 19140 - E102).\n" + "BỘT GIA VỊ - Muối, đường, chất tăng hương vị - bột ngọt (MSG - E621), tỏi, hành tây, hương vị gà nhân tạo (chứa chất điều vị E621, E631, E627), tiêu, vitamin (A, B1, B6, B12, Niacin, acid folic, acid pantohenic).\n" + "DẦU GIA VỊ - Dầu thực vật tinh luyện, hành tím.\n" + "NƯỚC SỐT - Đường, nước, đậu tương, bột lúa mạch, muối, gia vị và hương liệu gà nhân tạo, dầu mè.\n" + "SỐT ỚT - Ớt, nước, đường, muối, chất điều vị (E621), gia vị, chất tăng hương vị (bột ngọt, chất tăng hương vị E621, E631, E627), hương liệu gà nhân tạo, chất bảo quản (E211, sodium metabisulfite) Lá hành phi (chứa chất chống oxy hoá TBHQ - E319)", "https://cdn.tgdd.vn/Products/Images/2565/175909/bhx/thung-40-goi-mi-xao-kho-indomie-mi-goreng-85g-201912040953569441.jpg", 4.8f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(17, "Thùng 24 ly mì Handy Hảo Hảo tôm chua cay", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2565/77627/bhx/mi-tron-khoai-tay-omachi-xot-spaghetti-goi-91g-201904231421479591_300x300.jpg", "Mì tôm"), 31, 180000,
                "Loại mì: Mì nước\nVị mì: Tôm chua cay\nSợi mì: Sợi tròn, nhỏ\nKhối lượng: 67g / ly\nThành phần: VẮT MÌ - Bột mì, shortening (dầu cọ, chất chống oxy hoá (BHA (320), BHT (321))), tinh bột, muối, đường, dịch chiết xuất từ cá, chất điều vị (mononatri glutamat (621)), chất ổn định (pentanatri triphosphat (451(i)), kali carbonat (501 (i))), chất nhũ hoá (natri cacboxymethyl cellulose (466)), chất điều chỉnh độ acid (natri carbonat (500(i))), các gia vị, phẩm màu (curcumin (100(i))).\n" + "CÁC GÓI GIA VỊ - Dầu tinh luyện (dầu cọ, chất chống oxy hoá (BHA (320), BHT (321))), đường, muối, tôm viên sấy (trứng, đậu nành, sò điệp, phẩm màu (paprika oleoresin (160c)) và bột tôm (22,5 g/kg), chất điều vị (mononatri glutamat (621), dinatri 5'-inosinat (631), dinatri 5'-guanylat (627)), các gia vị, hành lá sấy, chất điều chỉnh độ acid (acid citric (330)), bạc hà sấy, dịch chiết xuất từ cá, phẩm màu (paprika oleoresin (160c), curcumin (100(i))), chất tạo ngọt (aspartam (951)).", "https://cdn.tgdd.vn/Products/Images/2565/175906/bhx/thung-24-ly-mi-handy-hao-hao-tom-chua-cay-67g-201912051406241113.jpg", 5.5f, new Date(2019, 12, 13, 22, 0)));

        //dầu gội dầu xả
        sp.add(new SanPham(18, "Dầu gội siêu cấp ẩm Tsubaki", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2483/207860/bhx/dau-goi-head-shoulders-huong-chanh-tuoi-mat-850ml-201908051345531195_300x300.JPG", "Dầu gội, dầu xả"), 58, 125000,
                "Sản xuất tại Nhật Bản\nCông dụng Bổ sung dưỡng chất và cấp ẩm, dưỡng tóc mềm mượt, óng ả\nThành phần: Hợp chất hoa trà lên men, chiết xuất tinh dầu hoa trà Nhật Bản\nMùi hương: Quyến rũ với hoa trà, mật ong, trái cây\nDung tích 500ml", "https://cdn.tgdd.vn/Products/Images/2483/197468/bhx/dau-goi-tsubaki-sieu-cap-am-450ml-201812201559552150.JPG", 5.0f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(19, "Dầu gội ngăn gãy rụng L'Oréal Elseve", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2483/207860/bhx/dau-goi-head-shoulders-huong-chanh-tuoi-mat-850ml-201908051345531195_300x300.JPG", "Dầu gội, dầu xả"), 119, 105000,
                "Thương hiệu: L'Oréal (Pháp)\nSản xuất: tại Indonesia\nCông dụng Ngăn gãy rụng tóc\nMùi hương Thơm dịu nhẹ\nDung tích: 650ml\n", "https://cdn.tgdd.vn/Products/Images/2483/174286/bhx/dau-goi-cham-soc-toc-gay-rung-loreal-fall-repair-3x-65ml-2-org.jpg", 4.5f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(20, "Dầu gội Fresh Organic giữ màu tóc nhuộm", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2483/207860/bhx/dau-goi-head-shoulders-huong-chanh-tuoi-mat-850ml-201908051345531195_300x300.JPG", "Dầu gội, dầu xả"), 234, 88000,
                "Thương hiệu: Fresh (Việt Nam)\nCông dụng: Dưỡng tóc óng mượt, giúp tóc nhuộm giữ màu và tăng cường độ sáng bóng cho sợi tóc\nThành phần: Có thành phần: quả mâm xôi đỏ, dầu hạt chia, chiết xuất hạt diêm mạch đem đến nguồn dưỡng chất giàu amino acids - thẩm thấu vào lớp biểu bì tóc cùng với phức hợp các loại vitamin B, D, E và các khoáng Cu, Zn, Fe tạo lớp thành bảo vệ sợi tóc khỏi những tác động xấu từ môi trường\nMùi hương Thơm dịu nhẹ\nPhù hợp với Tóc nhuộm và highlight\nKhối lượng 500g\nƯu điểm Không Paraben - chất bảo quản có thể gây kích ứng cho những người da nhạy cảm, dễ bị dị ứng. Không màu nhân tạo. Không silicone - nhân tố tạo bọt, giúp tóc suôn mượt nhưng dễ gây kích ứng da đầu, khiến tóc yếu và dễ gãy rụng\n", "https://cdn.tgdd.vn/Products/Images/2483/214381/bhx/dau-goi-fresh-organic-giu-mau-toc-nhuom-500g-201911081002098203.JPG", 4.7f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(21, "Dầu gội Head & Shoulders bạc hà", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2483/207860/bhx/dau-goi-head-shoulders-huong-chanh-tuoi-mat-850ml-201908051345531195_300x300.JPG", "Dầu gội, dầu xả"), 321, 160000,
                "Thương hiệu: Head & Shoulders (Mỹ)\nSản xuất: tại Thái Lan\nCông dụng Công thức chứa bạc hà giúp gội sạch, làm mát lạnh tóc và da đầu cho bạn cảm giác mát lạnh thật sảng khoái. Sạch gàu và ngăn gàu quay trở lại. Loại bỏ và ngăn ngừa những vảy gàu nhìn thấy được khi sử dụng thường xuyên\nMùi hương: Bạc hà\nDung tích: 850ml", "https://cdn.tgdd.vn/Products/Images/2483/96097/bhx/dau-goi-h-s-bac-ha-mat-lanh-chai-950g-99-org.jpg", 5.0f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(22, "Dầu gội nước hoa Elastine Love Me", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2483/207860/bhx/dau-goi-head-shoulders-huong-chanh-tuoi-mat-850ml-201908051345531195_300x300.JPG", "Dầu gội, dầu xả"), 192, 10000,
                "Thương hiệu: Elastine (Hàn Quốc)\nCông dụng: Óng mượt chắc khỏe\nMùi hương Hoa cỏ và trái cây\nDung tích 600ml\n", "https://cdn.tgdd.vn/Products/Images/2483/155839/bhx/dau-goi-nuoc-hoa-elastine-love-me-600ml-2-org.jpg", 4.5f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(23, "Dầu xả Pantene dưỡng mềm mượt", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2483/207860/bhx/dau-goi-head-shoulders-huong-chanh-tuoi-mat-850ml-201908051345531195_300x300.JPG", "Dầu gội, dầu xả"), 179, 139000,
                "Thương hiệu: Pantene (Mỹ)\nSản xuất: tại Thái Lan\nCông dụng Tăng cường độ ẩm cho tóc, làm tóc suôn mượt, bóng khỏe\nMùi hương Thơm dịu nhẹ\nThành phần: Pro-vitamin\nKhối lượng 400g\n", "https://cdn.tgdd.vn/Products/Images/2484/193348/bhx/dau-xa-pantene-duong-mem-muot-nhat-ban-400g-2-org.jpg", 3.6f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(24, "Dầu xả phục hồi Organic Care Dry Nourish", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2483/207860/bhx/dau-goi-head-shoulders-huong-chanh-tuoi-mat-850ml-201908051345531195_300x300.JPG", "Dầu gội, dầu xả"), 0, 143000,
                "Thương hiệu: Organic Care (Úc)\nCông dụng: Dưỡng ẩm sâu, giảm xơ rối, chăm sóc chuyên sâu và tăng độ mịn mượt cho tóc\nThành phần: Dưỡng chất chiết xuất tự nhiên từ các loại cây và hoa hữu cơ như lô hội, hoa cúc, nhân sâm, Vitamin, Protein lúa mạch\nMùi hương: Thơm dịu nhẹ\nDung tích: 400ml", "https://cdn.tgdd.vn/Products/Images/2484/194757/bhx/dau-xa-duong-phuc-hoi-toc-hu-ton-organic-care-400ml-2-org.jpg", 4.0f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(25, "Dầu xả Herbal Essences tinh dầu Moroccan Argan", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2483/207860/bhx/dau-goi-head-shoulders-huong-chanh-tuoi-mat-850ml-201908051345531195_300x300.JPG", "Dầu gội, dầu xả"), 73, 175000,
                "Thương hiệu: Herbal Essences (Mỹ)\nSản xuất: tại Thái Lan\nCông dụng Mềm mượt, chắc khỏe\nMùi hương Thơm dịu nhẹ\nThành phần: Có chiết xuất tinh Dầu Moroccan Argan\nDung tích 400ml\n", "https://cdn.tgdd.vn/Products/Images/2484/194654/bhx/dau-xa-herbal-essences-tinh-dau-moroccan-argan-400-2-org.jpg", 5.0f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(26, "Dầu gội ngăn rụng tóc Tsubaki", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2483/207860/bhx/dau-goi-head-shoulders-huong-chanh-tuoi-mat-850ml-201908051345531195_300x300.JPG", "Dầu gội, dầu xả"), 19, 10000,
                "Thương hiệu: Tsubaki (Nhật Bản)\n" + "Công dụng: Ngăn rụng tóc, dưỡng tóc bồng bềnh, mềm mượt chắc khoẻ, cải thiện lão hoá\n" + "Thành phần: Bổ sung Collagen, Clycerin, hợp chất hoa trà lên men, chiết xuất tinh dầu hoa trà Nhật Bản\nMùi hương: Hoa cỏ và trái cây\nDung tích: 500ml", "https://cdn.tgdd.vn/Products/Images/2483/197465/bhx/dau-goi-tsubaki-ngan-rung-toc-450ml-201812201555358342.JPG", 3.0f, new Date(2019, 12, 13, 22, 0)));

        //dầu ăn
        sp.add(new SanPham(27, "Dầu hướng dương Tường An", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2286/79823/bhx/dau-an-cao-cap-neptune-binh-5-lit-201903181038012103_300x300.jpg", "Dầu ăn"), 100, 39000, "Loại dầu Dầu hướng dương\nDung tích 750ml\nThành phần 100% dầu hướng dương nguyên chất tinh luyện.\nƯu điểm Thích hợp để chế biến thực phẩm ở nhiệt độ cao, kéo dài. Bổ sung năng lượng và vitamin E tự nhiên tốt cho cơ thể.\nThích hợp Dùng để chiên, xào, làm bánh, trộn salad, làm nước xốt, thích hợp cho người ăn chay.\n", "https://cdn.tgdd.vn/Products/Images/2286/202535/bhx/dau-huong-duong-tuong-an-chai-750ml-201905061020457484.jpg", 5.0f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(28, "Dầu dừa tinh luyện Vietcoco chai 1 lít\n", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2286/79823/bhx/dau-an-cao-cap-neptune-binh-5-lit-201903181038012103_300x300.jpg", "Dầu ăn"), 0, 41000, "Loại dầu Dầu dừa tinh luyện\nDung tích 1 lít\nƯu điểm Không sử dụng chất tạo màu. Không cholesterol.\n", "https://cdn.tgdd.vn/Products/Images/2286/211285/bhx/dau-dua-vietcoco-tinh-luyen-chai-1-lit-201909201450347026.jpg", 2.0f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(29, "Dầu đậu nành nguyên chất Simply", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2286/79823/bhx/dau-an-cao-cap-neptune-binh-5-lit-201903181038012103_300x300.jpg", "Dầu ăn"), 12, 230000, "Loại dầu Dầu đậu nành\nDung tích 5 lít\nThành phần 100% dầu đậu nành nguyên chất tinh luyện\nThích hợp Chiên, xào, trộn salad, làm sốt\n", "https://cdn.tgdd.vn/Products/Images/2286/82902/bhx/dau-an-simply-dau-nanh-5l-2-org.jpg", 4.0f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(30, "Dầu olive Extra Virgin Naturel", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2286/79823/bhx/dau-an-cao-cap-neptune-binh-5-lit-201903181038012103_300x300.jpg", "Dầu ăn"), 18, 180000, "Dung tích 500ml\nThành phần 100% dầu ô liu tinh khiết\nThích hợp Chiên, xào, làm bánh, trộn salad, làm nước sốt, mayonnaise\nBảo quản Nơi thoáng mát, nên dùng trong 1 tháng sau khi mở nắp\n", "https://cdn.tgdd.vn/Products/Images/2286/198809/bhx/dau-olive-naturel-extra-virgin-500ml-201901231611159819.JPG", 4.0f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(31, "Dầu ăn thượng hạng Gold Plus Sailing Boat", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2286/79823/bhx/dau-an-cao-cap-neptune-binh-5-lit-201903181038012103_300x300.jpg", "Dầu ăn"), 4, 168000, "Dung tích 5 lít\nThành phần Dầu đậu nành, dầu gạo, dầu hướng dương, dầu olein tinh luyện và vitamin A\nThích hợp Trộn salad, nước xốt, dùng chiên xào, làm bánh, món chay\nBảo quản Nơi thoáng mát, nên dùng trong 1 tháng sau khi mở nắp\n", "https://cdn.tgdd.vn/Products/Images/2286/198829/bhx/dau-an-thuong-hang-sailing-boat-gold-plus-5-lit-201901240944551615.JPG", 5.0f, new Date(2019, 12, 13, 22, 0)));

        //nước mắm
        sp.add(new SanPham(32, "2 chai Nước mắm Liên Thành nhãn vàng", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2289/188803/bhx/nuoc-mam-nam-ngu-10-do-dam-binh-1-95-lit-201903141509510739_300x300.jpg", "Nước mắm"), 19, 50000, "Dung tích 300ml\nThành phần Cá cơm Phú Quốc 95%, muối, nước, đường, chất điều vị, chất điều chỉnh độ acid, chất làm dày, phẩm màu, hương nước mắm tổng hợp, chất bảo quản\nBảo quản Nơi khô ráo, thoáng mát, tránh ánh nắng trực tiếp, đậy kín sau khi sử dụng\n", "https://cdn.tgdd.vn/Products/Images/2289/207532/bhx/combo-2-chai-nuoc-mam-lien-thanh-nhan-vang-300ml-201907171142535478.jpg", 5.0f, new Date(2019, 4, 1, 22, 0)));
        sp.add(new SanPham(33, "Nước mắm truyền thống Liên Thành 20 độ đạm", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2289/188803/bhx/nuoc-mam-nam-ngu-10-do-dam-binh-1-95-lit-201903141509510739_300x300.jpg", "Nước mắm"), 32, 10000, "Độ đạm 20 độ đạm\nDung tích 4 lít\nThành phần Cá cơm 95%, nước, muối, đường, chất điều vị, màu tự nhiên\nBảo quản Nơi khô ráo, thoáng mát, tránh ánh nắng trực tiếp, đậy kín sau khi sử dụng\n", "https://cdn.tgdd.vn/Products/Images/2289/82783/bhx/nuoc-mam-lien-thanh-4l-2-org.jpg", 5.0f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(34, "Nước mắm cá cơm Hồng Hạnh 20 độ đạm", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2289/188803/bhx/nuoc-mam-nam-ngu-10-do-dam-binh-1-95-lit-201903141509510739_300x300.jpg", "Nước mắm"), 21, 149000, "Độ đạm 20 độ đạm\nDung tích 5 lít\nThành phần Cá cơm than 70%, muối\nBảo quản Nơi khô ráo, thoáng mát, tránh ánh nắng trực tiếp, đậy kín sau khi sử dụng\n", "https://cdn.tgdd.vn/Products/Images/2289/91331/bhx/nuoc-mam-hong-hanh-cao-dam-20n-1l-2-org.jpg", 4.0f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(35, "Nước mắm Nam Ngư 10 độ đạm", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2289/188803/bhx/nuoc-mam-nam-ngu-10-do-dam-binh-1-95-lit-201903141509510739_300x300.jpg", "Nước mắm"), 3, 91000, "Độ đạm 10 độ đạm\nDung tích 1,95 lít\nThành phần Nước mắm cốt cá cơm, đường, nước muối, chất điều vị, chất điều chỉnh độ acid, hương cá hồi tổng hợp, chất ổn định, màu thực phẩm, chất tạo ngọt tổng hợp, chất bảo quản\nBảo quản Nơi khô ráo, thoáng mát, tránh ánh nắng trực tiếp, đậy kín sau khi sử dụng", "https://cdn.tgdd.vn/Products/Images/2289/188803/bhx/nam-ngu-binh-195lit-2-org.jpg", 4.0f, new Date(2019, 12, 13, 22, 0)));

        //bột giặt
        sp.add(new SanPham(36, "Nước giặt NET Matic", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2463/76139/bhx/bot-giat-tide-trang-dot-pha-41kg-201910221534513664_300x300.jpg", "Nước giặt, bột giặt"), 5, 75000, "Thương hiệu NET (Việt Nam)\nSản xuất tại Việt Nam\nCông dụng Xoáy sâu vào từng vết bẩn, giúp quần áo trắng sạch và thơm mát\nMùi hương Thơm dịu nhẹ\nDành cho Người lớn\nSử dụng Giặt tay, giặt máy cửa trên", "https://cdn.tgdd.vn/Products/Images/2464/111626/bhx/nuoc-giat-net-matic-chai-may-giat-cua-tren-27kg-2-org.jpg", 5.0f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(37, "Nước giặt Kolortex", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2463/76139/bhx/bot-giat-tide-trang-dot-pha-41kg-201910221534513664_300x300.jpg", "Nước giặt, bột giặt"), 44, 79000, "Thương hiệu Kolortex (Việt Nam)\nSản xuất tại Việt Nam\nCông dụng Chống lem màu khi giặt chung với quần áo khác. Dễ dàng hòa tan trong nước, thấm sâu vào từng sợi vải lốc bay mọi vết bẩn cứng đầu nhất ngay lần giặt đầu tiên mà không ảnh hưởng đến sắc màu trên vải. Ngăn cho các vết bẩn tái bám cho quần áo luôn thơm mát, rạng rỡ, bền, lâu đến không ngờ\nThành phần Fatty Alcohol Ethoxylate, Sodium Laurenth sulfate, chất thơm, nước\nMùi hương Thơm dịu nhẹ\nSử dụng Giặt tay, giặt máy cửa trên, giặt máy cửa trước\nKhối lượng 2.8 lít\n", "https://cdn.tgdd.vn/Products/Images/2464/128118/bhx/nuoc-giat-kolortex-chong-lem-mau-chai-28l-201906241536496824.jpg", 5.0f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(38, "Bột giặt NET Extra", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2463/76139/bhx/bot-giat-tide-trang-dot-pha-41kg-201910221534513664_300x300.jpg", "Nước giặt, bột giặt"), 29, 119000, "Thương hiệu NET (Việt Nam)\nCông dụng Giặt sạch cho quần áo trắng sáng. Lưu lại hương thơm bền lâu trên áo quần\nMùi hương Hương hoa\nSử dụng cho Giặt tay, giặt máy cửa trên\nKhối lượng 6kg", "https://cdn.tgdd.vn/Products/Images/2463/76108/bhx/bot-giat-net-extra-hoa-thien-nhien-6kg-201910230951003977.JPG", 5.0f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(39, "Bột giặt NET hương hoa sứ", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2463/76139/bhx/bot-giat-tide-trang-dot-pha-41kg-201910221534513664_300x300.jpg", "Nước giặt, bột giặt"), 12, 119000, "Thương hiệu NET (Việt Nam)\nCông dụng Giặt sạch cho quần áo trắng sáng. Lưu lại hương thơm bền lâu trên áo quần\nMùi hương Hương hoa\nSử dụng cho Giặt tay, giặt máy cửa trên\nKhối lượng 6kg", "https://cdn.tgdd.vn/Products/Images/2463/76108/bhx/bot-giat-net-extra-hoa-thien-nhien-6kg-201910230951003977.JPG", 5.0f, new Date(2019, 12, 13, 22, 0)));

        //nước xả vải
        sp.add(new SanPham(40, "Nước xả vải Eurosoft", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2465/214837/bhx/nuoc-xa-vai-downy-premium-parfum-huyen-bi-tui-3-lit-201911242149502857_300x300.jpg", "Nước xả vải"), 4, 79000, "Thương hiệu Eurosoft (Việt Nam)\nNơi sản xuất Việt Nam\nCông dụng Tăng sắc màu vải quần áo chỉ sau 3 lần xả. Làm mềm vải. Lưu lại hương thơm ngát tự nhiên, nhẹ nhàng suốt cả ngày\nMùi hương Hương thiên nhiên\nSố lần xả Nhiều lần xả\nDung tích 2.8 lít\n", "https://cdn.tgdd.vn/Products/Images/2465/134507/bhx/nuoc-xa-vai-eurosoft-tang-sac-mau-huong-thien-nhien-chai-28l-201906241502414089.jpg", 5.0f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(41, "Nước xả vải Downy Premium Parfum", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2465/214837/bhx/nuoc-xa-vai-downy-premium-parfum-huyen-bi-tui-3-lit-201911242149502857_300x300.jpg", "Nước xả vải"), 7, 145000, "Thương hiệu Downy (Mỹ)\nNơi sản xuất Việt Nam\nCông dụng Làm mềm vải, ngăn mùi mồ hôi, lưu lại hương thơm bền lâu đến 3 tuần, giúp quần áo dễ ủi hơn\nMùi hương Hương nước hoa đam mê\nSố lần xả Nhiều lần xả\nDung tích 3 lít\n", "https://cdn.tgdd.vn/Products/Images/2465/214832/bhx/nuoc-xa-vai-downy-premium-parfum-dam-me-tui-3-lit-201911242156493645.jpg", 5.0f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(42, "Nước xả vải Downy hương nắng mai", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2465/214837/bhx/nuoc-xa-vai-downy-premium-parfum-huyen-bi-tui-3-lit-201911242149502857_300x300.jpg", "Nước xả vải"), 0, 130000, "Thương hiệu Downy (Mỹ)\nNơi sản xuất Việt Nam\nCông dụng Lưu lại mùi hương trên quần áo lâu hơn, Khử mùi mồ hôi, bụi bẩn. Giúp cho các sợi vải không bị xơ, giữ được sự mượt mà, mềm mại tự nhiên\nMùi hương Hương nắng mai\nSố lần xả Nhiều lần xả\nDung tích 3 lít\n", "https://cdn.tgdd.vn/Products/Images/2465/214836/bhx/nuoc-xa-vai-downy-huong-nang-mai-tui-3-lit-201911242154342650.jpg", 5.0f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(43, "Nước xả vải Downy Premium Parfum vườn địa đàng", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2465/214837/bhx/nuoc-xa-vai-downy-premium-parfum-huyen-bi-tui-3-lit-201911242149502857_300x300.jpg", "Nước xả vải"), 12, 121000, "Thương hiệu Downy (Mỹ)\nNơi sản xuất Việt Nam\nCông dụng Làm mềm vải. Hương thơm tươi mát, dễ chịu từ vườn hoa thiên nhiên. Lưu giữ mùi hương lâu dài và ngăn đi những mùi khó chịu. Giúp quần áo mềm mại, dễ ủi\nSố lần xả Nhiều lần xả\nDung tích 2.1 lít\nĐiểm nổi bật Sử dụng được cho quần áo trẻ em\n", "https://cdn.tgdd.vn/Products/Images/2465/200370/bhx/nuoc-xa-vai-downy-premium-parfum-vuon-dia-dang-tui-21-lit-201910141006001533.JPG", 5.0f, new Date(2019, 12, 13, 22, 0)));

        //rửa chén
        sp.add(new SanPham(44, "Nước rửa chén NET kháng khuẩn", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2387/81191/bhx/nuoc-rua-chen-lix-sieu-dam-dac-chiet-xuat-tra-xanh-can-4kg-201910210910037305_300x300.jpg", "Nước rửa chén"), 4, 60000, "Thương hiệu NET (Việt Nam)\nNơi sản xuất Việt Nam\nCông dụng Tẩy sạch các vết bẩn, dầu mỡ, khử sạch mùi tanh. Kháng khuẩn, diệt khuẩn hiệu quả\nThành phần Có chiết xuất trà xanh\nMùi hương Hương trà xanh\nTrọng lượng 4kg\n", "https://cdn.tgdd.vn/Products/Images/2387/81585/bhx/nuoc-rua-chen-net-khang-khuan-dam-dac-huong-tra-xanh-4kg-201904102220369660.JPG", 3.0f, new Date(2019, 4, 1, 22, 0)));
        sp.add(new SanPham(45, "Nước rửa chén NET Sạch Vitamin E ", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2387/81191/bhx/nuoc-rua-chen-lix-sieu-dam-dac-chiet-xuat-tra-xanh-can-4kg-201910210910037305_300x300.jpg", "Nước rửa chén"), 8, 55000, "Thương hiệu NET (Việt Nam)\nNơi sản xuất Việt Nam\nMùi hương hương chanh\nTrọng lượng 4kg\n", "https://cdn.tgdd.vn/Products/Images/2387/81563/bhx/nuoc-rua-chen-net-sach-vitamin-e-huong-chanh-4kg-201901090910443578.JPG", 5.0f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(46, "Nước rửa chén Lix siêu đậm đặc", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2387/81191/bhx/nuoc-rua-chen-lix-sieu-dam-dac-chiet-xuat-tra-xanh-can-4kg-201910210910037305_300x300.jpg", "Nước rửa chén"), 19, 62000, "Thương hiệu Lix (Việt Nam)\nNơi sản xuất Việt Nam\nMùi hương chiết xuất trà xanh\nTrọng lượng 4kg\n", "https://cdn.tgdd.vn/Products/Images/2387/81191/bhx/nuoc-rua-chen-lix-sieu-dam-dac-chiet-xuat-tra-xanh-can-4kg-201910211323556745.jpg", 4.5f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(47, "Nước rửa chén Sunlight Extra trà xanh", new DanhMuc("https://cdn.tgdd.vn/Products/Images/2387/81191/bhx/nuoc-rua-chen-lix-sieu-dam-dac-chiet-xuat-tra-xanh-can-4kg-201910210910037305_300x300.jpg", "Nước rửa chén"), 23, 105000, "Thương hiệu Sunlight (Anh và Hà Lan)\nNơi sản xuất Việt Nam\nTrọng lượng 3.6kg\n", "https://cdn.tgdd.vn/Products/Images/2387/76489/bhx/nuoc-rua-chen-sunlight-extra-tra-xanh-matcha-nhat-ban-36kg-201905281129475606.JPG", 4.0f, new Date(2019, 12, 13, 22, 0)));

        //đồ đóng hộp
        sp.add(new SanPham(48, "Đậu sốt cà Castello", new DanhMuc("https://cdn.tgdd.vn/Products/Images/3239/83368/bhx/bo-kho-vissan-hop-397g-201906251602146529_300x300.JPG", "Đồ đóng hộp"), 4, 29500, "Xuất xứ Ý\nKhối lượng 400g\nThành phần Đậu hạt, nước, bột cà chua, muối\nCách dùng Dùng nấu súp, trộn salad, hầm xương hoặc nấu các món ăn khác\n", "https://cdn.tgdd.vn/Products/Images/7219/197336/bhx/dau-sot-ca-castello-hop-400g-201812151049149278.JPG", 5.0f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(49, "Oliu đen tách hạt Torrent ", new DanhMuc("https://cdn.tgdd.vn/Products/Images/3239/83368/bhx/bo-kho-vissan-hop-397g-201906251602146529_300x300.JPG", "Đồ đóng hộp"), 78, 63000, "Thương hiệu Torrent (Tây Ban Nha)\nNơi sản xuất Tây Ban Nha\nKhối lượng 370g\nThành phần Oliu đen, nước, muối,...\n", "https://cdn.tgdd.vn/Products/Images/7085/174559/bhx/qua-oliu-den-tach-hat-torrent-hu-370g-2-org.jpg", 4.0f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(50, "Cá nục kho tiêu Sea Crown", new DanhMuc("https://cdn.tgdd.vn/Products/Images/3239/83368/bhx/bo-kho-vissan-hop-397g-201906251602146529_300x300.JPG", "Đồ đóng hộp"), 21, 9500, "Loại sản phẩm Cá nục kho tiêu\nKhối lượng 155g (khối lượng cái 93g)\nThành phần Cá nục 60%, sốt 37%, ớt 1%, hành 1%, tiêu đen 1%\nCách dùng Ăn liền hoặc cho ra đĩa để hâm nóng lại. Cũng có thể dùng để chế biến thành các món ăn khác.\n", "https://cdn.tgdd.vn/Products/Images/3237/83369/bhx/ca-nuc-kho-tieu-sea-crown-hop-155g-201905211925072786.jpg", 5.0f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(51, "Bò hầm Vissan", new DanhMuc("https://cdn.tgdd.vn/Products/Images/3239/83368/bhx/bo-kho-vissan-hop-397g-201906251602146529_300x300.JPG", "Đồ đóng hộp"), 9, 68000, "Thương hiệu Vissan (Việt Nam)\nNơi sản xuất Việt Nam\nKhối lượng tịnh 397g\nKhối lượng thịt 198.5g\nThành phần Thịt bò 55%, muối, đường, nước, tỏi,...\n", "https://i.ytimg.com/vi/dfSyvK13NvU/sddefault.jpg", 5.0f, new Date(2019, 12, 13, 22, 0)));

        //mì nui bún khố
        sp.add(new SanPham(52, "Nui ống trắng Vinaly", new DanhMuc("https://cdn.tgdd.vn/Products/Images/3231/80385/bhx/nui-ong-lon-safoco-goi-400g-201903061355580589_300x300.jpg", "Mì, nui, bún khô..."), 19, 17250, "Loại sản phẩm Nui ống trắng (không chứa gluten)\nTrọng lượng 400g\nKhẩu phần 4 - 5 người ăn\nThành phần Bột gạo, tinh bột khoai mì, muối, chất ổn định (451i)", "https://cdn.tgdd.vn/Products/Images/3231/178529/bhx/nui-ong-trang-vinaly-goi-400g-2-org.jpg", 5.0f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(53, "Bánh hỏi gạo lứt hữu cơ Bích Chi", new DanhMuc("https://cdn.tgdd.vn/Products/Images/3231/80385/bhx/nui-ong-lon-safoco-goi-400g-201903061355580589_300x300.jpg", "Mì, nui, bún khô..."), 5, 39000, "Khối lượng 200g\nThời gian nấu 4 - 5 phút\nThành phần Gạo lứt hữu cơ 100%\n", "https://cdn.tgdd.vn/Products/Images/3232/197055/bhx/banh-hoi-gao-lut-huu-co-bich-chi-200g-201812121541250103.jpg", 4.0f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(54, "Bún xào Safoco", new DanhMuc("https://cdn.tgdd.vn/Products/Images/3231/80385/bhx/nui-ong-lon-safoco-goi-400g-201903061355580589_300x300.jpg", "Mì, nui, bún khô..."), 9, 30000, "Khối lượng 500g\nLoại sợi Bún có độ mềm vừa phải, dễ chế biến, không bị nát\nThời gian nấu 5-10 phút\nThành phần Bột gạo 87%, tinh bột khoai mì 10%, muối ăn...\n", "https://cdn.tgdd.vn/Products/Images/3232/196973/bhx/bun-xao-safoco-goi-500g-201903221036337365.jpg", 1.0f, new Date(2019, 12, 13, 22, 0)));
        sp.add(new SanPham(55, "Bún gạo Nàng Hương Bích Chi", new DanhMuc("https://cdn.tgdd.vn/Products/Images/3231/80385/bhx/nui-ong-lon-safoco-goi-400g-201903061355580589_300x300.jpg", "Mì, nui, bún khô..."), 19, 21000, "Khối lượng 400g\nLoại sợi Sợi nhỏ, mềm, vị ngọt tự nhiên\nThời gian nấu 4 - 6 phút\nThành phần Gạo Nàng Hương", "https://cdn.tgdd.vn/Products/Images/3232/88284/bhx/bun-gao-nang-huong-bich-chi-400gam-2-org.jpg", 3.0f, new Date(2019, 12, 13, 22, 0)));
    }

    public void DataNhanVien(ArrayList<NhanVien> nv) {
        nv.add(new NhanVien(1, "Hoàng Phi Đại", "0777230926", "Nam", "https://i.imgur.com/6Y44TcL.png", "Thành Phố Huế", "Quản Lí"));
        nv.add(new NhanVien(2, "Lê Đặng ", "077732163", "Nữ", "https://i.imgur.com/juw8HDv.png", "Thành Phố Huế", "Phó Quản Lí"));
        nv.add(new NhanVien(3, "Nguyễn Văn A", "0777123782", "Nữ", "https://i.imgur.com/DGBUnkQ.png", "Thành Phố Huế", "Nhân Viên"));
        nv.add(new NhanVien(4, "Trần Văn C", "0777123456", "Nam", "https://i.imgur.com/DDye22U.png", "Thành Phố Huế", "Nhân Viên"));
        nv.add(new NhanVien(5, "Lê Văn D", "0777789032", "Nữ", "https://i.imgur.com/yRS8jjO.png", "Thành Phố Đà Nẵng", "Nhân Viên"));
        nv.add(new NhanVien(6, "Nguyễn Thị Lâu", "077752567", "Nam", "https://i.imgur.com/tj8JxIT.png", "Thành Phố Huế", "Kế Toán"));
        nv.add(new NhanVien(7, "Hoàng Văn Ngủ", "0777234634", "Nữ", "https://i.imgur.com/XtMxUw8.png", "Thành Phố Đà Lạt", "Lái Xe"));
        nv.add(new NhanVien(8, "Lê Nguyễn Mỏi", "0777968226", "Nữ", "https://i.imgur.com/IeXOdsw.png", "Thành Phố Huế", "Bốc Vác"));
    }
}
