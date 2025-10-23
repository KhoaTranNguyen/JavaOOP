package Chapter3.NxMAddition;

import java.util.*;

public class NxMAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input num row N: ");
        int n = Integer.valueOf(sc.nextLine());

        System.out.print("Input num column M: ");
        int m = Integer.valueOf(sc.nextLine());

        int arrA[][] = new int[n][m];
        System.out.println("Type matrix A: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Type [" + i + "]" + "[" + j + "]" + " value: ");
                arrA[i][j] = Integer.valueOf(sc.nextLine());
            }
        }

        int arrB[][] = new int[n][m];
        System.out.println("Type matrix B: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Type [" + i + "]" + "[" + j + "]" + " value: ");
                arrB[i][j] = Integer.valueOf(sc.nextLine());
            }
        }

        System.out.println("\nA + B: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print((arrA[i][j] + arrB[i][j]) + " ");
            }
            System.out.println();
        }

        System.out.println("\nA - B: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print((arrA[i][j] - arrB[i][j]) + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
