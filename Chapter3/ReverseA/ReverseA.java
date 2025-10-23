package Chapter3.ReverseA;

import java.util.*;

public class ReverseA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input n: ");
        int n = Integer.valueOf(sc.nextLine());
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Input values " + i + "/" + n + ": ");
            arr[i] = Integer.valueOf(sc.nextLine());
        }

        int rev_arr[] = new int[n];
        for (int i = n - 1, j = 0; i >= 0; i--, j++) {
            rev_arr[j] = arr[i];
        }

        System.out.print("Reverse array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(rev_arr[i] + " ");
        }

        sc.close();
    }
}
