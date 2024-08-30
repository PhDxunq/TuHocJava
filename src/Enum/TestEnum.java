package Enum;

import java.util.ArrayList;

public class TestEnum {
    public static void main(String[] args) {
        //ktra thứ tự các thứ tự
        System.out.println(XepLoai.kha.ordinal());
        System.out.println(XepLoai.yeu.ordinal());
        // Tao List
        ArrayList<SinhVien> ds = new ArrayList<>();
        SinhVien sv1 = new SinhVien(1,"abc",7);
        SinhVien sv2 = new SinhVien(2,"qwe",9);
        //Add list
        ds.add(sv1);
        ds.add(sv2);
        for (SinhVien sv : ds){
            System.out.println(sv);
        }
    }
}
