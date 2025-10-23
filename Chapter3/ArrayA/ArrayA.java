package Chapter3.ArrayA;

import java.util.*;

public class ArrayA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Create array
        int[] A = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        // Display array
        System.out.println("Array A = " + Arrays.toString(A));

        sc.close();
    }
}