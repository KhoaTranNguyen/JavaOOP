package Chapter3.IntString;

import java.util.*;

public class IntString {
    static void n_char_substrings (String s, int n) {
        int start = 0;
        int end = n;
        
        while (start < s.length()) {
            if (end > s.length()) {
                end = s.length();
            }
            System.out.print(s.substring(start, end) + " ");
            start = end;
            end += n;
        }
        System.out.println();
    }

    static void n_equal_parts(String s, int n) {
        int len = s.length();
        int partSize = len / n;
        int remainder = len % n;  // in case len is not divisible by n
        int start = 0;

        for (int i = 0; i < n; i++) {
            int end = start + partSize + (i < remainder ? 1 : 0);
            if (end > len) end = len;
            System.out.print(s.substring(start, end) + " ");
            start = end;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Type n: ");
        int n = Integer.valueOf(sc.nextLine());

        System.out.print("Type s: ");
        String s = sc.nextLine();

        n_equal_parts(s, n);
        n_char_substrings(s, n);

        sc.close();
    }
}
