package Interface;

public interface ViDuInterface {
    // tập các thuộc tính (chỉ được phép là hằng số)

    static final double phuCap = 15;
    public abstract void thongTin(String ten, String que, int cccd, int namsinh); //abstract là class trừu tượng
    public abstract double tinhLuong(double luongNgay, int soNgayCong);
}
