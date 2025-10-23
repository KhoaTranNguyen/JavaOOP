package Chapter3.Fibonacci;

import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        int i, Last, NextToLast, Answer;
        Answer = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Type n: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("Fibonacci sequence of " + n + " numbers.");
        Last = NextToLast = 1;
        for (i = 2; i <= n; i++) {
            if (Last == NextToLast && NextToLast == 1) {
                System.out.print(NextToLast + " " + Last + " ");
            }
            else {
                System.out.print(Last + " ");
            }
            Answer = Last + NextToLast;
            NextToLast = Last;
            Last = Answer;
        }
        System.out.println();
    }
}
