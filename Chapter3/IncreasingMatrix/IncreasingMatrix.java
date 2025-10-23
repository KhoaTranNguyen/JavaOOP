package Chapter3.IncreasingMatrix;

import java.util.*;

public class IncreasingMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type n: ");
        int n = sc.nextInt();

        int arr[][] = new int[n][];

        for (int i = 0; i < n; i++) {
            arr[i]= new int[i + 1];
            for (int j = 0; j <= i; j++) {
                System.out.print("Type [" + i + "]" + "[" + j + "]" + " value: ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nInput Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
