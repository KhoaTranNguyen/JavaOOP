package Chapter3.WeekDay;

import java.util.*;

public class WeekDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter valid week day: ");
        int weekDay = Integer.valueOf(sc.nextLine());

        if (weekDay < 2 || weekDay > 8) {
            System.out.println("Error");
        }
        else {
            String[] pref_days = {"Mon", "Tues", "Wednes", "Thurs", "Fri", "Satur", "Sun"};
            System.out.println(pref_days[weekDay - 2] + "day");
        }
        
        sc.close();
    }
}
