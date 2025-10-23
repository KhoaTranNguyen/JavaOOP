package Chapter3.StringS1S2;

import java.util.*;

public class StringS1S2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type s1: ");
        String s1 = sc.nextLine();

        System.out.print("Type s2: ");
        String s2= sc.nextLine();

        s1 = s1.replace(s1, s2);

        System.out.println("s1: " + s1);

        sc.close();
    }
}
