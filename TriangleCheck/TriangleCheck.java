package TriangleCheck;
import java.util.*;

public class TriangleCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Give x: ");
        int x = Integer.valueOf(sc.nextLine());

        System.out.print("Give y: ");
        int y = Integer.valueOf(sc.nextLine());

        System.out.print("Give z: ");
        int z = Integer.valueOf(sc.nextLine());

        boolean equilateral = (x == y && y == z) ? true : false;
        boolean isosceles = (equilateral == true || x == y || y == z || z == x) ? true : false;

        System.out.println("Equilateral: " + equilateral);
        System.out.println("Isosceles: " + isosceles);

        sc.close();
    }
}
