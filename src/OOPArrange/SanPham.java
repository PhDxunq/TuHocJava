package OOPArrange;

public class SanPham implements Comparable<SanPham> {
    //Thuộc tính
    private int ma;
    private String ten;
    private double gia;
    // Contructor


    public SanPham(int ma, String ten, double gia) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
    }

    //Get

    public int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public double getGia() {
        return gia;
    }
    //Set

    public void setMa(int ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "ma=" + ma +
                ", ten='" + ten + '\'' +
                ", gia=" + gia +
                '}';
    }
    //Phuong thuc

//    // Sap xep theo thu tu giam dan
//    @Override
//    public int compareTo(SanPham o) // Dùng để sắp xếp
//    {
//        if (this.gia < o.gia){
//            return 1;
//        }
//        if (this.gia > o.gia){
//            return -1;
//        }
//        return 0;
//    }
    //Sap xep theo thu tu tang dan
//    @Override
//    public int compareTo(SanPham o) // Dùng để sắp xếp
//    {
//        if (this.gia < o.gia){
//            return -1;
//        }
//        if (this.gia > o.gia){
//            return 1;
//        }
//        return 0;
//    }
        @Override
        public int compareTo(SanPham o) // Dùng để sắp xếp
        {
            return this.ten.compareToIgnoreCase(o.ten);
        }
}
