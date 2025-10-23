package Chapter3.StringSS1;

import java.util.*;

public class StringSS1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type s: ");
        String s = sc.nextLine();

        System.out.print("Type s1: ");
        String s1 = sc.nextLine();

        System.out.println("Result: " + s.contains(s1));

        sc.close();
    }
}
