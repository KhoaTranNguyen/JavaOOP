package Chapter3.MonthDay;

import java.util.*;

public class MonthDay {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int month = Integer.valueOf(sc.nextLine());

        if (month < 1 || month > 12) {
            System.out.println("Error: Not found");
        } else if (month == 2) {
            System.out.println("Day_num: 28 / 29");
        } else if ((month <= 7 && month % 2 == 1) || (month >= 8 && month % 2 == 0)) {
            System.out.println("Day_num: 31");
        } else {
            System.out.println("Day_num: 30");
        }

        sc.close();
    }
}
