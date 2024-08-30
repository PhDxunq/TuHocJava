public class Bai2_Bien {
    public static void main(String[] args) {
        // Khai báo biến
        int a;
        float b;
        double c;

        //Khai báo nhiều biến
        int q,w,e,r;


        //Khởi tạo biến
        int age = 12;
        float mathMark = 9.5f; // float phải có f sau giá trị
        double engMark = 8.75;
        System.out.println(mathMark);

        //Hằng số
        final int DOSOI = 100;

        //Quy tắc đặt tên biến
        /*
        * Tên biến chỉ có chữ cái, dấu "_" và dấu "$"
        * Tên biến không được bắt đầu bằng số
        * Tên biến không được trùng với từ khóa, tên riêng trong Java
        * Tên biến phân biệt hoa/thường
        * Tuân theo quy tắc camelCase
        */

        //Ép kiểu dữ liệu

        /* Có 2 loại ép kiểu
        * Ép kiểu rộng : int -> long -> float -> double
        * Ép kiểu hẹp  : double -> float -> long -> int
        */

        int num_1 = 5;
        int num_2 = 10;
        double res = (double) num_1/num_2;
        System.out.println(res);
    }
}
