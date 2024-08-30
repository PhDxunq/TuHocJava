package CongTy;

public class Test {
    public static void main(String[] args){
       /* NhanVien nv1 = new NhanVien("Nhan vien 1", "HN", 12345);
        double luongnv1 = nv1.tinhLuong();
        System.out.println(luongnv1 );*/

        //tạo đối tượng là nv hành chính
        NhanVienHanhChinh hc1 = new NhanVienHanhChinh("abc","SG",789);
        double luonghc1 = hc1.tinhLuong();
        System.out.println(luonghc1);

        //tạo đối tượng là nhân viên đi ca
        NhanVienDiCa dc1 = new NhanVienDiCa("cvb","hp",2367);
        double luongdc1 = dc1.tinhLuong();
        System.out.println(luongdc1);
        NhanVienDiCa dc2 = new NhanVienDiCa("tui","rqw",123,2);
        double ca2luong = dc2.tinhLuong();
        System.out.println(ca2luong);
        System.out.println(dc2.ca);
    }
}
