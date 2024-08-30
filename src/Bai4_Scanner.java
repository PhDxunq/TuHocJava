import java.util.Scanner;

public class Bai4_Scanner {
    public static void main(String[] args){
/*        // Nhập dữ liệu
        // B1 : Khởi to đối tượng scanner
        Scanner sc = new Scanner(System.in);
        // B2: Nhập dữ liệu
        System.out.print("Nhập tên của bạn: ");
        String yourName = sc.nextLine(); // nextLine() : nhập chuỗi
        System.out.print("Nhập tuổi của bạn: ");
        int yourAge = sc.nextInt(); // nextInt() : nhập số nguyên
        System.out.print("Nhập điểm toán của bạn: ");
        float mathGrade = sc.nextFloat(); // nextFloat() : nhập số thập phân
        System.out.print("Nhập điểm lý của bạn: ");
        double physGrade = sc.nextDouble(); // nextDouble() : nhập số thập phân
        System.out.print("Bạn thích mèo phải không? ");
        boolean animal = sc.nextBoolean(); // nextBoolean() : nhập giá trị kiểu boolean
        System.out.println("Tên của bạn là: " + yourName );
        System.out.println("Tuổi của bạn: " + yourAge);
        System.out.println("Điểm toán của bạn: " + mathGrade);
        System.out.println("Điểm lý của bạn: " + physGrade);
        if (animal){
            System.out.println("Bạn thích mèo");
        } else {
            System.out.println("Bạn không thích mèo");
        }*/

        // Cách khai báo riêng các đối tượng cho mỗi lần nhập
        System.out.print("Input your name: ");
        String yourName = new Scanner(System.in).nextLine();
        System.out.print("Input your age: ");
        int yourAge = new Scanner(System.in).nextInt();
        System.out.print("Input your height: ");
        float yourHeight = new Scanner(System.in).nextFloat();
        System.out.print("Input your weight: ");
        double yourWeight = new Scanner(System.in).nextDouble();

        System.out.println("Your name: " + yourName);
        System.out.println("Your age: " + yourAge);
        System.out.println("Your height: " + yourHeight);
        System.out.println("Your weight: " + yourWeight);

    }
}
