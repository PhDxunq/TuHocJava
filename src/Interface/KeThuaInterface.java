package Interface;

public class KeThuaInterface implements ViDuInterface{

    @Override
    public void thongTin(String ten, String cccd, int cccd2, int namsinh) {

    }

    @Override
    public double tinhLuong(double luongNgay, int soNgayCong) {
        return luongNgay * soNgayCong;
    }
}
