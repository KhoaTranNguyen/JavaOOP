package Chapter3.DisplayArray;

import java.util.*;

public class DisplayArray {
    static void option_a(int[] arr, int n) {
        System.out.println("\na. Array A:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void option_b(int[] arr, int n) {
        System.out.println("\nb. Asceding A:");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); 
    }

    static void option_c(int[] arr, int n) {
        System.out.println("\nc. Descending A:");
        Arrays.sort(arr);

        int rev_arr[] = new int[n];
        for (int i = n - 1, j = 0; i >= 0; i--, j++) {
            rev_arr[j] = arr[i];
        }

        System.out.println(Arrays.toString(rev_arr)); 
    }

    static void option_d(int[] arr, int n) {
        System.out.println("\nd. All primes in A:");
        
        System.out.print("Prime: ");
        for (int i = 0; i < n; i++) {
            boolean prime = true;
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    prime = false;
                    break;
                }
            }
            System.out.printf(prime ? arr[i] + " " : "");
        }
        System.out.println();
    }

    static void option_e(int[] arr, int n) {
        System.out.println("\ne. Odd and even array of A:");
        String arr_even[] = new String[n];
        String arr_odd[] = new String[n];

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 1) {
                arr_odd[i] = String.valueOf(arr[i]);
            }
            else {
                arr_even[i] = String.valueOf(arr[i]);
            }
        }

        System.out.print("A1: ");
        for (String s : arr_even) {
            if (s != null) {
                System.out.print(s + " ");
            }
        }
        System.out.println();

        System.out.print("A2: ");
        for (String s : arr_odd) {
            if (s != null) {
                System.out.print(s + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size N: ");
        int input = Integer.valueOf(sc.nextLine());
        if (input < 0) {
            System.err.println(">> Auto convert " + input + " to " + (-input) + "...");
            input = -input;
        }

        int arrA[] = new int[input];
        System.out.println("Array A: ");
        for (int i = 0; i < input; i++) {
            System.out.print("Type " + i + "/" + input + " value: ");
            arrA[i] = Integer.valueOf(sc.nextLine());
        }

        System.out.println("\nChoose display option:");
        System.out.println(
            "a. Display A at the console.\r\n" + //
            "b. Sort out A in ascending order.\r\n" + //
            "c. Sort out A in descending order.\r\n" + //
            "d. Find all primes in A.\r\n" + //
            "e. Create a sub array A1 containing even numbers of A, and a sub array A2 \r\n" + //
                "containing odd numbers of A.\r\n" + //
            "f. All option."
            );

        System.out.print("Type: ");
        String option = String.valueOf(sc.nextLine());

        switch (option) {
            case "f":
                option_a(arrA, input);
                option_b(arrA, input);
                option_c(arrA, input);
                option_d(arrA, input);
                option_e(arrA, input);
                break;

            case "a":
                option_a(arrA, input);
                break;

            case "b":
                option_b(arrA, input);
                break;

            case "c":
                option_c(arrA, input);
                break;

            case "d":
                option_d(arrA, input);
                break;

            case "e":
                option_e(arrA, input);
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
