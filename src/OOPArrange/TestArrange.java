package OOPArrange;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrange {
    public static void main(String[] args){
        // Tao List
        ArrayList<SanPham> ds = new ArrayList<>();
        // khoi tao cac sp
        SanPham sp1 = new SanPham(1,"Samsung",100);
        SanPham sp2 = new SanPham(2,"Iphone",20);
        SanPham sp3 = new SanPham(3,"Huawei",40);
        // add list
        ds.add(sp1);
        ds.add(sp2);
        ds.add(sp3);
        // Xem danh sach sp
        for (SanPham sp : ds){
            System.out.println(sp);
        }
        // Sap xep
        Collections.sort(ds);
        System.out.println("danh sachg sau sap xep la");
        for (SanPham sp : ds){
            System.out.println(sp);
        }

    }
}
