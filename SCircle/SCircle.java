package SCircle;
import java.util.*;

public class SCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Give the diameter: ");
        double d = Double.valueOf(sc.nextLine());

        System.out.printf("Area: %.2f%n", Math.pow(d/2, 2)*Math.PI);

        sc.close();
    }
}