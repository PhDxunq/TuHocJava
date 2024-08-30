package OOP;

public class SinhVien {
    private String hoTen; // biến toàn cục
    private double diem; // thuoc tinh(attribute)
    public void hienThiThongTin(){ // phuong thuc( method)
        System.out.println(hoTen+" "+diem);
    }
    //Constructor
    /*
    * là 1 phương thức đặc biệt có tên giống hệt với tên lớp, không có kiểu trả về
    * Dùng để khởi tạo giá trị cho đối tượng, khi đối tượng được sinh ra
    * Có 2 loại Constructor: mặc định và đối số
    * */
    //Constructor mặc định
    /*
    * Dùng để khởi tạo giá trị mặc định cho đối tượng, khi đối tượng được sinh ra
    * Quy tắc: không có kiểu trả về
    * */
    //Exam:
    public SinhVien(){
        hoTen = "No name";
        diem = 9;
    }
    //Constructor có đối số
    /*
    * Dùng để tự động khởi tạo giá trị lúc đối tượng được tạo ra, qua các đối số do người dùng truyền vào
    * */

    public SinhVien(String hoTen) {
        this.hoTen = hoTen;
    }

    public SinhVien(String hoTen , double diem)//biến cục bộ
    {
        this.hoTen = hoTen; // this.hoTen chỉ đến biến toàn cục, hoTen là biến cục bộ
        this.diem = diem;
    }

    //Get và Set
    /*
    * Dùng để truy cập vào để thay đôi các giá trị của biến private
    * Get: xem thông tin
    * Set: sửa thông tin
    * */
    //Get
    public String getHoTen() {
        return hoTen;
    }

    public double getDiem() {
        return diem;
    }
    //Set

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    // Support Method
    private boolean checkDiem(){
        return this.diem >= 2;
    }
    // Service Method
    public void checkHopLeDiem(){
        if (checkDiem()){
            System.out.println("Hop Le");
        } else {
            System.out.println("Khong hop le");
        }
    }
    //Overloading Method: trong cùng class có nhiều phương thức cùng tên nhưng khác nhau về đối số
    public double TinhDiemTB(double toan, double van, double anh){
        return (toan+van+anh)/3;
    }

    public double TinhDiemTB(double toan, double van, double anh, double sinh){
        return (toan+van+anh+sinh)/3;
    }
    //Parametter List : khi chưa biết cố lượng đối số
//    public double tongDiem(double ... arr){
//        for (doulbe x : arr) {
//            tong+=x;
//        }
//        return tong;
//    }


}
