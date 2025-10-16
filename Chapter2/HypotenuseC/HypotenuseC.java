import java.util.*;

public class HypotenuseC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Give side length a: ");
        int a = Integer.valueOf(sc.nextLine());

        System.out.print("Give side length b: ");
        int b = Integer.valueOf(sc.nextLine());

        System.out.printf("Hypotenuse length c: %.1f%n", Math.sqrt((a*a + b*b)));

        sc.close();
    }
}
