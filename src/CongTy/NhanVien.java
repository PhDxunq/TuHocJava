package CongTy;

public abstract class NhanVien {
    protected String ten;
    protected String que;
    protected int cccd;
    protected double luongCoBan = 850;
    public NhanVien(String ten, String que, int cccd) {
        this.ten = ten;
        this.que = que;
        this.cccd = cccd;
    }
    public abstract double tinhLuong();

    /*
    * 1. Trong lớp có phương thức abstract thì lớp đó cũng phải có abstract
    * 2. Là phương thức chỉ định nghĩ tên hàm, các đối số, không có nội dung hàm
    * 3. Là 1 lớp trừu tượng, không khởi tạo nó bằng toán tử new
    * 4. Class con kế thừa từ abstract thì phải định nghĩa các phương thức abstract từ cha nó
    * */
}
