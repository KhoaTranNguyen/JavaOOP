import java.util.*;

public class Celsius_Fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Give the Celsius degree: ");
        double celsius = Double.valueOf(sc.nextLine());

        System.out.print("The Fahrenheit degree: ");
        System.out.printf("%.2f%n", celsius*(1.0*9/5) + 32);
        /* 2️⃣ "%.2f%n"

        Đây là chuỗi định dạng (format string) cho printf:

        Phần	Ý nghĩa
        %	Bắt đầu một specifier
        .2	Làm tròn 2 chữ số thập phân
        f	Định dạng kiểu floating-point (double/float)
        %n	Xuống dòng (newline, tương tự \n nhưng platform-independent)
        
        */

        System.out.print("Give the Fahrenheit degree: ");
        double fahrenheit = Double.valueOf(sc.nextLine());

        System.out.print("The Celsius degree: ");
        System.out.printf("%.2f%n", (fahrenheit-32)*(1.0*5/9));

        sc.close();
    }
}
