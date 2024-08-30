import java.util.Scanner;

public class Bai5_If_Else {
    public static void main(String[] args) {
        /*
            if (condition) {
                <if-block>
            } else if {
                <else if-block>
            }
            ....
            else {
                <else-block>
            }
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Input mark: ");
        double mark = sc.nextDouble();
        if (mark > 8) {
            System.out.println("Execllent");
        } else {
            System.out.println("Nice try");
        }
        // Toán tử ba ngôi
        /*
            biến = biểu thức ? câu lệnh (nếu đúng) : câu lệnh (nếu sai)
        * */
        String res = (mark % 2 == 0 ) ? "True" : "False" ;
        System.out.println("Result: " + res);
    }

}
