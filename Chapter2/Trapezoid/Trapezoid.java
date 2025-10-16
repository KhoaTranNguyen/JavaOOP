import java.util.*;

public class Trapezoid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Give the top-base: ");
        int b = Integer.valueOf(sc.nextLine());

        System.out.print("Give the bottom-base: ");
        int a = Integer.valueOf(sc.nextLine());
        
        System.out.print("Give the height: ");
        int h = Integer.valueOf(sc.nextLine());

        System.out.print("Area: " + ((1.0*(b+a))/2*h) + "\n");

        sc.close();
    }
}
