package OOP;

public class Index {
    public static void main(String[] args){
        // khoi tao huong doi tuong thuoc class SinhVien
        SinhVien sv1 = new SinhVien(); // doi tuong sv1
        sv1.hienThiThongTin();
        SinhVien sv3 = new SinhVien("phd");
        sv3.hienThiThongTin();
        SinhVien sv4 = new SinhVien("abc",8);
        sv4.hienThiThongTin();
        System.out.println(sv4.getHoTen());
        System.out.println(sv4.getDiem());
        // thay doi ten sv4
        sv4.setHoTen("qwe");
        sv4.setDiem(4);
        sv4.hienThiThongTin();
        sv4.checkHopLeDiem();
    }
}
