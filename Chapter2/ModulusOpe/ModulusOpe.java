// package Chapter2.ModulusOpe;

import java.util.Arrays;

public class ModulusOpe {
    public static void main(String[] args) {
        boolean truth = true;
        int a = (int) Double.parseDouble("3.14");
        // int a = truth;
        // int a = (int) truth;

        // int x, y, z;
        // x = y = z = 275;
        
        outer: for(int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > i) {
                System.out.println();
                continue outer; // i++, then check i < 10
                }
                System.out.print(" " + i + "," + j);
            }
            System.out.println();
            }
    }
}
