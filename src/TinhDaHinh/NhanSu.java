package TinhDaHinh;

public abstract class NhanSu {
    // thêm các thuộc tính
    private String ten;
    private String cccd;
    private String que;

    // Tạo Constructor

    public NhanSu(String ten, String cccd, String que) {
        this.ten = ten;
        this.cccd = cccd;
        this.que = que;
    }

    public NhanSu(String ten, String cccd) {
        this.ten = ten;
        this.cccd = cccd;
    }

    public NhanSu() {
    }

    // phương thức tính lương
    public abstract double tinhLuong(int ngayCong);
}
