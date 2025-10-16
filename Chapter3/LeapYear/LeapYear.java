package Chapter3.LeapYear;

import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    
       System.out.print("Enter valid year: ");
       int year = Integer.valueOf(sc.nextLine());

       if (year < 0 || year > 10000) {
            System.out.println("Invalid");
       }
       else if ((year % 4 == 0 && year % 100 != 0) ||
                (year % 400 == 0)) {
            System.out.println("Leap year");
       }
       else {
            System.out.println("Valid. But not leap year");
       }

       sc.close();
    }
}
