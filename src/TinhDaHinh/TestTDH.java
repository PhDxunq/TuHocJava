package TinhDaHinh;

public class TestTDH {
    public static void main(String[] args){
        NhanSu ns1 = new PhoPhong("phd", "tui123","hp");
        // xuất lương phó phòng
        System.out.println(ns1.tinhLuong(21));
        // thay đổi chức vụ
        ns1 = new TruongPhong();
        // in lương ns1 khi làm tp
        System.out.println(ns1.tinhLuong(21));
    }
}
