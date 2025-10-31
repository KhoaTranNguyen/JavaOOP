package Chapter3.DuplicateString;

import java.util.*;

public class DuplicateString {
    public static void main(String[] args) {
        String s = "helllllo";
        String new_str = "";

        for (int i = 0; i < s.length(); i++) {
            String temp = String.valueOf(s.charAt(i));
            new_str = new_str.contains(temp) ? new_str : new_str.concat(temp);
        }

        System.out.println(new_str); // helo
    }
}
