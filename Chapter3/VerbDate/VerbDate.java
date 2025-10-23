package Chapter3.VerbDate;

import java.util.*;

public class VerbDate {
    static String getMonthString (int d, int m) {
        int true_d = 0;

        if (m < 1 || m > 12) {
            System.out.println("Error: month not valid");
            System.exit(0);
        } else if (m == 2) {
            true_d = 28;
        } else if ((m <= 7 && m % 2 == 1) || (m >= 8 && m % 2 == 0)) {
            true_d = 31;
        } else {
            true_d = 30;
        }
        
        if (true_d != d && (d != 29 & m == 2)) {
            System.out.println("Error: day & month mismatched");
            System.exit(0);
        }

        String[] monthStrings = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
        };

        return monthStrings[m-1];
    }

    static String getDayString (int d) {
        String[] dayStrings = {
            "first", "second", "third", "fourth", "fifth",
            "sixth", "seventh", "eighth", "ninth", "tenth",
            "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",
            "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth",
            "twenty-first", "twenty-second", "twenty-third", "twenty-fourth", "twenty-fifth",
            "twenty-sixth", "twenty-seventh", "twenty-eighth", "twenty-ninth", "thirtieth",
            "thirty-first"
        };

        if (d < 1 || d > 31) {
            System.out.println("Error: day not valid");
            System.exit(0);  // thoát chương trình
        }

        return dayStrings[d-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input d = ");
        int d = Integer.valueOf(sc.nextLine());
        String day = getDayString(d);

        System.out.print("Input m = ");
        String m = getMonthString(d, Integer.valueOf(sc.nextLine()));
        
        System.out.println("The " + day + " of " + m);

        sc.close();
    }
}
