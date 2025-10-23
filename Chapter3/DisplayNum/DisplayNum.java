package Chapter3.DisplayNum;

import java.math.BigInteger;
import java.util.*;

public class DisplayNum {

    static void option1 (int n) {
        System.out.println("\n1. All even and odd numbers less than " + n + ":");

        System.out.print("Odd:   ");
        for (int i = 1; i < n; i+=2) {
            System.out.printf(i + " ");
        }
        System.out.println();

        System.out.print("Even: ");
        for (int i = 0; i < n; i+=2) {
            System.out.printf(i + " ");
        }
        System.out.println();
    }

    static void option2 (int n) {
        if (n < 2) {
            System.err.println("\nInvalid: there're no prime numbers < 2.");
            System.exit(0);
        }

        System.out.println("\n2. All numbers less than or equal to " + n + " are primes:");

        System.out.print("Prime: ");
        for (int i = 2; i <= n; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            System.out.printf(prime ? i + " " : "");
        }
        System.out.println();
    }

    static void option3 (int n) {
        int i, Last, NextToLast, Answer;
        Answer = 0;

        if (n <= 2) {
            System.err.println("\nInvalid: n must > 2.");
            System.exit(0);
        }

        System.out.println("\n3. Fibonacci sequence of " + n + " numbers.");
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

    static void option4 (int n) {
        System.out.println("\n4. Factorial of " + n + ".");

        BigInteger Factorial = BigInteger.ONE;
        System.out.print("Fact(" + n + ") = ");
        boolean long_flag = false;
        for (int i = 1; i <= n; i++) {
            Factorial = Factorial.multiply(BigInteger.valueOf(i));
            if (n >= 10 && (i > 3 && i <= n-3) && long_flag == false) {
                System.out.print("... * ");
                long_flag = true;
            }
            else if (n < 10 || i <= 3 || i > n-3){
                System.out.print(i != n ? i + " * " : i + "\n        = " + Factorial + "\n");
            }
        }
    }

    static void option5 (int n) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n5. Input m: ");
        int m = Integer.valueOf(sc.nextLine());
        sc.close();

        System.out.println("GCD("+n+", "+m+"): " + (n > m ? gcd(n, m) : gcd(m, n)));
    }

    static int gcd (int a, int b) {
        // a > b
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int input = Integer.valueOf(sc.nextLine());
        if (input < 0) {
            System.err.println(">> Auto convert " + input + " to " + (-input) + "...");
            input = -input;
        }

        System.out.println("Choose display option:");
        System.out.println(
            "1. All even and odd numbers less than n.\r\n" + //
            "2. All numbers less than or equal to n are primes.\r\n" + //
            "3. Fibonacci sequence of n numbers (n > 2).\r\n" + //
            "4. Factorial of n.\r\n" + //
            "5. Input second integer m. Show gcd(n, m).\r\n" + //
            "0. All option."
            );

        System.out.print("Type: ");
        int option = Integer.valueOf(sc.nextLine());

        switch (option) {
            case 0:
                option1(input);
                option2(input);
                option3(input);
                option4(input);
                option5(input);
                break;

            case 1:
                option1(input);
                break;

            case 2:
                option2(input);
                break;

            case 3:
                option3(input);
                break;

            case 4:
                option4(input);
                break;

            case 5:
                option5(input);
                break;
        
            default:
                System.err.println("Error: Invalid option!");
                System.exit(0);
                break;
        }

        System.out.println("\nExit: Status 0.");

        sc.close();
    }
}
