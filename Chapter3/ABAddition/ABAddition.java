package Chapter3.ABAddition;

import java.util.*;

public class ABAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input size N: ");
        int n = Integer.valueOf(sc.nextLine());

        int arrA[] = new int[n];
        System.out.println("Array A: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Type " + i + "/" + n + " value: ");
            arrA[i] = Integer.valueOf(sc.nextLine());
        }
        
        int arrB[] = new int[n];
        System.out.println("Array B: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Type " + i + "/" + n + " value: ");
            arrB[i] = Integer.valueOf(sc.nextLine());
        }

        int arrC[] = new int[n];
        System.out.print("Array C: ");
        for (int i = 0; i < n; i++) {
            arrC[i] = arrA[i] + arrB[i];
            System.out.print(arrC[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
