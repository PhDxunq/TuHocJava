package Enum;

public class SinhVien {
    // thuộc tính
    private int ma;
    private String ten;
    private double diemTB;
    private XepLoai loai;
    //Constructor

    public SinhVien(int ma, String ten, double diemTB) {
        this.ma = ma;
        this.ten = ten;
        this.diemTB = diemTB;
        this.loai = getLoai();
    }
    //Phuong thuc de get loai
    public XepLoai getLoai() {
        if (this.diemTB >= 8) {
            loai = XepLoai.gioi;
        } else if (this.diemTB >= 6.5) {
            loai = XepLoai.kha;
        } else if (this.diemTB >= 5.0) {
            loai = XepLoai.tb;
        } else if (this.diemTB >= 3.0) {
            loai = XepLoai.yeu;
        } else {
            loai = XepLoai.duoihoc;
        }
        return loai;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "ma=" + ma +
                ", ten='" + ten + '\'' +
                ", diemTB=" + diemTB +
                ", loai=" + loai +
                '}';
    }
}
